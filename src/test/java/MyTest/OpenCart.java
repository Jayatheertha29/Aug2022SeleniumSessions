package MyTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OpenCart extends BaseTest {

	
	
	@Test
	public void linkTest() {
	//	driver.get("https://www.opencart.com/");
		boolean flag = driver.findElement(By.linkText("VIEW DEMO")).isDisplayed();
		
		System.out.println(flag);
	}
	
	@Test
	public void logoTest() {
		
		boolean flag = driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).isDisplayed();
		
		System.out.println(flag);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
