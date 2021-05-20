package pages;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import root.Base;

public class TC13_Scrollupdown extends Base{
	/****************************************************************************
    '* NAME                : Scrollupdown
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	
	Base input = new Base();
	Properties prop = new Properties();

	public TC13_Scrollupdown() throws Exception {
		super();
		prop = input.getPropertyFile();

	}
	
	public void Scrollupdown() throws Exception {
		
		
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
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		input.Wait();
		Actions action1=new Actions(driver);
		action1.sendKeys(Keys.PAGE_UP).build().perform();
		driver.close();
		driver.quit();
		
	}
}
