package ScriptUsingTestNg;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseClass_forTestNg;
import pomRepo.OrganisationPage;

public class TestNgScriptUsingPom_UtilsForOrganisation extends BaseClass_forTestNg {
	
	    @Test(groups="Organisation")
		public void script1() throws EncryptedDocumentException, IOException, InterruptedException {
			
		OrganisationPage op=new OrganisationPage(driver);
		op.getOrganizationMajorTab().click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(),"Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		op.getCreateOrganization().click();
		Thread.sleep(2000);
		int ranNum= ja.getRandomNumber();
		op.getOrganizationName().sendKeys(um.getDataFromExcelFile("Organisation", 0, 0)+ranNum);
        op.getSaveOrg().click();
        Thread.sleep(3000);
	    }
		
		
}
		
		
		
	

