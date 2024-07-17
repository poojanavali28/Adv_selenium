package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	
	public Logout(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getAdminBtn() {
		return AdminBtn;
	}


	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}


	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement AdminBtn;
	
	
	@FindBy(linkText="Sign Out")
	private WebElement LogoutBtn;
}
