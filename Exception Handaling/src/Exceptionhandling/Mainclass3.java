package Exceptionhandling;

public class Mainclass3 
{
	public static void main(String[] args) 
	{
		System.out.println("****************");
		
		try
		{
		  //System.out.println(10/0);
			String s1="ab";
			System.out.println(s1.charAt(3));
		}
		catch(ArithmeticException|NullPointerException e1)
		{
			System.out.println("i am in AE|NPE...");
		}
		catch(RuntimeException e1)
		{
			System.out.println("i am in RuntimeException...");
		}
		catch(Exception e1)
		{
		  System.out.println("i am in Exception...");
		}
		
		System.out.println("****************");
	}
}
