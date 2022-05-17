package com.hybridframework.inetbanking.testcases;

import org.testng.annotations.Test;

import com.hybridframework.inetbanking.pageobject.HomePage;
import com.hybridframework.inetbanking.pageobject.LoginPage;
import com.hybridframework.inetbanking.testbase.Testbase;

public class ScreenshotCapture extends Testbase{
	
	@Test
	public void verifyLoginBtnTC0000001() {
		LoginPage Login = new LoginPage(driver);
		Login.setUsername(ConfigDataProvider.getUserName());
		Login.setPassword(ConfigDataProvider.getPassWord());
		Login.clickOnLoginBtn();
	}


}
