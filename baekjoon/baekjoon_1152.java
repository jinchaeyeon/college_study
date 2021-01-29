import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.nextLine();
		str = str.trim();
	
        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(str.split(" ").length);
        }
	}
}