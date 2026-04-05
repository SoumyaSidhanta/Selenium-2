package SeleniumJava.SeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deleting_Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("web driver.chrome.driver", "C:\\Users\\mohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.manage().deleteAllCookies();
//	        driver.manage().deleteCookieNamed("sessionKey");
	        driver.get("https://google.com/");
	        System.out.println(driver.getTitle());
	        
	        
	}

}
