#include "Shape.h"
Shape::Shape() {
	next = nullptr;
	this->cen1 = 0;
	this->cen2 = 0;
	this->hei = 0;
	this->wid = 0;
	this->area = 0;
}

Shape:: Shape(double cen1, double cen2, double hei, double wid){
	this->cen1 = cen1;
	this->cen2 = cen2;
	this->hei = hei;
	this->wid = wid;
	area = 0;
}   

Shape:: ~Shape() {}

double Shape:: getArea() const{
	return area;
}

double Shape::getcen1() const {
	return cen1;
}

double Shape::getcen2() const {
	return cen2;
}

double Shape:: gethei() const {
	return hei;
}

double Shape::getwid() const {
	return wid;
}

Shape* Shape::getNext() const{
	return next;
}

void Shape::setNext(Shape *s) {
	next = s;
}
