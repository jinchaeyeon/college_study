import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			int c = s.nextInt();
			String str= s.next();

			for(int j = 0; j < str.length(); j++) {
				for(int k=0; k < c; k++) {
					System.out.print(str.charAt(j));
				}
			}
			
			System.out.println();
		}
	}
}