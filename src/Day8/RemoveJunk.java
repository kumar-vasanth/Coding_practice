package Day8;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s="@#$%^&7996@$With char spcl";
		// We have one method in string class called the regular expression to remove the special characters.
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("special characters are removed: "+ s);

	}

}
