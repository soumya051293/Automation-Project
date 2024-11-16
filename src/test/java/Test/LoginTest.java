package Test;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Baseauto;
import Page.Login;
import Utility.Utilityclass;


public class LoginTest extends  Baseauto {
	
/*WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
	driver=new ChromeDriver	();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.manage().window().maximize();
		driver.get("https://www.minds.com/");
	}*/
	
	@Test
	public void verifylogin() throws Exception
	{ 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.findElement(By.xpath("/html/body/m-app/m-topbarwrapper/m-topbar/div/div/div[2]/div[3]/div[1]/m-button[1]/button/div")).click();

    Login ob=new Login(driver);  
		String xl="C:\\Users\\sibin\\Documents\\SOUMYA\\Luminar\\DataDrivenautomation.xlsx";
		String Sheet="Sheet1";
		int rowCount=Utilityclass.getRowCount(xl,Sheet);
		
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Utilityclass.getCellValue(xl,Sheet,i,0);
			System.out.println("Username="+ UserName);
			String PassWord=Utilityclass.getCellValue(xl,Sheet,i,1);
			System.out.println("Password="+ PassWord);
			
ob.setvalues(UserName, PassWord);
     ob.login();

	}
	}}
	
 