package Day6;

import java.util.Arrays;

public class MaxandMinArray {
// Logic 1= take one array and do sorting
	// when we sort min value is array(0) and max is array(array.length-1)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9, 80, 7, 5, 6};
        Arrays.sort(array);
        System.out.println("Max is: "+array[array.length-1]+'\t'+"Min is: "+ array[0]);
// logic 2 
       // declare one array and consider max=a[0]
        // iterate the whole array ignoring zero index using for loop and put condition if a[i]> max then replace max=a[i]
        
        //code for logic 2
        int [] arr= {2,45,93,77,23};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
        	if(arr[i]>max)
        	{
        		max=arr[i];
        	}
        }
        
        System.out.println("max number in array is: "+ max);
        
        int [] brr= {2,45,93,77,23};
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
        	if(arr[i]<min)
        	{
        		min=arr[i];
        	}
        }
        
        System.out.println("max number in array is: "+ min);
        
     


	}

}
