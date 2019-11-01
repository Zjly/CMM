/*
	Demo1: 展示变量的赋值
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

	print("i = " + i);
	print("s = " + s);
	print("d = " + d);
	print("f = " + f);
	print("b = " + b);
	print("str = " + s);

	print("d2i = " + d2i);
	print("i2d = " + i2d);

	return 0;
}