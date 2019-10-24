package SemanticAnalysis.Scope;

/**
 * 表示符号表中的变量定义（名称、类型）
 */
public class VariableSymbol extends Symbol {
	public VariableSymbol(String name, Type type) {
		super(name, type);
	}
}
