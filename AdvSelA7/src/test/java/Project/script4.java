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

public class script4 {

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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		
	FileInputStream fis1= new FileInputStream("./src/test/resources/testData.xlsx");
	Workbook wb= WorkbookFactory.create(fis1);
	
	Sheet sheet = wb.getSheet("Contact");
	Row RN = sheet.getRow(0);
	Cell cell = RN.getCell(0);
	String data = cell.getStringCellValue();
	
	driver.findElement(By.name("lastname")).sendKeys(data);
	driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
	String parentID = driver.getWindowHandle();
	Set<String> ids = driver.getWindowHandles();
	ids.remove(parentID);
	
	for(String i:ids) {
		
		driver.switchTo().window(i);
		driver.findElement(By.id("search_txt")).sendKeys("Nike");
		WebElement dropdown=driver.findElement(By.name("search_field"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Organization Name");
		driver.findElement(By.linkText("Nike")).click();
		break;
	}
	
	driver.switchTo().window(parentID);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.linkText("Sign Out")).click();
	
	}
	

}
