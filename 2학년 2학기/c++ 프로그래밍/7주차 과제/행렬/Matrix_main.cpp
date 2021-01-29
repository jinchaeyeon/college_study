#include "Matrix.h"

int main()
{
	Matrix m1, m2;
	cout << m1 << m2;

	cout << "행렬 합 " << endl;
	cout << m1 + m2 << endl;

	cout << "행렬 곱 " << endl;
	cout << m1 * m2 << endl;

	return 0;
}