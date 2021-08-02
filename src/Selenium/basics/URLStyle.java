package Selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLStyle {

	public static void main(String[] args) {
		
		String url = "https://www.amazon.com";
		
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		driver.close();
		
		
		
	}

}
