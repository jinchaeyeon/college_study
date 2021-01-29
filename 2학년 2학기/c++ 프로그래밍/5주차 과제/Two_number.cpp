#include <iostream>
using namespace std;

int main() {

	int number;
	const int SIZE = 32;
	int i;
	short two_number[SIZE];

	cout << "10진수 입력: ";
	cin >> number;

	for (i = 0; i < SIZE; i++) {
		two_number[i] = number % 2;
		if (number / 2 != 0) {
			number /= 2;
		}
		else {
			break;
		}
	}

	cout << "2진수는 ";
	for (int j = i; j >= 0; j--) {
		cout << two_number[j];
	}
}