package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.libraries.GenericUtils;

public class EmployeeCreationPage
{
	WebDriver driver;
	public EmployeeCreationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ctl00_LoginViewProfessional_LoginName1")
	private WebElement userNameDropDown;
	
	@FindBy(linkText="Manage Users")
	private WebElement manageUsersLink;
	
	@FindBy(linkText="Add Users")
	private WebElement addUsersLink;
	
	@FindBy(id="ctl00_MainContent_CreateUserWizard1_CreateUserStepContainer_ddlType")
	private WebElement userTypeDropDown;
	
	@FindBy(id="ctl00_MainContent_CreateUserWizard1_CreateUserStepContainer_UserName")
	private WebElement userNameTextField1;
	
	@FindBy(id="ctl00_MainContent_CreateUserWizard1_CreateUserStepContainer_Email")
	private WebElement emailTextField1;
	
	@FindBy(id="ctl00_MainContent_CreateUserWizard1_CreateUserStepContainer_Password")
	private WebElement passwordTextField1;
	
	@FindBy(id="ctl00_MainContent_CreateUserWizard1___CustomNav0_StepNextButtonButton")
	private WebElement createUserButton;
	
	@FindBy(id="ctl00_MainContent_CreateUserWizard1_CompleteStepContainer_ContinueButtonButton")
	private WebElement continueButton;
	
	
	public void createUser(String empusername, String email, String password)
	{
		userNameDropDown.click();
		
		manageUsersLink.click();
		addUsersLink.click();
		GenericUtils.selectbyVisibletext(userTypeDropDown, "Employee");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userNameTextField1.click();
		userNameTextField1.sendKeys(empusername);
		emailTextField1.click();
		emailTextField1.sendKeys(email);
		passwordTextField1.click();
		passwordTextField1.sendKeys(password);
		createUserButton.click();
		continueButton.click();
	}	
	
	
	
	


}
