package pages;

import java.util.Properties;

import root.Base;

public class TC2_Login extends Base{
	/****************************************************************************
    '* NAME                : Login
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	
	Base input = new Base();
	Properties prop = new Properties();

	public TC2_Login() throws Exception {
		super();
		prop = input.getPropertyFile();

	}
	
	public void Login() throws Exception {
		
	
		input.initializeDriver();
		input.getWebLink(prop.getProperty("url"));
		input.popup();
		input.inputProperty("account");
		input.inputProperty("myaccount");
		input.inputValues(prop.getProperty("email"), input.excelFile("Email"));
		input.inputValues(prop.getProperty("pass"), input.excelFile("Pass"));
		input.inputProperty("clickLoginButton");
		driver.close();
		driver.quit();
		
		
	}	
}
