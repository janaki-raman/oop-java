package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regformfill {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("vfb-5")).sendKeys("karthik");
		Thread.sleep(2000);
		
		driver.findElement(By.name("vfb-7")).sendKeys("vicky");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
