import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
 
		int size = s.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0] + " "+ arr[size-1]);
	}
}