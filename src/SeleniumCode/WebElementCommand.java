 package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://tek-school.com/retail/");
		
		// we will store search fields WebElement 
		WebElement searchField = driver.findElement(By.name("search")); 
		
		//we can type or pass a value using sendKeys methods 
		searchField.sendKeys("Mac");
		
		//we will store search button in webElement 
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i"));
		
		
		searchButton.click();
		
		//locators in Selenium WebDriver 
		// bye.id --- if element has id this is first option 
		// by.name
		// by.classname 
		// by.linktext 
		//by.xpath --- write xpath for all elements if they don't have id 
		//by.cssSelector 
		
		
		
		//syntax for htm locators 
		//<tag> attribute = value </tag>
		//attributes can be id, name, classname, linktext, and any other name.
		//number one choice to find an element is by. id a --- it is unique and fast to find 
		//we select xpath or cssSelector
		
			
		
		 WebElement wishList = driver.findElement(By.id("WishList-total"));
		 wishList.click(); 
		 
		 
		 WebElement currency = driver.findElement(By.className("dropdown-toggle"));
		currency.click();
		
		
		WebElement shoppingCart = driver.findElement(By.xpath("//a{@title='shopping Cart']"));
		shoppingCart.clear();
		
	}

}
