package AugTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForPageLoad {
      WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://api.cogmento.com/register/");
		
		driver.findElement(By.partialLinkText("Log in here")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//	JavaScriptUtil jsu = new JavaScriptUtil(driver);
	//	jsu.waitForPageLoad();
		driver.findElement(By.name("email")).sendKeys("jayatheertha11@gmail.com");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
