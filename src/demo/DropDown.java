package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

	WebDriver driver;
	
	@Test
	public void dummy(){
		System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement s = driver.findElement(By.id("Skills"));
		Select s1 = new Select(s);
		/*List<WebElement> o = s1.getAllSelectedOptions();
		for(WebElement k:o){
			System.out.println(k.getText());
		}*/
		boolean b = s1.isMultiple();
		System.out.println(b);
		
		/*s1.selectByIndex(1);
		s1.selectByVisibleText("Android");
		s1.selectByValue("APIs");*/
		
		driver.quit();
}
}