package pages;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import root.Base;

public class TC7_ViewProduct extends Base{
	
	/****************************************************************************
    '* NAME                : ViewProduct
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	
	Base input = new Base();
	Properties prop = new Properties();

	public TC7_ViewProduct() throws Exception {
		super();
		prop = input.getPropertyFile();

	}
	
	public void ViewProduct() throws Exception {
		
		input.initializeDriver();
		input.getWebLink(prop.getProperty("url"));
		input.popup();
		input.inputProperty("account");
		input.inputProperty("myaccount");
		input.inputValues(prop.getProperty("email"), input.excelFile("Email"));
		input.inputValues(prop.getProperty("pass"), input.excelFile("Pass"));
		input.Wait();
		input.inputProperty("clickLoginButton");
		input.Wait();
		input.inputProperty("ceiling");
		input.Wait();
		input.inputProperty("chandeliers");
		input.inputProperty("rect");
		input.inputProperty("filter");
		input.Wait();
		input.inputProperty("product");
		input.Wait();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		input.inputProperty("addcart");
		input.Wait();
		input.inputProperty("checkout");
		input.screenshot();
		driver.close();
		driver.quit();
		
		
	}
}

