/*
	while.c: while语句功能
    实现了while语句的功能
    可判断条件决定是否终止循环
*/
int main() {
	int a = 0;
	int result = 0;
	while(a < 10) {
		result += a;
		a++;
	}
	println("result = ", result);

	return 0;
}