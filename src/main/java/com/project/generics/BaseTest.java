package com.project.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconstants
{
	public static WebDriver driver;

	@BeforeMethod
	public void preConditions()
{
    System.setProperty(gecko_key,gecko_value); 
	driver=new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://zsn.zycus.com/guest");
}
@AfterMethod
	public void postConditions()
	{
	driver.close();
}
}
