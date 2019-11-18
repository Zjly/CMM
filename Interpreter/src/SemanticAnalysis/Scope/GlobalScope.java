package SemanticAnalysis.Scope;

/**
 * 全局作用域
 */
public class GlobalScope extends BaseScope {
	public GlobalScope(Scope enclosingScope) {
		super(enclosingScope);
	}

	public String getScopeName() {
		return "globals";
	}
}
