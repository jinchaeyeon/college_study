import java.util.*;

public class Main{
    public static void main(String args[]){
        int input = 0; 
        int count = 0;
        Scanner s = new Scanner(System.in);
        input = s.nextInt();
        
        while(true) {
            if (input % 5 ==0) {
                System.out.println(input/5 + count);
                break;
            }else if(input <= 0) {
                System.out.println(-1);
                break;
            }
            input = input-3;
            count++;
        }
    }
}