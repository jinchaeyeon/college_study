#include <iostream>
using namespace std;

int sum = 1;

int main() {
	int n;

	int getFactorial(int n);

	cout << "숫자를 입력하시오: ";
	cin >> n;

	cout << getFactorial(n);
}

int getFactorial(int n) {
	if (n == 1) {
		return sum;
	}
	else {
		sum *= n;
		getFactorial(n - 1);
	}
}
