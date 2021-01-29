import java.util.Scanner;
import java.util.*;

public class Tree {
		public static void main(String[] args) {

			BinaryTree bt = new BinaryTree();
			Scanner s = new Scanner(System.in);

			System.out.print("노드의 개수를 입력하시오: ");
			int n = s.nextInt();
	        int[] arr = new int[n+1];
	        int count= 1;
	        
	        for(int i=1; i<arr.length;i++) {
	        	arr[i]= i;
	        }
	        
	        bt.print(arr, count);
	        System.out.println();
	        System.out.print("preorder	: ");
	        bt.preOrder(arr,count);
	        System.out.println();
	        System.out.print("inorder		: ");
	        bt.inOrder(arr,count);
	        System.out.println();
	        System.out.print("postorder	: ");
	        bt.postOrder(arr,count);
	        System.out.println();
	        System.out.print("levelorder	: ");
	        bt.levelOrder(arr,count);
	        System.out.println();
		}
}