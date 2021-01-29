#include <iostream>
using namespace std;

class Fraction
{
private:
	int denom, numer, count;
	int reduce();

public:
	Fraction();
	Fraction(int n, int d);
	Fraction operator + (const Fraction& fr);
	friend ostream& operator << (ostream& output, const Fraction& fr);
};

