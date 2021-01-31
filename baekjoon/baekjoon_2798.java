import java.util.*;

public class Main {
	int count =0;
	public static void main(String[] args){

		Scanner s= new Scanner(System.in);

		int n = s.nextInt();
		int sum = s.nextInt();
		int [] arr = new int[n];
		boolean t = false;

		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		int nsum = 0;

		there: for(int i = 0; i < n; i++) {
			for(int j = i+1 ; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					if(arr[i] + arr[j] + arr[k] == sum) {
						System.out.print(arr[i]+arr[j] + arr[k]);
						t = true;
						break there;
					}
					else if(arr[i] + arr[j] + arr[k] < sum && arr[i] + arr[j] + arr[k] > nsum) {
						nsum = arr[i] + arr[j] + arr[k];
					}
				}
			}
		}

		if(t == false) {
			System.out.print(nsum);
		}
	}
}