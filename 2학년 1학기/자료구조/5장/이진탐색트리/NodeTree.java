class NodeTree<Key extends Comparable<Key>, Value> {
	private Key id;
	private Value name ;
	private NodeTree left;
	private NodeTree right;

	
	public NodeTree(Key newid, Value newname) {
		id = newid;
		name = newname;
		left = null;
		right = null;
	}
	
	public Key getid() {return id;}
	public Value getName() {return name;}
	public NodeTree getLeft() {return left;}
	public NodeTree getRight() {return right;}
	public void setid(Key newid) {id = newid;}
	public void setName(Value newname) {name = newname;}
	public void setLeft(NodeTree newLeft) { left = newLeft;}
	public void setRight(NodeTree newRight) { right = newRight;}
}