package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		
		driver.manage().window().maximize();
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement e:list)
		{
			e.click();
			System.out.println(e.isSelected());
		}
		

	}

}
