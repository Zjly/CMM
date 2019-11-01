// break出现在循环语句外
int main() {
	int a = 0;
	break;
    for (int i = 1; i <= 100; i++) {
        a += 1;
        continue;
    }
    return 0;
}