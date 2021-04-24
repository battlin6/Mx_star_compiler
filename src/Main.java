import AST.ProgramNode;
import AST.Visit.ASTBuilder;
import BackEnd.ASMModule;
import BackEnd.ASMPrinter;
import BackEnd.Construct.InstructionSelector;
import BackEnd.Construct.RegisterAllocate.RegisterAllocator;
import IR.IRBuilder;
import IR.Module;
import Optimization.*;
import Semantic.ExceptionHandle.CompileError;
import Semantic.ExceptionHandle.ExceptionListener;
import Semantic.ParserAndLexer.MXgrammarLexer;
import Semantic.ParserAndLexer.MXgrammarParser;
import Semantic.SemanticCheck;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class Main {


    public static void main(String[] args) throws CompileError, IOException {
        ExceptionListener exceptionListener = new ExceptionListener();

        InputStream is = System.in;
        //is = new FileInputStream("test/test.txt");
        ANTLRInputStream input = new ANTLRInputStream(is);

        MXgrammarLexer lexer = new MXgrammarLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(exceptionListener);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MXgrammarParser parser = new MXgrammarParser(tokens);
        parser.removeErrorListeners();;
        parser.addErrorListener(exceptionListener);
        ParseTree tree = parser.program(); // parse; start at prog15
        //System.out.println(tree.toStringTree(parser)); // print tree as text

        ASTBuilder astBuilder = new ASTBuilder(exceptionListener);
        ProgramNode programNode = (ProgramNode) astBuilder.visit(tree);
        if(exceptionListener.getErrorNum() != 0){
            System.out.println("Building AST found error");
            throw new CompileError();
        }
        SemanticCheck semanticCheck = new SemanticCheck(exceptionListener);
        try{
            programNode.accept(semanticCheck);
        } catch (CompileError compileError) {
            exceptionListener.errorOut(compileError);
        }
        if(exceptionListener.getErrorNum() !=0 ){
            System.out.println("Semantic error");
            throw new CompileError();
        }
        IRBuilder irBuilder = new IRBuilder(semanticCheck);
        irBuilder.visit(programNode);
        Module module = irBuilder.getModule();
//        IRPrinter irPrinter = new IRPrinter("out.ll");
//        irPrinter.visit(irBuilder.getModule());

        if(args[args.length-1].equals("codegen")){
            try{
                SSAConstructor ssaConstructor = new SSAConstructor(module);
                ssaConstructor.run();

                InlineExpansion inlineExpansion = new InlineExpansion(module);
//                IRPrinter irPrinter = new IRPrinter("IRout.txt");
//                irPrinter.visit(module);
                new SSADestructor(module).run();
                InstructionSelector instructionSelector = new InstructionSelector();
                module.accept(instructionSelector);
                ASMModule ASMRISCVModule = instructionSelector.getASMRISCVModule();


                new RegisterAllocator(ASMRISCVModule, module).run();
                new ASMPrinter("output.s").run(ASMRISCVModule);
                new ASMPrinter(null).run(ASMRISCVModule);
            }catch (Exception e){

            }
        }

    }

}
