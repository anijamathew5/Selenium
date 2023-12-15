package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		String locator=null;
		
		List<WebElement> list=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equals("Ashton Cox"))
			{
				locator="//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td[4]";
				break;
			}
		}	
		WebElement locate=driver.findElement(By.xpath(locator));
		System.out.println(locate.getText());
	}
	

}
