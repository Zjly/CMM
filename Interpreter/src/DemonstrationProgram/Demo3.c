/*
	Demo3: 展示if语句功能
    实现了if-else语句的功能
    可通过表达式的真假选择合适的分支执行
    支持嵌套if并可匹配相应的else
    支持三目运算符?:
*/
int main() {
	int a = 0;
	if(a > 1) {
		print("a > 1");
	} else {
		if(a < 0) {
			print("a < 0");
		} else {
			print("0 <= a <= 1");
		}
	}

	double b = 2;
	a > b ? print(a) : print(b);

	return 0;
}