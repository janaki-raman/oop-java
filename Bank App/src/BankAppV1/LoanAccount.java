package BankAppV1;

public class LoanAccount extends Account
{
	LoanAccount(int accNo,double accBal)
	{
		super(accNo,accBal);
		System.out.println("Loan Account created successfully...");
	}
	void deposit(double amt)
	{
		System.out.println("your Depositing Amount in Loan Account = "+amt);
		accBal=accBal-amt;
		System.out.println("your Account Balance = "+accBal);
	}
	
	void withdraw(double amt)
	{
		System.out.println("your withdraw Amount in Loan Account = "+amt);
		accBal=accBal+amt;
		System.out.println("your Account Balance = "+accBal);
	}
	
	

}
