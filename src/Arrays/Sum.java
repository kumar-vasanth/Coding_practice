package Arrays;

public class Sum {

	public static void main(String[] args) {
		int s[]= {1,4,6,9,4};
		int l=s.length;
		int sum=0;
		for(int i=0;i<l;i++)
		{
			sum=sum+s[i];
		}
   System.out.println("sum of array elements "+ sum);
	}

}
