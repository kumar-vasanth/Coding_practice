package Day7;

public class RepeatedNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,4,4,6,78,93,56};
		int rep=4;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(rep==a[i])
			{
				count++;
			}
		}
		
		System.out.println("Number of times given number is repeated is:  "+count);

	}

}
