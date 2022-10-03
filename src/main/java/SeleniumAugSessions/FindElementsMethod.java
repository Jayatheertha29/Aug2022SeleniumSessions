package SeleniumAugSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsMethod {
     
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
//		List<WebElement> images = driver.findElements(By.tagName("img"));
//		System.out.println(images.size());
//	
//		for (WebElement e : images) {
//			String alt = e.getAttribute("alt");
//			String src = e.getAttribute("src");
//			System.out.println(alt+"-->"+src);
//		}
		
		By linksList = By.tagName("a");
		
		List<WebElement> list = getElements(linksList);
		System.out.println(list.size());
		
		for (WebElement e : list) {
			String s = e.getText();
			if(!s.isEmpty()) {
				System.out.println(s);
			}
			
		}

	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	

}
