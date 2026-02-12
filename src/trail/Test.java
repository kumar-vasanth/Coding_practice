package trail;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // reverse a string code
		    String str = "Hello World";	
		    String rev = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}
			
			System.out.println(rev);
			// TODO Auto-generated method stub
			
	}

}
