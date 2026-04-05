package SeleniumJava.SeleniumJava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;


public class Handlling_BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		// TODO Auto-generated method stub

		 	System.setProperty("web driver.chrome.driver", "C:\\Users\\mohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	        
	        
	       List <WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	       
	       SoftAssert sa= new SoftAssert();
	       
	       for (WebElement link : links) {
	    	   
	    	   String url =link.getAttribute("href");
	    	   HttpURLConnection conn = (HttpURLConnection) new URI(url).toURL().openConnection();
		       conn.setRequestMethod("HEAD");
		       conn.connect();
		       
		       int responseCode = conn.getResponseCode();
		       System.out.println("Response Code is: "+responseCode);
		       // soft assertion
		       sa.assertTrue(responseCode<400, "The Link with text "+link.getText()+" is broken with code "+responseCode);
		    	 
		       }
	        
	       		sa.assertAll();
	
	        
	        //Broken URl check for 1 URL
//	       String url =driver.findElement(By.cssSelector("a[href*='brokenlink'")).getAttribute("href");
//	        
//	       HttpURLConnection conn = (HttpURLConnection) new URI(url).toURL().openConnection();
//	       conn.setRequestMethod("HEAD");
//	       conn.connect();
//	       int responseCode = conn.getResponseCode();
//	       
//	       System.out.println("Response Code is: "+responseCode);
//	       
//	       if(responseCode<400) {
//	    	   System.out.println("The URL Link is OK");
//	       }
//	       else {
//			System.out.println("The URL link is broken");
//		   }
	        
	       driver.quit();
	        
	}

}
