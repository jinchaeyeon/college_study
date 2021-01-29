#include <iostream>
#include "Shape.h"
#include "Triangle.h"
#include "LinkedList.h"
#include "Circle.h"
#include "Rhombus.h"
#include "Rectangle.h"
using namespace std;

int main() {

	int num;
	string shape;
	double center1;
	double center2;
	double height;
	double width;
	LinkedList<Shape> list = LinkedList<Shape>();

	while (true) {
		cout << "[1] 도형 추가 [2] 도형 변경 [3] 도형 삭제 [4] 도형 전체 출력 [0] 종료" << endl << "원하는 기능을 선택하세요: ";
		cin >> num;
		switch (num) {
		case 0:
			cout << "종료합니다.";
			exit(0);
		case 1:
			cout << "*** 도형 추가 ***" << endl << "[T] 이등변삼각형 [R] 직사각형 [D] 마름모 [C] 원 [Q] 취소" << endl << "추가할 도형을 선택하세요: ";
			cin >> shape;
			if (shape == "Q") {
				break;
			}
			cout << "중심점을 위한 두개의 정수를 입력하세요: ";
			cin >> center1 >> center2;
			if (shape == "C") {
				cout << "반지름을 입력하세요 : ";
				cin >> height;
				if (height == 0) {
					cout << "반지름이 없습니다.";
					break;
				}
				Shape* cir = new Circle(center1, center2, height,0);
				list.insert(cir);
			}
			else {
				cout << "높이와 너비를 위한 두개의 정수를 입력하세요 : ";
				cin >> height >> width;
				if (height == 0 || width == 0) {
					cout << "높이나 너비가 없습니다.";
					break;
				}

				if (shape == "T") {
					Shape* tri = new Triangle(center1, center2, height, width);
					list.insert(tri);
				}
				else if (shape == "R") {
					Shape* rec = new Rectangle(center1, center2, height, width);
					list.insert(rec);
				}
				else if (shape == "D"){
					Shape* rho = new Rhombus(center1, center2, height, width);
					list.insert(rho);
				}
				else {
					cout << "도형을 잘못입력하셨습니다.";
				}
			}
			break;
		case 2:
			cout << "*** 전체 도형(면적 오름차순) ***" << endl;
			for (int i = 0; i < list.size(); i++)
			{
				cout << "[" << i + 1 << "]";
				list[i]->print();
			}
			cout << "*** 도형 변경 ***" << endl << " 위 목록에서 변경하고자 하는 도형 번호를 선택하세요 (0은 취소) : ";
			cin >> num;
			if (num == 0) {
				break;
			}
			list.remove(num);
			cout << "[T] 이등변삼각형 [R] 직사각형 [D] 마름모 [C] 원 [Q] 취소" << endl << "변경하고자 하는 도형을 선택하세요: ";
			cin >> shape;
			if (shape == "Q") {
				break;
			}
			cout << "중심점을 위한 두개의 정수를 입력하세요: ";
			cin >> center1 >> center2;
			if (shape == "C") {
				cout << "반지름을 입력하세요 : ";
				cin >> height;
				if (height == 0) {
					cout << "반지름이 없습니다.";
					break;
				}
				Shape* cir = new Circle(center1, center2, height, 0);
				list.insert(cir);
			}
			else {
				cout << "높이와 너비를 위한 두개의 정수를 입력하세요 : ";
				cin >> height >> width;
				if (height == 0 || width == 0) {
					cout << "높이나 너비가 없습니다.";
					break;
				}

				if (shape == "T") {
					Shape* tri = new Triangle(center1, center2, height, width);
					list.insert(tri);
				}
				else if (shape == "R") {
					Shape* rec = new Rectangle(center1, center2, height, width);
					list.insert(rec);
				}
				else {
					Shape* rho = new Rhombus(center1, center2, height, width);
					list.insert(rho);
				}
			}
			list[num - 1]->printmodify();
			break;
		case 3: 
			cout << "*** 전체 도형(면적 오름차순) ***" <<endl;
			for (int i = 0; i < list.size(); i++)
			{
				cout << "[" << i + 1 << "]";
				list[i]->print();
			}
			cout << "*** 도형 삭제 ***" << endl << "위 목록에서 삭제하고자 하는 도형 번호를 선택하세요 (0은 취소) : ";
			cin >> num;
			if (num == 0) {
				break;
			}
			list.remove(num);
			break;
		case 4:
			cout << "*** 전체 도형(면적 오름차순) ***" << endl;
			for (int i = 0; i < list.size(); i++)
			{
				cout << "[" << i + 1 << "]";
				list[i]->print();
			}
			break;
		}
		cout << endl;
	}
}