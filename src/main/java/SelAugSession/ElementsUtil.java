package SelAugSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsUtil {

	private WebDriver driver;
	
	public ElementsUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public void doClick(By locator) {
		 getElement(locator).click();;
	}
	public String getText(By locator) {
		return getElement(locator).getText();
	}
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public List<String> getLinksList(By locator) {
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
