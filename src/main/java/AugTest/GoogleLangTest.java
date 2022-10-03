package AugTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLangTest {
  static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/webhp?tab=rw");
		
		List<WebElement> langList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		for(WebElement e : langList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("తెలుగు")) {
				e.click();
				break;
			}
		}
		
//		for(int i=0; i<=langList.size(); i++) {
//			String list = langList.get(i).getText();
//			System.out.println(list);
//		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
