public class Stack<E> {
	private E item ;
	private Stack<E> next;

	public Stack(E newitem, Stack<E> node) {
		item = newitem;
		next = node;
	}
	
	public E getItem() {return item;}
	public Stack<E> getNext() {return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(Stack<E> newNext) { next = newNext;}
}