package Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.Webdriverutil;

public class scripting_using_aboveMethods {

	public static void main(String[] args) throws IOException {
		
		
		Webdriverutil wb=new Webdriverutil();
		ExcelUtil um= new ExcelUtil();
		WebDriver driver= new ChromeDriver();
		
		wb.maximizeTheWindow(driver);
		wb.implicitWait(driver);
		driver.get(um.getDataFromPropertyFile("url"));
		driver.findElement(By.name("user_name")).sendKeys(um.getDataFromPropertyFile("username"));
		driver.findElement(By.name("user_password")).sendKeys(um.getDataFromPropertyFile("password"));
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		
		

		
	}

}
