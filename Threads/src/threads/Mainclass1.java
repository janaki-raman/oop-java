package threads;

public class Mainclass1 
{
	public static void main(String[] args) 
	{
		Hero h1=new Hero();
		Hero h2=new Hero();
		
		Demon d1=new Demon();
		Demon d2=new Demon();
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		
		h1.start();
		h2.start();
		
		t1.start();
		t2.start();
		
	}

}
