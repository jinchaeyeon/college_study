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
		cout << "[1] ���� �߰� [2] ���� ���� [3] ���� ���� [4] ���� ��ü ��� [0] ����" << endl << "���ϴ� ����� �����ϼ���: ";
		cin >> num;
		switch (num) {
		case 0:
			cout << "�����մϴ�.";
			exit(0);
		case 1:
			cout << "*** ���� �߰� ***" << endl << "[T] �̵�ﰢ�� [R] ���簢�� [D] ������ [C] �� [Q] ���" << endl << "�߰��� ������ �����ϼ���: ";
			cin >> shape;
			if (shape == "Q") {
				break;
			}
			cout << "�߽����� ���� �ΰ��� ������ �Է��ϼ���: ";
			cin >> center1 >> center2;
			if (shape == "C") {
				cout << "�������� �Է��ϼ��� : ";
				cin >> height;
				if (height == 0) {
					cout << "�������� �����ϴ�.";
					break;
				}
				Shape* cir = new Circle(center1, center2, height,0);
				list.insert(cir);
			}
			else {
				cout << "���̿� �ʺ� ���� �ΰ��� ������ �Է��ϼ��� : ";
				cin >> height >> width;
				if (height == 0 || width == 0) {
					cout << "���̳� �ʺ� �����ϴ�.";
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
					cout << "������ �߸��Է��ϼ̽��ϴ�.";
				}
			}
			break;
		case 2:
			cout << "*** ��ü ����(���� ��������) ***" << endl;
			for (int i = 0; i < list.size(); i++)
			{
				cout << "[" << i + 1 << "]";
				list[i]->print();
			}
			cout << "*** ���� ���� ***" << endl << " �� ��Ͽ��� �����ϰ��� �ϴ� ���� ��ȣ�� �����ϼ��� (0�� ���) : ";
			cin >> num;
			if (num == 0) {
				break;
			}
			list.remove(num);
			cout << "[T] �̵�ﰢ�� [R] ���簢�� [D] ������ [C] �� [Q] ���" << endl << "�����ϰ��� �ϴ� ������ �����ϼ���: ";
			cin >> shape;
			if (shape == "Q") {
				break;
			}
			cout << "�߽����� ���� �ΰ��� ������ �Է��ϼ���: ";
			cin >> center1 >> center2;
			if (shape == "C") {
				cout << "�������� �Է��ϼ��� : ";
				cin >> height;
				if (height == 0) {
					cout << "�������� �����ϴ�.";
					break;
				}
				Shape* cir = new Circle(center1, center2, height, 0);
				list.insert(cir);
			}
			else {
				cout << "���̿� �ʺ� ���� �ΰ��� ������ �Է��ϼ��� : ";
				cin >> height >> width;
				if (height == 0 || width == 0) {
					cout << "���̳� �ʺ� �����ϴ�.";
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
			cout << "*** ��ü ����(���� ��������) ***" <<endl;
			for (int i = 0; i < list.size(); i++)
			{
				cout << "[" << i + 1 << "]";
				list[i]->print();
			}
			cout << "*** ���� ���� ***" << endl << "�� ��Ͽ��� �����ϰ��� �ϴ� ���� ��ȣ�� �����ϼ��� (0�� ���) : ";
			cin >> num;
			if (num == 0) {
				break;
			}
			list.remove(num);
			break;
		case 4:
			cout << "*** ��ü ����(���� ��������) ***" << endl;
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