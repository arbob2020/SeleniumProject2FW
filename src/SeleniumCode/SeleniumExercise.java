package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.navigate().to("https://tekschool.us");
	    
	    String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		Thread.sleep(3000);
	    
	    driver.close();
		
	}

}
