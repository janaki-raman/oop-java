package project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regformfill2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='vfb-13[address]']")).sendKeys("Tambaram");
		
		//finding multiple Elements and using list interact with elements
		
		List<WebElement> ele =driver.findElements(By.xpath("//input[contains(@name,'vfb-13')]"));
		
		ele.get(0).sendKeys("Tambaram");
		Thread.sleep(2000);
		
		ele.get(1).sendKeys("near bus stop");
		Thread.sleep(2000);
		
		ele.get(2).sendKeys("opposite");
		Thread.sleep(2000);
		
		ele.get(3).sendKeys("Tambaram");
		Thread.sleep(2000);
		
		ele.get(4).sendKeys("Tambaram");
		Thread.sleep(3000);
		
		//Retrieving  elements using loop
		
		for(WebElement a:ele)
		{
			a.sendKeys("Tambaram");
			Thread.sleep(2000);
		}
		driver.close(); 

	}

}
