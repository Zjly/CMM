package SemanticAnalysis;

import CMM.CMMBaseVisitor;
import SemanticAnalysis.Scope.GlobalScope;
import SemanticAnalysis.Scope.Mutable;
import SemanticAnalysis.Scope.Scope;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class VRefPhase extends CMMBaseVisitor {
	private ParseTreeProperty<Scope> scopes;
	private GlobalScope globals;
	private ParseTreeProperty<Mutable> mutables;
	private Scope currentScope;    // 解析在此范围内开始的符号

	/**
	 * 构造函数，设置前一次遍历的结果
	 */
	public VRefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes, ParseTreeProperty<Mutable> mutables) {
		this.scopes = scopes;
		this.globals = globals;
		this.mutables = mutables;
	}
}
