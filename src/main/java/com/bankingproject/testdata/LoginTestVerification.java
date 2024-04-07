package com.bankingproject.testdata;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.bankingproject.pageobjectclass.BaseClass;
import com.bankingproject.pageobjectclass.LoginPage_POM;
import com.bankingproject.utilities.CaptureScreenshot;

public class LoginTestVerification extends BaseClass {
	
	public BaseClass obj = new BaseClass();
	CaptureScreenshot obj1 = new CaptureScreenshot();

	@Test
	
	public void logintest() throws IOException, InterruptedException
	{
		
		LoginPage_POM login = new LoginPage_POM(driver);
		test = extent.createTest("Verify Application Login");
		
		driver.get(baseURL);
		test.log(Status.PASS, "URL Open Sucessfully");
		login.SetUsername(username);
		test.log(Status.PASS, "Username Entered Sucessfully");
		
		login.SetPassword(password);
		test.log(Status.PASS, "Password Entered Sucessfully");
		
		login.ClickOnLoginButton();
		
			test.log(Status.PASS, "Button clicked Sucessfully");
		
		
		
		
		
		String expectedTitle = " GTPL Bank Home32423 ";
		
		Thread.sleep(4000);
		
		if(driver.getTitle().equals(expectedTitle)) 
		{
			test.log(Status.PASS, "Title Verified Sucessfully");
		}
		
		
		else 
		{
			test.log(Status.FAIL, "Title Mismatch Case Failed ");
		String screenshotpath = obj1.captureScreen();
				
		test.addScreenCaptureFromPath(screenshotpath);
		}
	}}
