package pages;


import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import root.Base;


public class TC1_CreateAccount extends Base {
	
	/****************************************************************************
    '* NAME                : CreateAccount
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	Base input = new Base();
	Properties prop = new Properties();

	public TC1_CreateAccount() throws Exception {
		super();
		prop = input.getPropertyFile();

	}
	
public void CreateAccount() throws Exception {
		
	input.initializeDriver();
	input.getWebLink(prop.getProperty("url"));
	input.popup();
	input.inputProperty("account");
	input.inputProperty("myaccount");
	input.inputValues(prop.getProperty("firstname"), input.excelFile("Fname"));
	input.inputValues(prop.getProperty("lastname"), input.excelFile("Lname"));
	input.inputValues(prop.getProperty("emailadd"), input.excelFile("Email"));
	input.inputValues(prop.getProperty("confirmemailadd"), input.excelFile("Email"));
	input.inputValues(prop.getProperty("password"), input.excelFile("Pass"));
	input.inputValues(prop.getProperty("confirmpass"), input.excelFile("Pass"));
	input.Wait();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		input.inputProperty("ClickCreateaccountbutton");
		input.Wait();
		driver.close();
		driver.quit();
}
}
