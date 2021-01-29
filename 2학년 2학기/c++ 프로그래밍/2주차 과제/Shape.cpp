#include <iostream>
using namespace std;

int main() {
	cout << "크기 (3보다 큰 홀수) : ";
	int size;
	cin >> size;

	int k = 1;

	for (int i = 0; i < size; i++) {
		for (int j = 0; j < (size - k) / 2; j++) {
			cout << " ";
		}
		for (int d = 0; d < k; d++) {
			cout << "*";
		}
		if (i < size / 2) {
			k = k + 2;
		}
		else {
			k = k - 2;
		}
		cout << endl;
	}
}