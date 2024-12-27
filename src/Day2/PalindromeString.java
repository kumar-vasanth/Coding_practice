package Day2;

public class PalindromeString {

	public static void main(String[] args) {
		String st="madam";
		String ogst=st;
		String rev="";
		int l=st.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+st.charAt(i);
			
		}
		System.out.println(rev);
		if(ogst.equals(rev))
		{
			System.out.println(ogst+  ":    the given string is palindrome:  ");
		}
			
		else System.out.println(ogst+ ":   the given string is not-palindrome ");

	}

}
