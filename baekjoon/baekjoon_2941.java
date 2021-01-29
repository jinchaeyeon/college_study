import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.next();
		int count = 0;

		for(int i=0; i<str.length(); i++) {
			switch(str.charAt(i)) {
			case 'c': 
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-') {
						i++;
					}
				}
				break;
			case 'd':
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == 'z') {
						if(i < str.length() - 2) {
							if(str.charAt(i+2) == '=') {
								i+=2;
							}
						}
					}
					else if(str.charAt(i+1) == '-') {
						i++;
					}
				}
				break;
			case 'l':
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == 'j') {
						i++;
					}
				}
				break;
			case 's':
				if(i < str.length() - 1) {
					if(str.charAt(i+1)=='=') {
						i++;
					}
				}
				break;
			case 'n':
				if(i< str.length() -1) {
					if(str.charAt(i+1) == 'j') {
						i++;
					}
				}
				break;
			case 'z':
				if(i < str.length() - 1) {
					if(str.charAt(i+1)== '=') {
						i++;
					}
				}
				break;
			}
			count++;
		}

		System.out.print(count);
	}
}