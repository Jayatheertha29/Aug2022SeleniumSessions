package SeleniumAugSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegTest {

	public static void main(String[] args) {

    BrowserUtil brUtil = new BrowserUtil();
    WebDriver driver = brUtil.launchBrowser("chrome");
    brUtil.enterUrl("https://www.opencart.com/index.php?route=account/login");
	String title = brUtil.getPageTitle();	
		System.out.println(title);
		//By un = By.id("input-username");
		//By fn = By.id("input-firstname");
		//By ln = By.id("input-lastname");
		//By email = By.id("input-email");
		//By co = By.id("input-country");
		//By pwd = By.id("input-password");
		
		ElementUtil eleutil = new ElementUtil(driver);
		//eleutil.doSendKeys(un, "jayatheertha");
		//eleutil.doSendKeys(fn, "jayatheertha");
        //eleutil.doSendKeys(ln, "khasnis");
        //eleutil.doSendKeys(email, "jayatheertha11@gmail.com");
        //eleutil.doSendKeys(co, "united states");
       // eleutil.doSendKeys(pwd, "jaya@$123");
        
     //  By email1 = By.name("email");
       //By password = By.name("password");
       
       //eleutil.doSendKeys(email1, "jayatheertha11@gmail.com");
       //eleutil.doSendKeys(password, "jayatheertha11");
       
     //*[@id="input-email"]
     // By email2 = By.xpath("//*[@id=\"input-email\"]");
     // By password1 = By.xpath("//*[@id=\"input-password\"]");
      
     // eleutil.doSendKeys(password1, "jayatheertha123");
     // eleutil.doSendKeys(email2, "jaya@gmail.com");
      
     // By link = By.linkText("Forgot your password?");
      //eleutil.doClick(link);
      
      By name = By.tagName("label");
      
     String s = eleutil.doGetText(name);
     System.err.println(s);
        
	}

}
