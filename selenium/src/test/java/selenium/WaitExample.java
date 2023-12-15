package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.qabible.in/payrollapp/site/login");
				driver.manage().window().maximize();
			
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
				WebElement uname=driver.findElement(By.id("loginform-username"));
				uname.sendKeys("carol");
				WebElement pswd=driver.findElement(By.id("loginform-password"));
				pswd.sendKeys("1q2w3e4r");
				WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
				login.click();
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10000));//explicitwait
				wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@href='/payrollapp/client/index']")));//condition in explicit wait
			
				WebElement clients=driver.findElement(By.xpath("//a[@href='/payrollapp/client/index']"));
				clients.click();
			}

		


	}


