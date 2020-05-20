package firstPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	String name="Giri";
	
	@Test
	public void checkEquals(){
		
		Assert.assertEquals(name, "Giri");
	}	
}
