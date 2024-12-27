package Day9;

public class CharOccurencesString {

	public static void main(String[] args) {
		String s="checking the repeated char";
		int stringCount=s.length();
		s=s.replace("e", "");
		int latestcount=s.length();
		int charoccurences=stringCount-latestcount;
		System.out.println("we found the occurrences: "+charoccurences);
		
		String st="Java Programming Array Answeraa";
		
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='a' || st.charAt(i)=='A')
			{
				count++;
			}
		}
   System.out.println("occurence is "+count);
	}

}
