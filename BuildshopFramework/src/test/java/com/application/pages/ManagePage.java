package com.application.pages;

import java.nio.channels.InterruptedByTimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.libraries.GenericUtils;

public class ManagePage {
	WebDriver driver;
	public ManagePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ctl00_pnlManage")
	private WebElement manageInHomePage;
	
	@FindBy(id="ctl00_ManageModule1_apDashboard")
	private WebElement manageDashboardTab;
	
	@FindBy(id="ctl00_ManageModule1_aSchListView")
	private WebElement manageScheduleTab;
	
	@FindBy(id="ctl00_ManageModule1_aToDoList")
	private WebElement manageToDoListTab;
	
	@FindBy(id="ctl00_ManageModule1_aPhotos")
	private WebElement managePhotosTab;
	
	@FindBy(id="ctl00_ManageModule1_aChangeOrders")
	private WebElement manageChangeOrderTab;
	
	@FindBy(id="ctl00_ManageModule1_aPunchList")
	private WebElement managePunchListTab;
	
	@FindBy(id="ctl00_ManageModule1_aIssueTracker")
	private WebElement manageIssueTrackerTab;
	
	@FindBy(id="ctl00_ManageModule1_aRiskManager")
	private WebElement manageRiskManagerTab;

	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement manageScheduleAddTaskButton;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_TextBox1")
	private WebElement scheduleItemNunberTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_txtDescription")
	private WebElement scheduleDescriptionTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_IsEstimate")
	private WebElement scheduleAddToEstimateCheckBox;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_ddlDivision")
	private WebElement scheduleDivisionsDropBox;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_ddlType")
	private WebElement scheduleTypeDropBox;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_ddlStatus")
	private WebElement scheduleStatusDropBox;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_ProjectPlanStartTextBox")
	private WebElement scheduleStartDateTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_ProjectPlanFinishTextBox")
	private WebElement scheduleFinishDateTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_ProjectPlanPercentCompleteTextBox")
	private WebElement schedulePercentCompleteTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_ProjectPlanInspectedDateTextBox")
	private WebElement scheduleInspectedDateTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_IsScope")
	private WebElement scheduleAddToScopeCheckBox;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_IsSharewithSubs")
	private WebElement scheduleShareWithSubsCheckBox;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_txtScopeofWork")
	private WebElement scheduleScopeTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_txtScopeofWork")
	private WebElement scheduleExclusionsTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_InsertButton")
	private WebElement manageScheduleSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewProjectPlanInsert_InsertCancelButton")
	private WebElement manageScheduleCancelButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement manageScheduleDoneButton;
	
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement toDoListAddItemButton;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_ddlSchedule")
	private WebElement toDoListScheduleTaskDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_ddlUser")
	private WebElement toDoListAssignedToDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_DateTextBox")
	private WebElement toDoListDateTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_TaskTextBox")
	private WebElement toDoListTaskTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_ddlStatus")
	private WebElement toDoListStatusDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_DetailsTextBox")
	private WebElement toDoListLocationTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_InsertButton")
	private WebElement toDoListSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_InsertCancelButton")
	private WebElement toDoListCancelItemButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement toDoListDoneButton;
	
	@FindBy(id="ctl00_MainContent_FormView1_ItemTextBox")
	private WebElement toDoListQuickAddTaskTextBox;
	
	@FindBy(id="ctl00_MainContent_FormView1_DateTextBox")
	private WebElement toDoListQuickAddDateTextBox;
	
	@FindBy(id="ctl00_MainContent_FormView1_InsertButton")
	private WebElement toDoListQuickAddAddButton;
	

	@FindBy(id="ctl00_MainContent_CODescriptionTextBox")
	private WebElement changeOrderQuickAddDescriptionTextField;
	
	@FindBy(id="ctl00_MainContent_DateTextBox")
	private WebElement changeOrderQuickAddDateTextField;
	
	@FindBy(id="ctl00_MainContent_InsertButton")
	private WebElement changeOrderQuickAddAddButton;
	
	@FindBy( id="ctl00_MainContent_AccordionPane1_content_FormViewAddCategory_CategoryTextBox")
	private WebElement managePunchListAddACategoryLink;
	
