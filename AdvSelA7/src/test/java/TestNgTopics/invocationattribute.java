package TestNgTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationattribute {

	
	@Test(invocationCount=0,priority=1)
	
	public void launch() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	@Test(invocationCount=2,priority=2)
	
	public void demo() {
		Reporter.log("testing");
		
	}
	
	
}
