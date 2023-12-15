package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		//driver.navigate().to("https://selenium.obsqurazone.com/index.php");//if using both get and navigate().to() its reflect like refresh
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		driver.navigate().forward();
	}

}
