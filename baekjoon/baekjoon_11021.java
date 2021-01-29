import java.util.*;

public class Main {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i <n; i++) {
			int a = s.nextInt();
			int b= s.nextInt();
			
			if(a > 0 && a <10 && b >0 && b<10) {
				arr[i] = a + b;
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("Case #" + (i+1) + ": " + arr[i]);
		}
	}
}
