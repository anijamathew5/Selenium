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
import org.testng.annotations.Test;

public class DataProviderImplementation {
	WebDriver driver;
  @Test(dataProvider = "login",dataProviderClass = DataProviderClass.class)
  public void SuccessfullLogin(String uname,String pswd) {
	  WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
	  userName.sendKeys(uname);
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys(pswd);
	  WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
	  Actions action=new Actions(driver);
	  action.sendKeys(signin, Keys.ENTER).build().perform();
	
	  WebElement adminPage=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
	  String expectedText="Admin";
	  String actualText=adminPage.getText();
	  Assert.assertEquals(actualText, expectedText,"Mismatched");
	  System.out.println(actualText);
  }
  @Test(dataProvider = "unsuccessfullLogin",dataProviderClass = DataProviderClass.class)
  public void verifyUnsuccessfullLogin(String uname, String pswd) {
	  WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
	  userName.sendKeys(uname);
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys(pswd);
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

}
