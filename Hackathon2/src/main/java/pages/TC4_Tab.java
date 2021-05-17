package pages;

import java.util.Properties;

import root.Base;

public class TC4_Tab extends Base {
	/****************************************************************************
    '* NAME                : Tab
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	Base by = new Base();
	Properties p = new Properties();

	public TC4_Tab() throws Exception {
		super();
		p = by.getPropertyFile();

	}
	
	public void Tab() throws Exception {
		
		by.initializeDriver();
		by.getWebLink(p.getProperty("url"));
		by.popup();
		by.inputProperty("account");
		by.waitFor();
		by.inputProperty("myaccount");
		by.inputValues(p.getProperty("email"), by.excelFile("Email"));
		by.inputValues(p.getProperty("pass"), by.excelFile("Pass"));
		Thread.sleep(5000);
		by.inputProperty("clickLoginButton");
		Thread.sleep(5000);
		by.inputProperty("ceiling");
		Thread.sleep(5000);
		by.inputProperty("chandeliers");
		by.inputProperty("rect");
		driver.close();
		driver.quit();
		
		
		
		
	}
}
