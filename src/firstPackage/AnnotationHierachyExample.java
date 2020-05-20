package firstPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationHierachyExample {
  
  @Test(priority=0)
  public void test() {
	  System.out.println("Im Test");
  }
  @Test(priority=2)
  public void test2() {
	  System.out.println("Im Test 2");
  }
  
  @Test(priority=3)
  public void test3() {
	  System.out.println("Im Test 3");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Im Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Im After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Im Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Im After class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Im Before test");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("Im After Test");
  }
  
  @BeforeTest
  public void beforeTest1() {
	  System.out.println("Im Before test 1");
  }

  @AfterTest
  public void afterTest1() {
	  System.out.println("Im After Test 1");
  }
  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("Im After suite");
  }
  
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Im Before suite");
  }
}
