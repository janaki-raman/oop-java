package interfaceDemo;

interface Calculator
{
	double PI=3.14;
	int add(int a,int b);
	int sub(int a,int b);
}

class MyCalculator implements Calculator
{
	public int add(int a,int b)
	{
	 return a+b;
	}
	
	public int sub(int a,int b)
	{
	return a-b;
	}
}

public class Mainclass1 
{
	public static void main(String[] args) 
	{
		System.out.println(Calculator.PI);
		
		//Calculator c1=new Calculator(); // we can't create object
		Calculator c1=new MyCalculator(); // upcasting
		
		System.out.println(c1.add(10,20));
		System.out.println(c1.sub(20,10));
	}

}
