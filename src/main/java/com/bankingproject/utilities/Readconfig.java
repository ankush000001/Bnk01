package com.bankingproject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readconfig 
{public Properties pro;

	public Readconfig() 
	{

 pro = new Properties();
 File src = new File("D:\\eclips data\\MAproject\\configuration\\Config.properties");
 FileInputStream file;
try {
	
	file = new FileInputStream(src);
	pro.load(file);
} catch (IOException e) 
{
	
	e.printStackTrace();
}

	}
	
	public String getApplicationURL()
	{
		String baseURL = pro.getProperty("baseURL");
		return baseURL;
	}
	
	
	public String getUsername() 
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	
	public String getPassword() 
	{
		String password = pro.getProperty("password");
		return password;
	}
	
}
