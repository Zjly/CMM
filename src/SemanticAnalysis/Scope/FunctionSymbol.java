package SemanticAnalysis.Scope;

import CMM.CMMParser;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 函数作用域
 */
public class FunctionSymbol extends Symbol implements Scope {
	private Map<String, Symbol> arguments = new LinkedHashMap<>();
	private Scope enclosingScope;

	public FunctionSymbol(String name, Type retType, Scope enclosingScope) {
		super(name, retType);
		this.enclosingScope = enclosingScope;
	}

	public FunctionSymbol(String name, Type retType, Scope enclosingScope, CMMParser.FunctionContext ctx) {
		super(name, retType, ctx);
		this.enclosingScope = enclosingScope;
	}

	public Symbol resolve(String name) {
		Symbol s = arguments.get(name);
		if(s != null) {
			return s;
		}

		// 如若不在此作用域内，查找其余作用域
		if(getEnclosingScope() != null) {
			return getEnclosingScope().resolve(name);
		}

		return null;
	}

	public void define(Symbol sym) {
		arguments.put(sym.name, sym);
		sym.scope = this; // 跟踪每个符号中的范围
	}

	public Scope getEnclosingScope() {
		return enclosingScope;
	}

	public String getScopeName() {
		return name;
	}

	public String toString() {
		return "function" + super.toString() + ":" + arguments.values();
	}
}
