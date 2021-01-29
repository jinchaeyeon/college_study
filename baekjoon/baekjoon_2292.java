import java.util.*;

public class Main {
	public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
 
		int n = s.nextInt();
		int count = 1; 
		int range = 2;	 
 
		if (n == 1) {
			System.out.print(1);
		}
 
		else {
			while (range <= n) {	
				range = range + (6 * count);	
				count++;	// count 1 증가 
			}
			System.out.print(count);
		}
	}
}