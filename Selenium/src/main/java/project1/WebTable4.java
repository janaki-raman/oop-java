package project1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable4 {


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
		
		for(WebElement ele:eles)
		{
			String ctry=ele.getAttribute("innerText");
			WebElement elecurrency=driver.findElement(By.xpath("//strong[text()='"+ctry+"'//following::td[2]"));
			String cur=elecurrency.getText();
			System.out.println(ctry+"-----"+cur);
		}
}
}
