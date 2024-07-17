package TestNgTopics;

import java.io.IOException;

import org.apache.poi.sl.draw.DrawBackground;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericlib.ExcelUtil;
import genericlib.Webdriverutil;

public class CrossBrowserTesting {

	WebDriver driver;
	ExcelUtil um=new ExcelUtil();
	Webdriverutil wb=new Webdriverutil();
	
	@Parameters("browser")
	@Test
	
	public void launch(String bname) throws IOException {
		if(bname.contains("chrome"))
		
		{
			driver=new ChromeDriver();
			wb.maximizeTheWindow(driver);
			driver.get(um.getDataFromPropertyFile("url"));
			
		}
		
		else if(bname.contains("firefox")){
			
			driver=new FirefoxDriver();
			wb.maximizeTheWindow(driver);
			driver.get(um.getDataFromPropertyFile("url"));
		}
	}
}
