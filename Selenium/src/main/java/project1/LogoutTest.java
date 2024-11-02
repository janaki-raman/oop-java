package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogoutTest {

	WebDriver driver;
	
	@BeforeMethod
	public void initiateddriver()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
	
	@Test
	public void positiveTest()
	{
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		String Expect="congratulations student";
		String actual=driver.findElement(By.tagName("strong")).getText();
		
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(Expect, actual);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		assertion.assertAll();
		
	}
}
