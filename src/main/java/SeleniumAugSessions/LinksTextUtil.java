package SeleniumAugSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksTextUtil {
   static WebDriver driver;
	public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    
    driver = new ChromeDriver();
    
    driver.get("https://www.amazon.in/");
    
    By linksList = By.tagName("a");
    
  //  int no = getCount(linksList);
    //System.out.println(no);
		
		
		List<String> actualList = getElementsTextList(linksList);
		
		for (String e : actualList) {
			System.out.println(e);
		}
		
		

	}
 public static List<WebElement> getElements(By locator) {
	 return driver.findElements(locator);
 }
//	public static int getCount(By locator) {
//		return getElements(locator).size();
//	}
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String text = e.getText();
			if(!text.isEmpty()) {
				eleTextList.add(text);
			}
			
		}
		
		return eleTextList;
		
		
	}
	
	
}
