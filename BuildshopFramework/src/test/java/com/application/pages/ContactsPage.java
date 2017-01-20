package com.application.pages;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.libraries.GenericUtils;


public class ContactsPage 
{
public WebDriver driver;
	
	public ContactsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='ctl00_CommunicationModule1_aContacts']")
	private WebElement contactsPage;
	
	//Add Contact..
	@FindBy(xpath="//input[@name='ctl00$MainContent$btnNew']")
	private WebElement ContactsAddContactButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_CompanyNameTextBox']")
	private WebElement ContactsAddContactCompanyNameTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_PhoneTextBox']")
	private WebElement ContactsAddContactPhoneTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_ExtensionTextBox']")
	private WebElement ContactsAddContactPhoneExtensionTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_CellPhoneTextBox']")
	private WebElement ContactsAddContactcellPhoneTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_FaxTextBox']")
	private WebElement ContactsAddContactFaxTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_EmailTextBox']")
	private WebElement ContactsAddContactEmailTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtContactName']")
	private WebElement ContactsAddContactContactNameTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtFirstName']")
	private WebElement ContactsAddContactFirstNameTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtLastName']")
	private WebElement ContactsAddContactLastNameTextBox;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_DropDownList1']")
	private WebElement ContactsAddContactTypeListBox;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlType']")
	private WebElement ContactsAddContactProfessionListBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_AddressTextBox']")
	private WebElement ContactsAddContactStreetTextBox;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlCountries']")
	private WebElement ContactsAddContactCountryListBox;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlStates']")
	private WebElement ContactsAddContactStateListBox;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlCities']")
	private WebElement ContactsAddContactCityListBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_ZipCodeTextBox']")
	private WebElement ContactsAddContactZipCodeTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtLongitude']")
	private WebElement ContactsAddContactLongitudeTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtLatitude']")
	private WebElement ContactsAddContactLatitudeTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_InsertButton']")
	private WebElement ContactsAddContactSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_InsertCancelButton']")
	private WebElement ContactsAddContactCancelButton;
	
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
	private WebElement ContactsDoneButton;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_ddlPageSize']")
	private WebElement ContactsPageShowRowsListBox;
	
		
	//Search Contact.......
	@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
	private WebElement ContactSearchTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
	private WebElement ContactSearchButton;
	
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_ddlPageSize']")
	private WebElement ContactShowRowsLB;
	
	
	//Delete Contact.........
	@FindBy(xpath="//span[text()='xyxyEmployee']/../../../../..//input")
	private WebElement ContactSelectChkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
	private WebElement ContactDeleteButton;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnMultipleRowDelete']")
	private WebElement ContactDeleteConfirmButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_CancelButton']")
	private WebElement ContactDeleteCancelButton;
	
	
	
	//Modify Contact...........
	@FindBy(xpath="//span[text()='xyxyEmployee']")
	private WebElement SelectExistingContact;
	
	@FindBy(xpath="//a[@id='__tab_ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit']")
	private WebElement EditContactEditLink;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_CompanyNameTextBox']")
	private WebElement EditContactCompanyNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_PhoneTextBox']")
	private WebElement EditContactPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ExtensionTextBox']")
	private WebElement EditContactPhoneExtensionTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_CellPhoneTextBox']")
	private WebElement EditContactCellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FaxTextBox']")
	private WebElement EditContactFaxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_EmailTextBox']")
	private WebElement EditContactEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtContactName']")
	private WebElement EditContactContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtFirstName']")
	private WebElement EditContactFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLastName']")
	private WebElement EditContactLastNameTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_DropDownList1']")
	private WebElement EditContactTypeLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlType']")
	private WebElement EditContactProfessionLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_AddressTextBox']")
	private WebElement EditContactStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlCountries']")
	private WebElement EditContactCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlStates']")
	private WebElement EditContactStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlCities']")
	private WebElement EditContactCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ZipCodeTextBox']")
	private WebElement EditContactZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLongitude']")
	private WebElement EditContactLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLatitude']")
	private WebElement EditContactLatitudeTB;
	
	
	//Modify Contact - Add Contact..
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_btnAddAdditionalContact']")
	private WebElement EditContactAddContactButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_NameTextBox']")
	private WebElement EditContactAddContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_PhoneTextBox']")
	private WebElement EditContactAddContactPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_EmailTextBox']")
	private WebElement EditContactAddContactEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_InsertButton']")
	private WebElement EditContactAddContactSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_InsertCancelButton']")
	private WebElement EditContactAddContactCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_LinkButton3']")
	private WebElement EditContactAddContactCloseIcon;
	
	@FindBy(xpath="//img[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_GridViewAdditionalContacts_ctl02_imgEdit']")
	private WebElement EditContactAdditionalContactEditIcon;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_GridViewAdditionalContacts_ctl02_LinkButton2']")
	private WebElement EditContactAdditionalContactDeleteButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_GridViewAdditionalContacts_ctl02_LinkButton2']")
	private WebElement EditContactAdditionalContactDeleteConfirmButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_GridViewAdditionalContacts_ctl02_LinkButton2']")
	private WebElement EditContactAdditionalContactDeleteCancelButton;


	//Modify Contact - Add Site..
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_btnAddAddNewSite']")
	private WebElement EditContactAddSiteButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_NameTextBox']")
	private WebElement EditContactAddSiteLocationTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_Street1TextBox']")
	private WebElement EditContactAddSiteStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlCountries']")
	private WebElement EditContactAddSiteCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlStates']")
	private WebElement EditContactAddSiteStatesLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlCities']")
	private WebElement EditContactAddSiteCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_ZipTextBox']")
	private WebElement EditContactAddSiteZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_txtLongitude']")
	private WebElement EditContactAddSiteLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_txtLatitude']")
	private WebElement EditContactAddSiteLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_InsertButton']")
	private WebElement EditContactAddSiteSaveButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton1']")
	private WebElement EditContactAddSiteCloseIcon;
			
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_UpdateButton']")
	private WebElement EditContactSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_UpdateCancelButton']")
	private WebElement EditContactCancelButton;
	
		
	
	//Prospects Page....	
	@FindBy(xpath="//div[@id='ctl00_CommunicationModule1_aProspects']")
	private WebElement contactsProspectsPage;
	
	
	//Add Prospect....
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnNew']")
	private WebElement ProspectsAddProspectButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_CompanyNameTextBox']")
	private WebElement ProspectsAddProspectCompanyNameTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_txtFirstName']")
	private WebElement ProspectsAddProspectFirstNameTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_txtLastName']")
	private WebElement ProspectsAddProspectLastNameTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_DateTextBox']")
	private WebElement ProspectsAddProspectCallDateTextBox;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewProspectingInsert_ddlStatus']")
	private WebElement ProspectsAddProspectContactStatusListBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_txtAppointmentDate']")
	private WebElement ProspectsAddProspectAppointmentDateTextBox;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewProspectingInsert_ddlAppointmentTime']")
	private WebElement ProspectsAddProspectAppointmentTimeListBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_PhoneTextBox']")
	private WebElement ProspectsAddProspectPhoneTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_ExtensionTextBox']")
	private WebElement ProspectsAddProspectPhoneExtensionTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_CellPhoneTextBox']")
	private WebElement ProspectsAddProspectCellPhoneTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_FaxTextBox']")
	private WebElement ProspectsAddProspectFaxTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_EmailTextBox']")
	private WebElement ProspectsAddProspectEmailTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_AddressTextBox']")
	private WebElement ProspectsAddProspectStreetTextBox;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewProspectingInsert_ddlCountries']")
	private WebElement ProspectsAddProspectContryListBox;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewProspectingInsert_ddlStates']")
	private WebElement ProspectsAddProspectStateListBox;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewProspectingInsert_ddlCities']")
	private WebElement ProspectsAddProspectCityListBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_ZipCodeTextBox']")
	private WebElement ProspectsAddProspectZipCodeTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_txtLongitude']")
	private WebElement ProspectsAddProspectLongitudeTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_txtLatitude']")
	private WebElement ProspectsAddProspectLatitudeTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_txtProjectDescription']")
	private WebElement ProspectsAddProspectDescriptionTextBox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_InsertButton']")
	private WebElement ProspectsAddProspectSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewProspectingInsert_InsertCancelButton']")
	private WebElement ProspectsAddProspectCancelButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
	private WebElement ProspectsAddProspectDoneButton;
	
	
	
	//Delete Prospect.........
	@FindBy(xpath="//span[text()='custom home']/../../../../..//input")
	private WebElement prospectSelectChkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
	private WebElement ProspectDeleteProspectButton;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnMultipleRowDelete']")
	private WebElement ProspectDeleteProspectConfirmationButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_CancelButton']")
	private WebElement ProspectDeleteProspectCancelButton;
		
	@FindBy(xpath="//select[@id='ctl00_MainContent_ddlPageSize']")
	private WebElement ProspectsContactShowRowsListBox;
	
	
	
	
	
	
	
	
	
	
	//Add Contact....
	public void clickContactsPage()
	{
		contactsPage.click();
	}
	
	public void clickOnAddContactButton()
	{
		ContactsAddContactButton.click();
	}
	
	public void enterCompanyNameToAddContact(String companyName)
	{
		ContactsAddContactCompanyNameTextBox.sendKeys(companyName);
	}
	
	public void enterPhoneNoToAddContact(String phoneNo)
	{
		ContactsAddContactPhoneTextBox.sendKeys(phoneNo);
	}
	
	public void enterPhoneExtensionToAddContact(String phoneExt)
	{
		ContactsAddContactPhoneExtensionTextBox.sendKeys(phoneExt);
	}
	
	public void enterCellPhoneToAddContact(String cellPhone)
	{
		ContactsAddContactcellPhoneTextBox.sendKeys(cellPhone);
	}
	
	public void enterFaxToAddContact(String fax)
	{
		ContactsAddContactFaxTextBox.sendKeys(fax);
	}
	
	public void enterEmailToAddContact(String email)
	{
		ContactsAddContactEmailTextBox.sendKeys(email);
	}
	
	public void enterContactNameToAddContact(String contactName)
	{
		ContactsAddContactContactNameTextBox.sendKeys(contactName);
	}
	
	public void enterFirstNameToAddContact(String firstName)
	{
		ContactsAddContactFirstNameTextBox.sendKeys(firstName);
	}
	
	public void enterLastNameToAddContact(String lastName)
	{
		ContactsAddContactLastNameTextBox.sendKeys(lastName);
	}
	
	public void selectContactTypeToAddContact(String contactType)
	{
		GenericUtils.selectbyVisibletext(ContactsAddContactTypeListBox, contactType);
	}
	
	public void selectProfessionTypeToAddContact(String professionType)
	{
		GenericUtils.selectbyVisibletext(ContactsAddContactProfessionListBox, professionType);
	}
	
	public void enterStreetNameToAddContact(String streetName)
	{
		ContactsAddContactStreetTextBox.sendKeys(streetName);
	}
	
	public void selectCountryNameToAddContact(String countryName)
	{
		GenericUtils.selectbyVisibletext(ContactsAddContactCountryListBox, countryName);
	}
	
	public void selectStateNameToAddContact(String stateName)
	{
		GenericUtils.selectbyVisibletext(ContactsAddContactStateListBox, stateName);
	}
	
	public void selectCityNameToAddContact(String cityName)
	{
		GenericUtils.selectbyVisibletext(ContactsAddContactCityListBox, cityName);
	}
	
	public void enterZipCodeToAddContact(String zipCode)
	{
		ContactsAddContactZipCodeTextBox.sendKeys(zipCode);
	}
	
	public void enterLongitudeToAddContact(String longitude)
	{
		ContactsAddContactLongitudeTextBox.sendKeys(longitude);
	}
	
	public void enterLatitudeToAddContact(String latitude)
	{
		ContactsAddContactLatitudeTextBox.sendKeys(latitude);
	}
	
	public void clickSaveToAddContact()
	{
		ContactsAddContactSaveButton.click();
	}
	
	public void clickDoneToAddContact()
	{
		ContactsDoneButton.click();
	}
	
	
	

	//Add Prospect
	public void clickOnProspectsPage()
	{
		contactsProspectsPage.click();
	}
	
	public void clickOnAddProspectButton()
	{
		ProspectsAddProspectButton.click();
	}
	
	public void enterCompanyNameToAddProspect(String companyName)
	{
		ProspectsAddProspectCompanyNameTextBox.sendKeys(companyName);
	}
	
	public void enterFirstNameToAddProspect(String firstName)
	{
		ProspectsAddProspectFirstNameTextBox.sendKeys(firstName);
	}
	
	public void enterLastNameToAddProspect(String lastName)
	{
		ProspectsAddProspectLastNameTextBox.sendKeys(lastName);
	}
	
	public void enterCallDateToAddProspect(String callDate)
	{
		ProspectsAddProspectCallDateTextBox.sendKeys(callDate);
	}
	
	public void selectContactStatusToAddProspect(String contactStatus)
	{
		GenericUtils.selectbyVisibletext(ProspectsAddProspectContactStatusListBox, contactStatus);
	}
	
	public void enterAppointmentDateToAddProspect(String appointmentDate)
	{
		ProspectsAddProspectAppointmentDateTextBox.sendKeys(appointmentDate);
	}
	
	public void selectAppointmentTimeToAddProspect(String appointmentTime)
	{
		GenericUtils.selectbyVisibletext(ProspectsAddProspectAppointmentTimeListBox, appointmentTime);
	}
	
	public void enterPhoneNoToAddProspect(String phoneNo)
	{
		ProspectsAddProspectPhoneTextBox.sendKeys(phoneNo);
	}
	
	public void enterPhoneExtensionToAddProspect(String phoneExt)
	{
		ProspectsAddProspectPhoneExtensionTextBox.sendKeys(phoneExt);
	}
	
	public void enterCellPhoneNoToAddProspect(String cellPhoneNo)
	{
		ProspectsAddProspectCellPhoneTextBox.sendKeys(cellPhoneNo);
	}
	
	public void enterFaxToAddProspect(String fax)
	{
		ProspectsAddProspectFaxTextBox.sendKeys(fax);
	}
	
	public void enterEmailToAddProspect(String email)
	{
		ProspectsAddProspectEmailTextBox.sendKeys(email);
	}
	
	public void enterStreetNameToAddProspect(String streetName)
	{
		ProspectsAddProspectStreetTextBox.sendKeys(streetName);
	}
	
	public void selectCountryToAddProspect(String countryName)
	{
		GenericUtils.selectbyVisibletext(ProspectsAddProspectContryListBox, countryName);
	}
	
	public void selectStateToAddProspect(String stateName)
	{
		GenericUtils.selectbyVisibletext(ProspectsAddProspectStateListBox, stateName);
	}
	
	public void selectCityToAddProspect(String cityName)
	{
		GenericUtils.selectbyVisibletext(ProspectsAddProspectCityListBox, cityName);
	}
	
	public void enterZipCodeToAddProspect(String zipCode)
	{
		ProspectsAddProspectZipCodeTextBox.sendKeys(zipCode);
	}
	
	public void enterLongitudeToAddProspect(String longitude)
	{
		ProspectsAddProspectLongitudeTextBox.sendKeys(longitude);
	}
	
	public void enterLatitudeToAddProspect(String latitude)
	{
		ProspectsAddProspectLatitudeTextBox.sendKeys(latitude);
	}
	
	public void enterDescriptionToAddProspect(String description)
	{
		ProspectsAddProspectDescriptionTextBox.sendKeys(description);
	}
	
	public void clickSaveToAddProspect()
	{
		ProspectsAddProspectSaveButton.click();
	}
	
	public void clickDoneToAddProspect()
	{
		ProspectsAddProspectDoneButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	public void addContactMethod() throws InterruptedException
	{
		contactsPage.click();
		Thread.sleep(2000);
		ContactsAddContactButton.click();
		Thread.sleep(2000);
		String  AddContactCompanyName= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,0);
		ContactsAddContactCompanyNameTextBox.sendKeys(AddContactCompanyName);
		String  AddContactContactName= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,1);
		ContactsAddContactContactNameTextBox.sendKeys(AddContactContactName);
		String  AddContactFirstName= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,2);
		ContactsAddContactFirstNameTextBox.sendKeys(AddContactFirstName);
		String  AddContactLastName= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,3);
		ContactsAddContactLastNameTextBox.sendKeys(AddContactLastName);
		String  AddContactPhone= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,4);
		ContactsAddContactPhoneTextBox.sendKeys(AddContactPhone);
		String  AddContactPhoneExtension= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,5);
		ContactsAddContactPhoneExtensionTextBox.sendKeys(AddContactPhoneExtension);
		String  AddContactcellPhone= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,6);
		ContactsAddContactcellPhoneTextBox.sendKeys(AddContactcellPhone);
		String  AddContactFax= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,7);
		ContactsAddContactFaxTextBox.sendKeys(AddContactFax);
		String  AddContactEmail= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,8);
		ContactsAddContactEmailTextBox.sendKeys(AddContactEmail);
		
		Thread.sleep(1000);
		Select s1=new Select(ContactsAddContactTypeListBox);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		Select s2=new Select(ContactsAddContactProfessionListBox);
		s2.selectByIndex(1);
		Thread.sleep(2000);
		String  AddContactStreet= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,9);
		ContactsAddContactStreetTextBox.sendKeys(AddContactStreet);
		Thread.sleep(2000);
		Select s3=new Select(ContactsAddContactCountryListBox);
		s3.selectByIndex(12);
		Thread.sleep(2000);
		Select s4=new Select(ContactsAddContactStateListBox);
		s4.selectByIndex(1);
		Thread.sleep(2000);
		Select s5=new Select(ContactsAddContactCityListBox);
		s5.selectByIndex(1);
		Thread.sleep(2000);
		String  AddContactZipCode= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,10);
		ContactsAddContactZipCodeTextBox.sendKeys(AddContactZipCode);
		String  AddContactLongitude= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,11);
		ContactsAddContactLongitudeTextBox.sendKeys(AddContactLongitude);
		String  AddContactLatitude= ExcelLibrary.getExcelData("datafile.xls","Contacts",1,12);
		ContactsAddContactLatitudeTextBox.sendKeys(AddContactLatitude);
		Thread.sleep(1000);
		ContactsAddContactSaveButton.click();
		Thread.sleep(2000);
		ContactsDoneButton.click();
		Thread.sleep(2000);
		Select s6=new Select(ContactsPageShowRowsListBox);
		s6.selectByIndex(4);
		Thread.sleep(2000);
		
		
