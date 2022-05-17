package com.hybridframework.inetbanking.testcases;

import org.testng.annotations.Test;

import com.hybridframework.inetbanking.pageobject.LoginPage;
import com.hybridframework.inetbanking.testbase.Testbase;

public class NewCustomer0002 extends Testbase {
	
	@Test
	public void verifyLoginBtnFunctinalityTC001() 
	{
		LoginPage Loginpg = new LoginPage(driver);
		Loginpg.setUsername("mngr400988");
		Loginpg.setPassword("EquzUpe");
		Loginpg.clickOnLoginBtn();
	}
	}
