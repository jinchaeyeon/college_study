import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.next();
		int arr[] = new int[26];
		for(int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') { 
				arr[str.charAt(i) - 'A']++;	
			}
		    
			else {
				arr[str.charAt(i) - 'a']++;
			}
		}
		
		char c = '?';
		int max = -1;
		
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				c = (char) (i + 65); 
			}
			else if (arr[i] == max) {
				c = '?';
			}
		}
		
		System.out.print(c);
	}
}