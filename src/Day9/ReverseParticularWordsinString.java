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
				
			    if (i == si.length - 1 || i == si.length - 2) 
			    {
			        StringBuffer s1 = new StringBuffer(si[i]);
			        sb.append(" " + s1.reverse());
			    } 
			    else {
			        sb.append(si[i] + " ");
			    }
			}

		  System.out.println("Printing the words which are reversed: "+sb.toString());
		
		
	}

}
