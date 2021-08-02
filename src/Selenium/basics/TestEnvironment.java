package Selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEnvironment {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://tek-school.com/retail/";
		
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(url);
		
		Thread.sleep(3000);
		
		driver.manage().deleteAllCookies();
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
