package Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\javaSoftware\\chrome78\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		WebElement scr =driver.findElement(By.id("draggable"));
		WebElement tar = driver.findElement(By.id("droppable"));
		Actions a =new Actions(driver);
		a.dragAndDrop(scr, tar).build().perform();
		a.clickAndHold(scr).moveToElement(tar).release().build().perform();

}
}