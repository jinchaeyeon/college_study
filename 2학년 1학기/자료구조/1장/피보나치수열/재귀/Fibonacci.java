import java.util.Scanner;

class Fibonacci {
	public static void main(String[] args){

		Scanner s= new Scanner(System.in);
		int n=s.nextInt();

		sequence(n);
		System.out.println(n+ "번째 피보나치 수열은 " + sequence(n));
	}

	public static int sequence(int n){
		if(n==0){
			return 0;
			}
		else if(n<3){
			return 1;
			}
		else{
			return sequence(n-1)+sequence(n-2);
			}
	}
}