/*
	expression.c: 四则运算功能
    实现了变量之间进行四则运算的功能
	支持运算符优先级的判断
	支持括号的使用
	支持运算符的左结合
	支持变量自增/自减运算
	支持变量增/减/积/商赋值运算(如+=)
*/
int main() {
	int a = 1;
	int b = 2;
	double c = 2.5;
	double d = 5.0;

	int result1 = a * b;
	double result2 = c + d;
	double result3 = (result1 + result2) / (result1 - result2);

	println("a * b = " + result1);
	println("c + d = " + result2);
	println("(result1 + result2) / (result1 - result2)) = " + result3);

	a++;
	println("a++, a = " + a);
	a += 1;
	println("a += 1, a = ", a);

	return 0;
}