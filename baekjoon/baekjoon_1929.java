import java.util.*;

public class Main {
	public static boolean[] prime;
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int min = s.nextInt();
		int max = s.nextInt();


		prime = new boolean[max + 1];
		get_prime();

		for(int i = min; i <= max; i++) { 
			if(!prime[i]) System.out.println(i);
		}
	}

	public static void get_prime() {
		prime[0] = prime[1] = true;

		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}