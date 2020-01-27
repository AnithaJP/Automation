package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\javaSoftware\\chrome78\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");	
	WebElement v =driver.findElement(By.xpath("//a[@class='sf-with-ul']"));
	Actions a=new Actions(driver);
	a.moveToElement(v).perform();
	a.doubleClick().build().perform();
	a.contextClick().build().perform();
	
}
}