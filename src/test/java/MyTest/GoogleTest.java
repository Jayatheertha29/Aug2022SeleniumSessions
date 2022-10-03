package MyTest;

import org.apache.hc.core5.util.Asserts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	
	
	@Test
	public void logoTest() {
		//driver.get("https://www.google.com/webhp?authuser=1");
		boolean flag = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		//Asserts.assertTrue(flag);
		System.out.println(flag);
	}
	@Test
	public void searchTest() {
		boolean flag = driver.findElement(By.className("gLFyf")).isDisplayed();
		System.out.println(flag);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
