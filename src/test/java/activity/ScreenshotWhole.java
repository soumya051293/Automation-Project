package activity;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotWhole {
	 ChromeDriver driver;
	
	@BeforeMethod
	public void setup()
		{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.minds.com/");
	}
	
	@Test
	public void takeshot() throws Exception 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./Screenshot//Shot2.png"));
		
	}

}
