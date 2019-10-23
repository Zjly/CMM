package Scope;

import org.antlr.v4.runtime.Token;

import CMM.*;

class Types {
	/**
	 * 得到变量的类型
	 * @param tokenType token的类型
	 * @return symbol的类型
	 */
	static Symbol.Type getType(int tokenType) {
		switch(tokenType) {
			case CMMParser.VOID:
				return Symbol.Type.tVOID;
			case CMMParser.BOOL:
				return Symbol.Type.tBOOL;
			case CMMParser.CHAR:
				return Symbol.Type.tCHAR;
			case CMMParser.BYTE:
				return Symbol.Type.tBYTE;
			case CMMParser.SHORT:
				return Symbol.Type.tSHORT;
			case CMMParser.INT:
				return Symbol.Type.tINT;
			case CMMParser.LONG:
				return Symbol.Type.tLONG;
			case CMMParser.FLOAT:
				return Symbol.Type.tFLOAT;
			case CMMParser.DOUBLE:
				return Symbol.Type.tDOUBLE;
		}
		return Symbol.Type.tINVALID;
	}

	/**
	 * 错误打印
	 * @param t token
	 * @param msg 错误信息
	 */
	static void error(Token t, String msg) {
		System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
	}
}