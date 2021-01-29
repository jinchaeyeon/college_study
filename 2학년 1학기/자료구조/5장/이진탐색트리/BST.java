import java.util.EmptyStackException;

class BST<Key extends Comparable<Key>, Value> {
	private NodeTree root;
	
	public NodeTree getRoot() {return root;}
	public BST(Key newid, Value newname) {
		root = new NodeTree(newid, newname);
	}
	
	public Value get(Key k) {return get(root, k);}
	public Value get(NodeTree n, Key k) {
		if(n == null) {return null;}
		int t = n.getid().compareTo(k);
		if(t>0) { return get(n.getLeft(),k);}
		else if(t<0) { return get(n.getRight(),k);}
		else	{ return (Value) n.getName();}
	}
	
	public void put(Key k, Value v) {root = put(root,k,v);}
	public NodeTree put(NodeTree n ,Key k , Value v) {
		if(n == null) { return new NodeTree(k,v);}
		int t = n.getid().compareTo(k);
		if(t>0) {n.setLeft(put(n.getLeft(), k ,v));}
		else if(t<0) { n.setRight(put(n.getRight(),k,v));}
		else	{n.setName(v);}
		return n;
	} 
	
	public int height(NodeTree root) {
    	if(root == null) {return 0;}
    	else {
    		return (1+Math.max(height(root.getLeft()), height(root.getRight())));
    	}
    }
	
	public void levelOrder(NodeTree root) { 
		//직접구상
	    	Queue<NodeTree> q = new Queue<NodeTree>();
	    	Queue2<NodeTree> q2 = new Queue2<NodeTree>();
	    	
	    	NodeTree t;
	    	q.add(root);
	    	int count = 1;
	    	int level = 1;
	    	int h = height(root);
	    	int blank = (height(root)-1)*20;
	    	int length = 0;
	    	
	    	while(!q.isEmpty() || level < h) {
	    		int count2 = count*2;
	       		for(int i=0; i<count; i++) {
	        		t = q.remove();

	        		System.out.print(t.getName());
	    		
					for(int k=0; k<blank-6; k++) {
						System.out.print(" ");
					}
					
					if(t.getLeft() == null && t.getRight() == null) {
						NodeTree newNode = new NodeTree(0,"      ");
						t.setLeft(newNode);
	        			q.add(t.getLeft());
	        			q2.add(t.getLeft());
	        			NodeTree newNode2 = new NodeTree(0,"      ");
	        			t.setRight(newNode2);
	        			q.add(t.getRight());
	        			q2.add(t.getRight());
					}
					else {
						if(t.getLeft() != null) {
	    					q.add(t.getLeft());
		        			q2.add(t.getLeft());
	    				}
	    				else {
	        				NodeTree newNode = new NodeTree(0,"X     ");
	        				t.setLeft(newNode);
	        				q.add(t.getLeft());
		        			q2.add(t.getRight());
	    				}
	   
	    				if(t.getRight() != null) {
	    					q.add(t.getRight());
		        			q2.add(t.getRight());
	    				}
	    				else {
	    					NodeTree newNode = new NodeTree(0,"X     ");
	        				t.setRight(newNode);
	        				q.add(t.getRight());
		        			q2.add(t.getRight());
	    				}
					}
	    		}
	       		if(level == h) {
	       			break;
	       		}
	       		int count3 = 0;
	       		System.out.println();
	       		for(int i=0; i<count2; i++) {
	       			while(q2.isEmpty() == false) {
	       			if(q2.remove().getName() == "      ") {
	       				for(int k=0; k<blank/2; k++) {
       						System.out.print(" ");
       					}
	       			}
	       			else {
	       				System.out.print("+");
	       				if(count3 % 2 == 0 ) {
	       					if(count2 == i+1) {;	
	       						break;
	       					}
	       					for(int k=0; k<blank/2-1; k++) {
	       						System.out.print("-");
	       					}
	       				}
	       				else {
	       					for(int k=0; k<blank/2-1; k++) {
	       						System.out.print(" ");
	       					}
	       				}
	       				count3++;
	       			}
	       			}
	       		}
	    		System.out.println();
	    		blank = blank/2;
	    		level++;
	    		count= count*2;
	    	}
	    }
}
