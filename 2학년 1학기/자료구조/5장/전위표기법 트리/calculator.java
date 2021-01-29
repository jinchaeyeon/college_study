import java.util.EmptyStackException;

public class calculator<E> {
	private Node2 <E> top;
	private int size;
	
	public calculator() {
		top = null;
		size = 0;
	}
	
	public int size() {return size;}

	public boolean isEmpty2() {
		return (size == 0);
	}
	
	public void push2(E item) {
		Node2 newNode = new Node2(item,top);
		top = newNode;
		size++;
	}
	
	public E pop() {
		if(isEmpty2()){throw new EmptyStackException();}
		E topItem = top.getItem();
		top = top.getNext();
		size --;
		return topItem;
	}
	
	public E peek() {
		if(isEmpty2()){throw new EmptyStackException();}
		return top.getItem();
	}
	
	public void print2() {
		Node2 p = top;
		while(p != null) {
			System.out.print(p.getItem() + " ");
			p = p.getNext();
		}
		System.out.println();
	}
}
