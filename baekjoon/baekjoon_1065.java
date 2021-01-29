import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print(one(s.nextInt()));
		s.close();
	}

	public static int one(int n) {
		int count = 0;

		if(n < 100) {
			return n;
		}
		else {
			count = 99;
			if (n== 1000) { 
				n = 999;
			}
			for(int i = 100; i<= n; i++) {
				int hun = i/100;
				int ten = (i/10)%10;
				int one = i%10;

				if((hun-ten) == (ten - one)) {
					count++;
				}
			}
		}
		return count;
	}
}