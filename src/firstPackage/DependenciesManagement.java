package firstPackage;

import org.testng.annotations.Test;

public class DependenciesManagement {

	@Test(dependsOnMethods="highSchool")
	public void higherSecondary(){
		System.out.println("Higher Secondary");
	}
	@Test
	public void highSchool(){
		System.out.println("High School");
	}
	@Test(dependsOnMethods="higherSecondary")
	public void enngineering()
	{
		System.out.println("College");	
	}
	
}
