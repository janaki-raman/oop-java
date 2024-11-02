package casting;

class Executor1
{
	void execute (Sample1 s1)
	{
		if(s1 instanceof Sample3)
		{
			Sample3 s3=(Sample3)s1; //down casting
			System.out.println(s3.x);
			System.out.println(s3.y);
			System.out.println(s3.z);
			s3.disp();
			s3.show();
			s3.view();
		}
		else if(s1 instanceof Sample2)
		{
			Sample2 s2 = (Sample2)s1;
			
			System.out.println(s2.x);
			System.out.println(s2.y);
			s2.disp();
			s2.show();
		}
		else
		{
			System.out.println(s1.x);
			s1.disp();
		}
	}
}

public class Mainclass6 
{
	public static void main(String[] args)
	{
		Executor1 e1=new Executor1();
		
		e1.execute(new Sample1()); 
		e1.execute(new Sample2());
		e1.execute(new Sample3());
	}
}


