package BankAppV1;

public class Account
{
	int accNo;
	double accBal;
	Account(int accNo,double accBal)
	{
		this.accNo=accNo;
		this.accBal=accBal;
		System.out.println(" Acccount created successfully...");
	}
	void deposit(double amt)
	{
		System.out.println("dummy...");
	}
	void withdraw(double amt)
	{
		System.out.println("dummy...");
	}
	final void balanceEnquiry()
	{
		System.out.println("your Account Balance ="+accBal);
	}
}

