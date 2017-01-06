package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmployeeCreationPage
{
	public EmployeeCreationPage(WebDriver driver)
	{
		
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
	private WebElement userNameTextField;
	
	@FindBy(id="ctl00_MainContent_CreateUserWizard1_CreateUserStepContainer_Email")
	private WebElement emailTextField;
	
	@FindBy(id="ctl00_MainContent_CreateUserWizard1_CreateUserStepContainer_Password")
	private WebElement passwordTextField;
	
	@FindBy(id="ctl00_MainContent_CreateUserWizard1___CustomNav0_StepNextButtonButton")
	private WebElement createUserButton;
	
	public void createUser()
	{
		userNameDropDown.click();
		manageUsersLink.click();
		addUsersLink.click();
		Select select = new Select(userTypeDropDown);
		select.selectByVisibleText("Employee");
		userNameTextField.sendKeys("Devis");
		emailTextField.sendKeys("divyarajj1994@gmail.com");
		passwordTextField.sendKeys("Devis1234");
		createUserButton.click();
	}	
	
	
	
	


}
