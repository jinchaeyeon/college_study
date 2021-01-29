import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		if(a >= 0 && a <= 23 && b >=0 && b <=59 ) {
			b = b-45;
			if(b < 0) {
				a = a-1;
				b = b + 60;
				if(a < 0) {
					a = 23;
				}
			}
			
			System.out.print(a + " " +b);
		}
	}
}