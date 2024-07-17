package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class assignment {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("./src/test/resources/ExcelData.xlsx");
		
		Workbook wb= WorkbookFactory.create(fis);
	
		//System.out.println(wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue());
		//System.out.println(wb.getSheet("Sheet1").getRow(2).getCell(2).getBooleanCellValue());
	//System.out.println(wb.getSheet("Sheet1").getRow(4).getCell(4).getNumericCellValue());
	
	Cell cell1 = wb.getSheet("Sheet1").getRow(0).getCell(0);
	Cell cell2 = wb.getSheet("Sheet1").getRow(2).getCell(2);
	Cell cell3 = wb.getSheet("Sheet1").getRow(4).getCell(4);
	Cell cell4=wb.getSheet("Sheet1").getRow(0).getCell(3);
	Cell cell5=wb.getSheet("Sheet1").getRow(2).getCell(0);
	Cell cell6=wb.getSheet("Sheet1").getRow(3).getCell(0);
	
	
	DataFormatter data= new DataFormatter();
	System.out.println(data.formatCellValue(cell1));
	System.out.println(data.formatCellValue(cell2));
	System.out.println(data.formatCellValue(cell3));
	System.out.println(data.formatCellValue(cell4));
	System.out.println(data.formatCellValue(cell5));
	System.out.println(data.formatCellValue(cell6));

	
	RemoteWebDriver driver = new ChromeDriver();
	driver.get(data.formatCellValue(cell4));
	
	driver.findElement(By.linkText("Log in")).click();
	String email = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
	driver.findElement(By.id("Email")).sendKeys(email);
	String pwd = wb.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
	driver.findElement(By.id("Password")).sendKeys(pwd);
	
	
	}
}




















