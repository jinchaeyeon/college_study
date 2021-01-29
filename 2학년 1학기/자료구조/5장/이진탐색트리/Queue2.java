import java.util.EmptyStackException;
import java.util.*;

public class Queue2 <E> {
	private NodeQueue2<E> front, rear;
	private int size;
	
	public Queue2() {
		front = rear = null;
		size = 0;
	}
	
	public int size() {return size;}
	public boolean isEmpty() {return size() == 0;}
	
	public void add(E newItem) {
		NodeQueue2 newNode = new NodeQueue2(newItem, null);
		if(isEmpty()) {front= newNode;}
		else {
			rear.setNext(newNode);
		}
		rear = newNode;
		size++;
	}
	
	public E remove() {
		if(isEmpty()) throw new NoSuchElementException();
		E frontItem = front.getItem();
		front = front.getNext();
		if(front == null) {rear = null;}
		size--;
		return frontItem;
		}
}