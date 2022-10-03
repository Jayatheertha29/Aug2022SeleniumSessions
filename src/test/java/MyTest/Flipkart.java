package MyTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Flipkart extends BaseTest{

	
	
	@Test
	public void logoTest() {
	//	driver.get("https://www.flipkart.com/");
		boolean flag = driver.findElement(By.xpath("//img[@title='Flipkart']")).isDisplayed();
		
		System.out.println(flag);
	}
	@Test
	public void urlTest() {
		String url = driver.getCurrentUrl();
		if(url.contains("flipkart")) {
			System.out.println("pass");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
