import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		double a = s.nextInt();
		double b = s.nextInt();
		
		if(a>0&&b<10){
            double c = a/b;
            System.out.print(c);
        }
				
	}
}