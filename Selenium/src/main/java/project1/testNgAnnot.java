package project1;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgAnnot {
	@BeforeTest
	public void beforetest()
	{
		System.out.println("i am running before test");
	}
	@Test
	public void testrun()
	{
		System.out.println("hi i am running Test");
	}
	@Test
	public void testrun1()
	{
		System.out.println("hi i am running Test1");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println(" i am running After test");
	}


}
