import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int count = 0;
		boolean t;

		for(int i=0; i<n; i++) {
			int a = s.nextInt();
			t = false;
		
			for(int j = 2; j <a; j++) {
				if(a% j == 0) {
					t = true;
					break;
				}
			}
				
			if(t == false && a>1) {
				count++;
			}
		}
		
		System.out.print(count);
	}
}