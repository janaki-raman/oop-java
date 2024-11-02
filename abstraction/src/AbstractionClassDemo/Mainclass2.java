package AbstractionClassDemo;

abstract class Account
{
	int accNo;
	double accBal;
	
	
    Account(int accNo,double accBal)
	{
		this.accNo=accNo;
		this.accBal=accBal;
		System.out.println(" Acccount created successfully...");
	}
	
	
	abstract void deposit(double amt);
	abstract void withdraw(double amt);
	
	
	final void balanceEnquiry()
	{
		System.out.println("your Account Balance ="+accBal);
	}
}



class LoanAccount extends Account
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



 class SavingsAccount extends Account
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


public class Mainclass2 
{
	
	public static void main(String[] args)
	{
	    Account a1= new LoanAccount(1234,10000.0);  // polymorphism ( we can use SavingsAccount)
		a1.balanceEnquiry();//
		a1.deposit(4000);//polymorphism
		a1.withdraw(5000);//polymorphism 
		
		
		
	}

}
