package SemanticAnalysis.VariableTable;

import java.util.ArrayList;

/** 变量表 */
public class VariableTable<T> {
	public ArrayList<Variable> variables;

	VariableTable() {
		variables = new ArrayList<>();
	}

	void addVariable(Variable variable) {
		variables.add(variable);
	}
}
