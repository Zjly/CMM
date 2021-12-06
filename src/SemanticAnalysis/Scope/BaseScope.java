package SemanticAnalysis.Scope;

import java.util.HashMap;
import java.util.Map;

/**
 * Base作用域抽象类
 * 实现Scope接口
 */
public abstract class BaseScope implements Scope {
	private final Scope enclosingScope; // 如果全局（最外层）作用域为空
	private final Map<String, Symbol> symbolHashMap = new HashMap<>();

	BaseScope(Scope enclosingScope) {
		this.enclosingScope = enclosingScope;
	}

	/**
	 * 寻找作用域内的符号
	 * @param name 符号名
	 * @return 符号对象
	 */
	public Symbol resolve(String name) {
		Symbol symbol = symbolHashMap.get(name);
		if(symbol != null) {
			return symbol;
		}

		// 如若不在此作用域内，查找其余作用域
		if(enclosingScope != null) {
			return enclosingScope.resolve(name);
		}

		return null;
	}

	/**
	 * 在作用域中定义符号
	 * @param symbol 符号对象
	 */
	public void define(Symbol symbol) {
		symbolHashMap.put(symbol.name, symbol);
		symbol.scope = this; // 跟踪每个符号中的范围
	}

	public Scope getEnclosingScope() {
		return enclosingScope;
	}

	public String toString() {
		return getScopeName() + ":" + symbolHashMap.keySet();
	}
}
