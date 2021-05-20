package pages;

import java.util.Properties;

import root.Base;

public class TC3_Title extends Base {
		
		/****************************************************************************
	    '* NAME                : Title
	    '* APPLICATION NAME    : Ylighting
	    '* CREATED BY        : Suraj Sahoo
	    '* CREATED DATE        : 16-05-2021
	    '* PARAMETERS        : NA
	    '***************************************************************************/
	
	Base input = new Base();
	Properties prop = new Properties();

	public TC3_Title() throws Exception {
		super();
		prop = input.getPropertyFile();

	}
	
	public void Title() throws Exception {
		
		
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
		input.inputProperty("title");
		driver.close();
		driver.quit();
		
	}
}
