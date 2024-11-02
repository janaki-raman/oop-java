package project1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseandKeyboardActions2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement right=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act= new Actions(driver);
		act.moveToElement(right).perform();
		
		//Right click on element
		act.contextClick().perform();
		Thread.sleep(2000);
		WebElement edit=driver.findElement(By.xpath("//span[text()='Edit']"));
		act.moveToElement(edit).click().build().perform();
		Alert alr=driver.switchTo().alert();
		alr.accept();
		Thread.sleep(2000);
		
		WebElement doubl=driver.findElement(By.xpath("//button[text()='Double-Click Me']"));
		
		//Double click
		Thread.sleep(4000);
		act.moveToElement(doubl).doubleClick().perform();
		//or 
		act.doubleClick(doubl).perform();

		
		
		

	}

}
