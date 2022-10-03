package AugTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EleUtil {
    private WebDriver driver;
	
    public EleUtil(WebDriver driver) {
    	this.driver=driver;
    }
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public void getAttributes(By locator, String value) {
		List<WebElement> linksList = getElements(locator);
		for(WebElement e : linksList) {
			String links = e.getAttribute(value);
			System.out.println(links);
	}
	}
	public  void getLinksText(By locator) {
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
	
	
	
	
	
	
	
	
	
	
}
