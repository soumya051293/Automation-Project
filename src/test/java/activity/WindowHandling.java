package activity;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandling {
	
WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urload()
	{
		driver.manage().window().maximize();
		 driver.get("https://www.minds.com/");
	}
	
	@Test
	public void mainurl() 
	{
		String parentWindow=driver.getWindowHandle();
		System.out.println("Window Title" + driver.getTitle());
		driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-homepagecontainer/m-productpage__base/m-productpage__hero/div/m-productpage__button[2]/button")).click();
		Set<String> allwindow = driver.getWindowHandles();
		driver.navigate().refresh();
		
		for(String handle:allwindow)
		{
			System.out.println(handle);
			
	if(!handle.equalsIgnoreCase(parentWindow)) 
	{	
		driver.switchTo().window(handle);
		//driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("/html/body/main/div[1]/section[1]/div[2]/div[2]/div[1]/div/div/div[2]/a")).click();
		driver.close();
	}	
		driver.switchTo().window(parentWindow);
			
		}

	}}
