package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Loginpagefactory;



public class LoginTestFc {

	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}

	@BeforeMethod
	public void url()
	{
		driver.get("https://www.minds.com/login");
	}
	
	@Test
	public void testlogin()
	{
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //  driver.findElement(By.xpath("/html/body/m-app/m-topbarwrapper/m-topbar/div/div/div[2]/div[3]/div[1]/m-button[1]/button/div")).click();
		
		Loginpagefactory ob=new Loginpagefactory();
		ob.setvalues("soumyaraj","Mindset123@");
		ob.login();
	}
}
