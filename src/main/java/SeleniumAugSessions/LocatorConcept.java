package SeleniumAugSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
//static WebDriver driver;
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.enterUrl("https://www.opencart.com/index.php?route=account/login");
		String title = br.getPageTitle();
		System.out.println(title);
		
		driver.findElement(By.id("input-email")).sendKeys("jayatheertha@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("jayatheertha@123");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		
		email.sendKeys("jaya");
		password.sendKeys("jaya");
		
		By e = By.id("input-email");
        By pwd = By.id("input-password");
        
        WebElement we = driver.findElement(e);
        WebElement we1 = driver.findElement(pwd);
        
        we.sendKeys("jaya123");
        we1.sendKeys("jaya456");
        
        
        
        
	}

}
