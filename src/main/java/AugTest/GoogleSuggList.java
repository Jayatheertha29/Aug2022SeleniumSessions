package AugTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSuggList {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/webhp?tab=rw");
		
		//ul[@role='listbox']/li//div[@class='wM6W7d']//span
		//driver.findElement(By.xpath("//div[@class='QlyBfb']/button")).click();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("naveen automationlabs");
		
		driver.findElement(By.xpath("//div[@class='QlyBfb']/button[text()='No thanks']")).click();
		List<WebElement> suggList = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@role='option']/div[@class='wM6W7d']/span"));
		
		//driver.findElement(By.xpath("//div[@class='QlyBfb']/button")).click();
		System.out.println(suggList.size());
		
		
		
		

	}

}
