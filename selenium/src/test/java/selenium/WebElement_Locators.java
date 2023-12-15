package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebElement_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement messageTextBox=driver.findElement(By.id("single-input-field"));//by using id
		//WebElement messageTextBox1=driver.findElement(By.cssSelector("Input#single-input-field"));//cssselector using id
		messageTextBox.clear();
		messageTextBox.sendKeys("Anija MAthew");
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		showMessageButton.click();
		
		WebElement yourMessage=driver.findElement(By.id("message-one"));
		String message=yourMessage.getText();
		System.out.println(message);
		
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkBoxOne=driver.findElement(By.id("check-box-one"));
		checkBoxOne.click();
		Boolean checkboxoneselect=checkBoxOne.isSelected();
		System.out.println(checkboxoneselect);
		
		

	}

}
