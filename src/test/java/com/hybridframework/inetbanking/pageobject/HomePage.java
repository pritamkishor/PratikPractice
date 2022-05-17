package com.hybridframework.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// OR HomePage Layers

	@FindBy(linkText = "New Customer")
	WebElement newCustomerLink;

	@FindBy(linkText = "Edit Customer")
	WebElement editCustomer_Link;

	@FindBy(linkText = "Delete Customer")
	WebElement deleteCustomer_Link;

	@FindBy(linkText = "New Account")
	WebElement newAccount_Link;
 
	@FindBy(linkText = "Log Out")
	WebElement logOut_Link;
	
	public NewCustomer clickOnNewCustomerLink()
	{
		try
		{
			newCustomerLink.click();
			return new NewCustomer(driver);
		}
		catch(Exception e)
		{
			e.printStackTrace(); 	
			return null;
		}
	}
	
	public EditCustomer clickOnEditCustomerLink()
	{
		try
		{
			editCustomer_Link.click();
			return new EditCustomer();
		}
		catch(Exception e)
		{
			e.printStackTrace(); 	
			return null;
		}
	}
	public DeleteCustomer clickOnDeleteCustomerLink()
	{
		try
		{
			deleteCustomer_Link.click();
			return new DeleteCustomer();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public NewAccount clickOnNewAccountLink()
	{
		try
		{
			newAccount_Link.click();
			return new NewAccount();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public LogOut clickOnLogOutLink()
	{
		try
		{
			logOut_Link.click();
			return new LogOut();
		}	
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}


}

