package Arrays;

public class ArrayElementSearch {

	public static void main(String[] args) {
		int crr[]= {4,5,8,34,56};
		int num=35;
		boolean found=false;
		for(int i=0;i<=crr.length-1;i++)
		{
			if(crr[i]==num)
			{
				System.out.println("Found number : "+crr[i]+" "+"at index: "+i);
				found=true;
			}
		}
		
		if(found==false)
		{
			System.out.println("Element ot found");
		}

	}

}
