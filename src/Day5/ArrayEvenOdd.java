package Day5;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,8,3,6,7,4};
		System.out.println("code is to print the even and odd");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Number is even");
			}
			
		}
		System.out.println("Extractoing odd numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("Number is odd");
			}
			
		}
		

	}

}
