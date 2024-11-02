package AbstractionClassDemo;

abstract class calculator
{
	void add(int a,int b)
	{
		System.out.println("addition = "+(a+b));
	}
	
	abstract void sub(int a, int b);
	
}

class Mycalculator extends calculator
{
	void sub(int a,int b)
	{
		System.out.println("Subtraction = "+(a-b));
	}
	
	void add(int a,int b)
	{
		System.out.println("Addition = "+(a+b));
	}
	
}

public class Mainclass1 
{
	public static void main(String[] args) 
	{
	 // calculator c1 =new calculator();// we can't create object
		
		calculator c1=new Mycalculator(); // upcasting
		c1.add(10, 20);
		c1.sub(20,10);
		
		
	}

	
}
