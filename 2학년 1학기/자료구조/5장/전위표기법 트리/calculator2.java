import java.util.EmptyStackException;
import java.util.*;

public class calculator2 {
	private Node3 top,rear;
	private int size;
	
	public calculator2() {
		top = rear = null;
		size = 0;
	}
	
	public int size() {return size;}

	public boolean isEmpty2() {
		return (size == 0);
	}
	
	public void add(String newItem) {
		Node3 newNode = new Node3(newItem, null);
		if(isEmpty2()) {top= newNode;}
		else {
			rear.setNext(newNode);
		}
		rear = newNode;
		size++;
	}
	
	public String remove() {
		if(isEmpty2()) throw new NoSuchElementException();
		String frontItem = top.getItem();
		top = top.getNext();
		if(top == null) {rear = null;}
		size--;
		return frontItem;
		}
	
	public String peek() {
		if(isEmpty2()) throw new NoSuchElementException();
		String frontItem = top.getItem();
		return frontItem;
		}
}