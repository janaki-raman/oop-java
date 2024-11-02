package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaSele {
	
	@Test(groups="java")
	public void printNum()
	{
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}
	
	@Test(groups="java")
	public void otp()
	{
		double ran=(Math.random())*1000000;
		System.out.println(Math.round(ran));
	}
	WebDriver driver;
	@Test(groups="Selenium",priority=1)
	public void initdriver()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(groups="Selenium",priority=2)
	public void enterurl()
	{
		driver.navigate().to("https://practicetestautomation.com/");
	}
	
	@Test(groups="Selenium",priority=3,enabled=false)
	public void enterurl1()
	{
		driver.get("https://www.flipkart.com/");
	}
	
	@Test(priority=4)
	public void refreshBackandFarword()
	{
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
	}

}
