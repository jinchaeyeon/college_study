#include <iostream>
using namespace std;

int main() {
	int n;

	int getFactorial(int n);

	cout << "숫자를 입력하시오: ";
	cin >> n;

	cout << getFactorial(n);
}

int getFactorial(int n) {
	int sum = 1;
	for (int i = 1; i <= n; i++) {
		sum *= i;
	}

	return sum;
}