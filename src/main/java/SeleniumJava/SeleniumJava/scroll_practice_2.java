package SeleniumJava.SeleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class scroll_practice_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("web driver.chrome.driver", "C:\\Users\\mohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	        
	       JavascriptExecutor js =(JavascriptExecutor)driver;
	       js.executeScript("window.scrollBy(0,700)");
	       
	       Thread.sleep(3000);
	       
//	      List<WebElement> valuElements= driver.findElements(By.cssSelector(".left-align table[id = 'product'] td:nth-child(3)"));
//	       
//	      int sum =0;
//	      
//	      for (int i = 0; i < valuElements.size(); i++) {
//			
//	    	  sum = sum + Integer.parseInt(valuElements.get(i).getText());
//		}
//	      System.out.println("sum of no are: " +sum);
	       
	       
	       WebElement table = driver.findElement(By.cssSelector("table[name='courses']"));
	       
	       //row
	       System.out.println("Row: " + table.findElements(By.tagName("tr")).size());
	       //column
	       System.out.println("Column: " +table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	       
	       
	       List<WebElement> ele = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	       
	       System.out.print(ele.get(0).getText()+ " ");
	       System.out.print(ele.get(1).getText()+ " ");
	       System.out.print(ele.get(2).getText()+ " ");
	       
	      driver.quit();
	 }

}
