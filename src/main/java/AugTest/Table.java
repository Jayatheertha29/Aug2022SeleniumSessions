package AugTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("(//tr[@class='row-3 odd']/td)[1]/input")).click();
//		
//		List<WebElement> list = driver.findElements(By.xpath("(//tr[@class='row-3 odd']/td)[1]/following-sibling::td"));
//		
//        for(WebElement e : list) {
//        	String text = e.getText();
//        	System.out.println(text);
//        }
		Thread.sleep(5000);
		List<WebElement> check = driver.findElements(By.xpath("//tr[@class='row-26 even']/td/input"));
		
	while(true) {
			if(!(check.size()==1)) {
				driver.findElement(By.xpath("//a[@class='paginate_button next']")).click();
			check = driver.findElements(By.xpath("//tr[@class='row-26 even']/td/input"));
			}
			else {
				driver.findElement(By.xpath("//tr[@class='row-26 even']/td/input")).click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
