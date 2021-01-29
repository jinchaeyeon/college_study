#include "Triangle.h"

Triangle:: Triangle(double cen1, double cen2, double hei, double wid) :Shape(cen1, cen2, hei, wid){
	this->cen1 = cen1;
	this->cen2 = cen2;
	this->hei = hei;
	this->wid = wid;
	area = (hei * wid) / 2;
}

double Triangle::getArea() const {
	return area;
}

void Triangle::print() const {
	cout << "<삼각형> 중심=(" << getcen1() << "," << getcen2() << ") 높이=" << gethei() << " 너비=" << getwid() << " 면적=" << getArea() << "->" << "꼭지점은 (" << cen1 - wid / 2 << "," << (cen2 * 2 + hei) / 2 << ") (" << cen1 + wid / 2 << "," << (cen2 * 2 - hei) / 2 << ") (" << cen1 - wid / 2 << "," << (cen2 * 2 - hei) / 2 << ")" << endl;
}

void Triangle::printmodify() const {
	cout << "<삼각형> 중심=(" << getcen1() << "," << getcen2() << ") 높이=" << gethei() << " 너비=" << getwid() << "가 추가되었습니다.";
}