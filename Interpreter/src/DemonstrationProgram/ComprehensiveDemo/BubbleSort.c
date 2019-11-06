/**
 *	综合示例：冒泡排序
 */

int main() {
	// 原数组
	int array[10] = {9, 2, 4, 3, 1, 8, 5, 0, 7, 6};

	// 打印原数组
	printn("排序前，原数组为: [");
	for(int i = 0; i < 9; i++) {
		printn(array[i] + ", ");
	}
	print(array[9] + "]");

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

	// 打印新数组
	printn("排序后，新数组为: [");
    	for(int i = 0; i < 9; i++) {
    		printn(array[i] + ", ");
    	}
    print(array[9] + "]");

	return 0;
}