	@FindBy( id="ctl00_MainContent_AccordionPane1_content_FormViewAddCategory_CategoryTextBox")
	private WebElement managePunchListAddACategoryNameTextField;
	
	@FindBy(id="ctl00_MainContent_AccordionPane1_content_FormViewAddCategory_InsertButton")
	private WebElement managePunchListAddACategorySaveButton;
	
	@FindBy(id="ctl00_MainContent_AccordionPane2_header")
	private WebElement managePunchListCategoriesLink;
	
	@FindBy(id="ctl00_MainContent_AccordionPane2_content_GridViewSelectionType_ctl02_lblRoom")
	private WebElement managePunchListCategoriesItemLink;
	
	@FindBy( id="ctl00_MainContent_FormView1_ItemTextBox")
	private WebElement managePunchListQuickAddTaskTextField;
	
	@FindBy( id="ctl00_MainContent_FormView1_DateTextBox")
	private WebElement managePunchListQuickAddDateTextField;
	
	@FindBy( id="ctl00_MainContent_FormView1_InsertButton")
	private WebElement managePunchListQuickAddAddButton;
	
	@FindBy( id="ctl00_MainContent_FormViewIssueIns_ItemTextBox")
	private WebElement manageIssueTrackerQuickAddItemTextField;
	
	@FindBy( id="ctl00_MainContent_FormViewIssueIns_DateTextBox")
	private WebElement manageIssueTrackerQuickAddDateTextField;
	
	@FindBy( id="ctl00_MainContent_FormViewIssueIns_InsertButton")
	private WebElement manageIssueTrackerQuickAddAddButton;	
	
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement manageIssueTrackerAddIssuesButton;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueTrackerInsert_NameTextBox")
	private WebElement manageIssueTrackerIssueNameTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueTrackerInsert_DateOpenedTextBox")
	private WebElement manageIssueTrackerIssueDateOpenedTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueTrackerInsert_DateClosedTextBox")
	private WebElement manageIssueTrackerIssueDateClosedTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueTrackerInsert_ddlOwner")
	private WebElement manageIssueTrackerOwnerOfTheIssueDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueTrackerInsert_ddlAssignedTo")
	private WebElement manageIssueTrackerIssueAssignedToDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueTrackerInsert_DropDownList2")
	private WebElement manageIssueTrackerStatusDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueTrackerInsert_DropDownList1")
	private WebElement manageIssueTrackerPriorityDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueTrackerInsert_DropDownList4")
	private WebElement manageIssueTrackerSharwWithCustomerDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueTrackerInsert_DetailsTextBox")
	private WebElement manageIssueTrackerIssueDetailsTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueTrackerInsert_InsertButton")
	private WebElement manageIssueTrackerSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueTrackerInsert_InsertCancelButton")
	private WebElement manageIssueTrackerCancelButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement manageIssueTrackerDoneButton;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueIns_ItemTextBox")
	private WebElement riskManagerQuickAddTaskTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueIns_DateTextBox")
	private WebElement riskManagerQuickAddDateTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewIssueIns_InsertButton")
	private WebElement riskManagerQuickAddAddButton;
	

	
	public void clickOnManageInHomePage()
	{
		manageInHomePage.click();
	}
	public void clickOnManageDashBoardTab()
	{
		manageDashboardTab.click();
	}
	public void clickOnManageScheduleTab()
	{
		manageScheduleTab.click();
	}
	public void clickOnManageToDoListTab()
	{
		manageToDoListTab.click();
	}
	public void clickOnManagePhotosTab()
	{
		managePhotosTab.click();
	}
	public void clickOnManageChangeOrderTab()
	{
		manageChangeOrderTab.click();
	}
	public void clickOnManagePunchListTab()
	{
		managePunchListTab.click();
	}
	public void clickOnManageIssueTrackerTab()
	{
		manageIssueTrackerTab.click();
	}
	public void clickOnManageRiskManagerTab()
	{
		manageRiskManagerTab.click();
	}
	public void clickOnManageAddTaskButton()
	{
		manageScheduleAddTaskButton.click();
	}
	public void enterScheduleItemNumber(String itemNumber)
	{
		scheduleItemNunberTextField.sendKeys(itemNumber);
	}
	public void enterDescriptionNumber(String description)
	{
		scheduleDescriptionTextField.sendKeys(description);
	}
	public void clickOnAddToEstimateCheckBox()
	{
		scheduleAddToEstimateCheckBox.click();
	}
	public void selectManageDivisionFromDropDown(String division)
	{
		GenericUtils.selectbyVisibletext(scheduleDivisionsDropBox, division);
	}
	public void selectManageTypeFromDropDown(String type)
	{
		GenericUtils.selectbyVisibletext(scheduleTypeDropBox, type);
	}
	public void selectManageStatusFromDropDown(String status)
	{
		GenericUtils.selectbyVisibletext(scheduleStatusDropBox, status);
	}
	public void enterScheduleStartDate(String startDate)
	{
		scheduleStartDateTextField.sendKeys(startDate);
	}
	public void enterScheduleFinishDate(String finishDate)
	{
		scheduleFinishDateTextField.sendKeys(finishDate);
	}
	public void enterSchedulePercentCompleteDate(String percentcompleted)
	{
		schedulePercentCompleteTextField.clear();
		schedulePercentCompleteTextField.sendKeys(percentcompleted);
	}
	public void enterInspectedDateTextField(String inspectedDate)
	{
		scheduleInspectedDateTextField.sendKeys(inspectedDate);
	}
	public void clickOnAddToScopeCheckBox()
	{
		scheduleAddToScopeCheckBox.click();
	}
	public void clickOnShareWithSubsCheckBox()
	{
		scheduleShareWithSubsCheckBox.click();
	}
	public void enterManageScheduledScope(String scope)
	{
		scheduleScopeTextField.sendKeys(scope);
	}
	public void enterManageScheduledExclusions(String scope)
	{
		scheduleExclusionsTextField.sendKeys(scope);
	}
	public void clickOnManageScheduleSaveButton()
	{
		manageScheduleSaveButton.click();
	}
	public void clickOnManageScheduleCancelButton()
	{
		manageScheduleCancelButton.click();
	}
	public void clickOnManageScheduleDoneButton()
	{
		manageScheduleDoneButton.click();
	}

