import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b =s.nextInt();
		int c = s.nextInt();
		
		if(c <= b) {
			System.out.print("-1");
		}
		else {
			System.out.print((a/(c-b))+1);
		}
	}
}