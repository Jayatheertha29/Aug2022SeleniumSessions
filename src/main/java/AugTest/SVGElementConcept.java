package AugTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElementConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		List<WebElement> statesList = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']/*[name()='g']/*[name()='path']"));
		Actions act = new Actions(driver);
		for(WebElement e : statesList) {
			//act.moveToElement(e).build().perform();
			String states = e.getAttribute("name");
			System.out.println(states);
		//	Thread.sleep(10000);
			if(states.equals("California")) {
				
				e.click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				List<WebElement> caliList = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g']//*[name()='g' and @id='california']/*[name()='g']/*[name()='path']"));
				for(WebElement e1 : caliList) {
					act.moveToElement(e1).perform();
					String calList = e1.getTagName();
					System.out.println(calList);
				}
				break;
			}
		}
		

	}

}
