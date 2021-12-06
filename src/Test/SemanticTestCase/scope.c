int global_a;

void f1() {}

void f2(int a) {}

int main() {
    int a = 1 + 2;
	f1();
	f2(a);

	global_a = 0;
    for (int i = 1; i <= 100; i++) {
        global_a += i;
    }
    print("global_a = " + global_a);
	a = 0;
    for (int j = 1; j <= 100; j++) {
        a += 1;
        continue;
        if (a > 10000) {
            break;
        }
    }
    print("a = " + a);
    return 0;
}
