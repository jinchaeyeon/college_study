import java.util.*;

public class Main {
	public static void main(String[] args) {
 
		Scanner s = new Scanner(System.in);
 
		int n = s.nextInt();
		int num = 666;
		int count = 1;
        
		while(count != n) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
	}
}