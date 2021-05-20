package pages;

import java.util.Properties;

import root.Base;

public class TC5_HomePage extends Base{
	
	/****************************************************************************
    '* NAME                : HomePage
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	Base input = new Base();
	Properties prop = new Properties();

	public TC5_HomePage() throws Exception {
		super();
		prop = input.getPropertyFile();

	}
	
	public void HomePage() throws Exception {
		
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
		driver.close();
		driver.quit();
		
		
	}
}
