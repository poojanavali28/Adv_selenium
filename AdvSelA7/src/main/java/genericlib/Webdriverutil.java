package genericlib;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverutil {
	WebDriver driver;
	public static void maximizeTheWindow(WebDriver driver){
		driver.manage().window().maximize();
	}


public void refreshThePage(WebDriver driver) {
	driver.navigate().refresh();
}


public void forwardThePage(WebDriver driver) {
	driver.navigate().forward();
}

public void implicitWait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

public void elementToBeClick(WebDriver driver,WebElement element) {
	
WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.elementToBeClickable(element));
}

public void switchToFrame(WebDriver driver,WebElement element) {
	
	driver.switchTo().frame(element);
}

public void switchBackToParentPage(WebDriver driver) {
	
	driver.switchTo().parentFrame();
}

public void selectDropdownByValue(WebElement dropdown,String value) {
	
	Select sel=new Select(dropdown);
	sel.selectByValue(value);
	
}

public void selectDropdownByVisibleText(WebElement dropdown,String visibleText) {
	
	Select sel = new Select(dropdown);
	sel.selectByVisibleText(visibleText);
}


public void deelectdropdownByVisibleText(WebElement dropdown,String visibleText) {
	Select sel = new Select(dropdown);
	sel.deselectByValue(visibleText);
}
public void acceptAlert(WebDriver driver) {
	
driver.switchTo().alert().accept();
}

public void dismissalert(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}

public void clickOnElement(WebElement element) {

	Actions actions = new Actions(driver);
	actions.click(element).perform();
}

public void doubleClick(WebElement element) {
	Actions actions = new Actions(driver);
	actions.doubleClick(element).perform();
}

public void contextClick(WebElement element) {
	Actions actions = new Actions(driver);
	actions.contextClick(element).perform();
}


public void scrollDown(WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500);");



}

public void closeBrowser(WebDriver driver) {
	
	driver.quit();
}

}