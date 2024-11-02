package project1;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNgAnnot2 {
	@BeforeMethod
	public void beforeTest()
	{
		System.out.println(" i am running before test");
	}
	@Test
	public void testRun()
	{
		System.out.println("hi i am running test");
	}
	@Test
	public void testRun1()
	{
		System.out.println("hi i am running test1");
	}
	@Test
	public void testRun2()
	{
		System.out.println("hi i am running test2");
	}
	@AfterMethod
	public void aftertest()
	{
		System.out.println(" i am running after test");
	}

}
