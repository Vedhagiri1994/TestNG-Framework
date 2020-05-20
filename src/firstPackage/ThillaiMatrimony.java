package firstPackage;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ThillaiMatrimony {
		

	@BeforeSuite
	public void sample() {
		System.out.println("before suite");
	}

	@AfterSuite
	public void sample5() {
		System.out.println("after suite");
	}

	@AfterClass
	public void sample6() {
		System.out.println("after class");
	}

	@BeforeGroups
	public void sample9() {
		System.out.println("before group");
	}

	@AfterMethod
	public void sample7() {
		System.out.println("after method");
	}

	@AfterTest
	public void sample8() {
		System.out.println("after test");
	}

	@BeforeClass
	public void sample1() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void sample2() {
		System.out.println("before method");
	}
	@AfterGroups
	public void sample4() {
		System.out.println("after groups");
	}
	@Test
	public void sample10() {
		System.out.println("Test");
	}
	
}
