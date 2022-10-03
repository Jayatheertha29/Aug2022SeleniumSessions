package AugTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
    static WebDriver driver;
    public static void main(String[] args) {
	
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		
		By elements = By.cssSelector("span.comboTreeItemTitle");
		
		doSelect(elements, "choice 2", "choice 3", "choice 4");
		
    }	
    
	public static void doSelect(By locator, String... value) {
List<WebElement> ele = driver.findElements(locator);
		
		for(WebElement e : ele) {
			String text = e.getText();
			System.out.println(text);
			for(int i=0; i<value.length; i++) {
				if(text.equals(value[i])) {
					e.click();
					break;
				}
			}
		}
	}
		
}	

	


