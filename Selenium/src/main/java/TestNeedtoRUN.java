import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomwithoutpf.UIandActions;

public class TestNeedtoRUN {
	
	WebDriver driver;
	@Test
	public void runProgrm()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		
		UIandActions uiact=new UIandActions(driver);
		uiact.enterun();
		uiact.enterpw();
		uiact.clickBtn();

	}

}
