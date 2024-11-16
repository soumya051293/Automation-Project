package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseauto {
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
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 //waits
 }
}
