package com.hybridframework.inetbanking.testcases;

import org.testng.annotations.Test;
import com.hybridframework.inetbanking.pageobject.NewCustomer;
import com.hybridframework.inetbanking.pageobject.HomePage;
import com.hybridframework.inetbanking.pageobject.LoginPage;
import com.hybridframework.inetbanking.testbase.Testbase;

public class AddNewCustomerTestCases0001 extends Testbase {
	@Test
	public void adnewCustomer() throws InterruptedException {
		LoginPage Login = new LoginPage(driver);
		Login.setUsername(ConfigDataProvider.getUserName());
		Login.setPassword(ConfigDataProvider.getPassWord());
		HomePage homepage = Login.clickOnLoginBtn();
		
		Thread.sleep(4000);
		NewCustomer addCust = homepage.clickOnNewCustomerLink();
		
		addCust.setCustomerName("Pratik");
		addCust.setCustomerGender("Male");
		
		addCust.setCustomerDOB("01");
		Thread.sleep(2000);
		addCust.setCustomerDOB("05");
		Thread.sleep(2000);
		addCust.setCustomerDOB("1989");
		Thread.sleep(2000);
		
		addCust.setCustomerAddress("Ambika park");
		addCust.setCustomerCity("Surat");
		addCust.setCustomerState("Gujarat");
		addCust.setCustomerPinCode("394210");
		addCust.setCustomerTelePhone("9254568595");
		addCust.setCustomerEmailID("pratik@gmail.com");
		addCust.setCustomerPassword("Pratik@123");
		
		addCust.SetSubmitBtn();

	}
}
