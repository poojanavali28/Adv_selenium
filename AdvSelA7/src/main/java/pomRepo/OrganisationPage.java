package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {

	
	public OrganisationPage(WebDriver Driver) {
		PageFactory.initElements(Driver, this);
	}
	
	@FindBy(linkText="Organizations")
	private WebElement OrganizationMajorTab;

    @FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
    private WebElement createOrganization;
    
    @FindBy(name="accountname")
    private WebElement OrganizationName;
    
    @FindBy(name="industry")
    private WebElement industryDropdown;
    
    @FindBy(name="assigntype")
    private WebElement groupRadioButton;

    
    @FindBy(xpath="//input[@title='Save [Alt+S]']")
    private WebElement saveOrg;
    
	public WebElement getOrganizationMajorTab() {
		return OrganizationMajorTab;
	}

	public WebElement getCreateOrganization() {
		return createOrganization;
	}

	public WebElement getOrganizationName() {
		return OrganizationName;
	}

	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}

	public WebElement getSaveOrg() {
		return saveOrg;
	}

	public WebElement getGroupRadioButton() {
		return groupRadioButton;
	}
	
	@FindBy(id="phone")
	private WebElement phoneNo;
	
	@FindBy(id="email1")
	private WebElement EmailID;

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getEmailID() {
		return EmailID;
	}
	
    



}
