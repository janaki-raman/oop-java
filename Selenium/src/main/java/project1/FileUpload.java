package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.id("uploadfile_0")).sendKeys("‪C:\\Users\\JanakiRaman\\Downloads\\test1.txt");
		Thread.sleep(3000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("send")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("(//center)[2]")).getText());

}
}

