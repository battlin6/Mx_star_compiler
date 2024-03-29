import yaml
import os
import json
import subprocess

configuration = {}
color_none = "\033[0m"
color_green = "\033[1;32m"
color_yellow = "\033[1;33m"
color_red = "\033[0;31m"
color_blue = "\033[0;34m"
color_purple = "\033[0;35m"

def buildCompiler():
    print(' == 1 ==[ ]== Build Your Compiler')
    buildScriptPath = os.path.join(configuration['path']['compiler'], 'build.sh')
    process = None
    try:
        process = subprocess.Popen(["sh", buildScriptPath], cwd=configuration['path']['compiler'], stdout=subprocess.PIPE, shell=False)
        process.wait(configuration['buildlimit'])
        if process.returncode == 0:
            print('{} == 1 ==[√]== Build successfully.{}'.format(color_green, color_none))
        else:
            print('{} == 1 ==[R]== Build failed with exitcode {}.{}'.format(color_purple, process.returncode, color_none))
            exit(0)
        pass
    except subprocess.TimeoutExpired as identifier:
        print('{} == 1 ==[T]== Build Timeout.{}'.format(color_yellow, color_none))
        try:
            process.kill()
        except Exception as identifier:
            pass
        exit(0)
        pass
    except Exception as identifier:
        print('{} == 1 ==[x]== Build failed with runtime error {}.{}'.format(color_red, identifier, color_none))
        exit(0)
    
def runSemantic():
    judgeList = open(os.path.join(configuration['path']['dataset'], 'sema/judgelist.txt'), 'r', encoding='utf-8').readlines()
    semaPath = os.path.join(configuration['path']['dataset'], 'sema')
    judgeList = [i.strip('\n') for i in judgeList]
    semanticPath = os.path.join(configuration['path']['compiler'], 'semantic.sh')
    print(' == 2 ==[ ]== Semantic Judge Start')
    totalNum = len(judgeList)
    acceptedNum = 0
    wrongNum = 0
    judgeResultList = []
    for case in judgeList:
        judgeCaseResult = {}
        judgeCaseResult['case'] = case
        judgeCaseResult['stage'] = 'semantic'
        # load test case
        caseData = open(os.path.join(semaPath, case), 'r').readlines()
        caseData = [i.strip('\n') for i in caseData]
        metaIdx = (caseData.index('/*'), caseData.index('*/'))
        metaArea = caseData[metaIdx[0] + 1: metaIdx[1]]
        metaArea = [i.split(': ') for i in metaArea]
        metaDict = {i[0]:i[1] for i in metaArea}
        expectedResult = metaDict['Verdict'] == 'Success'
        print(' == 2 ==[ ]==[ ]== Judge:{}.'.format(case), end='\r')
        dataArea = '\n'.join(caseData[metaIdx[1] + 1:])
        process = subprocess.Popen(["sh", semanticPath], cwd=configuration['path']['compiler'], stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=False)
        try:
            process.stdin.write(dataArea.encode('utf-8'))
            process.stdin.close()
            process.wait(configuration['timelimit'])

            stdout_result = process.stdout.readlines()
            stderr_result = process.stderr.readlines()
            stdout_result_str = ''.join([i.decode() for i in stdout_result])
            stderr_result_str = ''.join([i.decode() for i in stderr_result])
            judgeCaseResult['stdout'] = stdout_result_str
            judgeCaseResult['stderr'] = stderr_result_str

            if process.returncode == 0 and expectedResult:
                print('{} == 2 ==[ ]==[√]== Accepted:{}.{}'.format(color_green, case, color_none))
                acceptedNum = acceptedNum + 1
                judgeCaseResult['verdict'] = 'Accepted'
            elif process.returncode != 0 and (not expectedResult):
                print('{} == 2 ==[ ]==[√]== Accepted:{}.{}'.format(color_green, case, color_none))
                acceptedNum = acceptedNum + 1
                judgeCaseResult['verdict'] = 'Accepted'
            else:
                print('{} == 2 ==[ ]==[x]== Wrong Answer:{}.{}'.format(color_red, case, color_none))
                wrongNum = wrongNum + 1
                judgeCaseResult['verdict'] = 'Wrong Answer'
            pass
        except subprocess.TimeoutExpired:
            print('{} == 2 ==[ ]==[T]== Time Limit Exceeded:{}.{}'.format(color_yellow, case, color_none))
            wrongNum = wrongNum + 1
            judgeCaseResult['verdict'] = 'Time Limit Exceeded'
            try:
                process.kill()
            except Exception:
                pass
            pass
        except Exception as identifier:
            print('{} == 2 ==[ ]==[R]== Runtime Error:{}, error Message:{}.{}'.format(color_purple, case, identifier, color_none))
            wrongNum = wrongNum + 1
            judgeCaseResult['verdict'] = 'Runtime Error'
            pass
        judgeResultList.append(judgeCaseResult)
    if acceptedNum != totalNum:
        print('{} == 2 ==[x] Semantic Stage Summary: Passed: {} / {}, Ratio: {:.2f}%{}'.format(color_red, acceptedNum, totalNum, acceptedNum * 100.0 / totalNum, color_none))
    else:
        print('{} == 2 ==[√] Semantic Stage Summary: Passed: {} / {}, Ratio: {:.2f}% All passed!{}'.format(color_green, acceptedNum, totalNum, acceptedNum * 100.0 / totalNum, color_none))
    yaml.safe_dump(judgeResultList, open('semantic_result.yaml', 'w', encoding='utf-8'))
    pass

