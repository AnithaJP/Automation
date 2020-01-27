package Test;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver", "C:\\javaSoftware\\chrome78\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
			
			WebElement ele=driver.findElement(By.name("coffee2"));
		
			Select obj= new Select(ele);
			obj.selectByValue("skim");
			obj.selectByValue("milk2");
			
			List<WebElement>selopt=obj.getAllSelectedOptions();
			for(WebElement opt:selopt) {
				System.out.println(opt.getText());
			}
			
			System.out.println("------------->");
			List<WebElement>list=obj.getOptions();
			for(WebElement a:list) {
				System.out.println(a.getText());
			}
		}
}
