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
	cout << "<�ﰢ��> �߽�=(" << getcen1() << "," << getcen2() << ") ����=" << gethei() << " �ʺ�=" << getwid() << " ����=" << getArea() << "->" << "�������� (" << cen1 - wid / 2 << "," << (cen2 * 2 + hei) / 2 << ") (" << cen1 + wid / 2 << "," << (cen2 * 2 - hei) / 2 << ") (" << cen1 - wid / 2 << "," << (cen2 * 2 - hei) / 2 << ")" << endl;
}

void Triangle::printmodify() const {
	cout << "<�ﰢ��> �߽�=(" << getcen1() << "," << getcen2() << ") ����=" << gethei() << " �ʺ�=" << getwid() << "�� �߰��Ǿ����ϴ�.";
}