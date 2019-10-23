package Scope;

/**
 * 局部作用域
 */
public class LocalScope extends BaseScope {
	LocalScope(Scope parent) {
		super(parent);
	}

	public String getScopeName() {
		return "locals";
	}
}
