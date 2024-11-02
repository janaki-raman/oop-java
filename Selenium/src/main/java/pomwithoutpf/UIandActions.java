package pomwithoutpf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UIandActions {
	
	WebDriver driver;
	public UIandActions(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//UI's Creation
	By userName=By.id("username");
	By passWord=By.id("password");
	By butn=By.id("submit");
	
	//Actions
	public void enterun()
	{
		driver.findElement(userName).sendKeys("student");
	}
	public void enterpw()
	{
		driver.findElement(passWord).sendKeys("Password123");
	}
	public void clickBtn()
	{
		driver.findElement(butn).click();
	}

}
