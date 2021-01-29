import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a>=1&& b<=10000) {
			int c = a + b;
			System.out.println(c);
			c = a - b;
			System.out.println(c);
			c = a * b;
			System.out.println(c);
			c = a / b;
			System.out.println(c);
			c = a % b;
			System.out.println(c);
		}
				
	}
}