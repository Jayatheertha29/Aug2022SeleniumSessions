package AugTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextUsingSelectClass {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
	   WebElement couList = driver.findElement(By.id("input-country"));
		Select select = new Select(couList);
		List<WebElement> countryList = select.getOptions();
		for(WebElement e : countryList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Australia")) {
				e.click();
			}
		}
		
		
		
		
		
	}

}
