package com.bankingproject.utilities;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.bankingproject.pageobjectclass.BaseClass;

public class CaptureScreenshot extends BaseClass
{
public  String captureScreen() throws IOException
{
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String destination = "D:\\eclips data\\MAproject\\screenshot\\fifth" + ".jpg";
	
	FileUtils.copyFile(source,new File(destination));
	return destination;
}}
	
	
	
	

