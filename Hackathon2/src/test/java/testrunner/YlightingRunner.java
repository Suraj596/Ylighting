package testrunner;

import org.testng.annotations.Test;


import pages.TC1_CreateAccount;
import pages.TC2_Login;
import pages.TC3_Title;
import pages.TC4_Tab;
import pages.TC5_HomePage;
import root.Base;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;



public class YlightingRunner extends Base {

	TC1_CreateAccount createaccount;
	TC2_Login login;
	TC3_Title title;
	TC4_Tab tab;
	TC5_HomePage homepage;
	

	public YlightingRunner() throws IOException {
		super();

	}

	@BeforeMethod
	public void beforeMethod() throws Exception {

		createaccount = new TC1_CreateAccount();
		login = new TC2_Login();
		title = new TC3_Title();
		tab = new TC4_Tab();
		homepage = new TC5_HomePage();
		
	}

	//@Test(priority = 0, enabled = true)
	public void TC1_CreateAccount() throws Exception {

		createaccount.CreateAccount();
	}
	
	//@Test(priority = 1, enabled = true)
	public void TC2_Login() throws Exception {

		login.Login();
	}
	
	//@Test(priority = 2, enabled = true)
		public void TC3_Title() throws Exception {

			title.Title();
	}
	
	//@Test(priority = 3, enabled = true)
		public void TC4_Tab() throws Exception {

			tab.Tab();
	}
	
	@Test(priority = 4, enabled = true)
		public void TC5_HomePage() throws Exception {

			homepage.HomePage();
	}

	//@AfterMethod
	public void afterMethod() {
		driver.close();
		driver.quit();
	}

}

