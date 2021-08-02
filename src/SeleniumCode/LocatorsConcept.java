package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		
		driver.get("https://canvas.instructure.com/login/canvas");
		
		
		
		WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='passwd']"));
		
		WebElement signInButton = driver.findElement(By.xpath("//Button[@id='submitLogin']"));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		emailField.sendKeys("arbobrahimi2020@gmail.com");
		
		passwordField.sendKeys("sdet");
		signInButton.click();
		
	}

}
