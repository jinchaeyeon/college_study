import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		if(a >=-1000 && a <= 1000 && a != 0 && b >=-1000 && b <= 1000 && b != 0 ) {
			if(a > 0 && b >0) {
				System.out.print("1");
			}
			else if (a < 0 && b > 0) {
				System.out.print("2");
			}
			else if (a < 0 && b < 0) {
				System.out.print("3");
			}
			else {
				System.out.print("4");
			}
		}
	}
}