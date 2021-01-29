import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for(int i = 0; i <n; i++) {
			int ax = s.nextInt();
			int ay = s.nextInt();
			int da = s.nextInt();
			int bx = s.nextInt();
			int by = s.nextInt();
			int db = s.nextInt();

			int distance_pow = (int)(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
			 
			 
			if(ax == bx && ay == by && da == db) {
				System.out.println(-1);
			}
			else if(distance_pow > Math.pow(da + db, 2)) {
				System.out.println(0);
			}
			else if(distance_pow < Math.pow(db - da, 2)) {
				System.out.println(0);
			}
			else if(distance_pow == Math.pow(db - da, 2)) {
				System.out.println(1);
			}
			else if(distance_pow == Math.pow(da + db, 2)) {
				System.out.println(1);
			}
			else {
				System.out.println(2);
			}
		}
	}
}

