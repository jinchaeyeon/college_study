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
	cout << "<원> 중심=(" << getcen1() << "," << getcen2() << ") 반지름=" << gethei() << " 면적=" << getArea() << "->" << "꼭지점은 (" << cen1 << "," << cen2 + hei << ") (" << cen1 + hei << "," << cen2 << ") (" << cen1<< "," << cen2 - hei << ") (" << cen1 - hei << "," << cen2  << ")" << endl;
}

void Circle::printmodify() const {
	cout << "<원> 중심=(" << getcen1() << "," << getcen2() << ") 반지름=" << gethei()  << "이 추가되었습니다.";
}
