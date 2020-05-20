package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextBox {
	
	WebDriver driver;
	
	@BeforeMethod
	public void login(){
		
		System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void elementPresent(){
		if(driver.findElement(By.name("q"))!=null){
			System.out.println("Element is Displayed");
		}else{
			System.out.println("Element is not visible");
		}
	}
	
	@Test
	public void isDisplayed(){
		if(driver.findElement(By.name("q")).isDisplayed()){
			System.out.println("Element is Displayed");
		}else{
			System.out.println("Element is not visible");
		}
	}
	
	@Test
	public void isEnabled(){
		
		if(driver.findElement(By.name("q")).isEnabled()){
			System.out.println("Element is Enable");
		}else{
			System.out.println("Element is not Disabled");
		}
	}
	
	@Test
	public void textPresent(){
		
		if(driver.getPageSource().contains("true")){
			System.out.println("Text is present ");
		}else{
			System.out.println("Text is not present");
		}
	}
	
	
	@AfterMethod
	public void logOut(){
		driver.quit();
	}
}
