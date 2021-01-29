#include "Rectangle.h"

Rectangle::Rectangle(double cen1, double cen2, double hei, double wid) :Shape(cen1, cen2, hei, wid) {
	this->cen1 = cen1;
	this->cen2 = cen2;
	this->hei = hei;
	this->wid = wid;
	area = hei * wid;
}

double Rectangle::getArea() const {
	return area;
}

void Rectangle::print() const {
	cout << "<���簢��> �߽�=(" << getcen1() << "," << getcen2() << ") ����=" << gethei() << " �ʺ�=" << getwid() << " ����=" << getArea() << "->" << "�������� (" << cen1 - wid / 2 << "," << cen2 + hei/ 2 << ") (" << cen1 + wid / 2 << "," << cen2 + hei / 2 << ") (" << cen1 + wid / 2 << "," << cen2 - hei / 2 << ") (" << cen1 - wid / 2 << "," << cen2 - hei / 2 << ")" << endl;
}

void Rectangle::printmodify() const {
	cout << "<���簢��> �߽�=(" << getcen1() << "," << getcen2() << ") ����=" << gethei() << " �ʺ�=" << getwid() << "�� �߰��Ǿ����ϴ�.";
}