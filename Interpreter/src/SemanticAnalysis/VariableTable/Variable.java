package SemanticAnalysis.VariableTable;

import SemanticAnalysis.Scope.Scope;
import SemanticAnalysis.Scope.Types;

public class Variable {
	public Scope scope;
	public Types type;
	public Mutable mutable;

	Variable(Scope scope, Types type, Mutable mutable) {
		this.scope = scope;
		this.type = type;
		this.mutable = mutable;
	}
}
