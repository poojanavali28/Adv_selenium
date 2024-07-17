package Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practisescript_leads {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		
		FileInputStream fis= new FileInputStream("./src/test/resources/loginCred.properties");
		Properties p= new Properties();
		p.load(fis);
		
		String Url = p.getProperty("url");
		String UN = p.getProperty("username");
		String pwd = p.getProperty("password");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get(Url);
	    driver.findElement(By.name("user_name")).sendKeys(UN);
	    driver.findElement(By.name("user_password")).sendKeys(pwd);
	    driver.findElement(By.id("submitButton")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	   
	    Thread.sleep(3000);
	    FileInputStream fis1= new FileInputStream("./src/test/resources/testData.xlsx");
	    Workbook wb= WorkbookFactory.create(fis1);
	    Sheet sheet = wb.getSheet("Surname");
	    Row RN = sheet.getRow(0);
	    Cell cell = RN.getCell(0);
	    String data = cell.getStringCellValue();    
	    
	   Sheet sheet2 = wb.getSheet("Company");
	  Row row2 = sheet2.getRow(0);
	  Cell cell2 = row2.getCell(0);
	  String data2 = cell2.getStringCellValue();
	  
	  driver.findElement(By.name("lastname")).sendKeys(data);
	  Thread.sleep(3000);
	  driver.findElement(By.name("company")).sendKeys(data2);
	  
	  WebElement dropdown =driver.findElement(By.name("leadsource"));
	Select sel = new Select(dropdown);
	sel.selectByValue("Direct Mail");
	
	  Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	
driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Sign Out")).click();
	    
	    
	
	}



	}


