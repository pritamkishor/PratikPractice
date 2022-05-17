package com.hybridframework.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class NewCustomer {

	WebDriver driver;
	
	public NewCustomer(WebDriver driver) 
	{
			this.driver = driver;
			PageFactory.initElements(driver , this);
	}
	
	@FindBy(name="name")
	@CacheLookup
	WebElement Txt_custName; 
	
	@FindBy(xpath ="//input[@type = 'radio' and @value='m']")
	@CacheLookup
	WebElement maleRadioBtn; 
	
	@FindBy(xpath ="//input[@type = 'radio' and @value='f']")
	@CacheLookup
	WebElement femaleRadioBtn; 
	
	@FindBy(name ="dob")
	@CacheLookup
	WebElement custDOB; 
	
	@FindBy(name ="addr")
	@CacheLookup
	WebElement Txt_custAddr; 
	
	@FindBy(name ="city")
	@CacheLookup
	WebElement Txt_custCity; 
	
	@FindBy(name ="state")
	@CacheLookup
	WebElement Txt_custState; 
	
	@FindBy(name ="pinno")
	@CacheLookup
	WebElement Txt_custPinCode; 
	
	@FindBy(name ="telephoneno")
	@CacheLookup
	WebElement Txt_custTelephone; 
	
	@FindBy(name ="emailid")
	@CacheLookup
	WebElement Txt_custEmailid; 
	
	@FindBy(name ="password")
	@CacheLookup
	WebElement Txt_custPassword; 
	
	@FindBy(name ="sub")
	@CacheLookup
	WebElement Submitbtn; 
	
	public void setCustomerName(String customername) {
		Txt_custName.clear();
		Txt_custName.sendKeys(customername);	
	}
	public void setCustomerGender(String gender) {
		if(gender.equals("Male"))
		{
			maleRadioBtn.click();
		}
		else
		{
			femaleRadioBtn.click();
		}
	}
	
	public void setCustomerDOB(String DOB) {
		custDOB.sendKeys(DOB);
	}
	
	public void setCustomerAddress(String customerAdd) {
		Txt_custAddr.clear();
		Txt_custAddr.sendKeys(customerAdd);
	}
	
	public void setCustomerCity(String customerCity) {
		Txt_custCity.clear();
		Txt_custCity.sendKeys(customerCity);
	}
	
	public void setCustomerState(String customerState) {
		Txt_custState.clear();
		Txt_custState.sendKeys(customerState);
	}
	
	public void setCustomerPinCode(String customerPincode) {
		Txt_custPinCode.clear();
		Txt_custPinCode.sendKeys(customerPincode);
	}
	
	public void setCustomerTelePhone(String customerTelephone) {
		Txt_custTelephone.clear();
		Txt_custTelephone.sendKeys(customerTelephone);
	}
	
	public void setCustomerEmailID(String customerEmail) {
		Txt_custEmailid.clear();
		Txt_custEmailid.sendKeys(customerEmail);
	}
	
	public void setCustomerPassword(String customerPass) {
		Txt_custPassword.clear();
		Txt_custPassword.sendKeys(customerPass);
	}
	
	public void SetSubmitBtn() {
		Submitbtn.click();
	}
}
