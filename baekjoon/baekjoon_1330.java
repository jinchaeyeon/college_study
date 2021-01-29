import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		if(-10000 <= a && a<=10000 && -10000 <= b && b<=10000) {
			if (a > b) {
				System.out.print(">");
			}
			else if (a < b) {
				System.out.print("<");
			}
			else {
				System.out.print("==");
			}
		}		
	}
}
