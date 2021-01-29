import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		int cross_count = 1, prev_count_sum = 0;
		 
		while (true) {
        
			if (x <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	
					System.out.print((cross_count - (x - prev_count_sum - 1)) + "/" + (x - prev_count_sum));
					break;
				} 
				
				else {	
					System.out.print((x - prev_count_sum) + "/" + (cross_count - (x - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
	}
}