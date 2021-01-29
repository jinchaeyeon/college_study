import java.util.Scanner;
import java.util.EmptyStackException;
import java.util.*;

public class ExpressionTree {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
		String exp = "first";
		while(!exp.equals("quit")) {
			Formula2 op = new Formula2();
			Formula3 ab = new Formula3();
		     System.out.print("������ �Է��Ͻÿ�.(����� quit): ");
			 exp = s.nextLine();
			 if(error(exp)== true) {
				 System.out.println("[����] ������ �� ���� ����");
			 }
			 else {
				 if(exp.equals("quit")== true) {
					 System.out.print("�����մϴ�.");
					 break;
				 }
				 System.out.print("--- ���� ������  : ");
				 op.toPostfix(exp);
				 System.out.println();
				 ab.splitword(op.a);
				 System.out.print("--- ���� ������  : ");
				 ab.root.preorder(ab.root.getRoot());
				 System.out.println();
				 System.out.println();
				 ab.root.levelOrder(ab.root.getRoot());
				 System.out.println();
				 System.out.print("---- ����� : ");
				 ab.z.print2();
			 }
		}
	}
	
	public static boolean error(String exp) {
		boolean a = false;
		
		for(int i = 0; i<exp.length()-2; i++) {
			char q = exp.charAt(i);
			char w = exp.charAt(i+1);
			char e = exp.charAt(i+2);
			
			int q1 = 0;
			int w1 = 0;
			int e1 = 0;
			
			if(q == '=' || q == '&' || q == '<'|| q == '>') {
				q1 = 1;
			}
			else {
				q1 = 0;
			}
			if(w == '=' || w == '&' || w == '<'|| w == '>') {
				w1 = 1;
			}
			else {
				w1 = 0;
			}
			if(e == '=' || e == '&' || e == '<'|| e == '>') {
				e1 = 1;
			}
			else {
				e1 = 0;
			}
			if(q1 == 1 && w1 == 1 && e1 == 1) {
				a = true;
			}
		}
		return a;
	}
}