import java.util.*;

public class matrix{
	public static void main(String arg[]){

	int arr[][] = new int[4][4];

	System.out.println("최초 행렬");

	for(int i=0; i<4; i++) {
		for(int j=0; j<4; j++) {
			arr[i][j] = (int)(100*Math.random());
			System.out.print(arr[i][j]+"	");
			if(j==3){
			System.out.println();
				}
			}
		}

	System.out.println("\n우측으로 90도 회전");
		
	for(int j=0; j<4; j++) {
		for(int i=3; i>=0; i--) {
			System.out.print(arr[i][j]+"	");
			if(i==0){
			System.out.println();
				}
			}
		}

	System.out.println("\n좌측으로 90도 회전");

	for(int j=3; j>=0; j--) {
		for(int i=0; i<4; i++) {
			System.out.print(arr[i][j]+"	");
			if(i==3){
			System.out.println();
				}
			}
		}

	System.out.println("\n역행렬");

	for(int j=0; j<4; j++) {
		for(int i=0; i<4; i++) {
			System.out.print(arr[i][j]+"	");
			if(i==3){
			System.out.println();
				}
			}
		}
	}
}
