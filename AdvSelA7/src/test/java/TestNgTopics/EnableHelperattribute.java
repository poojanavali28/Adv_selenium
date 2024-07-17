package TestNgTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnableHelperattribute {


@Test
public void launch() throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	driver.quit();
}

@Test(enabled=false)
public void launch1() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shoppersstack.com/");
	Thread.sleep(3000);
	driver.quit();
}
	
}

		


