import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.print(sum(arr));
	}
	
	public static long sum(int[] a) {
		long sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
}