package ScriptUsingTestNg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericlib.BaseClass_forTestNg;
import pomRepo.ContactsPage;

public class ScriptForContactsUSingTestNg_Test extends BaseClass_forTestNg{

	
	@Test
	public void script2() throws EncryptedDocumentException, IOException {
		
		ContactsPage con=new ContactsPage(driver);
		
		con.getContactMjrTab().click();
		test.log(Status.INFO, "user has click on contact link");
		con.getCreateContact().click();
		test.log(Status.INFO, "user has clicked on create contact");
		con.getLastnameTxtBox().sendKeys(um.getDataFromExcelFile("Surname", 0, 0));
		test.log(Status.INFO, "user has entered data");
		con.getSaveContact();
		test.log(Status.INFO, "user has clicked on save button");
		
	}
	
}
