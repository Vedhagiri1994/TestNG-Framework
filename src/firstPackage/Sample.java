package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void verifyTitle(){
		System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		//String pageTitle = driver.getTitle();
		
		Assert.assertEquals("Gmail",driver.getTitle());   
		driver.close();
		
	}
	

}
