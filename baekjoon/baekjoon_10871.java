import java.util.*;

public class Main {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int c = s.nextInt();
		int arr[] = new int[n];
		
		if(n >=1 && n <= 10000 && c >=1 && c<=10000) {
			for(int i =0; i<n;i++) {
				arr[i] = s.nextInt();
			}
			
			for(int i=0; i<n; i++) {
				if(arr[i] < c) {
					System.out.print(arr[i]+ " ");
				}
			}
		}
	}	
}