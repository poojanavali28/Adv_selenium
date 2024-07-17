package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFrom_propertyFile {

	public static void main(String[] args) throws IOException {
		
	//1)Create FileInputStream object
		
		FileInputStream fis = new FileInputStream("./src/test/resources/prop.properties");
		
		
	//2) Create a property file object
		
		Properties p=new Properties();
		
	//3) load file
		p.load(fis);
		
	// 4)fetch file
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("Class"));
		
	
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//String Url=p.getProperty("url");
		//driver.get(Url);
		driver.get(p.getProperty("url"));
		System.out.println(driver.getCurrentUrl());
	     
	}

}
