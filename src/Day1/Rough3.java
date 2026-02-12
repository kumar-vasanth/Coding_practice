package Day1;

public class Rough3 {

	public static void main(String[] args) {
		int n=34589;
		int rev=0;
		
		while(n>0)

		{
			rev= rev*0+n%10;
			n=n/10;
			System.out.println(rev);
		}
		
		//swapping two numbers
		
		int a=45;
		int b=36;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("values after swapping: "+a+ " "+b);
		
		// reverse a string
		String s="mallesh";
		String rev2="";
		System.out.println("Before reversed: "+ s);
		char cr[]=s.toCharArray();
		for(int i=cr.length-1;i>=0;i--)
		{
			rev2=rev2+cr[i];
		}
		System.out.println("After reversing the string: "+rev2);
		
		// aproach 2
		String p="mahasena";
		String rev3="";
		for(int j=p.length()-1;j>=0;j--)
		{
			rev3=rev3+p.charAt(j);
		}
		
		System.out.println("After reversing the string: "+rev3);
		
		
		
		int lp=2378;
		int rev9=0;
		while(n>0)
		{
			rev9=rev9+lp%10;
			lp=lp/10;
			
		}
		
		
		
		
		
		
	}

}
