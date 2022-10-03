package SelAugSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {
static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		
		List<WebElement> linksText =driver.findElements(By.tagName("a"));
		
		System.out.println(linksText.size());
		for(int i=0;i<linksText.size(); i++) {
			String linksTextList = linksText.get(i).getText();
			if(!linksTextList.isEmpty()) {
				System.out.println(linksTextList);
			}
			
		}
//		getLinksText(list);
		
		
		

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
    public static void getLinksText(By locator) {
    	List<WebElement> linksList1 = getElements(locator);
    	System.out.println(linksList1.size());
    	for(WebElement e : linksList1) {
    		String linksTextList1 = e.getText();
    		if(!linksTextList1.isEmpty()) {
    			System.out.println(linksTextList1);
    		}
    	}
    	
    }
}
