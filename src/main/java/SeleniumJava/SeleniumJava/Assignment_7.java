package SeleniumJava.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("web driver.chrome.driver", "C:\\Users\\mohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	        driver.findElement(By.cssSelector("input[class $='ui-autocomplete-input']")).click();
	        driver.findElement(By.cssSelector("input[class $='ui-autocomplete-input']")).sendKeys("Aus");
	    
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("input[class $='ui-autocomplete-input']")).sendKeys(Keys.DOWN);
	        
	        System.out.println(driver.findElement(By.cssSelector("input[class $='ui-autocomplete-input']")).getAttribute("value"));
	        
	      driver.quit();
	        

	}

}
