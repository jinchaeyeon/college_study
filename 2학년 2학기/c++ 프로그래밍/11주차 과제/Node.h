#pragma once
#include <iostream>

template <typename T>
class Node {
public:
	Node(const T data, Node *next);
	T getdata();
	Node<T>* getnext();
	void setdata(T d);
	void setnext(Node<T>* n);
private:
	T data;
	Node* next;
};

