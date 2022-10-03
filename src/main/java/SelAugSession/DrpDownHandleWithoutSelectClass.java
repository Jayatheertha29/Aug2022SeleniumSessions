package SelAugSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDownHandleWithoutSelectClass {
	 static WebDriver driver;
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();   //freshworks xpath //ul[@class='footer-nav']/li/a[contains(text(),'Fresh')]
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		List<WebElement> monthsList = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		for(WebElement e : monthsList) {
			String list = e.getText();
			System.out.println(list);
			if(list.equals("Jul")) {
				e.click();
			}
		}
		
		

	}

}
