#include <iostream>
#include <cstdlib>
#include <random>
using namespace std;

class Matrix
{
private:
	static const int SIZE = 3;
	int matrix[SIZE][SIZE];

public:
	Matrix();
	friend ostream& operator << (ostream& output, const Matrix& fr);
	Matrix operator + (const Matrix& ma);
	Matrix operator * (const Matrix& ma);
};

