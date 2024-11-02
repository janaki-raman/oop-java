package project1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupTest {
	
	@BeforeTest(groups= {"alpha","num"})
	public void Beforetest()
	{
		System.out.println("I am running BeforeTest");
	}
	
	@Test(groups="alpha")
	public void Test1()
	{
		System.out.println("a");
	}
	
	@Test(groups="alpha")
	public void Test2()
	{
		System.out.println("b");
	}
	
	@Test(groups="alpha")
	public void Test3()
	{
		System.out.println("c");
	}
	
	@Test(groups="num")
	public void Test4()
	{
		System.out.println("1");
	}
	
	@Test(groups="num")
	public void Test5()
	{
		System.out.println("2");
	}
	
	@Test(groups="num")
	public void Test6()
	{
		System.out.println("3");
	}
	
	@AfterTest(groups= {"alpha","num"})
	public void aftertest()
	{
	System.out.println(" I am running After Test");	
	}
	
	
	

}
