package SeleniumCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("http://tek-school.com/retail/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		if (pageTitle.equals("tek school001")) {
			driver.close();
		}else 
		{
			System.out.println("pageTitle does not match");
		}
			
			
			
	}

}
