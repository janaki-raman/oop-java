package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("home")).click();
		Thread.sleep(2000);
		
		//getting Handles and storing in Set
		
		Set<String> hndls=driver.getWindowHandles(); 
		for(String a:hndls)
		{
			//printing handles
			System.out.println(a);
		}
		
		//complete handles Set converting as List
		List<String> lsthndl=new ArrayList<String>(hndls);
		
		//Switching to window using index
		driver.switchTo().window(lsthndl.get(1));
		driver.findElement(By.xpath("//img[@src='images/edit.png']")).click();

	}

}
