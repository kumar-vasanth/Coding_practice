 package Day5;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int num=4;
		int fact=1;
		int largest=Integer.MIN_VALUE;
		
		for(int i=1;i<=num;i++)
			
		{
			fact=fact*i;
		}
		
System.out.println("Factorial of the given number is:"+ fact);
	}

}
