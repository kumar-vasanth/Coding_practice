package strings_10;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	 public static void main(String[] args) {
	        String s = "programming";
	        StringBuilder sb = new StringBuilder();
	        char[] ar = s.toCharArray();

	        for (int i = 0; i < ar.length; i++) 
	        {
	            boolean isDuplicate = false;

	            // Check if character already exists in StringBuilder
	            for (int j = 0; j < sb.length(); j++)
	            {
	                if (ar[i] == ar[j])
	                {
	                    isDuplicate = true;
	                    break;
	                }
	               
		    
	            }

	            // Add only unique characters
	            if (!isDuplicate) 
	            {
	                sb.append(ar[i]);
	            }
	           
	        }

	        System.out.println("String after removing duplicates: " + sb.toString());
	        
	        // we have one more approach using the set collection 
	        
	        String s2="crossing lines";
	        StringBuilder sb2= new StringBuilder();
	        Set<Character> set = new LinkedHashSet<>();
	        for(int i=0;i<s2.length();i++)
	        {
	        	set.add(s2.charAt(i));
	        }
	        
	        System.out.println(set);
	        
	        for(char c:set)
	        {
	        	sb2.append(c);
	        }
	        
	        System.out.println(sb2.toString());   
	        
	        
	    }
}
