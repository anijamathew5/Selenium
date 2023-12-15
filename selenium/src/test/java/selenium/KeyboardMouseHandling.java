package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		driver.manage().window().maximize();
		
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Welcome");
		WebElement button=driver.findElement(By.id("button-one"));
		
		Actions action=new Actions(driver);
		//action.sendKeys(button, Keys.ENTER).build().perform();//click using sendkeys
		
		action.keyDown(Keys.TAB).build().perform();
		action.keyDown(Keys.ENTER).build().perform();
		
		action.moveToElement(button).build().perform();
		action.contextClick().build().perform();
		
		//action.contextClick(button).build().perform();
		
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");//example of drag and drop method
		WebElement amount=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
		WebElement drop=driver.findElement(By.id("amt7"));
		action.dragAndDrop(amount, drop).build().perform();
		

	}

}
