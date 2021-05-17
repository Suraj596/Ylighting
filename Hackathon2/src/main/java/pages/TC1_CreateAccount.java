package pages;


import java.util.Properties;




import root.Base;


public class TC1_CreateAccount extends Base {
	
	/****************************************************************************
    '* NAME                : CreateAccount
    '* APPLICATION NAME    : Ylighting
    '* CREATED BY        : Suraj Sahoo
    '* CREATED DATE        : 16-05-2021
    '* PARAMETERS        : NA
    '***************************************************************************/
	Base by = new Base();
	Properties p = new Properties();

	public TC1_CreateAccount() throws Exception {
		super();
		p = by.getPropertyFile();

	}
	
public void CreateAccount() throws Exception {
		
		by.initializeDriver();
		by.getWebLink(p.getProperty("url"));
		by.popup();
		by.inputProperty("account");
		by.waitFor();
		by.inputProperty("myaccount");
		by.inputValues(p.getProperty("firstname"), by.excelFile("Fname"));
		by.inputValues(p.getProperty("lastname"), by.excelFile("Lname"));
		by.inputValues(p.getProperty("emailadd"), by.excelFile("Email"));
		by.inputValues(p.getProperty("confirmemailadd"), by.excelFile("Email"));
		by.inputValues(p.getProperty("password"), by.excelFile("Pass"));
		by.inputValues(p.getProperty("confirmpass"), by.excelFile("Pass"));
		Thread.sleep(5000);
		by.inputProperty("ClickCreateaccountbutton");
		driver.close();

}
}
