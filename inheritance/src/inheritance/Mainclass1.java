package inheritance;

 class Sample1 
{
	int a=10;
	void disp() 
	{
		System.out.println("i am in disp()...");
	}
}
class Sample2 extends Sample1
{
	int b=20;
	void show()
	{
     System.out.println("i am in show()...");
	}
}
class Sample3 extends Sample2
{
	int c=30;
	void view()
	{
      System.out.println("i in view()...");
	}
} 



class Sample4
{
	
   Sample4(int x)
   {
    System.out.println("i am in Sample4(int)...");	
    }

}
class Sample5 extends Sample4
{
    Sample5(double d)
	{
	 super(10);
	 System.out.println("i am in Sample5(double)...");
	}
}
class Sample6 extends Sample5
{
    Sample6()
	{
	 super(10.5);
	 System.out.println("i am in Sample6()...");
	}
}



class Sample7
{
	Sample7()
	{
		this(10);
		System.out.println("i am in Sample7()...");
	}
	Sample7(int x)
	{
		this(10.5);
		System.out.println("i am in Sample7(int)..."+x);
	}
	Sample7(double x)
	{
		System.out.println("i am in Sample7(double)..."+x);
	}
}



class A
{
	int x=10;
}
class B extends A
{
	int x=100;
	void test()
	{
		int x=1000;
		System.out.println("x value ="+x);
		System.out.println("x value ="+this.x);
		System.out.println("x value ="+super.x);
	}
}



class ShoppingAppV1
{
	void payment()
	{
		System.out.println("Payment by COD");
	}
}
class ShoppingAppV2
{
	void payment()
	{
		System.out.println("Payment is based on CARD");
	}
}


public class Mainclass1
{
	public static void main(String[] args)
	{
		/*Sample3 S3=new Sample3();
		System.out.println(S3.a);
		System.out.println(S3.b);
		System.out.println(S3.c);
		S3.disp();
		S3.show();
		S3.view();*/
		
	  /* Sample6 S6=new Sample6(); */
		
		/*Sample7 S4=new Sample7(); */
		
		/*B b1=new B();
		b1.test(); */
		
		ShoppingAppV1 V1=new ShoppingAppV1();
		V1.payment();
		ShoppingAppV2 V2=new ShoppingAppV2();
		V2.payment();
		
		
		
	}
}