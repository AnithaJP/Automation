package Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screnshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\javaSoftware\\chrome78\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		TakesScreenshot ts =(TakesScreenshot)driver;
		File F1=ts.getScreenshotAs(OutputType.FILE);
		File F2=new File("C:\\javaSoftware\\pick.JPEG");
		FileHandler.copy(F1, F2);
	
		
		
	}
}
