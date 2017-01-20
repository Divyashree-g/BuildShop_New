package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.libraries.GenericUtils;

public class WarrantyPage {
	WebDriver driver;
	public WarrantyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ctl00_pnlWarranty")
	private WebElement warrantyInHomePage;
	
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement warrantyCreateWarrantyButton;
	
	@FindBy(id="ctl00_MainContent_ddlCompanyAssignedTo")
	private WebElement warrantyCreateWarrantyAssignedToDropDownList;
	
	@FindBy(id="ctl00_MainContent_FormViewWarrantyInsert_TypeTextBox")
	private WebElement warrantyCreateWarrantyTypeTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewWarrantyInsert_DropDownList2")
	private WebElement warrantyCreateWarrantyStatusDropDownList;
	
	@FindBy(id="ctl00_MainContent_FormViewWarrantyInsert_DropDownList1")
	private WebElement warrantyCreateWarrantyShareWithCustomerDropDownList;
	
	@FindBy(id="ctl00_MainContent_FormViewWarrantyInsert_CostTextBox")
	private WebElement warrantyCreateWarrantyCostTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewWarrantyInsert_ValidFromTextBox")
	private WebElement warrantyCreateWarrantyValidFromTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewWarrantyInsert_ValidToTextBox")
	private WebElement warrantyCreateWarrantyValidToTextField;
	
	@FindBy(id="ctl00_MainContent_FormViewWarrantyInsert_FileUpload1")
	private WebElement warrantyCreateWarrantyAddDocumentBrowseButton;
	
	
	
	@FindBy(id="ctl00_MainContent_FormViewWarrantyInsert_btnAddFile")
	private WebElement warrantyCreateWarrantyAddDocumentAddButton;
	
	@FindBy(id="ctl00_MainContent_FormViewWarrantyInsert_TermsTextBox")
	private WebElement warrantyCreateWarrantyTermsTextArea;
	
	@FindBy(id="ctl00_MainContent_FormViewWarrantyInsert_DescriptionTextBox")
	private WebElement warrantyCreateWarrantyDescriptionTextArea;
	
	@FindBy(id="ctl00_MainContent_FormViewWarrantyInsert_DisclaimerTextBox")
	private WebElement warrantyCreateWarrantyDisclaimerTextArea;
	
	@FindBy(id="ctl00_MainContent_FormViewWarrantyInsert_InsertButton")
	private WebElement warrantyCreateWarrantySaveButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement warrantyCreateWarrantyDoneButton;
		
	public void clickOnWarrantyInHomePage()
	{
		warrantyInHomePage.click();
	}
	public void clickOnCreateWarrantyButton()
	{
		warrantyCreateWarrantyButton.click();
	}
	public void selectWarrantyCreateWarrantyAssignedToFromDropDown(String assignedto)
	{
		GenericUtils.selectbyVisibletext(warrantyCreateWarrantyAssignedToDropDownList, assignedto);
	}
	public void enterWarrantyCreateWarrantyTypeTextField(String type)
	{
		warrantyCreateWarrantyTypeTextField.sendKeys(type);
	}
	public void selectWarrantyCreateWarrantyStatusFromDropDown(String status)
	{
		GenericUtils.selectbyVisibletext(warrantyCreateWarrantyStatusDropDownList, status);
	}
	public void selectWarrantyCreateWarrantyShareWithCustomerFromDropDown(String sharewithcustomer)
	{
		GenericUtils.selectbyVisibletext(warrantyCreateWarrantyShareWithCustomerDropDownList, sharewithcustomer);
	}
	public void enterWarrantyCreateWarrantyCostTextField(String cost)
	{
		warrantyCreateWarrantyCostTextField.sendKeys(cost);
	}
	public void enterWarrantyCreateWarrantyValidFromTextField(String validfrom)
	{
		warrantyCreateWarrantyValidFromTextField.sendKeys(validfrom);
	}
	public void enterWarrantyCreateWarrantyValidToTextField(String validto)
	{
		warrantyCreateWarrantyValidToTextField.sendKeys(validto);
	}
	public void clickOnWarrantyCreateWarrantyAddDocumentBrowseButton()
	{
		warrantyCreateWarrantyAddDocumentBrowseButton.click();
	}
	public void clickOnWarrantyCreateWarrantyAddDocumentAddButton()
	{
		warrantyCreateWarrantyAddDocumentAddButton.click();
	}
	public void enterWarrantyCreateWarrantyTermsTextArea(String terms)
	{
		warrantyCreateWarrantyTermsTextArea.sendKeys(terms);
	}
	public void enterWarrantyCreateWarrantyDescriptionTextArea(String description)
	{
		warrantyCreateWarrantyDescriptionTextArea.sendKeys(description);
	}
	public void enterWarrantyCreateWarrantyDisclaimerTextArea(String disclaimer)
	{
		warrantyCreateWarrantyDisclaimerTextArea.sendKeys(disclaimer);
	}
	public void clickOnWarrantyCreateWarrantySaveButton()
	{
		warrantyCreateWarrantySaveButton.click();
	}
	public void clickOnWarrantyCreateWarrantyDoneButton()
	{
		warrantyCreateWarrantyDoneButton.click();
	}
}
