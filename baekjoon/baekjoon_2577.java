import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
 
		int arr[] = {0,0,0,0,0,0,0,0,0,0};
		int a =s.nextInt();
		int b= s.nextInt();
		int c = s.nextInt();
		
		int d = a*b*c;
		
		while(true) {
			int e = d%10;
			d = d/10;
			
			arr[e] += 1;
			
			if(d == 0) {
				break;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}
}