	public void ClickOnManageToDoListAddItemButton()
	{
		toDoListAddItemButton.click();
	}
	public void scelectManageToDoListScheduleTask(String schedule)
	{
		GenericUtils.selectbyVisibletext(toDoListScheduleTaskDropDown, schedule);
	}
	public void scelectManageToDoListAssignTo(String assigneTo)
	{
		GenericUtils.selectbyVisibletext(toDoListAssignedToDropDown, assigneTo);
	}
	public void enterDateInManageToDoList(String date)
	{
		toDoListDateTextBox.sendKeys(date);
	}
	public void enterTaskInManageToDoList(String task)
	{
		toDoListTaskTextBox.sendKeys(task);
	}
	public void scelectManageToDoListStatus(String status)
	{
		GenericUtils.selectbyVisibletext(toDoListStatusDropDown, status);
	}
	public void enterLocationInManageToDoList(String location)
	{
		toDoListLocationTextBox.sendKeys(location);
	}
	public void ClickOnManageToDoListSaveButton()
	{
		toDoListSaveButton.click();
	}
	public void ClickOnManageToDoListCancelButton()
	{
		toDoListCancelItemButton.click();
	}
	public void ClickOnManageToDoListDoneButton()
	{
		toDoListDoneButton.click();
	}
	public void enterToDoListQuickAddTask(String quickTask)
	{
		toDoListQuickAddTaskTextBox.sendKeys(quickTask);
	}
	public void enterToDoListQuickAddDate(String quickDate)
	{
		toDoListQuickAddDateTextBox.sendKeys(quickDate);
	}
	public void clickOnToDoListQuickAddPlus(String date)
	{
		toDoListQuickAddAddButton.sendKeys(date);
	}
	
	public void enterChangeOrderQuickAddTask(String quickTask)
	{
		changeOrderQuickAddDescriptionTextField.sendKeys(quickTask);
	}
	public void enterChangeOrderQuickAddDate(String quickDate)
	{
		changeOrderQuickAddDateTextField.clear();
		changeOrderQuickAddDateTextField.sendKeys(quickDate);
	}
	public void clickOnChangeOrderQuickAddPlus(String date)
	{
		changeOrderQuickAddAddButton.sendKeys(date);
	}
	
