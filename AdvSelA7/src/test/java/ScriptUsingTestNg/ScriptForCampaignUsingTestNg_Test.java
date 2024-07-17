package ScriptUsingTestNg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseClass_forTestNg;
import pomRepo.CampaignPage;
import pomRepo.OrganisationPage;





public class ScriptForCampaignUsingTestNg_Test extends BaseClass_forTestNg {


	@Test(groups="Campaign")
	
	public void script6() throws EncryptedDocumentException, IOException {
	
	CampaignPage camp=new CampaignPage(driver);
	camp.getMoreBtn().click();
	camp.getCampBtn().click();
	camp.getCreateCamp().click();
	camp.getCampName().sendKeys(um.getDataFromExcelFile("Campaign", 0, 0));
	
	OrganisationPage org=new OrganisationPage(driver);
	org.getSaveOrg();

	
	
	}
	
}
