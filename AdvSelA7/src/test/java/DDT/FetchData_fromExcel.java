package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData_fromExcel {

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
	DataFormatter data= new DataFormatter();
	System.out.println(data.formatCellValue(cell1));
	System.out.println(data.formatCellValue(cell2));
	System.out.println(data.formatCellValue(cell3));
	

	
	}
	

}
