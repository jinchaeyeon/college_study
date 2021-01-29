#pragma once
#include "Shape.h"

class Rhombus :public Shape
{
private:
	double cen1, cen2, hei, wid, area;
public:
	Rhombus(double cen1, double cen2, double hei, double wid);
	double getArea()const;
	void print() const;
	void printmodify() const;
};

