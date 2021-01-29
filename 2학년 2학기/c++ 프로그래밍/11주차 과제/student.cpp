#include "student.h"

student::student() {
	id = 0;
	name = "";
	club = new LinkedList<string>();
}

student:: student(int id, string name) {
	this->id = id;
	this->name = name;
	this->club = new LinkedList<string>();
}

int student:: getid() {
	return id;
}

string student::getname() {
	return name;
}

LinkedList<string> * student::getclub() {
	return club;
}

void student:: addclub(string c) {
	club->Add_First(c);
}
