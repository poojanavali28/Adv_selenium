package genericlib;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import pomRepo.LoginPage;
import pomRepo.Logout;

@Listeners(ListenersImplementation.class)
public class BaseClass_forTestNg {

	
	public  static WebDriver driver;
	public static Webdriverutil wb= new Webdriverutil();
	public static ExcelUtil um=new ExcelUtil();
	public static JavaUtil ja=new JavaUtil();
	//LoginPage lp= new LoginPage(driver);
	Logout lg= new Logout(driver);
	public static ExtentSparkReporter reporter;
	public static ExtentReports reports;
	public ExtentTest test;
	
	@BeforeSuite(alwaysRun=true)
	public void BeforeSuite() 
	
	{
		Reporter.log("Report generation",true);
		
		reporter= new ExtentSparkReporter(IConstant.reportPath);
		reports= new ExtentReports();
		reports.attachReporter(reporter);
	}
	
	@Parameters
	@BeforeClass(alwaysRun=true)
	public void BeforeClass(@Optional("chrome")String bname) throws IOException, InterruptedException {
		if(bname.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if(bname.contains("firefox")) {
			driver=new FirefoxDriver();
		}
	
		wb.maximizeTheWindow(driver);
		wb.implicitWait(driver);
		Thread.sleep(3000);
		driver.get(um.getDataFromPropertyFile("url"));
		
		
	}
	
	@BeforeMethod(alwaysRun=true)
	public void BeforeMethod(Method method) throws IOException {
		test= reports.createTest(method.getName());
		Reporter.log(method.getName(),true);
		LoginPage lp=new LoginPage(driver);	
    lp.getUserTxtBox().sendKeys(um.getDataFromPropertyFile("username"));
            lp.getPswdTxtBox().sendKeys(um.getDataFromPropertyFile("password"));
       lp.getLoginButton().click();


	}
	
	
	@AfterMethod(alwaysRun=true)
	
	public void AfterMethod()
	{
		lg=new Logout(driver);
		
         lg.getAdminBtn().click();
         lg.getLogoutBtn().click();
	}
	
	@AfterClass(alwaysRun=true)
	public void AfterClass() {
		
     wb.closeBrowser(driver);
	
	}
	
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		Reporter.log("Report",true);
		reports.flush();
		
	}
	
	
	
	
}