	public void clickOnManagePunchListAddACategoryLink()
	{
		managePunchListAddACategoryLink.click();
	}
	public void enterManagePunchListAddACategoryName(String CategoryName)
	{
		managePunchListAddACategoryNameTextField.sendKeys(CategoryName);
	}
	public void clickOnManagePunchListAddACategorySaveButton()
	{
		managePunchListAddACategorySaveButton.click();
	}
	public void clickOnManagePunchListCategoriesLink()
	{
		managePunchListCategoriesLink.click();
	}
	public void clickOnMmanagePunchListCategoriesItemLink()
	{
		managePunchListCategoriesItemLink.click();
	}
	public void enterManagePunchListQuickAddATask(String punchTask)
	{
		managePunchListQuickAddTaskTextField.sendKeys(punchTask);
	}
	public void enterManagePunchListQuickAddTask(String punchDate)
	{
		managePunchListQuickAddDateTextField.clear();
		managePunchListQuickAddDateTextField.sendKeys(punchDate);
	}
	public void clickOnChangeOrderQuickAddPlus()
	{
		managePunchListQuickAddAddButton.click();
	}
	public void enterManageIssueTrackerQuickAddATask(String punchTask)
	{
		managePunchListQuickAddTaskTextField.sendKeys(punchTask);
	}
	public void enterManageIssueTrackerQuickAddTask(String punchDate)
	{
		managePunchListQuickAddDateTextField.clear();
		managePunchListQuickAddDateTextField.sendKeys(punchDate);
	}
	public void clickOnManageIssueTrackerQuickAddPlus()
	{
		managePunchListQuickAddAddButton.click();
	}

	public void clickOnManageIssueTrackerAddIssuesButton()
	{
		manageIssueTrackerAddIssuesButton.click();
	}
	public void enterManageIssueTrackerIssueName(String issueName)
	{
		manageIssueTrackerIssueNameTextField.sendKeys(issueName);
	}
	public void enterManageIssueTrackerDateOpened(String dateOpened)
	{
		manageIssueTrackerIssueDateOpenedTextField.sendKeys(dateOpened);
	}
	public void enterManageIssueTrackerDateClosed(String dateClosed)
	{
		manageIssueTrackerIssueDateClosedTextField.sendKeys(dateClosed);
	}
	public void selectManageIssueTrackerOwnerOfTheIssue(String issueOwner)
	{
		GenericUtils.selectbyVisibletext(manageIssueTrackerOwnerOfTheIssueDropDown, issueOwner);
	}
	public void selectManageIssueTrackerAssignedIssue(String assignedTo)
	{
		GenericUtils.selectbyVisibletext(manageIssueTrackerIssueAssignedToDropDown, assignedTo);
	}
	public void selectManageIssueTrackerStatus(String status)
	{
		GenericUtils.selectbyVisibletext(manageIssueTrackerStatusDropDown, status);
	}
	public void selectManageIssueTrackerIssuePriority(String issuePrioroty)
	{
		GenericUtils.selectbyVisibletext(manageIssueTrackerPriorityDropDown, issuePrioroty);
	}
	public void selectManageIssueTrackerSahreWithCustomer(String shareCustomer)
	{
		GenericUtils.selectbyVisibletext(manageIssueTrackerSharwWithCustomerDropDown, shareCustomer);
	}
	public void enterManageIssueTrackerIssueDetails(String issueDetails)
	{
		manageIssueTrackerIssueDetailsTextField.sendKeys(issueDetails);
	}
	public void clickOnManageIssueTrackerSaveButton()
	{
		manageIssueTrackerSaveButton.click();
	}
	public void clickOnManageIssueTrackerCancelButton()
	{
		manageIssueTrackerCancelButton.click();
	}
	public void clickOnManageIssueTrackerDoneButton()
	{
		manageIssueTrackerDoneButton.click();
	}
	public void enterRiskManagerQuickAddTask(String quickTask)
	{
		riskManagerQuickAddTaskTextBox.sendKeys(quickTask);
	}
	public void enterRiskManagerQuickAddDate(String quickDate)
	{
		riskManagerQuickAddDateTextBox.sendKeys(quickDate);
	}
	public void clickRiskManagerQuickAddPlus(String date)
	{
		riskManagerQuickAddAddButton.sendKeys(date);
	}
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement manageRiskManagerAddRiskButton;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_NameTextBox")
	private WebElement manageRiskManagerRiskNameTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_DateOpenedTextBox")
	private WebElement manageRiskManagerRiskDateOpenedTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_DateClosedTextBox")
	private WebElement manageRiskManagerIssueDateClosedTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_ddlOwner")
	private WebElement manageRiskManagerOwnerOfTheRiskDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_ddlAssignedTo")
	private WebElement manageRiskManagerRiskAssignedToDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_DropDownList2")
	private WebElement manageRiskManagerStatusDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_DropDownList1")
	private WebElement manageRiskManagerPriorityDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_DropDownList3")
	private WebElement manageRiskManagerProbabilityDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_DropDownList5")
	private WebElement manageRiskManagerImpactDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_DropDownList4")
	private WebElement manageRiskManagerSeverityDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_DropDownList7")
	private WebElement manageRiskManagerShareWithCustomerDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_DetailsTextBox")
	private WebElement riskManagerDetailsTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_TextBox1")
	private WebElement riskManagerMitigationTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_InsertButton")
	private WebElement riskManagerSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewRiskManagementInsert_InsertCancelButton")
	private WebElement riskManagerCancelButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement riskManagerDoneButton;
	
