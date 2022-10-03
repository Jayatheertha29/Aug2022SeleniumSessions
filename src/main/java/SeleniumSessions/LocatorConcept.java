package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
static WebDriver driver;
	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("jayath@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("jaya123");

		driver.navigate().back();
		driver.navigate().forward();
		
		WebElement emailId = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		
		emailId.sendKeys("jayatheertha@gmail.com");
		password.sendKeys("jaya123");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		By b = By.id("input-email");
		By c = By.id("input-password");
		WebElement wb = driver.findElement(b);
		WebElement wb1 = driver.findElement(c);
		
		wb.sendKeys("jayajaya");
		wb1.sendKeys("jaya123123");
		
		By b1 = By.id("input-email");
		By c1 = By.id("input-password");
		
	
	

	
	}
	
	
	
	
	
	
	
}
