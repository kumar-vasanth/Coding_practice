 package Day9;

public class ReverseParticularWordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // Logic == take down the input string and convert to array using split
	// Using enhanced for loop read each word and apply string reverse for each word that enhanced for loop reads
	// here we need two empty string one to store final string, 2nd to store each word reverse in for loop.
		
		String st="Hello all welcome to java";
		String[] si=st.split(" ");
		//It is not possible to print the converted array directly we should use array. to string or use for loop to read each element and print
		 
			StringBuffer sb=new StringBuffer();
			
			for (int i = 0; i < si.length; i++) {
				
			    if (i == si.length - 3 || i == si.length - 5) 
			    {
			        StringBuffer s1 = new StringBuffer(si[i]);
			        sb.append( s1.reverse()+" " );
			    } 
			    else {
			        sb.append(si[i] + " ");
			    }
			}

		  System.out.println("Printing the words which are reversed: "+sb.toString());
		  
		  String w = "I can get good job"; 
	        
	        // Step 1: Split the sentence into words
	        String[] ar = w.split(" ");

	        // Step 2: Create a StringBuilder to store the final output
	        StringBuilder sbl = new StringBuilder();
	        
	        // Step 3: Loop through words in reverse order
	        for (int i = ar.length - 1; i >= 0; i--) {
	            // Reverse the letters of each word and append to StringBuilder
	            sbl.append(new StringBuilder(ar[i]).reverse()).append(" "); 
	        }

	        // Step 4: Convert to string, trim extra space, and print
	        System.out.println(sbl.toString().trim());
	        
	      String wds="trying to reverse the words and its order" ;
	    
	    	String [] set=wds.split(" ");
	    	StringBuilder sb3= new StringBuilder();
	    	for(int m=set.length-1;m>=0;m--)
	    	{
	    		if(m==2|| m==3)
	    		{
	    			sb3.append(new StringBuilder(set[m]).reverse()).append(" ");
	    		}
	    		
	    		else
	    		{
	    			sb3.append(set[m]+ "  ");
	    		}
	    	}
	    	
	    	System.out.println(sb3.toString());
	                
		
		
	}

}
