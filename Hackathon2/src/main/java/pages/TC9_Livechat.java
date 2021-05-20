package pages;

import java.util.Properties;

import root.Base;

public class TC9_Livechat extends Base{
	/****************************************************************************
    '* NAME                : Livechat
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	Base input = new Base();
	Properties prop = new Properties();

	public TC9_Livechat() throws Exception {
		super();
		prop = input.getPropertyFile();

	}
	public void Livechat() throws Exception {
		
		input.initializeDriver();
		input.getWebLink(prop.getProperty("url"));
		input.popup();
		input.Wait();
		input.inputProperty("livechat");
		input.waitFor();
		input.inputValues(prop.getProperty("name"), input.excelFile("Fname"));
		input.inputValues(prop.getProperty("emadd"), input.excelFile("Email"));
		input.inputProperty("submit");
		input.Wait();
		input.screenshot();
		driver.close();
		driver.quit();	
	}
}
