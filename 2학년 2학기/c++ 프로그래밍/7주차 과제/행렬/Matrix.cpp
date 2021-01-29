#include "Matrix.h"

Matrix::Matrix() {
	random_device rng;
	auto result = rng();
	srand((unsigned int)result);

	for (int row = 0; row < SIZE; row++) {
		for (int col = 0; col < SIZE; col++) {
			matrix[row][col] = rand() % 21 - 10;
		}
	}
}

ostream & operator << (ostream& output , const Matrix& fr){
	for (int i = 0; i < fr.SIZE; i++) {
		output << "|";
		for (int j = 0; j < fr.SIZE; j++) {
			output << fr.matrix[i][j];
			if (j < fr.SIZE - 1) cout << "	";
		}
		output << "|" << endl;
		output << endl;
	}
	output << endl;

	return output;
}

Matrix Matrix::operator + (const Matrix& ma) {
	Matrix othermatrix;

	for (int i = 0; i < SIZE; i++) {
		for (int j = 0; j < SIZE; j++) {
			othermatrix.matrix[i][j] = matrix[i][j] + ma.matrix[i][j];
		}
	}

	return othermatrix;
}

Matrix Matrix::operator * (const Matrix& ma) {
	Matrix othermatrix;

	for (int i = 0; i < SIZE; i++) {
		for (int j = 0, sum = 0; j < SIZE; j++) {
			sum = 0;
			for (int k = 0; k < SIZE; k++) {
				sum += matrix[i][k] * ma.matrix[k][j];
			}
			othermatrix.matrix[i][j] = sum;
		}
	}

	return othermatrix;
}

