#include "Day.h"

int main() {
	Day day;
	string d = "12";

	while (true) {
		cout << day;
		cin >> d;
		day.menu(day, d);
	}
}