package AugTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowUtil {

	static WebDriver driver;
	
	public WebDriver launchBrowser(String browser) {
		WebDriverManager.chromedriver().setup();
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("plz pass the right browser name");
		}
		return driver;
	}
	public void enterUrl(String url) {
		if(url==null) {
			System.out.println("enter url");
		}
		if(url.indexOf("https") == -1) {
			System.out.println("https is missing");
		}
		driver.get(url);
	}
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	public String getTitle() {
		return driver.getTitle();
	}
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
