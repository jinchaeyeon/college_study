import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.print(Factorial(n));
		
	
	}
	
	public static int Factorial(int n) {
		
		if(n <=1) {
			return 1;
		}
		else {
			return n*Factorial(n-1);
		}
	}
}
