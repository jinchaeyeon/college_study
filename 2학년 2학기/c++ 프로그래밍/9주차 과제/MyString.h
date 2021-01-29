#pragma once
#include <iostream>
using namespace std;

class MyString
{
private:
	char* str;
	int len;
	int pos;

public:
	MyString();
	MyString(const MyString & s);
	MyString(const char* str);
	~MyString();

	void resize(int n);
	int length() const;
	char at(int i) const;
	MyString substr(int start, int count) const;
	void insert(int now, const MyString& s);
	void insert(int now, const char * s);
	void erase(int start, int many);
	int find(const MyString& s) const;
	int find(const char* s) const;
	int find(const MyString& s, int start) const;
	int find(const char * s, int start) const;

	const MyString& operator + (const MyString& s);

	const MyString& operator += (char c);
	const MyString& operator += (const char * s);
	const MyString& operator += (const MyString& s);

	const MyString& operator = (const char *s);
	const MyString& operator = (const MyString& s);

	bool operator == (const MyString& s);
	bool operator != (const MyString& s);
	bool operator < (const MyString& s);
	bool operator <= (const MyString& s);
	bool operator >= (const MyString& s);
	bool operator > (const MyString& s);
	
	friend ostream& operator << (ostream& output, const MyString& s);
	friend istream& operator >> (istream& input, MyString& s);
};

