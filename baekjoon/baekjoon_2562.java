import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
 
		int arr[] = new int[9];
		int arr2[] = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = s.nextInt();
			arr2[i] = arr[i];
		}
		
		Arrays.sort(arr);
		System.out.println(arr[8]);
		
		for(int i=0; i<9; i++) {
			if(arr2[i] == arr[8]) {
				System.out.print(i+1);
			}
		}
	}
}