//		String actual=driver.findElement(By.xpath("//span[contains(text(),'Cust ABCD')]")).getText();
//		AssertJUnit.assertEquals("Cust ABCD", actual);
		
	}
	
	public void searchContactMethod() throws InterruptedException
	{
		contactsPage.click();
		Thread.sleep(2000);
		Select s1=new Select(ContactShowRowsLB);
		s1.selectByIndex(3);
		Thread.sleep(2000);		
		ContactSearchTB.clear();
		ContactSearchTB.sendKeys("aaaaaNew Company1234");  //search by company name only....
		ContactSearchButton.click();
	}
	
	public void deleteContactMethod() throws InterruptedException
	{
		contactsPage.click();
		Thread.sleep(2000);
		ContactSelectChkbox.click();
		Thread.sleep(1000);
		ContactDeleteButton.click();
		Thread.sleep(1000);
		ContactDeleteCancelButton.click();
		//ContactDeleteConfirmButton.click();			
	}
	
	public void modifyContactMethod() throws InterruptedException
	{
		contactsPage.click();
		Thread.sleep(2000);
		SelectExistingContact.click();
		Thread.sleep(2000);
		EditContactCompanyNameTB.clear();
		EditContactCompanyNameTB.sendKeys("xyxy Company");
		EditContactPhoneTB.clear();
		EditContactPhoneTB.sendKeys("25631478");
		EditContactPhoneExtensionTB.clear();
		EditContactPhoneExtensionTB.sendKeys("0101");
		EditContactCellPhoneTB.clear();
		EditContactCellPhoneTB.sendKeys("9988665533");
		EditContactFaxTB.clear();
		EditContactFaxTB.sendKeys("fax5214");
		EditContactEmailTB.clear();
		EditContactEmailTB.sendKeys("xycust1@xy.com");
		EditContactContactNameTB.clear();
		EditContactContactNameTB.sendKeys("xy cust");
		EditContactFirstNameTB.clear();
		EditContactFirstNameTB.sendKeys("xycust");
		EditContactLastNameTB.clear();
		EditContactLastNameTB.sendKeys("xy123");
		Thread.sleep(1000);
		Select s1=new Select(EditContactTypeLB);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		Select s2=new Select(EditContactProfessionLB);
		s2.selectByIndex(1);
		Thread.sleep(2000);
		EditContactStreetTB.clear();
		EditContactStreetTB.sendKeys("Street 12");
		Thread.sleep(1000);
		Select s3=new Select(EditContactCountryLB);
		s3.selectByIndex(1);
		Thread.sleep(2000);
		Select s4=new Select(EditContactStateLB);
		s4.selectByIndex(1);
		Thread.sleep(2000);
		Select s5=new Select(EditContactCityLB);
		s5.selectByIndex(1);
		Thread.sleep(2000);
		EditContactZipCodeTB.clear();
		EditContactZipCodeTB.sendKeys("635241");
		EditContactLongitudeTB.clear();
		EditContactLongitudeTB.sendKeys("60");
		EditContactLatitudeTB.clear();
		EditContactLatitudeTB.sendKeys("50");
		Thread.sleep(1000);
		EditContactAddContactButton.click();
		Thread.sleep(1000);
		EditContactAddContactNameTB.sendKeys("xyxy Cust");
		EditContactAddContactPhoneTB.sendKeys("23568987");
		EditContactAddContactEmailTB.sendKeys("xyxycust@xy.com");
		Thread.sleep(1000);
		EditContactAddContactSaveButton.click();
		Thread.sleep(1000);
		EditContactAddContactCloseIcon.click();
		Thread.sleep(1000);
		Actions a1=new Actions(driver);
		a1.moveToElement(EditContactAdditionalContactEditIcon).perform();
		Thread.sleep(1000);
		EditContactAdditionalContactDeleteButton.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		//EditContactAdditionalContactDeleteConfirmButton.click();
		Thread.sleep(1000);
		//EditContactAdditionalContactDeleteCancelButton.click();
		EditContactAddSiteButton.click();
		Thread.sleep(1000);
		EditContactAddSiteLocationTB.sendKeys("Location xyxy");
		EditContactAddSiteStreetTB.sendKeys("xy street");
		Select s6=new Select(EditContactAddSiteCountryLB);
		s6.selectByIndex(1);
		Thread.sleep(2000);
		Select s7=new Select(EditContactAddSiteStatesLB);
		s7.selectByIndex(1);
		Thread.sleep(2000);
		Select s8=new Select(EditContactAddSiteCityLB);
		s8.selectByIndex(1);
		Thread.sleep(2000);
		EditContactAddSiteZipCodeTB.sendKeys("556321");
		EditContactAddSiteLongitudeTB.sendKeys("65");
		EditContactAddSiteLatitudeTB.sendKeys("50");
		Thread.sleep(1000);
		EditContactAddSiteSaveButton.click();
		Thread.sleep(1000);
		EditContactAddSiteCloseIcon.click();
		Thread.sleep(1000);
		EditContactSaveButton.click();
		Thread.sleep(2000);
		ContactsDoneButton.click();
		
	}
	*/
	
}
