package SemanticAnalysis;

import CMM.CMMLexer;
import CMM.CMMParser;
import SemanticAnalysis.DefPhase;
import SemanticAnalysis.RefPhase;
import SemanticAnalysis.VarPhase;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CheckSymbol {
	public static void main(String[] args) throws IOException {
		String inputFile = "./src/SemanticAnalysis/scopeTest.c";
		InputStream is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		CMMLexer lexer = new CMMLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CMMParser parser = new CMMParser(tokens);
		parser.setBuildParseTree(true);
		ParseTree tree = parser.file();

		ParseTreeWalker walker = new ParseTreeWalker();

		DefPhase def = new DefPhase();
		walker.walk(def, tree);

		RefPhase ref = new RefPhase(def.globals, def.scopes);
		walker.walk(ref, tree);

//		VarPhase var = new VarPhase(def.globals, def.scopes);
//		walker.walk(var, tree);
	}
}
