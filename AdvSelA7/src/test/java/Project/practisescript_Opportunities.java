package Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

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

public class practisescript_Opportunities {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("./src/test/resources/loginCred.properties");
		Properties p= new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String UN = p.getProperty("username");
		String pwd = p.getProperty("password");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
      driver.get(url);
      driver.findElement(By.name("user_name")).sendKeys(UN);
      driver.findElement(By.name("user_password")).sendKeys(pwd);
      driver.findElement(By.id("submitButton")).click();
      
      driver.findElement(By.linkText("Opportunities")).click();
      driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
      
      
      FileInputStream fis1= new FileInputStream("./src/test/resources/testData.xlsx");
      Workbook wb= WorkbookFactory.create(fis1);
      Sheet sheet = wb.getSheet("Opportunity");
      Row Row = sheet.getRow(0);
     Cell cell = Row.getCell(0);
     String data = cell.getStringCellValue();
     
     Thread.sleep(3000);
   driver.findElement(By.name("potentialname")).sendKeys(data);
   Thread.sleep(3000);
   
 driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
 

 Thread.sleep(3000);
 String parentID = driver.getWindowHandle();
 Set<String> ids = driver.getWindowHandles();
 ids.remove(parentID);
 for(String i:ids) {
	 
	 driver.switchTo().window(i);
	 driver.findElement(By.name("search_text")).sendKeys("Nike");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//a[@href='javascript:window.close();']")).click();
	 break;
 }
 
 Thread.sleep(3000);
 driver.switchTo().window(parentID);
 driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
 
  
	}
	

}
