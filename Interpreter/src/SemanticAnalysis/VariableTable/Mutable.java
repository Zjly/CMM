package SemanticAnalysis.VariableTable;

/** 可变存储，用于存储不同类型的返回值 */
public class Mutable<T> {
	public T value;

	public Mutable(T value) {
		this.value = value;
	}
}