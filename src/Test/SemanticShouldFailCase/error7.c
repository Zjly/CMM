// continue出现在循环语句外
int main() {
	int a = 0;
	continue;
    for (int i = 1; i <= 100; i++) {
        a += 1;
        break;
    }
    return 0;
}