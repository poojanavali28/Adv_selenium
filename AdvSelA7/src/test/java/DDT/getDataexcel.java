package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getDataexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fis=new FileInputStream("./src/test/resources/testData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Organisation");
		Row RowNo = sheet.getRow(0);
		Cell cell = RowNo.getCell(0);
	      String data = cell.getStringCellValue();
	      System.out.println(data);
		
	}
	

}
