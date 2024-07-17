package ScriptUsingTestNg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericlib.BaseClass_forTestNg;
import pomRepo.LeadsPage;

public class ScriptForLeadsForLeadsUsingTestNG extends BaseClass_forTestNg {


	@Test
	public void script3() throws EncryptedDocumentException, IOException {
		
		LeadsPage Ld=new LeadsPage(driver);
		
		Ld.getLeadsMjrTab().click();
		Ld.getCreateLead().click();
		Ld.getLeadLastname().sendKeys(um.getDataFromExcelFile("Surname", 0, 0));
		Ld.getLeadCompany().sendKeys(um.getDataFromExcelFile("Company", 0, 0));
		Ld.getSaveLead().click();

	}
	

	
	
}

