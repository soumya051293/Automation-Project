package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagefactory {
	WebDriver driver;
	
	@FindBy(id="username")
	WebElement Musername;

	@FindBy(id="password")
	WebElement Mpassword;
	
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/m-auth__modal/div/div[1]/m-loginform/div[2]/m-button/button/div\"")
	WebElement Mlogin;
	
	

	

	public  void LoginpageFactory(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setvalues(String email,String password)
	{
		Musername.sendKeys(email);
		Mpassword.sendKeys(password);
	}
	public void login() 
	{
		Mlogin.click();
	}
	

}
