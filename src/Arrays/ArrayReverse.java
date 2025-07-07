package Arrays;

import java.util.Arrays;

public class ArrayReverse {
// we should perform swapping by taking an temp variable,use while condition also.
	public static void main(String[] args) {
		int arr[]= {2,45,8,9,2,4,6};
		int start=0;
		int last=arr.length-1;
		int temp;
		while(start<last)
		{
			temp=arr[start];
			arr[start]=arr[last];
			arr[last]=temp;
			start++;
			last--;
			
		}
		//System.out.println(Arrays.toString(arr));
	// second method	
		 int[] ar = {2, 45, 8, 9, 2, 4, 6};

	        StringBuilder sb = new StringBuilder();

	        for (int i = ar.length - 1; i >= 0; i--) {
	            sb.append(ar[i]);
	            
	        }

	        System.out.println("Reversed array elements: " + sb.toString());
		
		
		
		
		
		
	}

}
