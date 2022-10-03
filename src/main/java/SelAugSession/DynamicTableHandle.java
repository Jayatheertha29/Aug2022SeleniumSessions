package SelAugSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTableHandle {
  static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		////*[@id="customers"]/tbody/tr[2]/td[1]
		////*[@id="customers"]/tbody/tr[3]/td[1]
		////*[@id="customers"]/tbody/tr[4]/td[1]
		////*[@id="customers"]/tbody/tr[5]/td[1]
		////*[@id="customers"]/tbody/tr[6]/td[1]
		////*[@id="customers"]/tbody/tr[7]/td[1]
		
//		String xpath1 = "//*[@id=\"customers\"]/tbody/tr[";
//		String xpath2 = "]/td[1]";
//		String x = xpath1+xpath2;
//		System.out.println(x);
		int rowsize = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();
		int columsize = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/th")).size();
		for(int i=2; i<=rowsize; i++) {
			for(int j=1; j<=columsize; j++) {
				String tableList = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(tableList);
			}
			System.out.println();
		}
		
		
		
	}

}
