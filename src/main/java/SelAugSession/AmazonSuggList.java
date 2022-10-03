package SelAugSession;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSuggList {
  static WebDriver driver;
  
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/webhp?tab=rw");
		
	//	driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		for(WebElement e : images) {
			String list = e.getAttribute("alt");
			System.out.println(list);
		}
		
		
//		List<WebElement> suggList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		System.out.println(suggList.size());
//		
//		for(WebElement e : suggList) {
//			String list = e.getText().trim();
//			System.out.println(list);
//			if(list.equals("हिन्दी")) {
//				e.click();
//			}
//		}
//		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='mkHrUc']/ul[@class='erkvQe']//li//div[@class='wM6W7d']/span"));
//		for(WebElement e : suggList) {
//			String list = e.getText();
//			System.out.println(list);
//			if(list.equals("naveen automationlabs youtube")) {
//				e.click();
//			}
//		}
		
		
	}

}
