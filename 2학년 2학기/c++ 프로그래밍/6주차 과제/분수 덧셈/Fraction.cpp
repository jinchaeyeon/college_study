#include "Fraction.h"

int main()
{
	Fraction f1, f2(2, 5), f3;
	f1.setDenom(3);
	f1.setNumer(2);
	f3 = f1.add(f2);
	f3.print();
	return 0;
}

Fraction:: Fraction(){
	denom = 1;
	numer = 1;
}

void Fraction::setDenom(int d) {
	denom = d;
}

void Fraction::setNumer(int n) {
	numer = n;
}

Fraction:: Fraction(int n, int d){
	numer = n;
	denom = d;

	reduce();
}

const Fraction Fraction:: add(const Fraction& fr) {
	int a, b;
	a = numer * fr.denom + fr.numer * denom;
	b = denom * fr.denom;

	return Fraction(a, b);
}

int Fraction:: reduce(){
	int gcd = getGCD(numer, denom);
	numer /= gcd;
	denom /= gcd;

	return 1;
}

int Fraction:: getGCD(int a, int b){
	int temp;
	while (b)
	{
		temp = a % b;
		a = b;
		b = temp;
	}
	return a;
}

void Fraction:: print() {
	if (denom == 1) {
		cout << numer;
	}
	else if (denom != 0) {
		cout << numer << "/" << denom;
	}
	else {
		cout << "분모가 0이므로 에러 발생";
	}
}