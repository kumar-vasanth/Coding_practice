package Day6;

import java.util.Arrays;

public class ArrayEqualCheck {
// logic= here we used one predefined arrays class and used equals method here
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6,7};
		// Approach1
	    boolean check;
	    check=Arrays.equals(a, b);
	    if (check== true)
	    {
	    	 System.out.println("both the arrays are equal");
	    }
	    else 
	    {
	    	System.out.println("both the arrays are not-equal");
	    }
	   
	    // approach 2 
	    // logic == take one boolean value and dec/initialise as true and we should check arrays length first if true then only check logic
	    // else make boolean value as false
	    // take one more if else to provide statement if(true) print one statement
	    
	    int l[]= {3,8,9,3,4};
	    int j[]= {3,8,9,3,4};
	    boolean test=true;
	    if(l.length==j.length)
	    {
	    	for(int i=0;i<l.length;i++)
	    	{
	    		if(l[i]!=j[i]) 
	    		{
	    			test=false;	
	    		}
	    		
	    		else
	    		{
	    			test=true;
	    		}
	    		
	    	}
	    	
	    
	    }

	    else {
	    	test=false;
	    }
	    
	    
	    if(test==true)
	    {
	    	System.out.println("Both the arrays are equal");
	    }
	    else
	    {
	    	System.out.println("Both the arrays are not-equal");
	    }
	    }
	    
	    
	    
	    
	    
	}


