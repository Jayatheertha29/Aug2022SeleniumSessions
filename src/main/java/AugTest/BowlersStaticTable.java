package AugTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BowlersStaticTable {
    static WebDriver driver;
	public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();  
    driver = new ChromeDriver();
    driver.get("https://stats.espncricinfo.com/ci/content/records/223646.html");
		
   
    
  
    
    for(int i=1; i<=5; i++) {
    	
    	String stats = driver.findElement(By.xpath("(//table//tbody/tr)["+i+"]")).getText();
    	System.out.println(stats);
    	
    }
    
    
		
		
		
	}

}
