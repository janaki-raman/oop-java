package casting;

class A
{
	void wish()
	{
		System.out.println("hi");
	}
}

class B extends A
{
	void wish()
	{
		System.out.println("bye");
	}	
}

public class Mainclass7 
{
  public static void main(String[] args)
  {
	  A a1=new A();
	  a1.wish();
	  
	  B b1=new B();
	  b1.wish();
	  
	  A a11=new B(); 
	  a11.wish();
   }
}
