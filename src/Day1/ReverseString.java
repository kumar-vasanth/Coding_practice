package Day1;

public class ReverseString {
   // here we use len() method and charat () for index looping 
	// 2nd logic we use len() and string to array conversion
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String st="DEFR";
     String rev="";

   /*  for(int i=st.length()-1;i>=0;i-- )
     {
    	 rev=rev+st.charAt(i);
     }
		
		System.out.println(rev);
		
		
	}*/
     // we have logic 2 where convert string into array and perform looping using the array index
     
     char a[]=st.toCharArray();
     int l=a.length;
     for(int i=l-1;i>=0;i--)
     {
    	 rev=rev+a[i];
     }
     
     System.out.println(rev);
     
		if (st.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
     
     
     String lp="vasanth";
     String rev1="";
     for(int i=lp.length()-1;i>=0;i--)
     {
    	 rev1=rev1+lp.charAt(i);
     }
     
     System.out.println("Reversed string is:  "+ rev1);
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}
}
