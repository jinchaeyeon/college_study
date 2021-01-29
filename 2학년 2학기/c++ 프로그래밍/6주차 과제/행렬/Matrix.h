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
	void random();
	void print();
	const Matrix add (const Matrix& ma);
	const Matrix multi(const Matrix& ma);
};

