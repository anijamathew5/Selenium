package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
WebDriver driver;
	
  @Test
  public void verifyThePageOpenWhileHittingTheUrl() {
	  String expectedUrl="https://selenium.obsqurazone.com/index.php";
	  String actualUrl=driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl, expectedUrl);//Hard Assert
  }
 
  @Test
  public void verifyThePageOpenWhileHittingTheUrl_SoftAssert() {
	  String expectedUrl="https://selenium.obsqurazone.com/index.php";
	  String actualUrl=driver.getCurrentUrl();
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals(actualUrl, expectedUrl);
	  soft.assertAll();
  }
  @BeforeTest
  public void beforeTest() {
	  	driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
