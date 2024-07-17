package Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
			FileInputStream fis = new FileInputStream("./src/test/resources/loginCred.properties");
			Properties p= new Properties();
			p.load(fis);
			String url = p.getProperty("url");
			String UN = p.getProperty("username");
			String pwd = p.getProperty("password");
			
		     
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.findElement(By.name("user_name")).sendKeys(UN);
			driver.findElement(By.name("user_password")).sendKeys(pwd);
			Thread.sleep(2000);
			driver.findElement(By.id("submitButton")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Sign Out")).click();
			Thread.sleep(2000);
			
			
		}

	

	}


