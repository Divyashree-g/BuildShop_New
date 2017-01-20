package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagesPage 
{
	WebDriver driver;
	public MessagesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ctl00_MainContent_btnSendMessage")
	private WebElement newMessageButton;
	
	@FindBy( id="ctl00_MainContent_SendMessage1_cblResourseList_0")
	private WebElement selectParticipantCheckbox;
	
	@FindBy( id="ctl00_MainContent_SendMessage1_cblProjectList_0" )
	private WebElement selectProjectCheckbox;
	
	@FindBy(id="ctl00_MainContent_SendMessage1_txtSubject")
	private WebElement topicTextField;
	
	@FindBy(id="ctl00_MainContent_SendMessage1_txtBody")
	private WebElement messageBodyTextField;
	
	@FindBy(id="ctl00_MainContent_SendMessage1_lbViewAllContacts")
	private WebElement viewContacts;
	
	@FindBy(id="ctl00_MainContent_SendMessage1_lbViewTeam" )
	private WebElement viewTeam;
	 
	@FindBy( id="ctl00_MainContent_SendMessage1_txtSubmit")
	private WebElement sendButton;
	
	@FindBy( id="ctl00_MainContent_SendMessage1_btnCancel")
	private WebElement cancelButton;
	
	@FindBy( id="ctl00_MainContent_btnShowGrid")
	private WebElement doneButton;
	
	@FindBy(id="ctl00_MainContent_txtFilterCompanies")
	private WebElement searchCompaniesTextField; 
	
	@FindBy(id="ctl00_MainContent_GridViewCompanies_ctl02_lbCompanyName")
	private WebElement selectCompanyName; 
	
	@FindBy(id="ctl00_MainContent_GridViewProjects_ctl02_labelProjectID")
	private WebElement selectProjectName;
	
	@FindBy(id="ctl00_MainContent_GridView1_ctl02_lblSubject" )
	private WebElement selectMessageSubject;
	
	@FindBy(id="ctl00_MainContent_txtEmailReply")
	private WebElement replyTextField;
	
	@FindBy(id="ctl00_MainContent_lbEmailReply")
	private WebElement replySendButton;
	
	@FindBy(id="ctl00_MainContent_GridView1_ctl02_lbDelete")
	private WebElement messageDeleteButton;
	
	public void clickNewMessageButton()
	{
		newMessageButton.click();
	}
	
	public void clickParticipantCheckbox()
	{
		selectParticipantCheckbox.click();
	}
	
	public void clickProjectCheckbox()
	{
		selectProjectCheckbox.click();
	}
	
	public void enterTopicInTextField(String msgtopic)
	{
		topicTextField.sendKeys(msgtopic);
	}

	public void enterMessageBodyInTextField(String msgbody)
	{
		messageBodyTextField.sendKeys(msgbody);
	}
	
	public void clickViewContacts()
	{
		viewContacts.click();
	}

	public void clickViewTeam()
	{
		viewTeam.click();
	}
	
	public void clickSendButton()
	{
		sendButton.click();	
	}
	
	public void clickCancelButton()
	{
		cancelButton.click();
	}
	
	public void clickDoneButton()
	{
		doneButton.click();	
	}
	
	public void enterSearchCompaniesTextField(String compname)
	{	
		searchCompaniesTextField.sendKeys(compname);	
	}
	
	public void clickCompanyName()
	{
		selectCompanyName.click();	
	}
	
	public void clickProjectName()
	{
		selectProjectName.click();	
	}
	
	public void clickMessageSubject()
	{
		selectMessageSubject.click();	
	}
	
	public void enterReplyInTextField(String replytext)
	{
		replyTextField.sendKeys(replytext);	
	}

	public void clickReplySendButton()
	{
		replySendButton.click();	
	}
	
	public void clickMessageDeleteButton()
	{
		messageDeleteButton.click();	
	}
	
	

}
