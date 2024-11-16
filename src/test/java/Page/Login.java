package Page;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Login {

	WebDriver driver;
	By Memail=By.id("username");
	By Mpassword=By.id("password");
	By Mlogin=By.xpath("/html/body/ngb-modal-window/div/div/m-auth__modal/div/div[1]/m-loginform/div[2]/m-button/button/div");
	
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String email,String password)
	{
		driver.findElement(Memail).clear();
		driver.findElement(Memail).sendKeys(email);
		driver.findElement(Mpassword).clear();
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
	 driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/m-sidebar__navigationv2/div/nav/ul/li[2]/a/div/span"));
	 driver.navigate().back();
	 driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/m-sidebar__navigationv2/div/nav/ul/li[3]/a/div/span")).click();
	}
	

}

