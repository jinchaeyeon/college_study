import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int arr[] = new int[a];
		
		for (int i = 0; i < a; i++) {
			int b = s.nextInt();
			int c = s.nextInt();
			
			arr[i] = b + c;
		}
		
		for(int i = 0; i<a; i++) {
			System.out.println(arr[i]);
		}
	}
}