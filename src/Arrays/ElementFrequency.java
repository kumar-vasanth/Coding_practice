package Arrays;

import java.util.HashMap;

public class ElementFrequency {

	public static void main(String[] args) {
		int farr[]= {1,2,3,2,3,4,4,5,8,9,8};
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int num:farr)
		{
			if(!map.containsKey(num))
			{
				map.put(num, 1);
			}
			else
			{
				int count=map.get(num);
				map.put(num, count+1);
			}
		}
   System.out.println(map);
   
   
   
/*   
   for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	    System.out.println(entry.getKey() + ": " + entry.getValue());*/
	}

	

}
