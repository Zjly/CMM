package SemanticAnalysis.Scope;

/**
 * 局部作用域LocalScope
 * 继承BaseScope
 */
public class LocalScope extends BaseScope {
	public LocalScope(Scope parent) {
		super(parent);
	}

	public String getScopeName() {
		return "locals";
	}
}
