import java.util.*;

public class BinaryTree {

    public void preOrder(int[] arr,int count){
        if(count>=arr.length) {
            return;
        }
        System.out.print(arr[count]+" ");
        preOrder(arr,2*count);
        preOrder(arr,2*count+1);
    }

    public  void inOrder(int[] arr,int count){
        if(count>=arr.length){
        	return;
        }
        inOrder(arr,2*count);
        System.out.print(arr[count]+" ");
        inOrder(arr,2*count+1);
    }
    


    public void postOrder(int[] arr,int count){
    	if(count>=arr.length){
    		return;
    	}
        postOrder(arr,2*count);
        postOrder(arr,2*count+1);
        System.out.print(arr[count]+" ");
    }
    
    public void levelOrder(int [] arr,int count) {
    	ArrayQueue q = new ArrayQueue();
    	int t;
    	q.add(arr[count]);
    	    	
    	while(!q.isEmpty()) {
    		t= q.remove();
    	    System.out.print(t + " ");

    	    if(2*count < arr.length) {
    	    	if(arr[2*count] != 0) {
    	    		q.add(arr[2*count]);
    	    	}
    	    }
    	    if(2*count+1 < arr.length) {
   	    	 	if(arr[2*count+1] != 0) {
   	    	 		q.add(arr[2*count+1]);
   	    	 	}
    	    }
    	    count++;
    	}
    }
    
    public void print(int [] arr,int count) {
    	int n= 1;
    	int blank = (int) Math.pow(2, height(arr)-1);
    	for(int i=1; i<arr.length; i++) {
    		if(arr[count]%2 == 1 && arr[count] !=1) {
    			if(arr[count]>=10) {
    				for(int j=0; j<(blank*8)-2; j++) {
    					System.out.print("-");
    				}
    			}
    			else {
    				for(int j=0; j<(blank*8)-1; j++) {
    					System.out.print("-");
    				}
    			}
    		}
    		else{
    			for(int j=0; j<blank; j++) {
    				System.out.print("	");
    			}
    		}
    		System.out.print(arr[count]);
    		if(arr.length-1 == count && (arr[count]%2 == 0)) {
    			if(arr[count]>=10) {
    				for(int j=0; j<(blank*8)-2; j++) {
    					System.out.print("-");
    				}
    			}
    			else {
    				for(int j=0; j<(blank*8)-1; j++) {
    					System.out.print("-");
    				}
    			}
    		}
    		if(count == Math.pow(2, n)-1) {
    			System.out.println();
        		for(int j=0; j<(Math.pow(2, n)-1)-(Math.pow(2, n-1)-1); j++) {
        			for(int k=0; k<blank; k++) {
        				System.out.print("	");
        			}
        			
        			if(height(arr) == n+1) {
        				int w = (int) ((arr.length-(Math.pow(2, n)-1))/2);
        				if(j<w) {
        					System.out.print("+");
        				}
        			}
        			else {
        				if(arr.length == Math.pow(2, n)) {
        					break;
        				}
        				else {
        					System.out.print("+");
        				}
        			}
        		}
        		if(count == Math.pow(2, n)-1) {
        			System.out.println();
        			n++;
        			blank = blank/2;
        		}
    		}
    		count++;
    	}
    }

    public int height(int [] arr) {
    	int n=1;
    	while((Math.pow(2, n)-1) < arr.length-1) {
    		n++;
    	}
    	return n;
    }
}