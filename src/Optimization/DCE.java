package Optimization;

import IR.Block;
import IR.Instruction.*;
import IR.LLVMfunction;
import IR.Module;
import Optimization.Loop.LoopAnalysis;

import java.util.*;

public class DCE extends IRPass {

    private SideEffectChecker sideEffectChecker;
    private LoopAnalysis loopAnalysis;
    private Map<LLVMfunction, Set<LLVMInstruction>> liveInstsSet;

    public DCE(Module module) {
        super(module);
        this.sideEffectChecker = new SideEffectChecker(module);
        this.loopAnalysis = new LoopAnalysis(module);
    }

    @Override
    public boolean run() {
        if (!module.checkNormalFunctional()) return false;
        liveInstsSet = new HashMap<>();
        loopAnalysis.run();
        sideEffectChecker.run();
        changed = false;
        for (LLVMfunction function : module.getFunctionMap().values()) {
            liveInstsSet.put(function, new HashSet<LLVMInstruction>());
            roughMarkLiveInst(function);
            changed |= deadCodeElimination(function);
        }
        return changed;
    }

    private void roughMarkLiveInst(LLVMfunction function) {
        Set<LLVMInstruction> liveInsts = liveInstsSet.get(function);
        Queue<LLVMInstruction> queue = new LinkedList<>();
        for (Block block : function.getBlocks())
            roughMarkLiveForBLock(block, liveInsts, queue);
        //for branchInst
        while (!queue.isEmpty()) {
            LLVMInstruction instruction = queue.poll();
            instruction.markUseAsLive(liveInsts, queue);
            for (Block block : instruction.getBlock().getPostDF()) {
                // ance frontier
                assert block.getInstTail() instanceof BranchInst;
                if (!liveInsts.contains(block.getInstTail())) {
                    liveInsts.add(block.getInstTail());
                    queue.offer(block.getInstTail());
                }
            }
        }

    }

    private boolean deadCodeElimination(LLVMfunction function) {
        Set<LLVMInstruction> liveInsts = liveInstsSet.get(function);
        boolean changed = false;
        for (Block block : function.getBlocks()) {
            LLVMInstruction currentInst = block.getInstHead();
            while (currentInst != null) {
                if (!liveInsts.contains(currentInst))
                    changed |= currentInst.dceRemoveFromBlock(loopAnalysis);
                currentInst = currentInst.getPostInst();
            }
        }
        return changed;
    }

    private void roughMarkLiveForBLock(Block block, Set<LLVMInstruction> liveInsts, Queue<LLVMInstruction> queue) {
        LLVMInstruction currentInst = block.getInstHead();
        while (currentInst != null) {
            boolean liveBlock = false;
            if (currentInst instanceof StoreInst) {
                liveInsts.add(currentInst);
                queue.offer(currentInst);
                liveBlock = true;
            } else if (currentInst instanceof CallInst) {
                LLVMfunction callee = ((CallInst) currentInst).getLlvMfunction();
                if (sideEffectChecker.checkSideEffect(callee)) {
                    liveInsts.add(currentInst);
                    queue.offer(currentInst);
                    liveBlock = true;
                }
            } else if (currentInst instanceof ReturnInst) {
                liveInsts.add(currentInst);
                queue.offer(currentInst);
                liveBlock = true;
            }
            if (liveBlock) {
                liveInsts.add(currentInst.getBlock().getInstTail());
                queue.offer(currentInst.getBlock().getInstTail());
            }
            currentInst = currentInst.getPostInst();
        }
    }

}
