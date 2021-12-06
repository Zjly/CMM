/**
	Demo10: 展示输入输出功能
	可从用户键盘获取输入
	可对变量进行输出
*/
int main() {
	println("请输入一个数字: ");
	int a = input();
	println("输入的数字为: " + a);
	return 0;
}