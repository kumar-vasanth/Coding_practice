package strings_10;

public class CountCharOccurences {

	public static void main(String[] args) {
		String v="vasantha";
		char reqChar='a';
		int count=1;
		char c[]=v.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==reqChar)
			{
				c[i]=String.valueOf(count).charAt(0);
				count++;
			}
		}
		
		System.out.println(c);
		
		
		
		//// next way 
		
		 String va = "professorroe";
	        char reqChar1 = 'r';
	        int count1 = 1;

	        StringBuilder sb = new StringBuilder();
	        
	        for (char ch : va.toCharArray()) {
	            if (ch == reqChar1) {
	                sb.append(count1);
	                count1++;
	            } else {
	                sb.append(ch);
	            }
	        }

	        System.out.println(sb.toString());
		

	}

}
