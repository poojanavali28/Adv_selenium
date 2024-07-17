package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

public ContactsPage(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
	
	
}

@FindBy(linkText="Contacts")
private WebElement ContactMjrTab;

@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement CreateContact;

@FindBy(name="lastname")
private WebElement lastnameTxtBox;
 
@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveContact;

public WebElement getContactMjrTab() {
	return ContactMjrTab;
}

public WebElement getCreateContact() {
	return CreateContact;
}

public WebElement getLastnameTxtBox() {
	return lastnameTxtBox;
}

public WebElement getSaveContact() {
	return saveContact;
}


 



}
