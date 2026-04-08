package SeleniumJava.SeleniumJava;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilteringWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("web driver.chrome.driver", "C:\\Users\\mohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        
        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement>vegList = driver.findElements(By.xpath("//tr/td[1]"));
        List<WebElement> filteredList = vegList.stream().filter(v->v.getText().contains("Rice")).collect(Collectors.toList());
        
        Assert.assertEquals(vegList.size(), filteredList.size());
        Assert.assertTrue(filteredList.equals(vegList));
        driver.quit();
        
        
	}

}
