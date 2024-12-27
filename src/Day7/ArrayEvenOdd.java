package Day7;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 2, 4, 3, 5, 6, 8, 7, 9, 4 };
		int evencount = 0;
		int oddcount = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evencount++;
			}

			else {
				oddcount++;
			}
		}

		System.out.println("even and odd count in the array is: " + evencount + "   " + oddcount);
	}

}
