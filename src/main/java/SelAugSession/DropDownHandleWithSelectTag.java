package SelAugSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelectTag {
  static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
//		WebElement day = driver.findElement(By.id("day"));
//		WebElement month = driver.findElement(By.id("month"));
//		WebElement year = driver.findElement(By.id("year"));
//		Select select = new Select(day);
//		Select selectmonth = new Select(month);
//		Select selectyear = new Select(year);
//		select.selectByIndex(28);
//		selectmonth.selectByVisibleText("Jul");
//		selectyear.selectByValue("1995");
		  By day = By.id("day");
		  By month = By.id("month");
		  By year = By.id("year");
		  DropDownHandleByIndex(day, 28);
		  DropDownHandleByVisibleText(month, "Jul");
		  DropDownHandleByValue(year, "1995");
		
		
	}	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void DropDownHandleByIndex(By locator, int id) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(id);
	}
	public static void DropDownHandleByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public static void DropDownHandleByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}	

	

}
