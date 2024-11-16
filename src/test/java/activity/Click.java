package activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Click {
public WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
			
	}
	
	
 @BeforeMethod
 public void url()
 {
	 driver.manage().window().maximize();
	 driver.get("https://www.minds.com/");
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 //waits
 }
 @Test
	public void activity()
	{
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.findElement(By.xpath("/html/body/m-app/m-topbarwrapper/m-topbar/div/div/div[2]/div[3]/div[1]/m-button[1]/button/div")).click();
     driver.findElement(By.id("username")).sendKeys("soumyaraj");
     driver.findElement(By.id("password")).sendKeys("Mindset123@");
     driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/m-auth__modal/div/div[1]/m-loginform/div[2]/m-button/button/div")).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   //  driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/m-sidebar__navigationv2/div/nav/ul/li[2]/a/div/span")).click();
	// driver.navigate().back();
	 driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-newsfeed/div/div[2]/div/div/m-discovery__sidebartags/m-sidebarwidget/div/m-button/button")).click();
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	 driver.findElement(By.xpath("//*[@id=\"cw-bubble-holder\"]/button[1]")).click();
	}

}
