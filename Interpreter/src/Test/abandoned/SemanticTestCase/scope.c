int global_a;

int main() {
    int a = 1 + 2;
	f1();
	f2(a);

	global_a = 0;
    for (int i = 1; i <= 100; i++) {
        global_a += i;
    }

	return 0;
}

void f1() {}

void f2(int a) {}