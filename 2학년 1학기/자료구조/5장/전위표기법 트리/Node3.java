public class Node3 {
	private String item ;
	private Node3 next;
	
	public Node3(String newitem, Node3 node) {
		item = newitem;
		next = node;
	}
	
	public String getItem() {return item;}
	public Node3 getNext() {return next;}
	public void setItem(String newItem) {item = newItem;}
	public void setNext(Node3 newNext) { next = newNext;}
}