package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {

	WebDriver driver;
	
	@Test
	public void dummy(){
		System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		List<WebElement> s = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement x:s){
			
			if(x.getAttribute("value").equals("Movies")||x.getAttribute("value").equals("Cricket")){
			x.click();
			}
			if(!x.isSelected()){
				System.out.println(x.getAttribute("value"));
			}
		}
		driver.quit();
}
}
