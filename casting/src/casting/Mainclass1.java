package casting;

public class Mainclass1 
{
	public static void main(String[] args)
	{
		System.out.println("***********");
		
		byte b=20;
		// int x =(int)b;//Explicit widening
		// int x=b;//implicit widening
		
		char ch='0';
		// int x=(int)ch; // Explicit widening
		// int x=ch; // implicit widening
		
		int i=22;
		// double x=i;  // implicit widening
		
		double d=22.9999;
		int x =(int)d; // narrowing ( always Explicit)
		
		
		System.out.println("x Value ="+x);
		
		System.out.println("***********");
	}

}
