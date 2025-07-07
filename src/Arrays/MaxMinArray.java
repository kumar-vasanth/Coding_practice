package Arrays;

public class MaxMinArray {

	public static void main(String[] args) {
		int[] numbers = { 1, 34, 56, 75 };

		int maxValue = numbers[0];
		int minValue = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
			if (numbers[i] < minValue) {
				minValue = numbers[i];
			}
		}

		System.out.println("Maximum value in the array: " + maxValue);
		System.out.println("Minimum value in the array: " + minValue);
	}
}
