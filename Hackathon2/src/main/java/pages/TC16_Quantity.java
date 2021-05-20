package pages;

import java.util.Properties;

import root.Base;

public class TC16_Quantity extends Base{
	/****************************************************************************
    '* NAME                : Quantity
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	Base input = new Base();
	Properties prop = new Properties();

	public TC16_Quantity() throws Exception {
		super();
		prop = input.getPropertyFile();

	}
	public void Quantity() throws Exception {
		
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
		input.inputProperty("quantity");
		input.screenshot();
		driver.close();
		driver.quit();
		
	}
}
