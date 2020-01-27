package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\javaSoftware\\chrome78\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactin.com/HotelApp/");      
	 WebElement user = driver.findElement(By.id("username"));
	 user.sendKeys("Anithaajp");
	 WebElement  password = driver.findElement(By.id("password"));
	 password.sendKeys("anitha536799998");
	 WebElement btn  = driver.findElement(By.id("login"));
	 btn.click();
     WebElement val  = driver.findElement(By.id("username_show"));
     String att = val.getAttribute("value");
    System.out.println(att);
}
}
