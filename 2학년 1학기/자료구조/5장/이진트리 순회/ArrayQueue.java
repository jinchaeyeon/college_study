import java.util.*;

public class ArrayQueue {
	private int [] q;
	private int front, rear, size;
	
	public ArrayQueue(){
		q = new int[2];
		front = rear = size = 0;
	}
	
	public int size() {return size;}
	public boolean isEmpty() { return (size == 0);}
	
	public void add(int newItem) {
		if((rear+1)%q.length == front) {resize(2*q.length);}
		rear = (rear+1) % q.length;
		q[rear] = newItem;
		size++;
	}
	
	public int remove() {
		if(isEmpty()) {throw new NoSuchElementException();}
		front = (front+1) %q.length;
		int item = q[front];
		q[front] = 0;
		size--;
		if(size >0 && size == q.length/4) {
			resize(q.length/2);
		}
		return item;
	}
	
	public void resize(int newsize) {
		int [] t = new int[newsize];
		for(int i=1, j=front+1; i<size+1; i++, j++) {
			t[i] = q[j%q.length];
		}
		front = 0;
		rear = size;
		q = t;
	}
}