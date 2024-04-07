package com.bankingproject.pageobjectclass;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.bankingproject.utilities.Readconfig;

public class BaseClass 
{
	public Readconfig readconfig = new Readconfig();
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver  driver;
	public ExtentReports extent;
	public ExtentSparkReporter SparkReport;
	public ExtentTest test;
//	
//	public  String captureScreen() throws IOException
//	{
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String destination = "D:\\eclips data\\MAproject\\screenshot\\second" + ".jpg";
//		
//		FileUtils.copyFile(source,new File(destination));
//		return destination;
//	
//	}
	@BeforeMethod
	public void openBrowser() 
	{
		System.setProperty("Webdriver.Chrome.Driver","D:\\AUTO.TESTING\\chromedriver-win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	
	
	
	
	
	@Parameters("browser")
//	@BeforeMethod
//	public void initilisation(String str)
//	{	if(str.equals("chrome")) {
//		System.setProperty("Webdriver.Chrome.Driver","D:\\AUTO.TESTING\\chromedriver-win32\\chromedriver.exe");
//		
//		 driver = new ChromeDriver();
//		
//	}
//	
//	else if(str.equals("edge")) 
//	{
//		System.setProperty("webdriver.edge.driver","D:\\AUTO.TESTING\\edgedriver_win64\\msedgedriver.exe");
//		
//		 driver = new EdgeDriver();
//	}
	

	//}
	
	@BeforeSuite
	public void setReport()
	{
		 SparkReport = new ExtentSparkReporter("D:\\eclips data\\MAproject\\report\\htmlreport15" + ".html");
		 extent = new ExtentReports();
		extent.attachReporter(SparkReport);
		
		extent.setSystemInfo("Oprating System", "Windows 10 pro");
		extent.setSystemInfo("Environment", "SIT");
		SparkReport.config().setReportName("Integration Testing");
		SparkReport.config().setDocumentTitle("QA Automation Test Report");
		SparkReport.config().setTheme(Theme.STANDARD);
		
	}
	
	
	
	
	
	
	
	@AfterSuite
	public void endReport()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
	
}
