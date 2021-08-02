package Selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Roblox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("https://www.roblox.com");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
