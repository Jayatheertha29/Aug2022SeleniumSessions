package SelAugSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
		
		List<WebElement> suggList = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']//span"));
		
		System.out.println(suggList.size());
		
//		for(WebElement e : suggList) {
//			String suggListText = e.getText();
//			System.out.println(suggListText);
//			if(suggListText.equals("naveen automationlabs selenium")) {
//				e.click();
//				break;
//			}
//		}

	}

}
