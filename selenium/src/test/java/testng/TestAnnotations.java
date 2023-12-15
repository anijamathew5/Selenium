package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
  @Test
  public void testcase() {
	  System.out.println("Test case 1 executed");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test Executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test Executed");
  }

}
