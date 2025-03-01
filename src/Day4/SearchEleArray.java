package Day4;

public class SearchEleArray {

	public static void main(String[] args) {
		// Logic= here we are finding the element in an array
       // need one variable finding number storage
		//iterate the for loop for the entire array and use boolean variable if we found elemnt make it true
		// if boolean value is false then print not found
	
		int arr[]= {2,45,6,4,9,1};
		int Value=44;
		boolean set=false;
		for(int i=0;i<arr.length-1;i++)
		{
		   if(Value==arr[i])	
		   {
			   set=true;
			   System.out.println("Found the number in the array: "+Value);
			   break;
		   }
		   
	
		}
		if(set==false)
		{
			System.out.println("searching element not found in the array");
		}

		
		
		int searchNum=44;
		int [] ar= {10,24,44,23,67,78};
		boolean set1=false;
		
		for(int i =0;i<ar.length;i++)
		{
			if(searchNum==ar[i])
			{
				set1=true;
				System.out.println("Element found in the array");
				break;
			}
		}
		
		
		if(set1==false)
		{
			System.out.println("element not found in the array");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
