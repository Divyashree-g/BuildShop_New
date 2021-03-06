package com.application.pages;
//Comment Added Again 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.libraries.GenericUtils;


public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[@class='hpmenu']/..//a[@class='headerLinksHP']")
	private WebElement welcomePageSignInLink;
	   
	@FindBy (xpath = "//input[@id='ctl00_ContentPlaceHolder1_Login101_UserName']/following-sibling::input[@class='txt-sign-in']")
	private WebElement usernameTextField;

	@FindBy (xpath = "//input[@id='ctl00_ContentPlaceHolder1_Login101_Password']/following-sibling::input[@class='txt-sign-in']")
	private WebElement passwordTextField;
	
	@FindBy (xpath="//input [@ id='ctl00_ContentPlaceHolder1_Login101_Submit2']")
	private WebElement loginPageSignInButton;
	
	public void clickWelcomePageSignInLink()
	{
		welcomePageSignInLink.click();	
	}
	
	public void enterUsernameTextField(String username)
	{
		GenericUtils.sendKeysUsingAction(driver, usernameTextField, username);
	}
	
	public void enterPasswordTextField(String password)
	{
		GenericUtils.sendKeysUsingAction(driver, passwordTextField, password);	
	}
	
	public void clickLoginPageSignInButton()
	{
		loginPageSignInButton.click();	
	}
	
	
	/*public void loginToApplication(WebDriver driver, String username,String password)
	{
		welcomePageSignInLink.click();
		
		GenericUtils.sendKeysUsingAction(driver, usernameTextField, username);
		GenericUtils.sendKeysUsingAction(driver, passwordTextField, password);
		loginPageSignInButton.click();
				
	}
	*/
	
}
