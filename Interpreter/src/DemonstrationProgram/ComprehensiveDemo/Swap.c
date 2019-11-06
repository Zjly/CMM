/**
 *  综合示例：变量交换
 *  展示指针功能
 *  展示指针作为参数传递功能
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
