import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		String num= s.next();
		
		int sum = 0;
		
		for(int i=0; i< n; i++) {
			sum += num.charAt(i) - '0';
		}
		
		System.out.print(sum);
	}
}