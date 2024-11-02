package project1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\JR\\QSPIDERS\\Selenium\\Essentials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/mobile-phones-end-of-season-sale-ca09i-avi97e-store?fm=neo%2Fmerchandising&iid=M_89e85a3d-cfec-4e59-b226-73c0de115ea7_1_EM1OLCDXDYHG_MC.AIDH8F3BCTJQ&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Mobiles_AIDH8F3BCTJQ&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=AIDH8F3BCTJQ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Scroll page using java Script executor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		
		//Scroll by distance
		js.executeScript("Window.ScrollBy(0,1000)");
		
		//Scroll till the end of the page
		js.executeScript("Window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("Window.scrollBy(0,-document.body.scrollHeight)");
		

	}

}
