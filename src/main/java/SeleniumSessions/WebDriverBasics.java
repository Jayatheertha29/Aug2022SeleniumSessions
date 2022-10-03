package SeleniumSessions;

import org.openqa.selenium.WebDriver;




import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
static WebDriver driver;

	public static void main(String[] args) {
		
		String browser = "chrome";
		if (browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		}
		else {
			System.out.println("pass the right browser");
		}
		driver.get("http://www.ethereum.org");
		
		String title = driver.getTitle();
		
		System.out.println("title is : " + title);
		
		if (title.equalsIgnoreCase("home | ethereum.org")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		driver.close();
		
    // automation steps + validation = automation testing
	}

}
