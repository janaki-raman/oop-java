package project1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class WebTable {
	
   @Test
   public void WebTable1()
   {
	   System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");
		Scanner sc=new Scanner(System.in);
		String ctry=sc.next();
		
		WebElement ele=driver.findElement(By.xpath("//Strong[text()="+ctry+"]//following::td[2]"));
		System.out.println(ele.getText());
		sc.close();
	
   }
   
	
	
}

