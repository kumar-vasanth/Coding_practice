package Day2;

public class Palindrome {
// logic = here same as reverse number logic catching and elimination but we have to store num to one variable for later comparison
	public static void main(String[] args) {
		
		int num=1991;
		int rev=0;
		int orgnum=num;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;	
			
		}
		System.out.println("print rev num: "+ rev);
		if(orgnum==rev)
		{
			System.out.println("The given num is palindrome");
			
		}
		else
		{
		System.out.println("normal number");	
		}
		
		
		

	}

}
