import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        
        char [] str = new char[100];
        String st = s.next();

        int[] al = new int[26];
        for(int i=0; i<al.length; i++) {
        	al[i]= -1;
        }
        
        for(int i=0; i<st.length(); i++){
           str[i] = (char) st.charAt(i);
           int count = 0;
           if(i>0) {
        	   for(int j=i-1; j>=0; j--) {
        		   if(str[j] == str[i] ) {
        			   count++;
        		   }
        	   }
           }

           if(count == 0) {
           if(str[i] == 'a') {
        	   al[0] = i;
           }
           if(str[i] == 'b') {
        	   al[1] = i;
           }
           if(str[i] == 'c') {
        	   al[2] = i;
           }
           if(str[i] == 'd') {
        	   al[3] = i;
           }
           if(str[i] == 'e') {
        	   al[4] = i;
           }
           if(str[i] == 'f') {
        	   al[5] = i;
           }
           if(str[i] == 'g') {
        	   al[6] = i;
           }
           if(str[i] == 'h') {
        	   al[7] = i;
           }
           if(str[i] == 'i') {
        	   al[8] = i;
           }
           if(str[i] == 'j') {
        	   al[9] = i;
           }
           if(str[i] == 'k') {
        	   al[10] = i;
           }
           if(str[i] == 'l') {
        	   al[11] = i;
           }
           if(str[i] == 'm') {
        	   al[12] = i;
           }
           if(str[i] == 'n') {
        	   al[13] = i;
           }
           if(str[i] == 'o') {
        	   al[14] = i;
           }
           if(str[i] == 'p') {
        	   al[15] = i;
           }
           if(str[i] == 'q') {
        	   al[16] = i;
           }
           if(str[i] == 'r') {
        	   al[17] = i;
           }
           if(str[i] == 's') {
        	   al[18] = i;
           }
           if(str[i] == 't') {
        	   al[19] = i;
           }
           if(str[i] == 'u') {
        	   al[20] = i;
           }
           if(str[i] == 'v') {
        	   al[21] = i;
           }
           if(str[i] == 'w') {
        	   al[22] = i;
           }
           if(str[i] == 'x') {
        	   al[23] = i;
           }
           if(str[i] == 'y') {
        	   al[24] = i;
           }
           if(str[i] == 'z') {
        	   al[25] = i;
           }
        }
        }
        for(int i=0; i<al.length; i++) {
        	System.out.print(al[i]+" ");
        }
    }
}