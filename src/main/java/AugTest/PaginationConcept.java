package AugTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationConcept {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://babynames.merschat.com/popular.cgi");
	Thread.sleep(5000);
	
	List<WebElement> namesList = driver.findElements(By.xpath("//a[contains(text(),'Varshat')]"));
        
	while(true) {
		if(!(namesList.size()==1)) {
			driver.findElement(By.xpath("//font[contains(text(),'Next')]")).click();
			namesList = driver.findElements(By.xpath("//a[contains(text(),'Varshat')]"));
		}
		else {
			String text = driver.findElement(By.xpath("(//a[contains(text(),'Varshat')]/../..//following-sibling::td)[3]")).getText();
			System.out.println(text);
			break;
		}
	}
	
		

	}

}
