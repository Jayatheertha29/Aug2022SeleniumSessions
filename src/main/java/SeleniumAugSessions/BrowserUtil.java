package SeleniumAugSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	static WebDriver driver;
	public WebDriver launchBrowser(String browser) {
		WebDriverManager.chromedriver().setup();
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equals("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("plz pass the right browser...");
		}
		return driver;
	}
	
	public void enterUrl(String url) {
		if (url == null) {
			System.out.println("enter the url..");
		}
		if (url.indexOf("https") == -1) {
			System.out.println("enter https");
		}
		 driver.get(url);
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void closeBrowser() {
		driver.close();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
