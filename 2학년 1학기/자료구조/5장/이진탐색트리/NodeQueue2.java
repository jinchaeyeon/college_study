public class NodeQueue2<E> {
	private E item ;
	private NodeQueue2<E> next;
	
	public NodeQueue2(E newitem, NodeQueue2<E> node) {
		item = newitem;
		next = node;
	}
	
	public E getItem() {return item;}
	public NodeQueue2<E> getNext() {return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(NodeQueue2<E> newNext) { next = newNext;}
}