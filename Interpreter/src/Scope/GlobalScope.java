package Scope;

/**
 * 全局作用域
 */
public class GlobalScope extends BaseScope {
	GlobalScope(Scope enclosingScope) {
		super(enclosingScope);
	}

	public String getScopeName() {
		return "globals";
	}
}
