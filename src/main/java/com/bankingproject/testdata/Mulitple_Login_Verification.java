package com.bankingproject.testdata;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.bankingproject.pageobjectclass.BaseClass;
import com.bankingproject.pageobjectclass.LoginPage_POM;
import com.bankingproject.utilities.getDataFromExcel;

public class Mulitple_Login_Verification extends BaseClass
{
	@Test
public void firstlogintest() throws IOException
{	
	LoginPage_POM login = new LoginPage_POM(driver);
	test = extent.createTest("Verify Application Login");
	driver.get(baseURL);
	test.log(Status.PASS, "URL Open Sucessfully");
	login.SetUsername(getDataFromExcel.getData(1,0));
	test.log(Status.PASS, "username entered Sucessfully");

	
	
	login.SetPassword(getDataFromExcel.getData(1, 1));
	test.log(Status.PASS, "password entered Sucessfully");
	
	
		test.log(Status.FAIL, "password entered UNSucessfully");
	
	
	login.ClickOnLoginButton();
	test.log(Status.PASS, "login button click sucessfully");
	
	
}
	
	
	
}
