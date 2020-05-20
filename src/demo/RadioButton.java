package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {

	WebDriver driver;

	@Test
	public void dummy() {
		System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		for(int i=1;i<=2;i++){
			//String s = driver.findElement(By.xpath("))
		}

	}
}
