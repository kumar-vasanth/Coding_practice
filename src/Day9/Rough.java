package Day9;

import java.util.HashMap;

public class Rough {

	public static void main(String[] args) {
		
	String s="I have to reverse the entire sentence";
	String sr[]=s.split(" ");
	
	StringBuilder sb= new StringBuilder();
	 for(int i= sr.length-1; i>=0;i--)
	 {
		 StringBuilder s1=new StringBuilder(sr[i]);
		
		sb.append(s1.reverse()+" ");
	 }
	 //sb.append(sr[i]+" " );
	System.out.println(sb.toString());
	
	
	
	String spr="vasanthhsa";
	HashMap<Character, Integer> maph= new HashMap<Character, Integer>();
	for(int i=0;i<=spr.length()-1;i++)
	{
		char ch=spr.charAt(i);
		
		if(maph.containsKey(ch))
		{
			int count=maph.get(ch);
		
			maph.put(ch, count+1);
		}
		
		else {
			maph.put(ch, 1);
		}
	}
	

	
	
	for(Character key:maph.keySet())
	{
		System.out.print(key+""+maph.get(key));
	}
	
	}

}
