package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {
	
	WebDriver driver;
	
	@Test
	public void dummy(){
		System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String s = driver.getCurrentUrl();
		System.out.println(s);
		
		Assert.assertEquals(s, "https://www.google.com/");
		
		driver.quit();
		
	}

}
