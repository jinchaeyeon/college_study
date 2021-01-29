import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		if(a >=1 && a <= 4000) {
			if (( (a % 4 == 0 && a % 100 != 0) || a % 400 == 0)){
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}	
		}
	}
}