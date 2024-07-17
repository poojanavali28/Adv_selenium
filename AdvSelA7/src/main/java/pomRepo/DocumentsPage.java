package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentsPage {

	
	public DocumentsPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Documents")
	private WebElement DocumentsMjrTab;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createDocument;
	
	@FindBy(xpath="//input[@class='detailedViewTextBox'][1]")
  private WebElement title;

	public WebElement getDocumentsMjrTab() {
		return DocumentsMjrTab;
	}

	public WebElement getCreateDocument() {
		return createDocument;
	}

	public WebElement getTitle() {
		return title;
	}
	
	
}
