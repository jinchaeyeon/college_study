import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int min = s.nextInt();
		int max = s.nextInt();
		int count = 0;
		int arr[] = new int[max];
		boolean t;

		for(int i = min; i <= max; i++) {
			t = false;
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					t = true;
				}
			}

			if(t == false && i >1) {
				arr[count++] = i;
			}
		}

		if(count != 0) {
			int sum = 0;

			for(int k = 0; arr[k] != '\0'; k++) {
				sum += arr[k];
			}

			System.out.println(sum);
			System.out.print(arr[0]);
		}
		else {
			System.out.print("-1");
		}
	}
}