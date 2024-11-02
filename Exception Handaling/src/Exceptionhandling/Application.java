package Exceptionhandling;

public class Application 
{
	public static void main(String[] args) 
	{
		System.out.println("**********");
	try
	{
		transfer(-1000.0);
	}catch(InvalidAmountException e)
	{
		e.errorMsg();
	}
	
	System.out.println("**********");
	}
	
	private static void transfer(double amt) throws InvalidAmountException
	{
		if(amt>0)
		{
			System.out.println("Money Transfer done Successfully...");
		}
		else
		{
			throw new InvalidAmountException();
		}
	}

}

