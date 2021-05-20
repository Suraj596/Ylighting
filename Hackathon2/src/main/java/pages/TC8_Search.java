package pages;

import java.util.Properties;

import root.Base;

public class TC8_Search extends Base{
	/****************************************************************************
    '* NAME                : Search
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	Base input = new Base();
	Properties prop = new Properties();

	public TC8_Search() throws Exception {
		super();
		prop = input.getPropertyFile();

	}
	
	public void Search() throws Exception {
		
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
		input.inputValues(prop.getProperty("searchbar"), input.excelFile("search"));
		input.inputValues(prop.getProperty("Search"));
		input.screenshot();
		driver.close();
		driver.quit();

		
		
		
	}
	
}
