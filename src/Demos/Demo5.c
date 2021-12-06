/*
	Demo5: 展示for语句功能
    实现了for语句的功能
    可判断条件决定是否终止循环
*/
int main() {
	int result = 0;
	for(int i = 0; i < 10; i++) {
		result += i;
	}
	println("result = " + result);

	return 0;
}