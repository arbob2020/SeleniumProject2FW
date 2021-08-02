package Selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MidasBuyBrowser {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.midasbuy.com/midasbuy/ot/buy/pubgm");
	
	driver.manage().deleteAllCookies();
	
	String pageTitle = driver.getTitle();
	System.out.println(pageTitle);
	
	driver.close();
	 
	}

}
