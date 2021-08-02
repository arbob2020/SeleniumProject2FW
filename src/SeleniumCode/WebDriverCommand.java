package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommand {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://www.youtube.com/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		
		
		driver.get(url);
		
		String pageTitle = driver.getTitle();
		System.out.println("this is tek school page title "+pageTitle);
		
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		driver.navigate().to("http://tek-school.com/retail/");
		String testEnvpageTitle = driver.getTitle();
		System.out.println("this is the test Env page title: "+ testEnvpageTitle);
		
		Thread.sleep(3000);
		
//		driver.navigate().back();
//		goes back to the previous browser 
//		driver.navigate().forward();
//		goes to the browser after the previous browser
		Thread.sleep(3000);
		
		driver.close();
	}

}
