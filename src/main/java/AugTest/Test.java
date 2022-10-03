package AugTest;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
static WebDriver driver;
	public static void main(String[] args) {
		
		BrowUtil br = new BrowUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.enterUrl("https://www.flipkart.com/");
		
//	EleUtil eu = new EleUtil(driver);
//	By un = By.id("input-username");
//	By fn = By.id("input-firstname");
//	By ln = By.id("input-lastname");
//	By email = By.id("input-email");
//	By country = By.id("input-country");
//	By pwd = By.id("input-password");
//	
//	eu.doSendKeys(un, "jayatheertha");
//	eu.doSendKeys(fn, "jayatheertha");
//	eu.doSendKeys(ln, "khasnis");
//	eu.doSendKeys(email, "jayatheertha11@gmail.com");
//	eu.doSendKeys(country, "India");
//	eu.doSendKeys(pwd, "jayatheertha@12345");
//	By linksList = By.xpath("//ul[@class='list-inline']/li/a");
//	By imagesList = By.xpath("//ul[@class='list-inline']/li//img");
//    eu.getAttributes(linksList, "href");
//    eu.getAttributes(imagesList, "src");      ////div[@class='row']//div/h1
   
	List<WebElement> text = driver.findElements(By.xpath("(//div[@class='col gu12 _3MmGvF']//div)[2]//a[@class='_3CuAg8']"));
	System.out.println(text.size());	
	for(WebElement e : text) {
			String linkshref = e.getAttribute("href");
		//	List<String> arrList = new ArrayList<String>();
			System.out.println(linkshref);
		//	String s = e.getText();
			//arrList.add(s);
		}
		
		
		
		
		
		
		
		
		

	}

}
