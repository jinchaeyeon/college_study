import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.next();
		String str2 = s.next();
		String str3 = "";
		String str4 = "";
		
		for(int i = 2; i >= 0; i--) {
			str3 += str.charAt(i);
			str4 += str2.charAt(i);
		}
		
		if(Integer.parseInt(str3) > Integer.parseInt(str4)) {
			System.out.print(str3);
		}
		else {
			System.out.print(str4);
		}
	}
}