package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//not working
		//driver.findElement(By.id("uploadfile_0")).click();
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.id("uploadfile_0"));
		act.click(ele).perform();
		
		//copy the file path
		StringSelection strselect=new StringSelection
		clipboard clipbrd=Toolkit.getDefaultToolkit().getSystemclipboard();
		clipbrd.setcontents(strselect,null);
		robot robo;
		robo=new Robot();
		robo.delay(5000);
		robo.keypress(keyEvent.vk_control);
		robo.keypress(keyEvent.vk_v);
		robo.keyRelease(keyEvent.vk_v);
		robo.keypress(keyEvent.vk_control);
		robo.delay(5000);
		robo.keypress(keyEvent.vk_Enter);
		robo.keypress(keyEvent.vk_Enter);
		Thread.sleep(3000);
		driver.findElement(By.id("trems")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("send")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//center)[2]")).getText());
		
		

	}

}
