package codeUsingPom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.Webdriverutil;
import pomRepo.LoginPage;
import pomRepo.OrganisationPage;

public class CodeUsingPomForOragnizationPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		Webdriverutil wb=new Webdriverutil();
		ExcelUtil um=new ExcelUtil();
		
		wb.maximizeTheWindow(driver);
		wb.implicitWait(driver);
		driver.get(um.getDataFromPropertyFile("url"));
		LoginPage lp=new LoginPage(driver);
		lp.getUserTxtBox().sendKeys(um.getDataFromPropertyFile("username"));
		lp.getPswdTxtBox().sendKeys(um.getDataFromPropertyFile("password"));
		lp.getLoginButton().click();
		
		OrganisationPage org=new OrganisationPage(driver);
		org.getOrganizationMajorTab().click();
		org.getCreateOrganization().click();
		//org.getOrganizationName().sendKeys(um.getDataFromExcelFile(Organisation, 0, 0));
		
		
	}

}
