package Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericlib.ExcelUtil;
import genericlib.JavaUtil;
import genericlib.Webdriverutil;

public class staleElementException {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Webdriverutil wb=new Webdriverutil();
ExcelUtil um=new ExcelUtil() ;
		
		WebDriver driver=new ChromeDriver();
		wb.maximizeTheWindow(driver);
		driver.get(um.getDataFromPropertyFile("url"));
		
		driver.findElement(By.name("user_name")).sendKeys(um.getDataFromPropertyFile("username"));
		driver.findElement(By.name("user_password")).sendKeys(um.getDataFromPropertyFile("password"));
	driver.findElement(By.id("submitButton")).click();
	WebElement search = driver.findElement(By.name("query_string"));
	search.sendKeys("contacts");

	wb.refreshThePage(driver);
	search.sendKeys("contacts");
	

}
}
