package activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class All {

	WebDriver driver;
	By Memail=By.id("username");
	By Mpassword=By.id("password");
	By Mlogin=By.xpath("/html/body/ngb-modal-window/div/div/m-auth__modal/div/div[1]/m-loginform/div[2]/m-button/button/div");
	
	
	

	public void Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String email,String password)
	{
	
		driver.findElement(Memail).sendKeys(email);

		driver.findElement(Mpassword).sendKeys(password);
	}
	
	 public void login()
		{
			
			driver.findElement(Mlogin).click();
			//driver.navigate().refresh();
		}
	 
	 public void activity()
		{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/m-sidebar__navigationv2/div/nav/ul/li[2]/a/div/span")).click();
		 driver.navigate().back();
		 driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/m-sidebar__navigationv2/div/nav/ul/li[3]/a/div/span")).click();	
		}
	 

	 
	 
	
}
