/*
	array.c: 数组功能
    支持定义数组
    支持数组初始化赋初值
    支持数组元素的使用
    支持数组元素的赋值
*/
int main() {
	int a[10];
	a[0] = 1;
	println("a[0] = " + a[0]);
	a[1] = 1;
	println("a[1] = " + a[1]);
	int b[3] = {1, 2, 3};

	for(int i = 2; i < 10; i++) {
		a[i] = a[i - 1] + a[i - 2];
		println("a[" + i + "] = " + a[i]);
	}

	for(int j = 0; j < 3; j++) {
		println("b[" + j + "] = " + b[j]);
	}

    return 0;
}