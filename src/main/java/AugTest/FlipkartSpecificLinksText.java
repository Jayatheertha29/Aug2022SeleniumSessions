package AugTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartSpecificLinksText {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> linksList = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div//div[@class='xtXmba']"));
		
		System.out.println(linksList.size());
		
		for(WebElement e : linksList) {
			String text = e.getText();
			System.out.println(text);
		
			driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
			if(text.contains("Top Offers")) {
				e.click();
			}
		}
	
		
		
		
		
		
		
		
		

	}

}
