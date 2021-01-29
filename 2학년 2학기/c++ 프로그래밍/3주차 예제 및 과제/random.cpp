#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
	int n;

	srand((unsigned int)time(NULL));

	int number = rand() % 100 + 1;

	int count = 0;
	bool tr = false;

	cout << "나는  100이하의 자연수 하나를 생각하고 있습니다." << endl;

	while (tr != true) {
		cout << "숫자를 짐작해서 입력하시오: ";
		cin >> n;

		count++;

		if (number < n) {
			cout << "내가 생각하고 있는 숫자는 " << n << "보다는 작은 숫자 입니다." << endl;
		}
		else if (number > n) {
			cout << "내가 생각하고 있는 숫자는 " << n << "보다는 큰 숫자 입니다." << endl;
		}
		else {
			tr = true;
			cout << "맞췄습니다!!!" << count << "번 만에 성공하셨네요!";
		}
	}

	return 0;
}