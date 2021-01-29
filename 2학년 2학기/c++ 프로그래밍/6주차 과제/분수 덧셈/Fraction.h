#include <iostream>
using namespace std;

class Fraction
{
private:
	int denom, numer;

public:
	Fraction();
	Fraction(int n, int d);
	void setDenom(int d);
	void setNumer(int n);
	const Fraction add(const Fraction& fr);
	int reduce();
	int getGCD(int a, int b);
	void print();
};

