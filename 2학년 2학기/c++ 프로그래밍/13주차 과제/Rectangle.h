#pragma once
#include "Shape.h"

class Rectangle :public Shape
{
private:
	double cen1, cen2, hei, wid, area;
public:
	Rectangle(double cen1, double cen2, double hei, double wid);
	double getArea()const;
	void print() const;
	void printmodify() const;
};

