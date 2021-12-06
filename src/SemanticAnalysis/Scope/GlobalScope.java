package SemanticAnalysis.Scope;

/**
 * 全局作用域GlobalScope
 * 继承BaseScope
 */
public class GlobalScope extends BaseScope {
	public GlobalScope(Scope enclosingScope) {
		super(enclosingScope);
	}

	public String getScopeName() {
		return "globals";
	}
}
