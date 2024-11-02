package BankAppV1;

public class MainClass1 
{
	
	public static void main(String[] args)
	{
		SavingsAccount Sa1= new SavingsAccount(1234,10000.0);
		Sa1.balanceEnquiry();
		Sa1.deposit(4000.0);
		Sa1.withdraw(8000.0);
		
		
		LoanAccount La1=new LoanAccount(5678,10000.0);
		La1.balanceEnquiry();
		La1.deposit(5000.0);
		La1.withdraw(3000.0);
	}

}
