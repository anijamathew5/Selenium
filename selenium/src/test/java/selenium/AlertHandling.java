package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		
		driver.manage().window().maximize();

		WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-success'] "));
		clickme.click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		WebElement promptalert=driver.findElement(By.xpath("//button[@class='btn btn-danger'] "));
		promptalert.click();
		
		
		driver.switchTo().alert().sendKeys("Anija");
		driver.switchTo().alert().accept();
		
		

	}

}
