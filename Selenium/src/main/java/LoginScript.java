import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PFUIandAction.LoginuiandActions;

public class LoginScript {
	
	WebDriver driver;
	@Test
	public void runTestforLogin()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		LoginuiandActions logon=PageFactory.initElements(driver,LoginuiandActions.class);
		
		logon.enterUsername();
		logon.enterpassword();
		logon.clicksubmit();
		
	}

}
