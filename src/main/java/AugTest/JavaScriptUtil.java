package AugTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptUtil {
       WebDriver driver;
       public JavaScriptUtil(WebDriver driver) {
    	   this.driver=driver;
       }
	
	public void waitForPageLoad() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String status = js.executeScript("return document.readystate;").toString();
		if(status.equals("complete")) {
			System.out.println("loading is complete");
		}
		else {
			for(int i =1; i<=20; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				status = js.executeScript("return document.readystate;").toString();
				System.out.println("current loading status is :" + status);
				if(status.equals("complete")) {
					break;
				}
			}
		}
		
		////*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']/*[name()='g']/*[name()='path']
		
	}
	
	
	
	
	
	
	
	
}
