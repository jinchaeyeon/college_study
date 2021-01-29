#include <iostream>
using namespace std;

int main() {
	int size;

	cout << "입력 : ";
	cin >> size;

	for (int i = 4; i <= size; i++) {
		int sum = 0;
		for (int j = 1; j < i; j++) {
			if (i % j == 0) {
				sum += j;
			}
		}

		if (sum == i) {
			cout << sum << "(";
			for (int k = 1; k < i; k++) {
				if (i % k == 0 && sum == i) {
					if (k != 1) {
						cout << "+";
					}
					cout << k;
				}
			}
			cout << ")" << endl;
		}
	}
}