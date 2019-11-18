package SemanticAnalysis.Scope;

import CMM.CMMParser;

/**
 * 通用编程语言符号
 */
public class Symbol {
	public static enum Type {
		tINVALID, tVOID, tBOOL, tCHAR, tBYTE, tSHORT, tINT, tLONG, tFLOAT, tDOUBLE, tSTRING, tpINT
	}

	String name;
	public Type type;
	Scope scope; // 符号范围
	public Mutable value; // 符号值
	public CMMParser.FunctionContext ctx;

	private Symbol(String name) {
		this.name = name;
	}

	Symbol(String name, Type type) {
		this(name);
		this.type = type;
	}

	Symbol(String name, Type type, Mutable value) {
		this(name, type);
		this.value = value;
	}

	Symbol(String name, Type type, CMMParser.FunctionContext ctx) {
		this(name, type);
		this.ctx = ctx;
	}

	private String getName() {
		return name;
	}

	public Mutable getValue() {
		return value;
	}

	public void setValue(Mutable value) {
		this.value = value;
	}

	public String toString() {
		if(type != Type.tINVALID) return '<' + getName() + ":" + type + '>';
		return getName();
	}
}
