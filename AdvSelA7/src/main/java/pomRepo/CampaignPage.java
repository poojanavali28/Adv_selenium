package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {

	
	public CampaignPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getMoreBtn() {
		return moreBtn;
	}

	public WebElement getCampBtn() {
		return CampBtn;
	}


	@FindBy(xpath="//a[@href='javascript:;'][1]")
	private WebElement moreBtn;
	
	@FindBy(xpath="//a[@name='Campaigns']")
	private WebElement CampBtn;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createCamp;
	
	@FindBy(xpath="//input[@class='detailedViewTextBox'][1]")
	private WebElement CampName;

	public WebElement getCreateCamp() {
		return createCamp;
	}

	public WebElement getCampName() {
		return CampName;
	}
	
	
}
