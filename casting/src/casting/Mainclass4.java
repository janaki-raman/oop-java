package casting;

class Sample3 extends Sample2
{
	int z=30;
	void view()
	{
	 System.out.println("i am in view()...");
	}
}

public class Mainclass4 
{
	public static void main(String[] args)
	{
		Sample3 s3=new Sample3();
		
		System.out.println(s3.x);
		System.out.println(s3.y);
		System.out.println(s3.z);
		s3.disp();
		s3.show();
		s3.view();
		
		Sample2 s2=(Sample2)s3;
		
		System.out.println(s2.x);
		System.out.println(s2.y);
		s2.disp();
		s2.show();
		
		Sample1 s1=(Sample1)s2;
		
		System.out.println(s1.x);
		s1.disp();
	
		
		
	}

}
