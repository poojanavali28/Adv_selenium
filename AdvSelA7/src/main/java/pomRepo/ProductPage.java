package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public ProductPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	public WebElement getProductMjrTab() {
		return ProductMjrTab;
	}


	public WebElement getCreateProduct() {
		return CreateProduct;
	}


	public WebElement getProductname() {
		return Productname;
	}


	@FindBy(linkText="Products")
	private WebElement ProductMjrTab;
	
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreateProduct;
	
	
	@FindBy(name="productname")
	private WebElement Productname;
}
