package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//Using Index
		new Select(driver.findElement(By.id("dropdown1"))).selectByIndex(1);
		Thread.sleep(3000);
		
		//Using Text
		new Select(driver.findElement(By.name("dropdown2"))).selectByVisibleText("Appium");
		Thread.sleep(3000);
		
		//Using Value
		new Select(driver.findElement(By.name("dropdown3"))).selectByValue("3");
		Thread.sleep(3000);
		
		//Sending Keys to dropdown
		driver.findElement(By.xpath("(//select)[5]")).sendKeys("load runner");
		Thread.sleep(3000);
		
		//Click the Option in Opendropdown
		driver.findElement(By.xpath("(//select)[6]//option[@value='2']")).click();
		Thread.sleep(3000);
		

		driver.close();
		
		
		

	}

}

