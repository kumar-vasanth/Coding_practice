package Day8;
// Logic= we should use the string class methods called regular expression and replace spaces with no value
public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str = " Java   Programming   Language ";
		System.out.println("Original String: " + str);

		// Remove all white spaces
		String result = str.replaceAll("[\\s]", "");

		System.out.println("String after removing white spaces: " + result);
	}
}
