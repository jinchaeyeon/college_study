import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		int b1 = b/100;
		int b2 = (b%100)/10;
		int b3 = (b%10);
		
		System.out.println(a*b3);
		System.out.println(a*b2);
		System.out.println(a*b1);
		System.out.println(a*b);
				
	}
}