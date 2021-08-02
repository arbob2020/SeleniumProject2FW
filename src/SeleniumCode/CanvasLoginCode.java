package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanvasLoginCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://canvas.instructure.com/login/canvas");
		WebElement userName = driver.findElement(By.id("pseudonym_session_unique_id"));
		WebElement password = driver.findElement(By.id("pseudonym_session_password"));
		WebElement loginButton = driver.findElement(By.className("//button[@class='button button--login']"));
		
		
		userName.sendKeys("arbobrahimi2020@gmail.com");
		password.sendKeys("sdet");
		loginButton.click();
		
	}

}
