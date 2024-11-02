package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	String value =driver.findElement(By.xpath("/html/body/div/div/div/div/div/h1")).getText();
	
	System.out.println(value);
	
	//String value1=driver.findElement(By.xpath("/h1")).getText();
	
	//System.out.println(value1);
    
	}

}
