package AST.Visit;

import AST.*;
import Semantic.ExceptionHandle.CompileError;

abstract public class ASTVisitor {
    abstract public void visit(ProgramNode node) throws CompileError;

    abstract public void visit(ArrayTypeNode node) throws CompileError;

    abstract public void visit(NonArrayTypeNode node) throws CompileError;

    //for DefNode
    abstract public void visit(VarDefNode node) throws CompileError;

    abstract public void visit(VarDefOneNode node);

    abstract public void visit(FuncDefNode node) throws CompileError;

    abstract public void visit(ClassDefNode node) throws CompileError;

    abstract public void visit(ConstructDefNode node) throws CompileError;

    //for StatementNode
    abstract public void visit(BlockNode node) throws CompileError;

    abstract public void visit(VarDefStNode node) throws CompileError;

    abstract public void visit(IfNode node) throws CompileError;

    abstract public void visit(WhileNode node) throws CompileError;

    abstract public void visit(ForNode node) throws CompileError;

    abstract public void visit(ReturnNode node) throws CompileError;

    abstract public void visit(BreakNode node);

    abstract public void visit(ContinueNode node);

    abstract public void visit(EmptyNode node);

    abstract public void visit(ExprStNode node) throws CompileError;

    //for ExprNode
    abstract public void visit(ThisExprNode node) throws CompileError;

    abstract public void visit(ConstExprNode node) throws CompileError;

    abstract public void visit(IdExprNode node) throws CompileError;

    abstract public void visit(PostfixExprNode node) throws CompileError;

    abstract public void visit(NewExprNode_array node) throws CompileError;

    abstract public void visit(NewExprNode_nonArray node) throws CompileError;

    abstract public void visit(MemberExprNode node) throws CompileError;

    abstract public void visit(FuncExprNode node) throws CompileError;

    abstract public void visit(SubscriptExprNode node) throws CompileError;

    abstract public void visit(PrefixExprNode node) throws CompileError;

    abstract public void visit(BinaryExprNode node) throws CompileError;

    abstract public void visit(AssignExprNode node) throws CompileError;


}
