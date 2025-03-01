package Day4;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=7;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0) {
					count++;
				}				
			}
			
			if(count==2)
			{
				System.out.println("Number is prime");
			}
			else
				System.out.println("Number is not prime");
			
			
			
		}
		
		else
		{
			System.out.println("Given number is not prime number");
		}
		
	// prime check
		
		int tak=5;
		int count1=0;
		if(tak>0)
		{
		   for(int i=1;i<=tak;i++)
		   {
			   if(tak%i==0)
			   {
				   count1++;  
			   }
			   if(count==2)
			   {
				   System.out.println("Number is prime");
			   }
			   else
				   System.out.println("number is not prime");
			   
		   }
		}
		else
		{
			System.out.println(" number is not prime number");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
