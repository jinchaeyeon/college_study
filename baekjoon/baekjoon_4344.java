import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
	
		int n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			double arr[];
			int count;
			count = s.nextInt();
			double sum = 0;
			double ave = 0;
			double c = 0;
			arr = new double[count];
			
			for(int j=0; j<count; j++) {
				arr[j] = s.nextInt();
				sum += arr[j];
			}
			
			ave = sum / count;
			
			for(int k = 0; k<count; k++) {
				if(arr[k] > ave) {
					c++;
				}
			}
			
			double a = c/count*100;
			
			System.out.println(String.format("%.3f", a) + "%");
		}
	}
}