package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPage {

	
	public OpportunitiesPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getOpportunitiesMjrTab() {
		return OpportunitiesMjrTab;
	}

	public WebElement getCreateOpportunities() {
		return createOpportunities;
	}

	public WebElement getOpportunityName() {
		return OpportunityName;
	}

	public WebElement getRelatedToOpportunityBtn() {
		return RelatedToOpportunityBtn;
	}

	public WebElement getSaveOpportunity() {
		return saveOpportunity;
	}

	@FindBy(linkText="Opportunities")
	private WebElement OpportunitiesMjrTab;
	
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOpportunities;
	
	@FindBy(name="potentialname")
	private WebElement OpportunityName;
	
	@FindBy(xpath="//img[@src='themes/softed/images/select.gif']")
	private WebElement RelatedToOpportunityBtn;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveOpportunity;
	
	
}

