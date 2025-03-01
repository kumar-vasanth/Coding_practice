package Day8;

import java.util.HashSet;

public class ArrayDuplicateElement {
	// Approach1
// Logic 1= we should apply conditions to index 
// Take two for loops one should copare with next value(take index +1 in looping)
	public static void main(String[] args) {
		String ar[] = { "Eng", "Tel", "Beng", "Eng","Te" };
		boolean flag = false;
		for (int i = 0; i < ar.length; i++) 
		{
			
			for (int j = i + 1; j < ar.length; j++)
			{
				if (ar[i] == ar[j])
				{
					System.out.println("Found the duplicate element: " + ar[i]);
					flag = true;
				}

			}

		}

		if (flag == false) {
			System.out.println("Duplicate not found");
		}
// approach2
// Declare one collection hashset with some data tyep
// iterate the loop and add values to hashset
// hasset doesnot allow duplicate values while adding if we found duplicate it shows that element
		
		String wr[] = { "Eng", "Tel", "Beng", "Eng","Te" };
	
	HashSet<String> values=new HashSet<String>();
	  boolean flagg=false;
		
		for(int i=0;i<wr.length;i++)
		{
			if(values.add(wr[i])==false)
			{
				System.out.println("Found the dupliacte value: "+ wr[i]);
				flagg=true;
			}
			
			
		}
		if(flagg==false)
		{
			System.out.println("duplicate elements not found");
		}
		
		
		
		
		
	}

}
