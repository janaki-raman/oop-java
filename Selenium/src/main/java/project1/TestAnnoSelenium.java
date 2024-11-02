package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnoSelenium {
	WebDriver driver;
	@BeforeMethod
	public void initDriver() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
	     driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@Test
	public void urlEnter() throws InterruptedException
	{
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
	}
	
	@Test
	public void urlEnter1() throws InterruptedException
	{
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
	}
	
	@Test
	public void urlEnter2() throws InterruptedException
	{
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void closedriver()
	{
		driver.close();
	}
	

}
