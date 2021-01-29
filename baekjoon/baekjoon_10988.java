import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        
        char [] str = new char[100];
        String st = s.next();
        
        int n = 1;
        
        for(int i=0; i<st.length(); i++){
           str[i] = (char) st.charAt(i);
        }

        for(int j=0; j<st.length()/2; j++) {
        	if(str[j] !=str[st.length()-j-1]) {
        		n = 0;
        	}
       	}
        
        System.out.print(n);
    }
}