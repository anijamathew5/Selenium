package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
  @Test
  public void testcase1() {
	  System.out.println("Testcase 1 Executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod Executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod Executed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass Executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass Executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest Executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest Executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite Executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite Executed");
  }

}
