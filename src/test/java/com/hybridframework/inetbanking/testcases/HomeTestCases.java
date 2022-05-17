package com.hybridframework.inetbanking.testcases;

import org.testng.annotations.Test;

import com.hybridframework.inetbanking.pageobject.HomePage;
import com.hybridframework.inetbanking.pageobject.LoginPage;
import com.hybridframework.inetbanking.testbase.Testbase;

public class HomeTestCases extends Testbase {
	HomePage homepage;
	@Test(priority = 1)
	public void verifyLoginBtnTC0000001() {
		LoginPage Login = new LoginPage(driver);
		Login.setUsername(ConfigDataProvider.getUserName());
		Login.setPassword(ConfigDataProvider.getPassWord());
		homepage = Login.clickOnLoginBtn();	
	}
	
	@Test(priority = 2)
	public void navigateToNewCustomer()
	{
		homepage.clickOnNewCustomerLink();
	}
	
	@Test(priority = 3)
	public void navigateToEditCustomer()
	{
		homepage.clickOnEditCustomerLink();
	}
	
	@Test(priority = 4)
	public void navigateToDeleteCustomer()
	{
		homepage.clickOnDeleteCustomerLink();
	}
	
	@Test(priority = 2)
	public void navigateToLogOutCustomer()
	{
		homepage.clickOnLogOutLink();
	}
}
