import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int arr [] = new int[3];
		
		while(true) {
			arr[0] = s.nextInt();
			arr[1] = s.nextInt();
			arr[2] = s.nextInt();
			if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}
			
			Arrays.sort(arr);
			
			if(Math.pow(arr[0],2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
				System.out.println("right");
			}
			else {
				System.out.println("wrong");
			}
			
			
		}
	}
}
 