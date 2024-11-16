package activity;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Baseauto;

public class Sreenshotmind   {
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
	
	@Test
	public void Screenshot() throws Exception 
	{
		WebElement mind=driver.findElement(By.xpath("/html/body/m-app/m-topbarwrapper/m-topbar/div/div/div[1]/nav/h1/a/img[1]"));
		File src1=mind.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("./Screenshot//Shot1.png"));
		
	}
	

	
}
