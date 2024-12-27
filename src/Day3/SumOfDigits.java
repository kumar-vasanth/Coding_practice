package Day3;

public class SumOfDigits {

	public static void main(String[] args) {
		int n=279353;
		int sum=0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("Sum of the input digits is:  "+sum);

	}

}
