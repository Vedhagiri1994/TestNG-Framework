package firstPackage;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(invocationCount=10)
	public void sample(){
		System.out.println("Sample Test");
		
	}

}
