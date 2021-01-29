import java.util.*;

public class Main {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		if(n >=1 && n<= 100) {
			for(int i = 1; i<= n; i++) {
				for(int j = n-1; j > i-1; j--) {
					System.out.print(" ");
				}
				for(int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}