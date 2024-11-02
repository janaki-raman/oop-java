package project1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgAnnot3 {
	
	@Test
	public void testrun()
	{
		System.out.println(" I am in Test");
	}
	
	@Test
	public void testrun1()
	{
		System.out.println(" I am in Test1");
	}
	
	@BeforeTest
	public void beforetestrun()
	{
		System.out.println(" I am in BeforeTest");
	}
	
	@AfterTest
	public void Aftertestrun()
	{
		System.out.println("I am in AfterTest");
	}
	
	@BeforeMethod
	public void Beforemethodtestrun()
	{
		System.out.println("I am in BeforeMethodTest");
	}
	@AfterMethod
	public void AfterMethodtestrun()
	{
		System.out.println("I am in AfterMethodTest");
	}
	
	@BeforeClass
	public void Beforeclasstestrun()
	{
		System.out.println("I am in BeforeClassTest");
	}

	@AfterClass
	public void Afterclasstestrun()
	{
		System.out.println("I am in AfterClassTest");
	}
	
	@BeforeSuite
	public void Beforesuitetestrun()
	{
		System.out.println("I am in BeforeSuiteTest");
	}
	@AfterSuite
	public void Aftersuitetestrun()
	{
		System.out.println("I am in AfterSuiteTest");
	}

}
