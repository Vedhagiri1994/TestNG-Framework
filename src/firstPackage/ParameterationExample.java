package firstPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterationExample {
	
	@Test
	@Parameters({"UserName","Password"})
	public void printName(String name, String password){
		System.out.println("Name is " + name);
		System.out.println("Password is " + password);
	}

} 
