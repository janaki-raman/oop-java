package project1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable3 {
	

	@Test
	public void initDriver()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		List<WebElement> eles=driver.findElements(By.xpath("//strong//following::tr//td[2]"));
		
		System.out.println(eles.size());
		int count=0;
		for(WebElement ele:eles)
		{
			count++;
			System.out.println(count);
			System.out.println(ele.getAttribute("innerText"));
		}
	}

}
