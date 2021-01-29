#include "Fraction.h"

Fraction::Fraction() {
	denom = 1;
	numer = 1;
}

Fraction::Fraction(int n, int d) {
	numer = n;
	denom = d;

	reduce();
}

Fraction Fraction:: operator + (const Fraction& fr) {
	int a, b;
	a = numer * fr.denom + fr.numer * denom;
	b = denom * fr.denom;

	return Fraction(a, b);
}

int Fraction::reduce() {
	int gcd = getGCD(numer, denom);
	numer /= gcd;
	denom /= gcd;

	return 1;
}

int getGCD(int a, int b) {
	int temp;
	while (b)
	{
		temp = a % b;
		a = b;
		b = temp;
	}
	return a;
}

ostream& operator << (ostream& output, const Fraction& fr) {
	if (fr.denom == 1) {
		output << fr.numer;
	}
	else if (fr.denom != 0) {
		output << fr.numer << "/" << fr.denom;
	}
	else {
		output << "분모가 0이므로 에러 발생";
	}

	return output;
}