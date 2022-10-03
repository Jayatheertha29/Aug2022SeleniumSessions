package AugTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectWithoutUsingSelectTag {
	static WebDriver driver;
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		List<WebElement> couList = driver.findElements(By.xpath("//select[@id='input-country']/option"));
		
		for(WebElement e : couList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Germany")) {
				e.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
