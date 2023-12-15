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

public class AssertionExample2 {
	WebDriver driver;
  @Test
  public void verifySuccessfulLogin() {
	  WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
	  userName.sendKeys("admin");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("admin");
	  WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
	  Actions action=new Actions(driver);
	  action.sendKeys(signin, Keys.ENTER).build().perform();
	
	  WebElement adminPage=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
	  String expectedText="Admin";
	  String actualText=adminPage.getText();
	  Assert.assertEquals(actualText, expectedText,"Mismatched");
	  System.out.println(actualText);
	}
  @Test
  public void VerifyUnsuccessfullLoginInvalidUsernameValidPassword()
  {
	  
	  WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
	  userName.sendKeys("admin12");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("admin");
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
  @Test
  public void VerifyUnsuccessfullLoginValidUsernameInvalidPassword()
  {
	  
	  WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
	  userName.sendKeys("admin");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("admin123");
	  WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
	  Actions action=new Actions(driver);
	  action.sendKeys(signin, Keys.ENTER).build().perform();
	 
	  WebElement alert=driver.findElement(By.xpath("//*[contains(text(),'Alert!')]"));
	  String expectedAlert="Alert!";
	  String actualAlert=alert.getText();
	  Assert.assertEquals(actualAlert, expectedAlert);
	  System.out.println(actualAlert);
	}
  @Test
  public void VerifyUnsuccessfullLoginInvalidUsernameInvalidPassword()
  {
	  
	  WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
	  userName.sendKeys("admin2345");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("admin123");
	  WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
	  Actions action=new Actions(driver);
	  action.sendKeys(signin, Keys.ENTER).build().perform();
	 
	  WebElement alert=driver.findElement(By.xpath("//*[contains(text(),'Alert!')]"));
	  String expectedAlert="Alert!";
	  String actualAlert=alert.getText();
	  Assert.assertEquals(actualAlert, expectedAlert);
	  System.out.println(actualAlert);
	}
  @Test
  public void VerifyRemeberMeIsByDefaultSelectedOrNot()
  {
	  
	  WebElement rememberMe=driver.findElement(By.xpath("//label[@for='remember']"));
	  Boolean rememberChecked=rememberMe.isSelected();
	  Assert.assertFalse(rememberChecked);
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
