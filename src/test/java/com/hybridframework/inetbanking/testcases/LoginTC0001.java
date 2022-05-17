package com.hybridframework.inetbanking.testcases;

import org.testng.annotations.Test;

import com.hybridframework.inetbanking.pageobject.HomePage;
import com.hybridframework.inetbanking.pageobject.LoginPage;
import com.hybridframework.inetbanking.testbase.Testbase;

public class LoginTC0001 extends Testbase {

	// @Test
	// public void verifyLoginBtnFunctinalityTC001()
	// {
	// LoginPage Loginpg = new LoginPage(driver);
	// Loginpg.setUsername("mngr400988");
	// Loginpg.setPassword("EquzUpe");
	// Loginpg.clickOnLoginBtn();
	// }

	@Test
	public void verifyLoginBtnTC0000001() {
		LoginPage Login = new LoginPage(driver);
		Login.setUsername(ConfigDataProvider.getUserName());
		Login.setPassword(ConfigDataProvider.getPassWord());
		HomePage homepage = Login.clickOnLoginBtn();
	}

}
