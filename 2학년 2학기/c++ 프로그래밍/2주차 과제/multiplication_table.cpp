#include <iostream>
using namespace std;

int main() {
	int times;
	int mul;
	int print;
	int count;

	cout << "몇단까지 출력할까요? : ";
	cin >> times;
	cout << "몇까지 곱할까요? :";
	cin >> mul;
	cout << "한줄에 몇단씩 출력할까요? : ";
	cin >> print;

	for (int j = 1; j < times + 1; j += print) {
		for (int k = 1; k < mul + 1; j = j - count, k++) {
			count = 0;
			for (int i = 0; i < print; i++) {
				if (j <= times) {
					cout << j << " * " << k << " = " << j * k << "	";
					count++;
					j++;
				}
			}
			cout << endl;
		}
		cout << endl;
	}
}