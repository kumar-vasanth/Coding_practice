package Day3;

import java.util.Scanner;

public class NumOfEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number here:   ");
		int num=sc.nextInt();
		int evenCount=0;
		int oddcount=0;
		while(num>0) 
		{
			int rem=num%10;	
		if(rem%2==0)
		{
			evenCount++;
		}
		else {
			oddcount++;
		}
		num=num/10;	
		}
		
		System.out.println("count if even and odd: "+evenCount +":"+ oddcount);
		
		
		
		
	}

}
