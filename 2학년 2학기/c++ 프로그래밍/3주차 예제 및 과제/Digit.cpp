#include <iostream>
using namespace std;

int main() {

	int val;
	void showDigit(int n);
	void showReverseDigit(int n);

	cout << "정수 입력 : ";
	cin >> val;
	cout << "바로 출력 : ";
	showDigit(val);
	cout << endl;
	cout << "거꾸로 출력 : ";
	showReverseDigit(val);
	return 0;
}

void showDigit(int n) {
	if (n > 10) {
		showDigit(n /10);
		n = n % 10;
		cout << n << " ";
	}
	else {
		cout << n << " ";
	}
}

void showReverseDigit(int n) {
	if (n > 0) {
		cout << n % 10 << " ";
		showReverseDigit(n / 10);
	}
}
