package SeleniumJava.SeleniumJava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InovkingMultWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("web driver.chrome.driver", "C:\\Users\\mohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        /*Test Case-
         * Hit "https://rahulshettyacademy.com/angularpractice/" URL
         * Switch to Next Window URL as "https://rahulshettyacademy.com/"
         * Click on Browse Course 
         * Product list appears after that scroll down by "window.scrollBy(0,2500)"
         * search for "Core Java for Automation Testers + Interview Programs" text 
         * return back to 1st(Parent Window) 
         * In name text field give input as "Core Java for Automation Testers + Interview Programs"
         * quit 
         * */
        
//        AJAHSD
        
        driver.switchTo().newWindow(WindowType.TAB);        
        
        Set<String> handle= driver.getWindowHandles();
        Iterator<String> iterators = handle.iterator();
        String parentWindowId= iterators.next();
        String childWindowId= iterators.next();
        driver.switchTo().window(childWindowId);
        
        driver.get("https://rahulshettyacademy.com/");
        
        JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
	    
        driver.findElement(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/courses']")).click();
        
        Set<String> newHandle= driver.getWindowHandles();
        Iterator<String> it = newHandle.iterator();
        String parentId1= it.next();
        String childId2= it.next();
        String childId3= it.next();
        driver.switchTo().window(childId3);
        
        js.executeScript("window.scrollBy(0,2500)");
        
        String ch3=  driver.findElement(By.xpath("//h2[contains(text(),'Core Java for Automation Testers + Interview Progr')]")).getText();
        System.out.println(ch3);

        Thread.sleep(3000);
   
        driver.switchTo().window(parentId1);
        
        driver.findElement(By.cssSelector("[name='name']")).sendKeys(ch3);
        
        driver.close();
        
        }

}
