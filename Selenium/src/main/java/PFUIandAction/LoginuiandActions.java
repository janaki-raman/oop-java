package PFUIandAction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginuiandActions {
	
	@FindBy(how=How.NAME,using="username")WebElement userName;
	
	@FindBy(how=How.ID,using="password")WebElement passwrd;
	
	@FindBy(how=How.XPATH,using="//button[text()='Submit']")WebElement submitButn;
	
	public void enterUsername()
	{
		userName.sendKeys("student");
	}

	public void enterpassword()
	{
		passwrd.sendKeys("Password123");
	}
	
	public void clicksubmit()
	{
		submitButn.click();
	}
}
