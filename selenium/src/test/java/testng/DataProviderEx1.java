package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {
	WebDriver driver;
  @Test(dataProvider = "unsuccessfullLogin")
  public void verifyUnsuccessfullLogin(String username, String password) {
	  WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
	  userName.sendKeys(username);
	  WebElement passwrd=driver.findElement(By.xpath("//input[@name='password']"));
	  passwrd.sendKeys(password);
	  WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
	  Actions action=new Actions(driver);
	  action.sendKeys(signin, Keys.ENTER).build().perform();
	  //signin.click();
	  WebElement alert=driver.findElement(By.xpath("//*[contains(text(),'Alert!')]"));
	  String expectedAlert="Alert!";
	  String actualAlert=alert.getText();
	  Assert.assertEquals(actualAlert, expectedAlert);
	  System.out.println(actualAlert);
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }


  @DataProvider(name="unsuccessfullLogin")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "admin", "a" },
      new Object[] { "admin_1234", "admin" },
      new Object[] { "admin123", "b" }
    };
  }
}
