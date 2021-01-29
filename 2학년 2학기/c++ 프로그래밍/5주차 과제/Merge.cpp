#include <iostream>
using namespace std;

int main() {

	const int SIZE = 5;
	int arr1[SIZE];
	int arr2[SIZE];
	int arr3[SIZE * 2];
	int j = 0;
	int k = 0;

	cout << "오름차순 정수 5개 입력: ";
	for (int i = 0; i < SIZE; i++) {
		cin >> arr1[i];
	}

	cout << "오름차순 정수 5개 입력: ";
	for (int i = 0; i < SIZE; i++) {
		cin >> arr2[i];
	}

	cout << "합병된 정수 10개는: ";

	for (int i = 0; i < SIZE * 2; i++) {
		if (j > SIZE - 1) {
			arr3[i] = arr2[k++];
		}
		else if (k > SIZE - 1) {
			arr3[i] = arr1[j++];
		}
		else {
			if (arr1[j] < arr2[k]) {
				arr3[i] = arr1[j++];
			}
			else if (arr1[j] > arr2[k]) {
				arr3[i] = arr2[k++];
			}
			else {
				arr3[i++] = arr1[j++];
				arr3[i] = arr2[k++];
			}
		}

		cout << arr3[i] << " ";
	}
}