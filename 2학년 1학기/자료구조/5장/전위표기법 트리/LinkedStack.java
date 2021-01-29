import java.util.EmptyStackException;

public class LinkedStack<E> {
	private Node <E> top;
	private int size;
	
	public LinkedStack() {
		top = null;
		size = 0;
	}
	
	public int size() {return size;}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void push(E item,int isp,int icp) {
		Node newNode = new Node(item,top,isp,icp);
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
	
	public int peekisp() {
		if(isEmpty()){return 15;}
		return top.getisp();
	}
}