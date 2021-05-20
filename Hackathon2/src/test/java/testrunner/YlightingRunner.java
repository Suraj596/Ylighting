package testrunner;

import org.testng.annotations.Test;

import pages.TC10_LivechatInvalid;
import pages.TC11_Remove;
import pages.TC12_Coupon;
import pages.TC13_Scrollupdown;
import pages.TC14_NavigateBack;
import pages.TC15_ZipCode;
import pages.TC16_Quantity;
import pages.TC17_Logout;
import pages.TC18_Logo;
import pages.TC1_CreateAccount;
import pages.TC2_Login;
import pages.TC3_Title;
import pages.TC4_Tab;
import pages.TC5_HomePage;
import pages.TC6_Product;
import pages.TC7_ViewProduct;
import pages.TC8_Search;
import pages.TC9_Livechat;
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
	TC6_Product product;
	TC7_ViewProduct viewproduct;
	TC8_Search search;
	TC9_Livechat livechat;
	TC10_LivechatInvalid livechatinvalid;
	TC11_Remove remove;
	TC12_Coupon coupon;
	TC13_Scrollupdown scrollupdown;
	TC14_NavigateBack navigateback;
	TC15_ZipCode zipcode;
	TC16_Quantity quantity;
	TC17_Logout logout;
	TC18_Logo logo;
	

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
		product = new TC6_Product();
		viewproduct = new TC7_ViewProduct();
		search = new TC8_Search();
		livechat = new TC9_Livechat();
		livechatinvalid = new TC10_LivechatInvalid();
		remove = new TC11_Remove();
		coupon = new TC12_Coupon();
		scrollupdown = new TC13_Scrollupdown();
		navigateback = new TC14_NavigateBack();
		zipcode = new TC15_ZipCode();
		quantity = new TC16_Quantity();
		logout = new TC17_Logout();
		logo = new TC18_Logo();
		
		
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
	
	//@Test(priority = 4, enabled = true)
		public void TC5_HomePage() throws Exception {

			homepage.HomePage();
	}
		
	//@Test(priority = 5, enabled = true)
	public void TC6_Product() throws Exception {

		product.Product();
	}
	
	//@Test(priority = 6, enabled = true)
		public void TC7_ViewProduct() throws Exception {

			viewproduct.ViewProduct();
	}
		
	//@Test(priority = 7, enabled = true)
	public void TC8_Search() throws Exception {

		search.Search();
	}
	
	//@Test(priority = 8, enabled = true)
	public void TC9_Livechat() throws Exception {

		livechat.Livechat();
	}
	
	//@Test(priority = 9, enabled = true)
		public void TC10_LivechatInvalid() throws Exception {

		livechatinvalid.LivechatInvalid();
	}
	
	//@Test(priority = 10, enabled = true)
	public void TC11_Remove() throws Exception {

		remove.Remove();
	}
	
	//@Test(priority = 11, enabled = true)
	public void TC12_Coupon() throws Exception {

		coupon.Coupon();
	}
	
	//@Test(priority = 12, enabled = true)
	public void TC13_Scrollupdown() throws Exception {

		scrollupdown.Scrollupdown();
	}
	
	//@Test(priority = 13, enabled = true)
	public void TC14_NavigateBack() throws Exception {

		navigateback.NavigateBack();
	}
	
	//@Test(priority = 14, enabled = true)
		public void TC15_ZipCode() throws Exception {

			zipcode.ZipCode();
	}
	
	//@Test(priority = 15, enabled = true)
	public void TC16_Quantity() throws Exception {

		quantity.Quantity();
    }
	
	//@Test(priority = 16, enabled = true)
	public void TC17_Logout() throws Exception {

		logout.Logout();
    }
	
	@Test(priority = 17, enabled = true)
	public void TC18_Logo() throws Exception {

		logo.Logo();
    }

	//@AfterMethod
	public void afterMethod() {
		driver.close();
		driver.quit();
	}

}

