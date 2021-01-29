#include <iostream>
using namespace std;

int main() {

    int arr1[3][3] = { { 1,2,3 }, { 4,5,6 }, { 7,8,9 } };
    int arr2[3][3] = { { 1,-1,0 }, { 0,-1,1 }, { -1,1,0 } };
    int mul[3][3] = { 0 };

    cout << "두 행렬의 합은 " << endl;

    for (int i = 0; i < 3; i++) {
        cout << "|";
        for (int j = 0; j < 3; j++) {
            printf("%2d", arr1[i][j] + arr2[i][j]);
            if (j < 2) cout << " ";
        }
        cout << "|" << endl;
        cout << endl;
    }

    cout << "행렬의 곱은 " << endl;

    for (int i = 0; i < 3; i++) {
        cout << "|";
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                mul[i][j] += arr1[i][k] * arr2[k][j];
            }
            printf("%2d", mul[i][j]);
            if (j < 2) cout << " ";
        }
        cout << "|" << endl;
        cout << endl;
    }
}