package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseandKeyboardActions3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//switch to frame
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		//creating action driver
		Actions act=new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//img[@src='image/high tatras]"));
		WebElement ele2=driver.findElement(By.id("trash"));
		act.moveToElement(ele1).perform();
		
		//drag and drop the element
		act.dragAndDrop(ele1, ele2).perform();
		
		

	}

}
