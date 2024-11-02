package pattern;

public class Mainclass3 
{
	public static void main(String[] args)
	{
		System.out.println("**********");
		
		char ch='A';
		
		for(char ch1='A';ch1<='E';ch1++)
		{
			for(char ch2='A';ch2<=ch1;ch2++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
			
		System.out.println("**********");
	}

}
