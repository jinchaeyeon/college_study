#pragma once
#include <iostream>
using namespace std;

class Shape
{
protected:
	double cen1, cen2, hei, wid,area;
	Shape* next;
public:
	Shape();
	Shape(double cen1, double cen2, double hei, double wid);
	virtual double getArea()const;
	virtual double getcen1()const;
	virtual double getcen2()const;
	virtual double gethei()const;
	virtual double getwid()const;
	Shape* getNext() const;
	void setNext(Shape * s);
	virtual ~Shape();
	virtual void print() const = 0;
	virtual void printmodify() const = 0;
};

