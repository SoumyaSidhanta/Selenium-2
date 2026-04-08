package SeleniumJava.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static  org.openqa.selenium.support.locators.RelativeLocator.*;

public class RealtiveLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("web driver.chrome.driver", "C:\\Users\\mohan\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        WebElement nameBox = driver.findElement(By.cssSelector("[name='name']"));
        
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameBox)).getText());
	}

}
