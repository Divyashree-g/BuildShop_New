package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageUsersPage 
{

	WebDriver driver;
	public ManageUsersPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ctl00_MainContent_GridView1_ctl03_btnDetails")
	private WebElement selectUser1ToEdit;
	
	@FindBy(id="ctl00_MainContent_GridView1_ctl04_btnDetails")
	private WebElement selectUser2ToEdit;
	
	@FindBy(id="ctl00_MainContent_chkLockedOut")
	private WebElement lockedOutCheckBox;
	
	@FindBy( id="ctl00_MainContent_chkApproved")
	private WebElement approvedCheckBox;
	
	@FindBy( id="ctl00_MainContent_btnUpdateRoles")
	private WebElement manageUsersSaveButton;
			
	@FindBy( id="ctl00_MainContent_ibDelete")
	private WebElement manageUsersDeleteButton;
			
	@FindBy(id="ctl00_MainContent_CheckBox1")
	private WebElement checkAllCheckBox;
	
	@FindBy(id="ctl00_MainContent_chklRoles_2" )
	private WebElement empBidsCheckBox;
	
	@FindBy(id="ctl00_MainContent_chklRoles_3" )
	private WebElement empBudgetCheckBox;
	
	@FindBy(id="ctl00_MainContent_chklRoles_5")
	private WebElement empContactsCheckBox;
	
	@FindBy(id="ctl00_MainContent_chklRoles_11" )
	private WebElement empEstimateCheckBox;
	
	@FindBy(id="ctl00_MainContent_chklRoles_12" )
	private WebElement empFinancialCheckBox;
	
	@FindBy(id="ctl00_MainContent_chklRoles_0" )
	private WebElement cusChangeOrdersCheckBox;
	
    @FindBy(id="ctl00_MainContent_chklRoles_5")
	private WebElement cusDrawingsCheckBox;
	
    @FindBy(id="ctl00_MainContent_chklRoles_6")
	private WebElement cusInvoicesCheckBox;
	
	@FindBy(id="ctl00_MainContent_chklRoles_7")
	private WebElement cusIssueTrackerCheckBox;
	
	@FindBy(id="ctl00_MainContent_chklRoles_8")
	private WebElement cusMessagesCheckBox;
	
	public void clickUser1ToEdit()
	{
		selectUser1ToEdit.click();
	}
	
	public void clickUser2ToEdit()
	{
		selectUser2ToEdit.click();
	}
	
	public void clickCheckAllCheckBox()
	{
		checkAllCheckBox.click();
	}
	
	public void clickCusChangeOrdersCheckBox()
	{
		cusChangeOrdersCheckBox.click();
	}
	
	public void clickEmpBudgetCheckBox()
	{
		empBudgetCheckBox.click();
	}
	
	public void clickEmpContactsCheckBox()
	{
		empContactsCheckBox.click();
	}
	
	public void clickEmpEstimateCheckBox()
	{
		empEstimateCheckBox.click();
	}
	
	public void clickEmpFinancialCheckBox()
	{
		empFinancialCheckBox.click();
	}
	
	public void clickEmpBidsCheckBox()
	{
		empBidsCheckBox.click();
	}
	
	public void clickCusDrawingsCheckBox()
	{
		cusDrawingsCheckBox.click();
	}
	
	public void clickCusInvoicesCheckBox()
	{
		cusInvoicesCheckBox.click();
	}
	
	public void clickCusIssueTrackerCheckBox()
	{
		cusIssueTrackerCheckBox.click();
	}
	
	public void clickCusMessagesCheckBox()
	{
		cusMessagesCheckBox.click();
	}
	
	public void clickLockedOutCheckBox()
	{
		lockedOutCheckBox.click();
	}
	
	public void clickApprovedCheckBox()
	{
		approvedCheckBox.click();
	}
	
	public void clickManageUsersSaveButton()
	{
		manageUsersSaveButton.click();
	}
	
	public void clickManageUsersDeleteButton()
	{
		manageUsersDeleteButton.click();
	}
}
