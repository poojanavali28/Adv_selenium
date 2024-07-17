package TestNgTopics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlib.ExcelUtil;
import genericlib.Webdriverutil;
import pomRepo.LoginPage;
import pomRepo.OrganisationPage;

public class Script1_login {

	
	public class script1 {
		
		
		@Test
		public void launch() throws IOException {
			Reporter.log("testNg",true);
		
			
			WebDriver driver = new ChromeDriver();
			
			ExcelUtil um=new ExcelUtil();
			Webdriverutil wb=new Webdriverutil();
			LoginPage lp=new LoginPage(driver);
			OrganisationPage org= new OrganisationPage(driver);
			
		wb.maximizeTheWindow(driver);
	    driver.get(um.getDataFromPropertyFile("url"));
			wb.implicitWait(driver);
			
	
    lp.getUserTxtBox().sendKeys(um.getDataFromPropertyFile("username"));
	lp.getPswdTxtBox().sendKeys(um.getDataFromPropertyFile("password"));
	lp.getLoginButton().click();
	
	
	org.getOrganizationMajorTab().click();
	org.getCreateOrganization().click();
	org.getOrganizationName().sendKeys(um.getDataFromExcelFile("Organisation", 0, 0));
	org.getSaveOrg().click();
	

	
		
			
			
			
		}
	}
}
