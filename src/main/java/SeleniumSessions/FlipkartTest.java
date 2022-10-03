package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTest {

	public static void main(String[] args) {

   
		
		//WebDriverManager.chromedriver().setup();
		
		BrowUtil br = new BrowUtil();
		br.launchBrowser("chrome");
	    br.enterUrl("http://www.flipkart.com");
		String curl = br.getCurrentUrl();
		System.out.println(curl);
		String title = br.getPageTitle();
		System.out.println(title);
		br.closeBrowser();
	}

}
