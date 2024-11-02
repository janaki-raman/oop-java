package project1;

import java.io.File;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest {
	
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
		
		//verfication
		Assert.assertEquals(Expect, actual);
		//Assert.assertTrue(Expect.contains(actual));
	}
		
		@AfterMethod
		public  void takescreenshotandclose1()throws InterruptedException
		{
			File files=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyfiles(files,new File("E:\\JR\\QSPIDERS\\Selenium\\ScreenShot.png"));
			Thread.sleep(3000);
			driver.close();
		}
		
		@AfterMethod
		public void takescreenshotandclose()throws InterruptedException
		{
			File files=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copyfiles(files,new File("E:\\JR\\QSPIDERS\\Selenium\\"+System.currenttimemills()+".png"));
			Thread.sleep(3000);
			driver.close();
		}
	

}
