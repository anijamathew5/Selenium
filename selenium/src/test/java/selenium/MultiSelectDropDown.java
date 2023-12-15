package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		
		WebElement multidrop=driver.findElement(By.id("multi-select-field"));
		multidrop.click();
		
		Select select=new Select(multidrop);
		
		Boolean b=select.isMultiple();//check if dropdown is multi or single
		System.out.println(b);
		
		select.selectByValue("Red");
		select.selectByValue("Green");
		//select.deselectAll();
		//select.deselectByValue("Red");
		
		List<WebElement> list=select.getOptions();
		System.out.println("All options are:");	
		for(WebElement e:list)
		{
			
			System.out.println(e.getText());
		}
		
		
		List<WebElement> list1=select.getAllSelectedOptions();
		System.out.println("All Selected options are:");
		for(WebElement e:list1)
		{
			System.out.println(e.getText());
		}
		
		WebElement we=select.getFirstSelectedOption();
		System.out.println("Selected First Element is: "+we.getText());

	}

}
