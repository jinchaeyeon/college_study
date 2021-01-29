#include "Matrix.h"

int check = 0;

int main()
{
	Matrix m1, m2;

	m1.print(); m2.print();

	Matrix m3 = m1.add(m2);
	cout << "두 행렬의 합은 " << endl;
	m3.print();

	m3 = m1.multi(m2);
	cout << "두 행렬의 곱은" << endl;
	m3.print();
	return 0;
}

Matrix::Matrix() {

	if (check == 0) {
		random();
	}
	else {
		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				matrix[row][col] = 0;
			}
		}
	}
}

void Matrix::random() {
	random_device rng;
	auto result = rng();
	srand((unsigned int)result);

	for (int row = 0; row < SIZE; row++) {
		for (int col = 0; col < SIZE; col++) {
			matrix[row][col] = rand() % 21 - 10;
		}
	}
}

void Matrix::print() {
	for (int i = 0; i < SIZE; i++) {
		cout << "|";
		for (int j = 0; j < SIZE; j++) {
			printf("%2d", matrix[i][j]);
			if (j < SIZE - 1) cout << "	";
		}
		cout << "|" << endl;
		cout << endl;
	}
	cout << endl;
}

const Matrix Matrix::add(const Matrix& ma) {
	check = 1;
	Matrix othermatrix;

	for (int i = 0; i < SIZE; i++) {
		for (int j = 0; j < SIZE; j++) {
			othermatrix.matrix[i][j] = matrix[i][j] + ma.matrix[i][j];
		}
	}

	return othermatrix;
}

const Matrix Matrix::multi(const Matrix& ma) {
	check = 1;
	Matrix othermatrix;

	for (int i = 0; i < SIZE; i++) {
		for (int j = 0; j < SIZE; j++) {
			for (int k = 0; k < SIZE; k++) {
				othermatrix.matrix[i][j] += matrix[i][k] * ma.matrix[k][j];
			}
		}
	}

	return othermatrix;
}

