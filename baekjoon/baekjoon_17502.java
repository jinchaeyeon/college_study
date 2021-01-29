import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        
        char [] str = new char[a];
        String st = s.next();
        
        for(int i=0; i<st.length(); i++){
           str[i] = (char) st.charAt(i);
        }

        for(int j=0; j<st.length(); j++) {
        	if(str[j] == '?'&& str[st.length()-j-1] =='?') {
        		str[j] ='a';
        	}
        	else if(str[j] == '?'|| str[st.length()-j-1] !='?') {
        		int b = st.length()-j-1;
        		str[j] =str[b];
        	}
        	else if(str[j] != '?'|| str[st.length()-j-1] =='?') {
        		int b = st.length()-j-1;
        		str[b] =str[j];
        	}
       	}
        
        for(int i=0; i<st.length(); i++) {
        	System.out.print(str[i]);
        }
    }
}