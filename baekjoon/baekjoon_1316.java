import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int count = s.nextInt();
		String arr[] = new String[count];
		int n = 0;

		for(int i=0; i<count; i++) {
			arr[i] = s.next();
		}

		for (int i = 0; i < count; i++) {
			int[] groupWords = new int[26];
			boolean groupWordsCheck = true;

			for (int j = 0; j < arr[i].length(); j++) {
				if (groupWords[(int)arr[i].charAt(j) - 97] > 0) {
					groupWordsCheck = false;
					break;
				}

				int count2 = 1;

				for (int k = j + 1; k < arr[i].length(); k++) {
					if (arr[i].charAt(j) != arr[i].charAt(k)) {
						groupWords[(int)arr[i].charAt(j) - 97] = count2;
						break;
					}

					j++;
					count2++;
				}
			}

			if (groupWordsCheck) {
				n++;
			}
		}

		System.out.println(n);
	}
}