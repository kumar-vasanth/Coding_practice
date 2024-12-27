package Day9;

public class ChangeWordOrdeArray {
	// Logic== Take down the string with 3 or more words
	// convert the string to the array and apply for loop to read the each word

	public static void main(String[] args) {
		
		String d1="put the basket ";
		String d2="Put the ";
		Boolean c=d1.equalsIgnoreCase(d2);
		d1=d1.replace("bas", "ball");
		System.out.println(d1);

		String st = " Try to reverse the words";
		String[] w = st.split(" ");
		String reverse = "";
		// words the reverse to try
		for (int i = w.length - 1; i >= 0; i--) {
			if (i == 0)

			{

				reverse = reverse + w[i];
			}

			else {
				reverse = reverse + w[i] + " ";
			}
		}

		System.out.println("sequence of words got chnaged: " + reverse.toLowerCase());

	}

}
