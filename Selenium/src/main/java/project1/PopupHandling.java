package project1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		Thread.sleep(5000);
		
		//Handling Alert popup
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		//Accept methods we use to click on popup's
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		//Handling Confirmation popup and pressing cancel on popup
		Alert alt1=driver.switchTo().alert();
		alt1.dismiss();
		
		//Dismiss method will click Cancel on popup
		String txt=driver.findElement(By.id("result")).getText();
		System.out.println(txt);
		
		//prompt popup handling
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(2000);
		Alert alt2=driver.switchTo().alert();
		
		//Sending text to popup
		alt2.sendKeys("Java Selenium");
		Thread.sleep(2000);
		alt2.accept();
		String txt1=driver.findElement(By.id("result1")).getText();
		System.out.println(txt1);
		
		
		
		
	}

}
