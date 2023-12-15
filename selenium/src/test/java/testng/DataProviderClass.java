package testng;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
  
 
@DataProvider(name="unsuccessfullLogin")
public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "admin", "a" },
	      new Object[] { "admin_1234", "admin" },
	      new Object[] { "admin123", "b" }
    };
  }
@DataProvider(name="login")
public Object[][] dp1() {
	    return new Object[][] {
	      new Object[] { "admin", "admin" },
	      
    };
  }

}
