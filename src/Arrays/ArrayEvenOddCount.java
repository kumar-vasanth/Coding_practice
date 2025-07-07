package Arrays;

public class ArrayEvenOddCount {

	public static void main(String[] args) {
		int rr[]= {2,4,8,3,5,9,1};
		int evencount=0;
		int oddCount=0;
		for(int i=0;i<rr.length-1;i++)
		{
			if(rr[i]%2==0)
			{
				evencount++;
			}
			else {
				oddCount++;
			}
		}
System.out.println("Even count: "+evencount);
System.out.println(oddCount);
	}

}
