/**
	Demo8: 展示递归功能
	可实现函数的递归调用
	函数递归调用可传递返回值
*/
int count = 0;

void Move(int n, string a, string b) {
	count++;
	print("第" + count +"次移动 Move " + n + ": Move from " + a + " to " + b);
}

void Hanoi(int n, string a, string b, string c) {
	if(n == 1) {
		Move(n, a, c);
	} else {
		Hanoi(n - 1, a, c, b);
		Move(n, a, c);
		Hanoi(n - 1, b, a, c);
	}
}

int main() {
	int n = 3;
	Hanoi(n, "A", "B", "C");
	return 0;
}