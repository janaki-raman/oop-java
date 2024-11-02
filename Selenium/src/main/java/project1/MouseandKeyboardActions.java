package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseandKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("Test@mail.com");
		Actions act =new Actions(driver);
		Thread.sleep(2000);
		
		//press Tab
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);

		//send keys to field
		act.sendKeys("mypassword").perform();
		WebElement log=driver.findElement(By.name("login"));
		
		//Hover to element and click
		act.moveToElement(log).click().perform();
		
		

		
		

	}

}
