package SelAugSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricScoreTable {
    static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-in-zimbabwe-2022-1325547/zimbabwe-vs-india-3rd-odi-1325551/full-scorecard");
		////a[@title='Shubman Gill']/../../following-sibling::td[@class='ds-min-w-max ds-text-right']
		String xpath = "//a[@title='Shubman Gill']/../../following-sibling::td[@class='ds-min-w-max ds-text-right']";
		
		List<WebElement> list = driver.findElements(By.xpath(xpath));
		
		System.out.println(list.size());
		
		for(int i=1; i<=list.size(); i++) {
			String scoreList = list.get(i).getText();
			System.out.println(scoreList);
		}
		
		
		
		
		
		
		
		
		

	}

}
