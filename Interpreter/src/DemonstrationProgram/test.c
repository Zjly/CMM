int main() {
	int a = 1;
	int b = 2;
	double c = 2.5;
	double d = 5.0;

	int result1 = a * b;
	double result2 = c + d;
	double result3 = (result1 + result2) / (result1 - result2);

	print("a * b = " + result1);
	print("c + d = " + result2);
	print("(result1 + result2) / (result1 - result2)) = " + result3);

	a++;
	print("a++, a = " + a);
	a += 1;
	print("a += 1, a = ", a);

	return 0;
}