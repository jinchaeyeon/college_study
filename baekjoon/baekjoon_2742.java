import java.util.*;

public class Main {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		if(n <= 100000) {
			for(int i = n; i >= 1; i--) {
				System.out.println(i);
			}
		}
	}
}