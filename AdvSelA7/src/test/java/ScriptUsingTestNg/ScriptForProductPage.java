package ScriptUsingTestNg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlib.BaseClass_forTestNg;
import pomRepo.OrganisationPage;
import pomRepo.ProductPage;

public class ScriptForProductPage extends BaseClass_forTestNg {
	
	@Test
	public void Script5() throws EncryptedDocumentException, IOException {
		
		ProductPage PR=new ProductPage(driver);
		PR.getProductMjrTab().click();
		PR.getCreateProduct().click();
		PR.getProductname().sendKeys(um.getDataFromExcelFile("Products", 0, 0));
		
		OrganisationPage Og= new OrganisationPage(driver);
		Og.getSaveOrg().click();;
		
	}

}
