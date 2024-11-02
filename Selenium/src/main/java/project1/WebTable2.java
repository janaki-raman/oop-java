package project1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable2 {
	
	@Test
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		Scanner ctry=sc.next();
		
		WebElement ele=driver.findElement(By.xpath("//Strong[text()="+ctry+"]//preceding::input[1]"));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		ele.click();
	
	}

}
