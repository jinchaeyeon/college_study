import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
 
		int count = s.nextInt();
		
		for(int i=0; i<count; i++) {
			int h = s.nextInt();
			int w = s.nextInt();
			int n = s.nextInt();
			int num = 0;
			
			for(int j = 1; j<=w; j++) {
				for(int k = 1; k <= h; k++) {
					num++;
					if(num== n) {
						String a ="";
						if(j < 10) {
							a = Integer.toString(k) + "0" + Integer.toString(j);
						}
						else {
							a = Integer.toString(k) + Integer.toString(j);
						}
						System.out.println(a);
					}
				}
			}
		}
	}
}