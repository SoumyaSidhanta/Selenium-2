package SeleniumJava.SeleniumJava;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("web driver.chrome.driver", "C:\\Users\\mohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        
        
       // ToDo
        /*
         * got to -> https://rahulshettyacademy.com/seleniumPractise/#/offers
         * Web Table is appear
         * click on column  
         * after sorted capture all web element present in the list and grab the text out of it and create a new (original) list
         * applying sort on original list in step-4 -> Sorted list is created 
         * Then compare original list and Sorted List 
         * */
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> cartElements= driver.findElements(By.xpath("//tr/td[1]"));
        
        List<String> originalList = cartElements.stream().map(s->s.getText()).collect(Collectors.toList()); 
        
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
        
        Assert.assertTrue(originalList.equals(sortedList));
	}

}
