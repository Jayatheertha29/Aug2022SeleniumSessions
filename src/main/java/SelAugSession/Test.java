package SelAugSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {

	public static void main(String[] args) {
		
	BrowserUtil br = new BrowserUtil();
	WebDriver driver = br.launchBrowser("chrome");
	br.enterUrl("https://www.amazon.in/");
//	String url = br.getCurrentUrl();
//		System.out.println(url);
//		String title = br.getTitle();
//		System.out.println(title);
		
		ElementsUtil eu = new ElementsUtil(driver);
//		By pn = By.xpath("//*[@id=\"__next\"]/div[3]/div/div[2]/div/div/div[2]/input");
//		By click = By.xpath("//*[@id=\"__next\"]/div[3]/div/div[2]/div/button/div/span");
//		eu.doSendKeys(pn, "9966945004");
//		//eu.doClick(click);
		
//		By link = By.xpath("//*[@id=\"__next\"]/div[3]/div/div[2]/span/span[1]");
//		String s= eu.getText(link);
//		System.out.println(s);
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println(linksList.size());
//		for(int i = 0; i<linksList.size(); i++) {
//			String actList = linksList.get(i).getText();
//			if(!actList.isEmpty()) {
//				System.out.println(actList);
//			}
			for (WebElement e : linksList) {
				String actList1 = e.getText();
			if(!actList1.isEmpty()) {
				System.out.println(actList1);
			}
			
			
		}
		
	}

}
