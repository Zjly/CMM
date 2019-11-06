/**
	Demo7: 展示函数调用功能
	支持函数调用参数
	支持函数调用返回值
	支持返回值类型匹配
*/
int add(int x, int y) {
	return x + y;
}

int main() {
	int a = 1;
	int b = 2;
	int result = add(a, b);
	println("a + b = " + result);
	return 0;
}