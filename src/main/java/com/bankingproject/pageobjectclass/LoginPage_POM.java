package com.bankingproject.pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_POM

{
	
	 WebDriver Ldriver;
	//Elements
	@FindBy(xpath = "//input[@name = 'uid']")
	WebElement UserID;
	
	@FindBy(xpath = "//input[@name = 'password']")
	WebElement Password;
	
	
	@FindBy(xpath = "//input[@name = 'btnLogin']")
	WebElement  LoginButton;
	
	@FindBy(xpath = "//input[@name = 'btnReset']")
	WebElement ResetButton;
	//constructor
	public LoginPage_POM(WebDriver Rdriver)
	{
		Ldriver = Rdriver;
		PageFactory.initElements( Rdriver, this);
	}

	
	public void SetUsername(String name)
	{
		UserID.sendKeys(name);
	}
	
	public void SetPassword(String pass)
	{
		Password.sendKeys(pass);
		
	}
	
	public void ClickOnLoginButton()
	{
		LoginButton.click();
		
	}
	
	
	
}
