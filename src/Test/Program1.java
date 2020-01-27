package Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program1 {
	private static final String ExceptedConditions = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\javaSoftware\\chrome78\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");  
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Anithaajp");
		WebElement  password = driver.findElement(By.id("password"));
		password.sendKeys("anitha536");
		WebElement btn  = driver.findElement(By.id("login"));
		btn.click();
		WebElement ele =driver.findElement(By.name("location"));
		Select obj = new Select(ele);
		obj.selectByValue("Sydney");
		WebElement ele1 =driver.findElement(By.name("hotels"));
	    Select obj1 =new Select(ele1);
	    obj1.selectByValue("Hotel Sunshine");
	    WebElement ele2 =driver.findElement(By.name("room_type"));
	    Select obj2 = new Select(ele2);
	    obj2.selectByValue("Super Deluxe");
	    WebElement ele3 =driver.findElement(By.name("room_nos"));
	    Select obj3 = new  Select(ele3);
	    obj3.selectByValue("4");
	    WebElement ele4 = driver.findElement(By.name("adult_room"));
	    Select obj4 =  new Select(ele4);
	    obj4.selectByValue("2");
	    WebElement ele5 = driver.findElement(By.name("child_room"));
	    Select obj5 =  new Select(ele5);
	    obj4.selectByValue("1");
	    WebElement bttn = driver.findElement(By.id("Submit"));
	    bttn.click();
	    WebElement bttn1 = driver.findElement(By.id("radiobutton_0"));
	    bttn1.click();
	    WebElement bttn2 = driver.findElement(By.id("continue"));
	    bttn2.click();
	    WebElement Fname =driver.findElement(By.id("first_name"));
	    Fname.sendKeys("Anithaa");
	    WebElement Lname =driver.findElement(By.id("last_name"));
	    Lname.sendKeys("JP");
	    WebElement add =driver.findElement(By.id("address"));
	    add.sendKeys("Tambaram");
	    WebElement cnum =driver.findElement(By.id("cc_num"));
	    cnum.sendKeys("4568731295214783");
	    WebElement ele6 = driver.findElement(By.name("cc_type"));
	    Select obj6 =  new Select(ele6);
	    obj6.selectByValue("VISA");
	    WebElement emnth = driver.findElement(By.name("cc_exp_month"));
	    Select obj7 =  new Select(emnth);
	    obj7.selectByValue("6");
	    WebElement eyr = driver.findElement(By.name("cc_exp_year"));
	    Select obj8 =  new Select(eyr);
	    obj8.selectByValue("2020");
	    WebElement ccvnum =driver.findElement(By.id("cc_cvv"));
	    ccvnum.sendKeys("879");
	    WebElement bttn3 = driver.findElement(By.id("book_now"));
	    bttn3.click();
	    WebDriverWait wait= new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("order_no")));
	    WebElement val=driver.findElement(By.id("order_no"));
	    String att=val.getAttribute("value");
	    System.out.println(att);
	    
	}
	}

	

