package Day1;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		int a=30;
		int b=50;
		System.out.println("printing the values before swapping: "+a +" "+b);
		/*
		 * //logic 1  For logic 1, we use third variable first affign one value to new third varianle and then reassign already declared variables
		 * int l; l=a; a=b; b=l;
		 */
		
		//LOgic 2 here we use operators +,-
		/*
		 * a=a+b; b=a-b; a=a-b;
		 */
		
		//Logic 3 using *,/ operators
		/*
		 * a=a*b; b=a/b; a=a/b;
		 */
		
		// Note: for logic 2, logic 3 apply two operations first for both variables and then apply 2nd operator to first variable again
		
		//Logic 4  will work from right to left first assignment works and then minus the bith variable sum
		
		b=(a+b)-(a=b);
		
		
		
	
	 System.out.println("printing the values after swapping: "+a +" "+b);

	}

}
