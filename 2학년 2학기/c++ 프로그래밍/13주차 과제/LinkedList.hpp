#pragma once

template <typename T>
LinkedList<T>::LinkedList() {
	head = nullptr;
}

template <typename T>
LinkedList<T>:: ~LinkedList() {
	if (head != nullptr)
		deleteList(head);
}

template <typename T>
void LinkedList<T>::deleteList(T* Shape)
{
	if (Shape->getNext() != nullptr)
	{
		deleteList(Shape->getNext());
	}

	delete Shape;
}

template <typename T>
T* LinkedList<T>::getHead() const
{
	return head;
}


template <typename T>
void LinkedList<T>::setHead(T* Shape)
{
	head = Shape;
}


template <typename T>
void LinkedList<T>::insert(T* Shape)
{
	double area = Shape->getArea();
	if (head == nullptr)
	{
		head = Shape;
	}
	else if (head->getArea() > area) {
		Shape->setNext(head);
		head = Shape;
	}
	else
	{
		T * cur = head;
		T * pre = head;
		while (cur->getArea() < area)
		{
			pre = cur;
			cur = cur->getNext();
			if (cur == NULL)
			{
				break;
			}
		}
		pre->setNext(Shape);
		Shape->setNext(cur);
	}
}

template <typename T>
void LinkedList<T>::remove(int ShapeNum)
{
	if (head == nullptr || ShapeNum > size())
	{
		cout << "remove(" << ShapeNum << ") : Out Of Index!" << endl;
		return;
	}

	T* cur = head;

	for (int i = 1; i < ShapeNum - 1; i++)
	{
		cur = cur->getNext();
	}

	if (size() == 0)
	{
		delete head;
		head = nullptr;
	}
	else if (ShapeNum == 1)
	{
		T* tmp = head;
		head = head->getNext();
		delete tmp;
	}
	else
	{
		T* tmp = cur->getNext();
		cur->setNext(tmp->getNext());
		delete tmp;
	}
}

template <typename T>
T* LinkedList<T>::operator[](int i) const
{
	return this->at(i);
}

template <typename T>
T* LinkedList<T>::at(int i) const
{
	if (i >= size())
	{
		cout << "at(" << i << ") : Out Of Index!" << endl;
		return nullptr;
	}

	T* Shape = head;

	for (int j = 0; j < i; j++)
	{
		Shape = Shape->getNext();
	}

	return Shape;
}
template <typename T>
int LinkedList<T>::size() const
{
	T* Shape = head;
	int length = 0;

	while (true)
	{
		if (Shape == nullptr)
			break;
		else
		{
			length++;
			Shape = Shape->getNext();
		}
	}

	return length;
}