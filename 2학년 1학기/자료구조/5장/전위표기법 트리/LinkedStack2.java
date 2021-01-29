import java.util.*;

public class LinkedStack2<E> {
	private Stack <E> top;
	private int size;
	
	public LinkedStack2() {
		top = null;
		size = 0;
	}
	
	public int size() {return size;}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void push(E item) {
		Stack newNode = new Stack(item,top);
		top = newNode;
		size++;
	}

	public E pop() {
		if(isEmpty()){throw new EmptyStackException();}
		E topItem = top.getItem();
		top = top.getNext();
		size --;
		return topItem;
	}

	public E peek() {
		if(isEmpty()){throw new EmptyStackException();}
		return top.getItem();
	}
}
