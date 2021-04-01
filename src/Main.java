import org.antlr.v4.runtime.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import Scope.*;
import parser.*;
import AST.*;
import utility.*;
import SemanticChecker.*;
import codegen.InstructionSelection;
import codegen.LivenessAnalysis;
import codegen.RegisterAllocation;
import codegen.RvPrinter;
import IR.*;
import IR.Inst.IRInst;
import IR.Inst.StoreInst;
import Riscv.RvModule;
import Riscv.Operand.RegisterTable;

public class Main {
	public static void main(String[] args) throws IOException {
		ErrorReminder errorReminder = new ErrorReminder();
		InputStream IS = System.in;
		//InputStream IS = new FileInputStream("test.txt");
		CharStream AIS = CharStreams.fromStream(IS);

		if(args[0].contains("semantic")) {

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

		} else {

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
}
