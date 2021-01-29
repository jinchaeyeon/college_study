#pragma once
#include "Shape.h"

class Circle :public Shape
{
private:
	double cen1, cen2, hei, wid, area;
public:
	Circle(double cen1, double cen2, double hei, double wid);
	double getArea()const;
	void print() const;
	void printmodify() const;
};

