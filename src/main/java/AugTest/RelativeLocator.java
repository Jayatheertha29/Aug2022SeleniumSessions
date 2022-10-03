package AugTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
public class RelativeLocator {
  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://whenwise.com/sign-in");
		driver.findElement(By.id("email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@12345");
		driver.findElement(By.id("login-btn")).click();
		driver.navigate().to("https://whenwise.com/users/2835/edit");
		Thread.sleep(5000);
	//	WebElement ele = driver.findElement(By.xpath("//span[text()='Email on booking confirmation?']"));
		
	//	driver.findElement(with(By.className("lever")).toRightOf(ele)).click();
		By text = By.xpath("//span[text()='Email on booking confirmation?']");
	    By toggle = By.className("lever");
	    getElement(text);
	    relativeLocator(toggle, text);
		
	}	
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
//		public static void relativeLocator(By locator) {
//			driver.findElement(with(By.className("lever")).toRightOf(locator)).click();
//		}
		public static void relativeLocator(By locator1, By locator) {
			getElement(with(locator1).toRightOf(locator)).click();
		}
		

	

}
