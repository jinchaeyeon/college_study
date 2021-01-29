import java.util.Scanner;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.*;

public class SearchTree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("���ڿ��� �Է��Ͻÿ�(�������� 0): "); 
			String a = "";
			Sort array = new Sort();
			int count2 = 0;
		
			while(true) {
				a = s.next();
				count2++;
				if(a.equals("0")) {break;}
				array.insert(a);
			}
			
			if(count2 == 1) {
				System.out.print("�����մϴ�");
				break;
			}
		
			String [] array2 = new String[array.Array.length];
		
			for(int i=0; i<array.Array.length; i++) {
				array2 [i] = array.Array[i];
			}

			Arrays.sort(array.Array);
		
			int r = 0;
	
			for(int i=0; i<array.Array.length; i++) {
				if(array.Array[0].equals(array2[i])) {
					r = i+1;
				}
			} // ��Ʈ�� Űã��
		
			BST bst = new BST(r,array.Array[0]);
		
			for(int i=0; i<array.Array.length; i++) {
				for(int j=0; j<array.Array.length; j++) {
					if(array.Array[j].equals(array2[i])) {
						bst.put(j+1, array.Array[j]);
					}
				}
			} 
		
			bst.levelOrder(bst.getRoot());
			System.out.println();
		}
	}
}