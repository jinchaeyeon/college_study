public class NodeQueue<E> {
	private E item ;
	private NodeQueue<E> next;
	
	public NodeQueue(E newitem, NodeQueue<E> node) {
		item = newitem;
		next = node;
	}
	
	public E getItem() {return item;}
	public NodeQueue<E> getNext() {return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(NodeQueue<E> newNext) { next = newNext;}
}