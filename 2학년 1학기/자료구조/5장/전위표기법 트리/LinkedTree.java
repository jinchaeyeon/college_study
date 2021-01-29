public class LinkedTree<E> {
	NodeTree<E> root;

	public LinkedTree(Object item) {
		root = new NodeTree(item,0);
	}
	
	public NodeTree<E> getRoot() {return root;}
	public void setRoot(NodeTree<E> newRoot) {root = newRoot;}
	
    public void preorder(NodeTree root){
        if(root!=null){
            System.out.print(root.getItem() + " ");
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }
    
    public int height(NodeTree root) {
    	if(root == null) {return 0;}
    	else {
    		return (1+Math.max(height(root.getLeft()), height(root.getRight())));
    	}
    }
    
    public void levelOrder(NodeTree root) { 
	//오한석학생이 프린트구현을 도와줌
    	Queue<NodeTree> q = new Queue<NodeTree>();
    	calculator2 cal = new calculator2 ();
    	
    	NodeTree t;
    	q.add(root);
    	int count = 1;
    	int level = 1;
    	int h = height(root);
    	int blank = (height(root)-1)*20;
    	int length = 0;
    	
    	while(!q.isEmpty() || level < h) {
    		String a = null;
       		for(int i=0; i<count; i++) {
        		t = q.remove();
        		if(t.getMiddle() != 0) {
    				System.out.print(t.getItem()+" (" + t.getMiddle() +")");
    				a = t.getItem() + " (" + t.getMiddle() + ")";
        		}
        		else {
        			System.out.print(t.getItem());
        			a = (String) t.getItem();
        		}
    		
				for(int k=0; k<blank-a.length(); k++) {
					System.out.print(" ");
				}
				
    			if(t.getLeft() != null) {
    				q.add(t.getLeft());
    				cal.add((String) t.getLeft().getItem());
    			}
    			else {
    				NodeTree newNode = new NodeTree(" ",0);
    				t.setLeft(newNode);
    				q.add(t.getLeft());
    				cal.add((String) t.getLeft().getItem());
    			}
    			
    			if(t.getRight() != null) {
    				q.add(t.getRight());
    				cal.add((String) t.getRight().getItem());
    			}
    			else {
    				if(t.getLeft().getItem() == " ") {
        				NodeTree newNode = new NodeTree(" ",0);
        				t.setRight(newNode);
        				q.add(t.getRight());
        				cal.add((String) t.getRight().getItem());
    				}
    				else {
    					NodeTree newNode = new NodeTree("X",0);
    					t.setRight(newNode);
    					q.add(t.getRight());
    					cal.add((String) t.getRight().getItem());
    				}
    			}
    		}
       		if(level == h) {
       			break;
       		}
       		System.out.println();
       		int count2 = 0;
       		while(cal.isEmpty2() == false) {
       			if(cal.remove() != " ") {
       				for(int o = 0; o < 1; o++) {
       					System.out.print("+");
       					if(count2 % 2 == 0 ) {
       						for(int k=0; k<blank/2-1; k++) {
       							if(cal.peek() != " ") {
       								System.out.print("-");
       							}
       							else {
       								System.out.print(" ");
       							}
       						}
       					}
       					else {
       						for(int k=0; k<blank/2-1; k++) {
       							System.out.print(" ");
       						}
       					}
       					count2++;
       				}
       			}
       			else {
					for(int k=0; k<blank/2; k++) {
   						System.out.print(" ");
   					}
					count2++;
       			}
       		}
    		System.out.println();
    		blank = blank/2;
    		level++;
    		count= count*2;
    	}
    }
}