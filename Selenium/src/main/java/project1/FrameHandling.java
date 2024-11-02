package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement ele =driver.findElement(By.xpath("//iframe[contains(@src,'default')]"));
		
		//Switching to frame using web element
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		String txt=driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println(txt);
		String id=driver.findElement(By.xpath("//button[@id='Click']")).getAttribute("onclick");
		System.out.println(id);
		
		

	}

}
