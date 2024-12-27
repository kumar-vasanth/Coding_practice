package Day2;

import java.util.Scanner;
//logic= Take one variable to capture length count=0; and use while loop and divide operator to count length until num bcoms zero.
public class CountNoDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("eneter the input here:  ");
       int num=sc.nextInt();
       int count =0;
       
       while(num>0)
       {
    	   num=num/10;
    	   count++;
       }
       System.out.println("Number of diguts in a given number is ;  "+ count);
       
	}

}
