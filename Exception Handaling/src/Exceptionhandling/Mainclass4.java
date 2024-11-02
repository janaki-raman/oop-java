package Exceptionhandling;

public class Mainclass4 
{
	public static void main(String[] args)
	{
		System.out.println("*************");		
		m1();
		System.out.println("*************");
	}
	private static void  m1()
	{
		m2();
	}
	private static void m2()
	{
		System.out.println(10/0);
	}

}
