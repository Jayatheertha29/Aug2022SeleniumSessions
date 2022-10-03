package SelAugSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectTag {
  static WebDriver driver;
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
//		WebElement day = driver.findElement(By.id("day"));
//		
//		Select selectday = new Select(day);
//		List<WebElement> daysList = selectday.getOptions();
//		for(WebElement e : daysList) {
//			String list = e.getText();
//			if(!list.equals("29")) {
//				System.out.println(list);
//			}
//			if(list.equals("29")) {
//				e.click();
//			}
//			
//		}
		By days = By.id("day");
		DropDownHandleWithoutSelectTag(days, "29");
		
	}		
		
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void DropDownHandleWithoutSelectTag(By locator, String value) {
		Select selectDay = new Select(getElement(locator));
		List<WebElement>daysList =  selectDay.getOptions();
		for(WebElement e : daysList) {
			String list = e.getText();
			System.out.println(list);
			if(list.equals(value)) {
				e.click();
			}
		}
	}
		
		
		

	

}
