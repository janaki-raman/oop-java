package BankAppV1;

public class SavingsAccount extends Account
{
	SavingsAccount(int accNo,double accBal)
	{
		
	super(accNo,accBal);
	System.out.println("Savings Account created successfully...");
	
	}
	
	void deposit(double amt)
	{
		System.out.println("your Depositing Amount in Savings Account = "+amt);
		accBal=accBal+amt;
		System.out.println("your Account Balance = "+accBal);
	}
	
	void withdraw(double amt)
	{
		System.out.println("your withdraw Amount in Savings Account = "+amt);
		accBal=accBal-amt;
		System.out.println("your Account Balance = "+accBal);
	}
	
}
