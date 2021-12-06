/**
	Demo9: 展示指针功能
	可实现指针功能
	可实现函数参数传递指针功能
*/
void swap(int *p, int *q) {
	int t;
	t = *p;
	*p = *q;
	*q = t;
}

int main() {
	int a = 1;
	int b = 2;
	println("交换前: a = " + a + ", b = " + b);
	swap(&a, &b);
	println("交换后: a = " + a + ", b = " + b);
	return 0;
}
