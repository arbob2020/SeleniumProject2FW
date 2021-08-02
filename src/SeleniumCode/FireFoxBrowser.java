package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://youtube/"); 
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		    driver.navigate().to("https://youtube");
		    
		    String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			
			Thread.sleep(3000);
			
			driver.navigate().refresh();
			
			Thread.sleep(3000);
		    
		    driver.close();
		
		
		
	}

}
