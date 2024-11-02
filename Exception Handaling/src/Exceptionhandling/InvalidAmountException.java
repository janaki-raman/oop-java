package Exceptionhandling;

public class InvalidAmountException extends Exception
{
	InvalidAmountException()
	{
		System.out.println("Invalid Amount Exception Object is Created...");
	}
	void errorMsg()
	{
		System.out.println("you get lost culprit..!!!");
	}
}
