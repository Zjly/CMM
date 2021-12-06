/**
 *  综合示例：汉诺塔
 *  展示递归函数功能
 */

// 移动次数计数
int count = 0;

// 移动函数
void Move(int n, string a, string b) {
	count++;
	println("第" + count +"次移动 Move " + n + ": Move from " + a + " to " + b);
}

// 汉诺塔递归
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