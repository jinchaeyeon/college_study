public class NodeTree<E> {
	private E item ;
	private int middle ;
	private NodeTree<E> left;
	private NodeTree<E> right;

	
	public NodeTree(E newitem,int newmiddle) {
		item = newitem;
		middle = newmiddle;
		left = null;
		right = null;
	}
	
	public E getItem() {return item;}
	public int getMiddle() {return middle;}
	public NodeTree<E> getLeft() {return left;}
	public NodeTree<E> getRight() {return right;}
	public void setItem(E newItem) {item = newItem;}
	public void setMiddle(int newmiddle) {middle = newmiddle;}
	public void setLeft(NodeTree<E> newLeft) { left = newLeft;}
	public void setRight(NodeTree<E> newRight) { right = newRight;}
}