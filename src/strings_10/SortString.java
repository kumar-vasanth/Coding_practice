package strings_10;

import java.util.Arrays;

public class SortString {

	// logic is we have to swap the character using one temp variable.

	public static void main(String[] args) {
		String st = "munkeyjava";
		char ar[] = st.toCharArray();
		char temp;
		for (int i = 0; i < st.length(); i++) {
			for (int j = i + 1; j < st.length(); j++) {
				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}

		}
		System.out.println(ar);
		
		// 2nd approach using the sort bydefault methods
		String sew="signature";
		char cr[]=sew.toCharArray();
		Arrays.sort(cr);
		System.out.println(cr);
		
		
		
		
		
		

	}

}
