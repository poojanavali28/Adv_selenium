package Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		FileInputStream fis =new FileInputStream("./src/test/resources/loginCred.properties");
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
		driver.findElement(By.linkText("Organizations")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Thread.sleep(2000);
		
		Random ranNum= new Random();
		int num = ranNum.nextInt(100);
		
		FileInputStream fis1= new FileInputStream("./src/test/resources/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sheet = wb.getSheet("Organisation");
		Row RowNo = sheet.getRow(0);
		Cell cell = RowNo.getCell(0);
	 String data = cell.getStringCellValue()+num;
		
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(data);
		driver.findElement(By.id("phone")).sendKeys("9284576770");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(" //input[@title='Save [Alt+S]']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//img[src=themes/softed/images/user.PNG'']")).click();
		//driver.findElement(By.linkText("Sign Out")).click();
		
				
		
		
		
		
	}

	
	}


