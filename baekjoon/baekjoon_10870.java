import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.print(Fibonacci(n));
		
	
	}
	
	public static int Fibonacci(int n) {
		if(n==0){
			return 0;
			}
		else if(n<3){
			return 1;
			}
		else{
			return Fibonacci(n-1)+Fibonacci(n-2);
			}
	}
}

