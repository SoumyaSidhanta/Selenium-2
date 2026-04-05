package SeleniumJava.SeleniumJava;

import java.util.Arrays;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Http_Certification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);

		// if required to logging with proxy
		Proxy proxi = new Proxy();
		proxi.setHttpProxy("ipaddress:3333");
		options.setCapability("proxy", proxi);
		
//		Block dialog windows
		
//		By default, ChromeDriver configures Chrome 
//		to allow pop-up windows. If you want to block pop-ups, and 
//		restore the normal Chrome behavior when it isn't 
//		controlled by ChromeDriver, do the following:
		
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		
		
		
		 System.setProperty("web driver.chrome.driver", "C:\\Users\\mohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.get("https://expired.badssl.com/");
	        System.out.println(driver.getTitle());

	}

}
