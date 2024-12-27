package Day6;	
	import java.util.ArrayList;
	import java.util.List;

	public class MissingNumbersBoolean {
//logic= declare array with missing numbers, declare the range integer
	// we should take boolean array(where we set all value as false) with size as declared array range+1(bcoz array follows indexing concept)
	// use for each loop and go through each number and mark boolean value as present for array numbers.
  // 
	    public static void main(String[] args) {
	        int[] arr = {1, 3, 5, 7,9,10}; // Example array
	        int n = 10; // Range of numbers (1 to 10)

	        boolean[] present = new boolean[n + 1]; // To track presence

	        // Mark the numbers present in the array
	        for (int num : arr) {
	            present[num] = true;
	        }

	        // Find missing numbers
	        List<Integer> missingNumbers = new ArrayList<>();
	        for (int i = 1; i <= n; i++) {
	            if (present[i] == false) 
	            {
	            	
	                missingNumbers.add(i);
	            }
	        }

	        System.out.println("Missing numbers are: " + missingNumbers);
	    }
	} 
