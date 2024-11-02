package casting;

public class Mainclass5 
{
	public static void main(String[] args)
	{
		// Downcasting
		// Sample3 s3=(Sample3)new Sample1();//ClassCastException
		
		Sample1 s1=new Sample2();//upcasting (implicit)
		
		System.out.println(s1.x);
		s1.disp();
		
		Sample2 s2 =(Sample2)s1;
		
		System.out.println(s2.x);
		System.out.println(s2.y);
		s2.disp();
		s2.show();
		
		Sample3 s3 = (Sample3)s1;
		System.out.println(s3.x);
		System.out.println(s3.y);
		System.out.println(s3.z);
		s3.disp();
		s3.show();
		s3.view();
		
		
	}

}
