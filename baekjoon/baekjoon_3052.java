import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[] n = new int[10];
		int count = 0;


		for(int i=0;i<10;i++) {   
			n[i] = s.nextInt()%42; 

		}


		for(int i=0;i<10;i++) {      
			int cnt = 0;
			for(int j=i+1 ;j<10 ;j++) {   
				if(n[i]==n[j]) {    
					cnt++;
				}
			}
			if(cnt==0) {   
				count++;
			}
		}
		System.out.println(count);  
	}
}