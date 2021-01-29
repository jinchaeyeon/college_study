#pragma once
#include "Node.h"
#include "Node.cpp"
#include <iostream>
using namespace std;

template <typename T>
class LinkedList {
public:
	LinkedList();
	~LinkedList();
	void Add_First(T item);
	void Add( T item);
	void Delete(int id, Node<T> * n);
	Node <T>* Find(int id);
	Node<T>* getNode();
	void printclub();
	void print();
private:
	Node<T>* head;
};

