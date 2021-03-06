package AST;

import utility.Location;
import java.util.ArrayList;

public class FunctExprNode extends ExprNode {
	private ExprNode nameExpr;
	private ArrayList<ExprNode> paraList;
	private String identifier;
	
	public FunctExprNode(Location loc, ExprNode nameExpr, ArrayList<ExprNode> paraList) {
		super(loc);
		this.nameExpr = nameExpr;
		this.paraList = paraList;
	}
	
	public FunctExprNode(Location loc, String identifier, ArrayList<ExprNode> paraList) {
		super(loc);
		this.identifier = identifier;
		this.paraList = paraList;
		this.nameExpr = null;
	}
	
	public ExprNode getNameExpr() {
		return nameExpr;
	}
	
	public ArrayList<ExprNode> getParaList() {
		return paraList;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	public void accept(ASTVisitor visitor) {
		visitor.visit(this);
	}
}
