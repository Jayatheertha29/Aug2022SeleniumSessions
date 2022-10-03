package AugTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartLinksText {
   static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		By linkText = By.tagName("a");

		getLinksText(linkText);
	}	
		
		public static void getLinksText(By locator) {
			List<WebElement> linksList = getElements(locator);
			System.out.println(linksList.size());
			List<String> stext = new ArrayList<String>();
			for(WebElement e : linksList) {
				String text = e.getText();
				stext.add(text);
				if(!text.isEmpty()) {
					System.out.println(text);
				}
		}	
			for(int i=0; i<=linksList.size(); i++) {
				String text1 = linksList.get(i).getText();
				if(!text1.isEmpty()) {
					System.out.println(text1);
				}
			}
		}
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		
		
		
		

	

}
