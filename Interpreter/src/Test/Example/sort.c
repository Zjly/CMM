/**
	sort.c: 冒泡排序
*/
int main() {
	int array[10] = {9, 2, 4, 3, 1, 8, 5, 0, 7, 6};

	print("排序前，原数组为: [");
	for(int i = 0; i < 9; i++) {
		print(array[i] + ", ");
	}
	println(array[9] + "]");

	// 进行冒泡排序
	for(int i = 0; i < 10; i++) {
		for(int j = 0; j < 10 - 1 - i; j++) {
			if(array[j] > array[j + 1]) {
				int temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
			}
		}
	}

    print("排序前，原数组为: [");
    for(int i = 0; i < 9; i++) {
        print(array[i] + ", ");
    }
    println(array[9] + "]");
	return 0;
}