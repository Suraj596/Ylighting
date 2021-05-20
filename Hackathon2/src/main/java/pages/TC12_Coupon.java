package pages;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import root.Base;

public class TC12_Coupon extends Base{
	/****************************************************************************
    '* NAME                : CouponCode
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	Base input = new Base();
	Properties prop = new Properties();

	public TC12_Coupon() throws Exception {
		super();
		prop = input.getPropertyFile();

	}
	public void Coupon() throws Exception {
		
		input.initializeDriver();
		input.getWebLink(prop.getProperty("url"));
		input.popup();
		input.inputProperty("account");
		input.inputProperty("myaccount");
		input.inputValues(prop.getProperty("email"), input.excelFile("Email"));
		input.inputValues(prop.getProperty("pass"), input.excelFile("Pass"));
		input.inputProperty("clickLoginButton");
		input.Wait();
		input.inputProperty("cart");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		input.inputValues(prop.getProperty("coupon"), input.excelFile("Coupon"));
		input.inputProperty("apply");
		input.screenshot();
		driver.close();
		driver.quit();		
	}
}
