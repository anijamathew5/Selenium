package testng;

import org.testng.annotations.Test;

public class BasicCmds {
  @Test(priority = 5)
  public void testcase1() {
	  System.out.println("First testcase executed");
  }
  @Test(enabled = false)
  public void testcase2()
  {
	  System.out.println("Second testcase executed");
  }
  @Test(priority = 1)
  public void testcase3()
  {
	  System.out.println("Third testcase executed");
  }
  @Test
  public void testcase4()
  {
	  System.out.println("fourth testcase executed");
  }
  @Test(priority = 4)
  public void testcase5()
  {
	  System.out.println("Fifth testcase executed");
  }
}
