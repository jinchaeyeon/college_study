#include "Node.h"

template <typename T>
Node<T>::Node(const T data, Node* next) {
	this->data = data;
	this->next = next;
}

template <typename T>
T Node<T>::getdata() {
	return data;
}

template <typename T>
Node<T>* Node<T>::getnext() {
	return next;
}

template <typename T>
void Node<T>::setdata(T d) {
	data = d;
}

template <typename T>
void Node<T>::setnext(Node<T>* n) {
	next = n;
}