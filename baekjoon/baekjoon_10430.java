import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a>=2&& b>=2&& c<=10000) {
			int d = (a+b)%c;
			System.out.println(d);
			d = ((a%c) + (b%c))%c;
			System.out.println(d);
			d = (a*b)%c;
			System.out.println(d);
			d = ((a%c) * (b%c))%c;
			System.out.println(d);
		}
				
	}
}