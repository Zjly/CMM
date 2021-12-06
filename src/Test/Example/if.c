/*
	if.c: if语句功能
    实现了if-else语句的功能
    可通过表达式的真假选择合适的分支执行
    支持嵌套if并可匹配相应的else
    支持三目运算符?:
*/
int main() {
	int a = 0;
	if(a > 1) {
		println("a > 1");
	} else {
		if(a < 0) {
			println("a < 0");
		} else {
			println("0 <= a <= 1");
		}
	}

	double b = 2;
	a > b ? println(a) : println(b);

	return 0;
}