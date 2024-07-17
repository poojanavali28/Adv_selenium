package TestNgTopics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Project.Login_page;
import genericlib.ExcelUtil;
import genericlib.Webdriverutil;
import pomRepo.LoginPage;
import pomRepo.OrganisationPage;

public class MultipleDatausingDataProvider {

	@DataProvider
	public String[][] testData() throws EncryptedDocumentException, IOException  {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/testData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][]data=new String[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			data[i][j]=sheet.getRow(i).getCell(j).toString();
		}
			
		}
		return data;
	}
		
	
	
		
		@Test(dataProvider = "testData")
		public void details(String[] testData) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		ExcelUtil um=new ExcelUtil();
		driver.get(um.getDataFromPropertyFile("url"));
		Webdriverutil wb= new Webdriverutil();
		wb.maximizeTheWindow(driver);
		LoginPage lg=new LoginPage(driver);
		lg.getUserTxtBox().sendKeys(um.getDataFromPropertyFile("username"));
		lg.getPswdTxtBox().sendKeys(um.getDataFromPropertyFile("password"));
		lg.getLoginButton().click();		
		
		OrganisationPage og=new OrganisationPage(driver);
		og.getOrganizationMajorTab().click();
		og.getCreateOrganization().click();
		og.getOrganizationName().sendKeys(testData[0]);
		Thread.sleep(2000);
		og.getPhoneNo().sendKeys(testData[1]);
		Thread.sleep(2000);
		og.getEmailID().sendKeys(testData[2]);
	}
	
}

