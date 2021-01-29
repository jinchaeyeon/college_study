#pragma once
#include <iostream>
using namespace std;

template <typename T>
class LinkedList {
public:
	LinkedList();

	~LinkedList();
	void deleteList(T* Shape);

	T* getHead() const;

	void setHead(T* Shape);

	void insert(T* Shape);
	void remove(int docuNum);

	T* operator [](int i) const;

	T* at(int i) const;
	int size() const;
private:
	T* head;
};
#include "LinkedList.hpp"
