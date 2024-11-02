package project1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		System.out.println(driver.getWindowHandle());
		
		String mainhndl=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@href='#Tabbed']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a//button")).click();
		Thread.sleep(5000);
		
		//Switch to windows by using set concept
		Set<String> str=driver.getWindowHandles();
		for(String a:str)
		{
			System.out.println(a);
			if(mainhndl!=a)
			{
				driver.switchTo().window(a);
			}
				
		}
		
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//span[text()='Documentation']")).click();
		

	}

}
