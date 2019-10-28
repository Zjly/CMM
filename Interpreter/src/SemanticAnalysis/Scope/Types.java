package SemanticAnalysis.Scope;

import org.antlr.v4.runtime.Token;

import CMM.*;

public class Types {
	/**
	 * 得到变量的类型
	 *
	 * @param tokenType token的类型
	 * @return symbol的类型
	 */
	public static Symbol.Type getType(int tokenType) {
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
			case CMMParser.STRING:
				return Symbol.Type.tSTRING;
		}
		return Symbol.Type.tINVALID;
	}
}
