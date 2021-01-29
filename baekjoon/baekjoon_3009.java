import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int [] a = {s.nextInt(), s.nextInt()};
		int [] b = {s.nextInt(), s.nextInt()};
		int [] c = {s.nextInt(), s.nextInt()};
		
		int x;
		int y;
		
		if(a[0] == b[0]) {
			x = c[0];
		}
		else if (a[0] == c[0]) {
			x = b[0];
		}
		else {
			x = a[0];
		}
		
		if(a[1] == b[1]) {
			y = c[1];
		}
		else if (a[1] == c[1]) {
			y = b[1];
		}
		else {
			y = a[1];
		}
		
		System.out.print(x + " " + y);
	}
}
 