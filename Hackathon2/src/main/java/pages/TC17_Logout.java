package pages;

import java.util.Properties;

import root.Base;

public class TC17_Logout extends Base{
	/****************************************************************************
    '* NAME                : Logout
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	
	Base input = new Base();
	Properties prop = new Properties();

	public TC17_Logout() throws Exception {
		super();
		prop = input.getPropertyFile();

	}
	
	public void Logout() throws Exception {
		
	
		input.initializeDriver();
		input.getWebLink(prop.getProperty("url"));
		input.popup();
		input.inputProperty("account");
		input.inputProperty("myaccount");
		input.inputValues(prop.getProperty("email"), input.excelFile("Email"));
		input.inputValues(prop.getProperty("pass"), input.excelFile("Pass"));
		input.inputProperty("clickLoginButton");
		input.Wait();
		input.inputProperty("account");
		input.inputProperty("logout");
		driver.close();
		driver.quit();
		
		
	}	
}

