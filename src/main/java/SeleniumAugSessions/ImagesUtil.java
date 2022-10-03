package SeleniumAugSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesUtil {
static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		By img = By.tagName("img");
		
//		List<WebElement> imgList = driver.findElements(img);
		
//		List<WebElement> imgList = getElements(img);
//		for (WebElement e : imgList) {
//			String altList = e.getAttribute("alt");
//			String srcList = e.getAttribute("src");
//			System.out.println(altList + "---->" + srcList);
//		}
		

		List<String> actAttList = getAttributesList(img, "alt");
		List<String> actAttList1 = getAttributesList(img, "src");
		
		System.out.println(actAttList);
		System.out.println(actAttList1);
		
		
		
		

	}
    public static List<WebElement> getElements(By locator) {
    	return driver.findElements(locator);
    }
    public static List<String> getAttributesList(By locator,String name) {
    	List<WebElement> imgAtt = getElements(locator);
    	List<String> attList = new ArrayList<String>();
    	for(WebElement e : imgAtt) {
    		String attValue = e.getAttribute(name);
    		attList.add(attValue);
    	}
    	return attList;
    }
	
	
	
	
	
}
