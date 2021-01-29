import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        
        char [] str = new char[100];
        String st = s.next();
        for(int i=0; i<st.length(); i++){
           str[i+1] = (char) st.charAt(i);
           System.out.print(str[i+1]);
           if((i+1)%10 == 0) {
        	   System.out.println();
           }
        }
    }
}