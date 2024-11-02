package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass1 {
	
	
             public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			// To initiate the driver
			System.setProperty("webdriver.chrome.driver","E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.youtube.com/");
			
			//To Maximize the window
		   driver.manage().window().maximize();
		   
		   Thread.sleep(5000);
			
			//To Close Windows
			driver.close();
			
			}

	}


 