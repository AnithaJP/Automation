package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\javaSoftware\\chrome78\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	WebElement we = driver.findElement(By.xpath("(//*[@class='product-image-container']//img[@title='Faded Short Sleeve T-shirts'])[1]"));
	System.out.println((we.isDisplayed()));
	
}
}