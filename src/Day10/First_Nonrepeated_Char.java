package Day10;

import java.util.HashMap;
import java.util.Map;

public class First_Nonrepeated_Char {

	public static void main(String[] args) {
	
	String rep="AABEDBEDFJ";
	char ch[]=rep.toCharArray();
	Map<Character,Integer> map= new HashMap();
	for(char c:ch)
	{
		if(map.containsKey(c))
		{
			int count=map.get(c);
			map.put(c, count+1);
		}
		
		else
		{
			map.put(c, 1);
		}
		
		
	}
	
	
	System.out.println(map);

	// using the entry set to show the maps and its  values
	
	for (java.util.Map.Entry<Character, Integer> entrySet: map.entrySet())
	{
		if(entrySet.getValue()==1)
		{
			System.out.println(entrySet.getKey());
			break;
		}
	}

	 
	
	
	}
	
}
