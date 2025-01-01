package Day1;

import java.util.Scanner;

public class ReverseNumber {
   // here we should remember catching and elimination
	//catch and give that to rev printed variable using %
	// elimiate input num everytime using / and iterate while loop
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("User should enter the numbe:....");
		// Logic 1 = Use an algorithm to reverse
		/*
		 * int num=sc.nextInt();
		 *  int rev=0;
		 *   while(num!=0)
		 *    { rev=rev*10+num%10;
		 * num=num/10; }
		 */
		
		/*
		 * int num=sc.nextInt(); StringBuffer sbfr=new
		 * StringBuffer(String.valueOf(num));
		 * 
		 * StringBuffer rev=sbfr.reverse();
		 * System.out.println("the reversed number is: "+rev);
		 * 
		 */
		
		int num=sc.nextInt();
		StringBuilder sbfr=new StringBuilder(String.valueOf(num));
		
		StringBuilder rev=sbfr.reverse();
		System.out.println("the reversed number is: "+rev);
		
		

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
