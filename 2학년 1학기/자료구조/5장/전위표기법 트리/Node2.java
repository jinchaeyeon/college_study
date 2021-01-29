public class Node2<E> {
	private E item ;
	private Node2<E> next;
	
	public Node2(E newitem, Node2<E> node) {
		item = newitem;
		next = node;
	}
	
	public E getItem() {return item;}
	public Node2<E> getNext() {return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(Node2<E> newNext) { next = newNext;}
}