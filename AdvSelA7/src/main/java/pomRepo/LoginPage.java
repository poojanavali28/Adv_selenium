package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	/*rule1: create Constructor & initialise pagefactory-class initelement -method*/
	
	}
	
	//rule2: store element @findBy annotation
	//rule3: make private & add return type
	//rule4: get getters from source
	
	
	
	@FindBy(name="user_name")
	private WebElement userTxtBox;
	
	public WebElement getUserTxtBox() {
		return userTxtBox;
	}

	public WebElement getPswdTxtBox() {
		return pswdTxtBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(name="user_password")
	private WebElement pswdTxtBox;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[text()='Powered by vtiger CRM - 5.4.0']")
	private WebElement text;

	public WebElement getText() {
		return text;
	}
	
	
	
	
}

