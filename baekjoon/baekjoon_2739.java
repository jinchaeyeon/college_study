import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		
		if(a >= 1 && a <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(a + " * " +i + " = " + a*i);
			}
		}
	}
}