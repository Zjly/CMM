package SemanticAnalysis.Scope;

public interface Scope {
	/** 得到作用域名 */
	public String getScopeName();

	/** 得到外部作用域 */
	public Scope getEnclosingScope();

	/** 在作用域中定义符号 */
	public void define(Symbol sym);

	/** 寻找作用域内的符号 */
	public Symbol resolve(String name);
}
