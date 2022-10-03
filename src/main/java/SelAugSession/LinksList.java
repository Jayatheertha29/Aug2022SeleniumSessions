package SelAugSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksList {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		By linksList = By.tagName("a");
		
		List<String> actLinkList = getLinksList(linksList);
        for(String e : actLinkList) {
        	System.out.println(e);
        }
		
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static List<String> getLinksList(By locator) {
		List<WebElement> linksList = getElements(locator);
		List<String> eleLinkList = new ArrayList<String>();
		for(WebElement e : linksList) {
			String eleList = e.getText();
			if(!eleList.isEmpty()) {
				eleLinkList.add(eleList);
			}
		}
		return eleLinkList;
	}

}