def runCodegen():
    judgeList = open(os.path.join(configuration['path']['dataset'], 'codegen/judgelist.txt'), 'r', encoding='utf-8').readlines()
    codegenPath = os.path.join(configuration['path']['dataset'], 'codegen')
    judgeList = [i.strip('\n') for i in judgeList]
    codegenScriptPath = os.path.join(configuration['path']['compiler'], 'codegen.sh')
    print(' == 3 ==[ ]== Codegen Judge Start')
    totalNum = len(judgeList)
    acceptedNum = 0
    wrongNum = 0
    judgeResultList = []
    for case in judgeList:
        judgeCaseResult = {}
        judgeCaseResult['Case'] = case
        judgeCaseResult['stage'] = 'codegen'

        # load test case
        caseData = open(os.path.join(codegenPath, case), 'r').readlines()
        caseData = [i.strip('\n') for i in caseData]
        metaIdx = (caseData.index('/*'), caseData.index('*/'))
        metaArea = caseData[metaIdx[0] + 1: metaIdx[1]]
        metaConfigArea = [i for i in metaArea if '===' not in i and 'output' not in i and 'Input' not in i and 'Output' not in i]
        metaConfigArea = [i.split(': ') for i in metaConfigArea]
        
        newMetaArea = metaArea[metaArea.index('=== end ===') + 1:]
        inputDataStr = '\n'.join(metaArea[metaArea.index('=== input ===') + 1 : metaArea.index('=== end ===')])
        
        file = open('test.in', 'w')
        file.write(inputDataStr)
        #file.writelines(metaArea[metaArea.index('=== input ===') + 1 : metaArea.index('=== end ===')])
        file.close()
        
        outputDataStr = '\n'.join(newMetaArea[newMetaArea.index('=== output ===') + 1 : newMetaArea.index('=== end ===')])
        print(' == 3 ==[ ]==[ ]== Judge:{}.'.format(case), end='\r')
        dataArea = '\n'.join(caseData[metaIdx[1] + 1:])
        process = subprocess.Popen(["sh", codegenScriptPath], cwd=configuration['path']['compiler'], stdin=subprocess.PIPE, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=False)
        process.stdin.write(dataArea.encode('utf-8'))
        process.stdin.close()
        process.wait(configuration['timelimit'])
        file2 = open('test.out')
        stdout_result = process.stdout.readlines()
        stderr_result = process.stderr.readlines()
        stdout_result_str = file2.read()#' '.join([i.decode() for i in stdout_result])
        file2.close();
        stderr_result_str = ' '.join([i.decode() for i in stderr_result])
        judgeCaseResult['Compiler-Output'] = stdout_result_str
        judgeCaseResult['Compiler-Stderr'] = stderr_result_str
        judgeCaseResult['Compiler-ExitCode'] = process.returncode

        
        outputMatch = stdout_result_str == outputDataStr
        exitcodeMatch = True #process.returncode == expectedExitCode 
        timeScriptMatch = True #instLimit == -1 or report_dict['time'] < instLimit
        compileExitcode = True #process.returncode == 0

        if compileExitcode and exitcodeMatch and timeScriptMatch and outputMatch:
            print('{} == 3 ==[ ]==[√]== Accepted:{}.{}'.format(color_green, case, color_none))
            acceptedNum = acceptedNum + 1
            judgeCaseResult['verdict'] = 'Accepted'
        elif compileExitcode and exitcodeMatch and (not timeScriptMatch) and outputMatch:
            print('{} == 3 ==[ ]==[T]== Time Limit Exceeded:{}.{}'.format(color_yellow, case, color_none))
            wrongNum = wrongNum + 1
            judgeCaseResult['verdict'] = 'Time Limit Exceeded'
        elif compileExitcode and (not exitcodeMatch) and timeScriptMatch and outputMatch:
            print('{} == 3 ==[ ]==[x]== Failed: Exitcode Mismatch:{}.{}'.format(color_red, case, color_none))
            wrongNum = wrongNum + 1
            judgeCaseResult['verdict'] = 'Failed: Exitcode Mismatch'
        elif compileExitcode and exitcodeMatch and timeScriptMatch and (not outputMatch):
            print('{} == 3 ==[ ]==[x]== Failed: Compiled Output Mismatch:{}.{}'.format(color_red, case, color_none))
            wrongNum = wrongNum + 1
            judgeCaseResult['verdict'] = 'Failed: Compiled Output Mismatch'
        else:
            print('{} == 3 ==[ ]==[x]== Failed:{}.{}'.format(color_red, case, color_none))
            wrongNum = wrongNum + 1
            judgeCaseResult['verdict'] = 'Failed:'
        pass
        
        judgeResultList.append(judgeCaseResult)
        
    if acceptedNum != totalNum:
        print('{} == 3 ==[x] Codegen Stage Summary: Passed: {} / {}, Ratio: {:.2f}%{}'.format(color_red, acceptedNum, totalNum, acceptedNum * 100.0 / totalNum, color_none))
    else:
        print('{} == 3 ==[√] Codegen Stage Summary: Passed: {} / {}, Ratio: {:.2f}% All passed!{}'.format(color_green, acceptedNum, totalNum, acceptedNum * 100.0 / totalNum, color_none))
    yaml.safe_dump(judgeResultList, open('codegen_result.yaml', 'w', encoding='utf-8'))
    pass


if __name__ == '__main__':
    content = open('config.yaml', 'r', encoding='utf-8').read()
    configuration = yaml.safe_load(content)
    assert 'stage' in configuration.keys()
    assert 'path' in configuration.keys()
    assert 'compiler' in configuration['path'].keys()
    assert 'dataset' in configuration['path'].keys()
    assert 'timelimit' in configuration.keys()
    assert 'memlimit' in configuration.keys()
    assert 'instlimit' in configuration.keys()
    assert 'buildlimit' in configuration.keys()
    buildCompiler()
    if configuration['stage'] == 'semantic':
        runSemantic()
    elif configuration['stage'] == 'codegen' or configuration['stage'] == 'optimize':
        runCodegen()
    else:
        print(' [!] Error: stage can only be [semantic, codegen, optimize]')
    print(' == Judge Finished')
    
    
