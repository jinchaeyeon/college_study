import java.util.Scanner;

class Fibonacci2 {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);

		int n=s.nextInt();

		int a=1;
		int b=1;
		int answer=0;
	
		if(n==0){
			System.out.println(n+ "번째 피보나치 수열은 " +0);
			}
		else if(n<3){
			System.out.println(n+ "번째 피보나치 수열은 " +1);
			}
		else{
			for(int i=2; i<n; i++){
				answer = a+b;
				a=b;
				b=answer;
			}
			System.out.println(n+ "번째 피보나치 수열은 " + answer);
		}
	}
}