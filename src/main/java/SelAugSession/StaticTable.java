package SelAugSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTable {
    static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String bxpath = "//table[@class='ws-table-all notranslate']//tr/td";
		
		List<WebElement> list = driver.findElements(By.xpath(bxpath));
		System.out.println(list.size());
		for(WebElement e : list) {
			String tableList = e.getText();
			System.out.println(tableList);
		}
		
		
		
		
		
		
		
		
	}

}
