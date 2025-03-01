package Day9;

public class WordsCountInString {
   
	
	
	//Approach 1
	// we used iterator using chrat method for string when we found space char increase count by 1.
	public static void main(String[] args) {
		String s="Practice Java dialy ";
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
   System.out.println(count);
   
   
     //approach 2
   
  // logic we used split method from the string 
   // It splits a string into an array of substrings based on a specified delimiter (regular expression)
   //split("\\s+") splits the string wherever there are one or more spaces.
   //words.length gives the count of words in the string.
   // trim90 = which removes the leading or trailing white spaces
   String st="be consistent and practice java everytime   ";
   String[] words=st.trim().split("\\s+");
   System.out.println("words count is:"+words.length);
  

   
   

   
  
	}

}
