package firstPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	@BeforeSuite
	public void sample() {
		System.out.println("before suite");
	}

	@AfterSuite
	public void sample5() {
		System.out.println("after suite");
	}
}
