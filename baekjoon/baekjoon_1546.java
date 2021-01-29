import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
	
		int n = s.nextInt();
		double arr[] = new double[n];
		double arr2[] = new double[n];
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			arr2[i] = arr[i]/arr[n-1]*100;
			sum += arr2[i];
		}
		
		System.out.print(sum/n);
	}
}