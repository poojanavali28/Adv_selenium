package ScriptUsingTestNg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseClass_forTestNg;
import pomRepo.DocumentsPage;
import pomRepo.OrganisationPage;

public class ScriptForDocumentPageUSingTestNG_Test extends BaseClass_forTestNg{

	
@Test
private void script6() throws EncryptedDocumentException, IOException {
	
	DocumentsPage dc=new DocumentsPage(driver);
	dc.getDocumentsMjrTab().click();
	dc.getCreateDocument().click();
	dc.getTitle().sendKeys(um.getDataFromExcelFile("Document", 0, 0));
	OrganisationPage og=new OrganisationPage(driver);
	og.getSaveOrg().click();
}
	
			
}
