package pattern;

public class Mainclass1 
{
	public static void main(String[] args)
	{
		System.out.println("**********");
		
		for(char ch='A';ch<='E';ch++)
		{
			for(char ch2='A';ch2<=ch;ch2++)
			{
				System.out.print(ch2+" ");
			}
			System.out.println();
		}
			
		System.out.println("**********");
	}

}
