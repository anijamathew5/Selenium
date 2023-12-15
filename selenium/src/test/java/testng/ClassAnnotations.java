package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotations {
  @Test
  public void testcase1() {
	  System.out.println("Testcase 1 executed");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass Executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass Executed");
  }

}
