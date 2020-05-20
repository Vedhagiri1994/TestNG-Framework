package demo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	

	WebDriver driver;
	
	@Test
	public void dummy() throws IOException{
		System.setProperty("webdriver.chrome.driver", "./src/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> tRows=driver.findElements(By.tagName("tr"));
		for(int i=0;i<tRows.size();i++){
			List<WebElement> tDatas = driver.findElements(By.tagName("td"));
			for(int j=0;j<tDatas.size();j++){
				if(tDatas.get(j).getText().equals("Bajaj Corp Ltd.")){
					driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[11]/td[4]"));
					System.out.println(tDatas.get(j).getText());
				}
				
			}
		}
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File f=tk.getScreenshotAs(OutputType.FILE);
		File f1=new File("E:/Screenshot.jpg");
		FileUtils.copyFile(f,f1);
		
		
		
		
		
		/*String s = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[4]")).getText();
		System.out.println(s);*/
	}
	
}
