package Day7;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {2,4,7,23,45};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
			for(int i=0;i<num.length;i++)
			{
				if(num[i]>largest)
				{
					secondLargest=largest;
					largest=num[i];
				}
				if(num[i]<largest && num[i]> secondLargest)
				{
					secondLargest=num[i];
				}
			}
         System.out.println(secondLargest);
	}

}
