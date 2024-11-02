package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaitMethod {
	
	WebDriver driver;
	
	@Test
	public void initiatedriver()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("a[@href='/gp/bestsellers/books/ref=zg_bs_nav_0']"));
	}

}
