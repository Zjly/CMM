/*
	assign.c: 变量的赋值
	实现了多种类型变量的赋值功能
	实现了先声明后赋值的功能
	支持int/short/double/float/string/bool等多种类型
	支持变量的强制类型转换
*/

int main() {
	int i;
	i = 1;
	short s = 3;
	double d = 3.5;
	float f = 2.5;
	bool b = true;
	string str = "hello world!";

	int d2i = (int)d;
	double i2d = (double)i;

	println("i = " + i);
	println("s = " + s);
	println("d = " + d);
	println("f = " + f);
	println("b = " + b);
	println("str = " + s);

	println("d2i = " + d2i);
	println("i2d = " + i2d);

	return 0;
}