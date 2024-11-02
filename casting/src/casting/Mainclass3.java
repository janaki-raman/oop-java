package casting;

class Sample1
{
	int x=10;
	void disp()
	{
		System.out.println("i am in disp()...");
	}
}

class Sample2 extends Sample1
{
    int y=20;
    void show()
   {
	 System.out.println("i am in show()...");
   }
 
}
public class Mainclass3 
{
public static void main(String[] args)
{
	// Sample1 s1=(Sample1)new Sample2();//explicit upcasting
	// Sample1 s1=new Sample2();  //implicit upcasting

	Sample2 s2=new Sample2();
	
	System.out.println(s2.x);
	System.out.println(s2.y);
	s2.disp();
	s2.show();
	
	Sample1 s1=(Sample1)s2;
	
	System.out.println(s1.x);
	s1.disp();
	
	
	
	
}
}
