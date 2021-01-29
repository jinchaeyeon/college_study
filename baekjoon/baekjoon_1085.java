import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int h_x = s.nextInt();
		int h_y = s.nextInt();
		int s_x = s.nextInt();
		int s_y = s.nextInt();

		int x_min = Math.min(h_x, s_x-h_x);
		int y_min = Math.min(h_y, s_y-h_y);
		
		System.out.print(Math.min(x_min, y_min));
	}
}