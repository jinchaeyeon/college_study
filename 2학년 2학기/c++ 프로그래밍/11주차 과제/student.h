#pragma once
#include<iostream> 
#include "LinkedList.h"
#include "LinkedList.cpp"
using namespace std;

class student
{
private:
	int id;
	string name;
	LinkedList <string> *club;
public:
	student();
	student(int id, string name);
	int getid();
	string getname();
	LinkedList<string>* getclub();
	void addclub(string c);
};

