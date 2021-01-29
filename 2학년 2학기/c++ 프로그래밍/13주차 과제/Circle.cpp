#include "Circle.h"

Circle::Circle(double cen1, double cen2, double hei, double wid) :Shape(cen1, cen2, hei, wid) {
	this->cen1 = cen1;
	this->cen2 = cen2;
	this->hei = hei;
	this->wid = wid;
	area = hei * hei * 3.14;
}

double Circle::getArea() const {
	return area;
}

void Circle::print() const {
	cout << "<��> �߽�=(" << getcen1() << "," << getcen2() << ") ������=" << gethei() << " ����=" << getArea() << "->" << "�������� (" << cen1 << "," << cen2 + hei << ") (" << cen1 + hei << "," << cen2 << ") (" << cen1<< "," << cen2 - hei << ") (" << cen1 - hei << "," << cen2  << ")" << endl;
}

void Circle::printmodify() const {
	cout << "<��> �߽�=(" << getcen1() << "," << getcen2() << ") ������=" << gethei()  << "�� �߰��Ǿ����ϴ�.";
}
