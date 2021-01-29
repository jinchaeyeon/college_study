#pragma once
#include <iostream>
#include <ctime>
#include <string>
#include <ctype.h>

using namespace std;

class Day
{
private:
	int year, mon, mday, Dday;

public:
	Day();
	Day(int years, int mons, int mdays, int Ddays);
	void setDay(string d);
	friend const Day operator + (Day& D, int day);
	friend const Day operator ++ (Day& D);
	friend const Day operator - (Day& D, int day);
	friend const Day operator -- (Day& D);
	friend ostream& operator <<(ostream& output, const Day& d1);
	int days(int year, int month);
	void menu(Day& d1, string d);
};

