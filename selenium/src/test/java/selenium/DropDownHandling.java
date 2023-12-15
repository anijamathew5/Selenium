package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();

		WebElement dropdown=driver.findElement(By.id("single-input-field"));
		dropdown.click();
		
		Select select=new Select(dropdown);
		//select.selectByIndex(2);
		//select.selectByValue("Red");
		select.selectByVisibleText("Yellow");
		
		List<WebElement> list=select.getOptions();
		for(WebElement e:list)
		{
			System.out.println(e.getText());
		}
		
		
	}

}
