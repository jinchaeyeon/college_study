import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
	
		int n = s.nextInt();
		String arr[] = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.next();
		}
		
		for(int i = 0; i<n; i++) {
			int sum = 0;
			int count = 0;
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count ++;
				}
				else {
					count = 0;
				}
				sum += count;
			}
			
			System.out.println(sum);
		}
	}
}