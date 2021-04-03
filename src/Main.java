import AST.ASTBuilder;
import AST.ProgramNode;
import IR.IRBuilder;
import IR.IRModule;
import Riscv.RvModule;
import Scope.GlobalScope;
import Scope.StringType;
import SemanticChecker.SemanticChecker;
import codegen.InstructionSelection;
import codegen.RegisterAllocation;
import codegen.RvPrinter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.MxstarErrorListener;
import parser.MxstarLexer;
import parser.MxstarParser;
import utility.ErrorReminder;

import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) throws IOException {
		ErrorReminder errorReminder = new ErrorReminder();
		InputStream IS = System.in;
		//InputStream IS = new FileInputStream("test/test.txt");
		CharStream AIS = CharStreams.fromStream(IS);
      	
		MxstarLexer lexer = new MxstarLexer(AIS);
		lexer.removeErrorListeners();
		lexer.addErrorListener(new MxstarErrorListener(errorReminder));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MxstarParser parser = new MxstarParser(tokens);
		parser.removeErrorListeners();
		parser.addErrorListener(new MxstarErrorListener(errorReminder));
		
		ASTBuilder ast = new ASTBuilder(errorReminder);
		ProgramNode root = (ProgramNode) ast.visit(parser.program());
		SemanticChecker checker = new SemanticChecker(errorReminder);
		checker.visit(root);

		int count = errorReminder.count();
		//System.out.println(count);
		if(args[0].equals("semantic")) {
			System.exit(count);
		}
		
		//build IR
		GlobalScope globalScope = checker.getGlobalScope();
		StringType stringTemplate = checker.getStringTemplate();
		IRBuilder ir = new IRBuilder(globalScope, stringTemplate, errorReminder);
		ir.visit(root);
		IRModule irModule = ir.getModule(); 
		

		
		//codegen
		InstructionSelection selector = new InstructionSelection(irModule);
		RvModule rvModule = selector.run();

		RegisterAllocation allocator = new RegisterAllocation(rvModule);
		allocator.run();


		RvPrinter output = new RvPrinter("output.s", true);
		output.visit(rvModule);
	}
}
