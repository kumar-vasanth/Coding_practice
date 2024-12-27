package Day4;

public class FibanocciSeries {

	public static void main(String[] args) {
		// Logic = sum of two preceding numbers will generate this series
		//here first two digits we should define n1=0,n2=1
		// then perform sum for those two and reassign values n1=n2 and sum=n2
		
		int n1=0;
		int n2=1;
		{
			for(int i=1;i<10;i++)
			{
				int sum=n1+n2;
				System.out.print(" " +sum);
				n1=n2;
				n2=sum;
			}
		}

	}

}
