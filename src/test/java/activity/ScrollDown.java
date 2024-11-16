package activity;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollDown {

	WebDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void uploading()
	{
		driver.get("https://www.minds.com/");
		
	}
	
	@Test
	public void test1() 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)", "");
		//js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[5]/ul/li[2]/a")));
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	    driver.findElement(By.xpath("/html/body/m-app/m-page/m-body/div/div/m-homepagecontainer/m-productpage__base/m-marketing__footer/div/div[2]/div[2]/div[4]/ul/li[4]/a")).click();
	}
	
	@AfterTest

	public void browserclose()
	{
		driver.close();
	}
}
