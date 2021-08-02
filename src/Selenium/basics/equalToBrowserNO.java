 package Selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class equalToBrowserNO {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.manage().deleteAllCookies();
	    
	    driver.get("http://tek-school.com/retail/");
		
	    String pageTitle = driver.getTitle();
	    System.out.println(pageTitle);
	    
	    if(pageTitle.equals("tek school")) {
	    	driver.close();
	    }else {
	    	System.out.println("page Title doesn't match");
	    }
	    	
	    driver.close();
	    
	}

}
