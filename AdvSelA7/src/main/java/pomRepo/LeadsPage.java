package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {

	
	public LeadsPage(WebDriver driver) {
	
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(linkText="Leads")
	private WebElement LeadsMjrTab;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createLead;
	
	@FindBy(name="lastname")
	private WebElement LeadLastname;
	
	public WebElement getLeadsMjrTab() {
		return LeadsMjrTab;
	}

	public WebElement getCreateLead() {
		return createLead;
	}

	public WebElement getLeadLastname() {
		return LeadLastname;
	}

	public WebElement getLeadCompany() {
		return LeadCompany;
	}

	public WebElement getSaveLead() {
		return saveLead;
	}

	@FindBy(name="company")
	private WebElement LeadCompany;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveLead;
}
