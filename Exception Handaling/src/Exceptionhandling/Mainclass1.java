package Exceptionhandling;

public class Mainclass1 
{

	public static void main(String[] args) 
	{
		System.out.println("*****************");
		
		int n1=10,n2=0,n3=0;
		
		try
		{
			//code cause Exception
			n3=n1/n2;
		}
		catch(Exception e1)
		{
			//solution code for Exception
			System.out.println("executing solution...");
			n3=n1/1;
		}
		
		System.out.println("n1 Value ="+n1);
		System.out.println("n2 Value ="+n2);
		System.out.println("n3 Value ="+n3);
		
		System.out.println("*****************");
		
	}
}
