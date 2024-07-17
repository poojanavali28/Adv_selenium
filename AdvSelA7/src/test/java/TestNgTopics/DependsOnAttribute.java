package TestNgTopics;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DependsOnAttribute {

	
	@Test
	public void login()
	{
		int i=1/0;
		Reporter.log("login to app",true);
	}
	
	@Test(dependsOnMethods="login")
	public void addtocart() {
		
		Reporter.log("add to cart",true);
	}
	
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		Reporter.log("loggedout",true);;
	}

	
}

