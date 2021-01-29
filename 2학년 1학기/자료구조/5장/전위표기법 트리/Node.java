public class Node<E> {
	private E item ;
	private Node<E> next;
	int isp;
	int icp;
	
	public Node(E newitem, Node<E> node,int newisp, int newicp) {
		item = newitem;
		next = node;
		isp = newisp;
		icp = newicp;
	}
	
	public E getItem() {return item;}
	public Node<E> getNext() {return next;}
	public int getisp() {return isp;}
	public int geticp() {return icp;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(Node<E> newNext) { next = newNext;}
	public void setisp(int newisp) {isp = newisp;}
	public void seticp(int newicp) {icp = newicp;}
}