	public void clickOnManageRiskManagerAddIssuesButton()
	{
		manageRiskManagerAddRiskButton.click();
	}
	public void enterManageRiskManagerRiskName(String riskName)
	{
		manageRiskManagerRiskNameTextField.sendKeys(riskName);
	}
	public void enterManageRiskManagerDateOpened(String dateOpened)
	{
		manageRiskManagerRiskDateOpenedTextField.sendKeys(dateOpened);
	}
	public void enterManageRiskManagerDateClosed(String dateClosed)
	{
		manageRiskManagerIssueDateClosedTextField.sendKeys(dateClosed);
	}
	public void selectManageRiskManagerOwnerOfTheIssue(String issueOwner)
	{
		GenericUtils.selectbyVisibletext(manageRiskManagerOwnerOfTheRiskDropDown, issueOwner);
	}
	public void selectManageRiskManagerAssignedIssue(String assignedTo)
	{
		GenericUtils.selectbyVisibletext(manageRiskManagerRiskAssignedToDropDown, assignedTo);
	}
	public void selectManageRiskManagerStatus(String status)
	{
		GenericUtils.selectbyVisibletext(manageRiskManagerStatusDropDown, status);
	}
	public void selectManageRiskManagerIssuePriority(String issuePrioroty)
	{
		GenericUtils.selectbyVisibletext(manageRiskManagerPriorityDropDown, issuePrioroty);
	}
	public void selectManageRiskManagerProbabilityOfTheIssue(String issueOwner)
	{
		GenericUtils.selectbyVisibletext(manageRiskManagerProbabilityDropDown, issueOwner);
	}
	public void selectManageRiskManagerImpactOfIssue(String assignedTo)
	{
		GenericUtils.selectbyVisibletext(manageRiskManagerImpactDropDown, assignedTo);
	}
	public void selectManageRiskManagerSeverity(String status)
	{
		GenericUtils.selectbyVisibletext(manageRiskManagerSeverityDropDown, status);
	}
	public void selectManageRiskManagerShareWithCustomer(String issuePrioroty)
	{
		GenericUtils.selectbyVisibletext(manageRiskManagerShareWithCustomerDropDown, issuePrioroty);
	}
	public void enterManageRiskManagerDetails(String riskDetail)
	{
		riskManagerDetailsTextBox.sendKeys(riskDetail);
	}
	public void enterManageRiskManagerMitigation(String mitigation)
	{
		riskManagerMitigationTextBox.sendKeys(mitigation);
	}
	public void clickOnManageRiskManagerSaveButton()
	{
		riskManagerSaveButton.click();
	}
	public void clickOnManageRiskManagerCancelButton()
	{
		riskManagerCancelButton.click();
	}
	public void clickOnManageRiskManagerDoneButton()
	{
		riskManagerDoneButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
