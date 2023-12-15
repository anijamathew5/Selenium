package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;//for scrolling
		
		
		WebElement iframe=driver.findElement(By.id("a077aa5e"));
		js.executeScript("arguments[0].scrollIntoView();",iframe);
		
		driver.switchTo().frame(iframe);
		
		String parentWindowHandle=driver.getWindowHandle();//parenthandle
		System.out.println(parentWindowHandle);
		
		WebElement image=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		image.click();
		
		Set<String> handleAllWindows=driver.getWindowHandles();//handle all windows
		
		for(String handle:handleAllWindows)
		{
			if(!handle.equalsIgnoreCase(parentWindowHandle))
			{
				driver.switchTo().window(handle);
				System.out.println("Title is:"+driver.getTitle());
				System.out.println("Url is:"+driver.getCurrentUrl());
			}
		}
		driver.switchTo().window(parentWindowHandle);
		//driver.quit();
		

	}

}
