package Day3;

public class LargestOfthreeNumbers {

	public static void main(String[] args) {
		int a = 16, b = 10, c = 8;
		System.out.println("These are the inputs: " + " a=" + a + " b=" + b + " c=" + c);
		if (a > b && a > c) {
			System.out.println("a is Largest number");
		} else if (b > a && b > c) {
			System.out.println("b is Largest number");
		} else {
			System.out.println("c is Largest number");
		}

	}
}
