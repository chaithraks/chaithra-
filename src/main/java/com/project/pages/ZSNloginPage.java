package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.project.generics.BasePage;

public class ZSNloginPage 
{
@FindBy(id="login-email")
private WebElement untb;
@FindBy(id="login-password")
private WebElement pwtb;
@FindBy(xpath="//input[@value,'Login']")
private WebElement loginbtn;
public ZSNloginPage(WebDriver driver)
{
	//Super(driver);
PageFactory.initElements(driver, this);
}

public void enterusername(String user)
{
	untb.sendKeys(user);
}
public void enterpassword(String pass)
{
	untb.sendKeys(pass);
}
public void clickOnLogin()
{
	loginbtn.click();
}

















}
