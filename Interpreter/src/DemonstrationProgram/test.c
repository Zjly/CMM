int main() {
	int a = 1;
	int *p = &a;
	print("a = " + a);
	print("*p = " , *p);
	*p = 2;
	print("a = " + a);
    print("*p = " , *p);
	return 0;
}
