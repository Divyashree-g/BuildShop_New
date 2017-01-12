package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.libraries.GenericUtils;

public class ProjectSetupPage 
{
	WebDriver driver;
	public ProjectSetupPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Manage Projects")
	private WebElement manageProjectsLink;
	
	@FindBy(linkText="Team")
	private WebElement teamLink;
	
	@FindBy(id="ctl00_MainContent_GridView1_ctl02_imgEdit")
	private WebElement projectEditIcon;
	
	@FindBy(id="ctl00_MainContent_GridView1_ctl02_btnEditProject")
	private WebElement projectEditButton;
	
	@FindBy(id="ctl00_MainContent_GridView1_ctl02_btnEditProject")
	private WebElement projectDeleteButton;
	
	@FindBy( id="ctl00_MainContent_txtFilter")
	private WebElement projectSearchTextFiled;
	
	@FindBy(id="ctl00_MainContent_btnSearch")
	private WebElement projectSearchIcon;
	
	@FindBy(id="__tab_ctl00_MainContent_Tabs_TabPanel2")
	private WebElement projectResourceTab;
	
	@FindBy(id="ctl00_MainContent_Tabs_TabPanel2_FormViewResources_hylProjectProjects")
	private WebElement projectResourceAddIcon;	
	
	@FindBy(id="ctl00_MainContent_Tabs_TabPanel2_FormViewResources_GridViewUsers_ctl02_btnUserName")
	private WebElement selectProjectResource;		
	
	@FindBy(id="__tab_ctl00_MainContent_Tabs_PanelNotes")
	private WebElement projectNotesTab;
	
	@FindBy(id="ctl00_MainContent_Tabs_PanelNotes_FormViewNotes1_Editor")
	private WebElement projectNotesTextField;		
	
	@FindBy( id="ctl00_MainContent_Tabs_PanelNotes_FormViewNotes1_UpdateButton")
	private WebElement projectNotesSaveButton;
	
	@FindBy( id="ctl00_MainContent_Tabs_PanelNotes_FormViewNotes1_UpdateCancelButton")
	private WebElement projectNotesCancelButton;
	
	public void clickManageProjectsLink()
	{
		manageProjectsLink.click();
	}
	
	public void clickTeamLink()
	{
		teamLink.click();
	}
	
	public void moveMouseHoverEditLink()
	{
		GenericUtils.mouseOver(driver, projectEditIcon);
	}
	
	public void clickProjectEditButton()
	{
		projectEditButton.click();
	}
	
	public void clickProjectDeleteButton()
	{
		projectDeleteButton.click();
	}
	
	public void enterProjectInSearchTextField(String searchtext)
	{
		projectSearchTextFiled.sendKeys(searchtext);
	}
	
	public void clickProjectSearchIcon()
	{
		projectSearchIcon.click();
	}
	
	public void clickProjectResourceTab()
	{
		projectResourceTab.click();
	}
	
	public void moveMouseHoverProjectResourceAddIcon()
	{
		GenericUtils.mouseOver(driver, projectResourceAddIcon);
	}
	
	public void selectProjectResourceName()
	{
		selectProjectResource.click();
	}
	
	public void clickProjectNotesTab()
	{
		projectNotesTab.click();
	}
	
	public void enterProjectNotesText(String notestext)
	{
		projectNotesTextField.sendKeys(notestext);
	}
	
	public void clickProjectNotesSaveButton()
	{
		projectNotesSaveButton.click();;
	}
	
	public void clickProjectNotesCancelButton()
	{
		projectNotesCancelButton.click();;
	}
	
	
	
}
