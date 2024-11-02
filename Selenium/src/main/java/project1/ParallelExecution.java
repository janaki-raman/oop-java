package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	WebDriver driver;
	
	@Test(priority=1)
	@Parameters("browser")
	public void initiateDriver(String browserType)
	{
		if(browserType.equalsIgnoreCase("Edge"))
		{
			System.setProperty("Webdriver.edge.driver","‪E:\\JR\\QSPIDERS\\Selenium\\Essentials\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		else if(browserType.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}
	
	@Test
	public void enterurl()
	{
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

	}
	

}
