package pages;

import java.util.Properties;

import root.Base;

public class TC18_Logo extends Base {
	
	/****************************************************************************
    '* NAME                : Logo
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/

	Base input = new Base();
	Properties prop = new Properties();

	public TC18_Logo() throws Exception {
	super();
	prop = input.getPropertyFile();

}

	public void Logo() throws Exception {
	
	
	input.initializeDriver();
	input.getWebLink(prop.getProperty("url"));
	input.popup();
	input.inputProperty("title");
	driver.close();
	driver.quit();	
}
}

