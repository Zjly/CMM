package Scope;

/**
 * 通用编程语言符号
 */
public class Symbol {
	public static enum Type {
		tINVALID, tVOID, tBOOL, tCHAR, tBYTE, tSHORT, tINT, tLONG, tFLOAT, tDOUBLE
	}

	String name;
	Type type;
	Scope scope; // 符号范围

	private Symbol(String name) {
		this.name = name;
	}

	Symbol(String name, Type type) {
		this(name);
		this.type = type;
	}

	private String getName() {
		return name;
	}

	public String toString() {
		if(type != Type.tINVALID) return '<' + getName() + ":" + type + '>';
		return getName();
	}
}
