import java.util.Scanner;

class Main {
	int count =0;//��üȽ��
	public static void main(String[] args){

		Scanner s= new Scanner(System.in);
		int n=s.nextInt();

		Main Hanoi = new Main();

		Hanoi.movehanoi("1","2","3",n);
		Hanoi.showResult();
	}

	public void movehanoi(String first, String center, String last, int n){
		if(n==1){
			++count;
			System.out.println(n+" : " + first+" �� " +last);
			}
		else{
			movehanoi(first,last,center,n-1);
			++count;
			System.out.println(n+" : " + first+" �� " +last);
			movehanoi(center,first,last,n-1);
			}
	}
	
	public void showResult(){
		System.out.println("�� �̵�Ƚ��: "+count);
	}
}