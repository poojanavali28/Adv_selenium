package genericlib;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersImplementation extends BaseClass_forTestNg implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Tes Script Execution started",true);
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Script failed",true);
		Reporter.log(result.getName());
		TakesScreenshot Ts=(TakesScreenshot)driver;
		File source = Ts.getScreenshotAs(OutputType.FILE);
		File target =new File(IConstant.screenshotPath);
	
		
	try {
		FileHandler.copy(source, target);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		}
	
	
	@Override
	public void onTestSuccess(ITestResult result){
		Reporter.log("Test script passed",true);
	}
	
	

}
