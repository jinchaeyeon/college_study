#include "Rhombus.h"

Rhombus::Rhombus(double cen1, double cen2, double hei, double wid) :Shape(cen1, cen2, hei, wid) {
	this->cen1 = cen1;
	this->cen2 = cen2;
	this->hei = hei;
	this->wid = wid;
	area =( hei * wid)/2;
}

double Rhombus::getArea() const {
	return area;
}

void Rhombus::print() const {
	cout << "<������> �߽�=(" << getcen1() << "," << getcen2() << ") ����=" << gethei() << " �ʺ�=" << getwid() << " ����=" << getArea() << "->" << "�������� (" << cen1 << "," << cen2 + hei / 2 << ") (" << cen1 + wid / 2 << "," << cen2 << ") (" << cen1 << "," << cen2 - hei / 2 << ") (" << cen1 - wid / 2 << "," << cen2 << ")" << endl;
}


void Rhombus::printmodify() const {
	cout << "<������> �߽�=(" << getcen1() << "," << getcen2() << ") ����=" << gethei() << " �ʺ�=" << getwid() << "�� �߰��Ǿ����ϴ�.";
}