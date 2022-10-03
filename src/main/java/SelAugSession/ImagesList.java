package SelAugSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesList {
  static WebDriver driver;
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		By images = By.tagName("img");
		
		List<String> actImageList = getImagesAttributes(images, "src");
		
		for(String e : actImageList) {
			System.out.println(e);
		}
		
		
		
	
	}
   public static List<WebElement> getElements(By locator) {
	   return driver.findElements(locator);
   }
   public static List<String> getImagesAttributes(By locator, String attributename) {
	   List<WebElement> attList = getElements(locator);
	   List<String> imageList = new ArrayList<String>();
	   for(WebElement e : attList) {
		  String attValue = e.getAttribute(attributename);
		  imageList.add(attValue);
	   }
	   return imageList;
   }
  
}
