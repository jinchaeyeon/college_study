#include "LinkedList.h"

template <typename T>
LinkedList<T>::LinkedList() {
	this->head = NULL;
}

template <typename T>
LinkedList<T>:: ~LinkedList() {
	Node<T>* temp;
	while (head != NULL)
	{
		temp = head;
		head = head->getNext();
		delete temp;;
	}
}

template <typename T>
void LinkedList<T>::Add_First(T item) {
	this->head = new Node<T>(item, this->head);
}

template <typename T>
void LinkedList<T>::Add(T item) {
	Node<T>* cur = head;
	Node<T>* pre = head;
	int num = item.getid();

	if (head == NULL || cur->getdata().getid() > num)
	{
		Add_First(item);
	}
	else
	{
		while (cur->getdata().getid() < num)
		{
			pre = cur;
			cur = cur->getnext();
			if (cur == NULL)
			{
				break;
			}
		}
		pre->setnext(new Node<T>(item, cur));
	}
}

template <typename T>
void LinkedList<T>::Delete (int id, Node<T> * n) {
	if (head == NULL) {
		cout << "리스트가 없습니다.";
	}
	Node<T>* temp = head;
	if (id == head->getdata().getid()) {
		head = head->getnext();
		delete temp;
	}
	else {
		Node<T>* p = n->getnext();
		n->setnext(p->getnext());
		delete p;
	}
}

template <typename T>
Node <T>* LinkedList<T>::Find(int id) {
	Node <T>* cur = this->head;
	Node <T>* pre = this->head;
	while (cur->getdata().getid() != id) {
		pre = cur;
		cur = cur->getnext();
	}
	return pre;
}

template <typename T>
Node<T>* LinkedList<T>::getNode() {
	return head;
}

template<class T>
void LinkedList<T>::printclub ()
{
	Node<T>* p = head;
	cout << p->getdata();
	p = p->getnext();
	while (p != NULL)
	{
		cout << "/" << p->getdata();
		p = p->getnext();
	}
	delete p;
	p = NULL;
}

template<class T>
void LinkedList<T>::print()
{
	Node<T>* p = head;
	while (p != NULL)
	{
		cout << p->getdata().getid() << " " << p->getdata().getname() << " ";
		if (p->getdata().getclub()->getNode() != NULL) {
			p->getdata().getclub()->printclub();
		}
		p = p->getnext();
		cout << endl;
	}
	delete p;
	p = NULL;
}
