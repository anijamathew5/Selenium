package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
  @Test(priority = 2)
  public void testcase1() {
	  System.out.println("Testcase1 executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method executed");
  }
  @Test(priority = 1)
  public void testcase2()
  {
	  System.out.println("Testcase 2 executed");
  }
  

}
