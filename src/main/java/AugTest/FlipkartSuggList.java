package AugTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartSuggList {
    static WebDriver driver;
	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//div[@class='_2QfC02']/button")).click();
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
