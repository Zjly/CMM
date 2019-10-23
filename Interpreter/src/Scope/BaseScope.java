package Scope;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 作用域base抽象类
 */
public abstract class BaseScope implements Scope {
	private Scope enclosingScope; // 如果全局（最外层）作用域为空
	private Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();

	BaseScope(Scope enclosingScope) {
		this.enclosingScope = enclosingScope;
	}

	public Symbol resolve(String name) {
		Symbol s = symbols.get(name);
		if(s != null) {
			return s;
		}

		// 如若不在此作用域内，查找其余作用域
		if(enclosingScope != null) {
			return enclosingScope.resolve(name);
		}

		return null;
	}

	public void define(Symbol sym) {
		symbols.put(sym.name, sym);
		sym.scope = this; // 跟踪每个符号中的范围
	}

	public Scope getEnclosingScope() {
		return enclosingScope;
	}

	public String toString() {
		return getScopeName() + ":" + symbols.keySet().toString();
	}
}
