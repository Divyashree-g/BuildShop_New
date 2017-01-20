package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.libraries.GenericUtils;

public class Field360Page 
{
	public WebDriver driver;
	
	public Field360Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Field 360']")
	private WebElement Field360Page;
	
	//Sub Modules..........................
	
	@FindBy(id="ctl00_ServiceModule1_aServiceDashboard")
	private WebElement Field360DashboardPage;
	
	@FindBy(id="ctl00_ServiceModule1_pnlCustomers")
	private WebElement Field360CustomersPage;
	
	
	//Add Customer Button..... 
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnNew']")
		private WebElement Field360CustomerAddCustomerButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_CompanyNameTextBox']")
		private WebElement Field360CustomerAddCustomerCompanyNameTextBox;
				
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtContactName']")
		private WebElement Field360CustomerAddCustomerContactNameTextBox;
				
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtFirstName']")
		private WebElement Field360CustomerAddCustomerFirstNameTextBox;
				
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtLastName']")
		private WebElement Field360CustomerAddCustomerLastNameTextBox;
				
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_PhoneTextBox']")
		private WebElement Field360CustomerAddCustomerPhoneTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_ExtensionTextBox']")
		private WebElement Field360CustomerAddCustomerPhoneExtensionTextBox;	
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_CellPhoneTextBox']")
		private WebElement Field360CustomerAddCustomerCellPhoneTextBox;	
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_FaxTextBox']")
		private WebElement Field360CustomerAddCustomerFaxTextBox;	
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_EmailTextBox']")
		private WebElement Field360CustomerAddCustomerEmailTextBox;	
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_AddressTextBox']")
		private WebElement Field360CustomerAddCustomerStreetTextBox;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlCountries']")
		private WebElement Field360CustomerAddCustomerCountryListBox;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlStates']")
		private WebElement Field360CustomerAddCustomerStateListBox;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactInsert_ddlCities']")
		private WebElement Field360CustomerAddCustomerCityListBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_ZipCodeTextBox']")
		private WebElement Field360CustomerAddCustomerZipCodeTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtLongitude']")
		private WebElement Field360CustomerAddCustomerLongitudeTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_txtLatitude']")
		private WebElement Field360CustomerAddCustomerLatitudeTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_InsertButton']")
		private WebElement Field360CustomerAddCustomerSaveButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactInsert_InsertCancelButton']")
		private WebElement Field360CustomerAddCustomerCancelButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
		private WebElement Field360CustomerAddCustomerDoneButton;
		
		
		
		//Delete Customer.......................
			
		@FindBy(xpath="//td//div/a/span[text()='New Company1234']/../../../../preceding-sibling::td/input[@id='ctl00_MainContent_GridView1_ctl08_cbRows']")
		private WebElement Field360CustomerCheckBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
		private WebElement Field360CustomerDeleteButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnMultipleRowDelete']")
		private WebElement Field360CustomerDeleteConfirmationButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_CancelButton']")
		private WebElement Field360CustomerDeleteCancelConfirmationButton;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_ddlPageSize']")
		private WebElement Field360CustomerShowRowsListBox;
		
		
		
		//Search Customer.......
		@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
		private WebElement Field360CustomerSearchCustomerTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
		private WebElement Field360CustomerSearchCustomerButton;
		
		
		
		
		//Update Customer......
		@FindBy(xpath="//td//div/a/span[text()='New Customer1234']")
		private WebElement Field360CustomerSelectExistingCustomer;
		
		
		//Update Customer Window.....
		@FindBy(xpath="//a[@id='__tab_ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit']")
		private WebElement Field360CustomerEditPage;
		
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_CompanyNameTextBox']")
		private WebElement Field360CustomerEditCompanyNameTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtContactName']")
		private WebElement  Field360CustomerEditContactNameTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtFirstName']")
		private WebElement  Field360CustomerEditFirstNameTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLastName']")
		private WebElement  Field360CustomerEditLastNameTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_PhoneTextBox']")
		private WebElement  Field360CustomerEditPhoneTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ExtensionTextBox']")
		private WebElement  Field360CustomerEditPhoneExtensionTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_CellPhoneTextBox']")
		private WebElement  Field360CustomerEditCellPhoneTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FaxTextBox']")
		private WebElement  Field360CustomerEditFaxTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_EmailTextBox']")
		private WebElement  Field360CustomerEditEmailTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_AddressTextBox']")
		private WebElement  Field360CustomerEditStreetTextBox;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlCountries']")
		private WebElement  Field360CustomerEditCountryListBox;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlStates']")
		private WebElement  Field360CustomerEditStateListBox;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlCities']")
		private WebElement  Field360CustomerEditCityListBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ZipCodeTextBox']")
		private WebElement  Field360CustomerEditZipCodeTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLongitude']")
		private WebElement  Field360CustomerEditLongitudeTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLatitude']")
		private WebElement  Field360CustomerEditLatitudeTextBox;
		
		//Update - Add Contact button...
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_btnAddAdditionalContact']")
		private WebElement  Field360CustomerEditAddContactButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_NameTextBox']")
		private WebElement  Field360CustomerEditAddContactNameTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_PhoneTextBox']")
		private WebElement  Field360CustomerEditAddContactPhoneTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_EmailTextBox']")
		private WebElement  Field360CustomerEditAddContactEmailTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_InsertButton']")
		private WebElement  Field360CustomerEditAddContactSaveButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_InsertCancelButton']")
		private WebElement  Field360CustomerEditAddContactCancelButton;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_LinkButton3']")
		private WebElement  Field360CustomerEditAddContactCloseIcon;
		
		
		//Update - Add Site button....
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_btnAddAddNewSite']")
		private WebElement  Field360CustomerEditAddSiteButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_NameTextBox']")
		private WebElement  Field360CustomerEditAddSiteLocationNameTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_Street1TextBox']")
		private WebElement  Field360CustomerEditAddSiteStreetTextBox;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlCountries']")
		private WebElement  Field360CustomerEditAddSiteCountryListBox;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlStates']")
		private WebElement  Field360CustomerEditAddSiteStateListBox;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlCities']")
		private WebElement  Field360CustomerEditAddSiteCityListBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_ZipTextBox']")
		private WebElement  Field360CustomerEditAddSiteZipCodeTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_txtLongitude']")
		private WebElement  Field360CustomerEditAddSiteLongitudeTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_txtLatitude']")
		private WebElement  Field360CustomerEditAddSiteLatitudeTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_InsertButton']")
		private WebElement  Field360CustomerEditAddSiteSaveButton;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton1']")
		private WebElement  Field360CustomerEditAddSiteCloseButton;
		
		
		
		
		//Update - Notes Link....
		
		@FindBy(xpath="//a[@id='__tab_ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit']")
		private WebElement  Field360CustomerEditNotesPage;
		
		@FindBy(xpath="//textarea[@id='ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_txtNotes']")
		private WebElement  Field360CustomerEditNotesTextBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_UpdateButton']")
		private WebElement  Field360CustomerEditNotesSaveButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_UpdateCancelButton']")
		private WebElement  Field360CustomerEditNotesCancelButton;
		
		
		
		//Update Existing Customer.....
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_UpdateButton']")
		private WebElement  Field360CustomerEditSaveButton;
			
		@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_UpdateCancelButton']")
		private WebElement  Field360CustomerEditCancelButton;
		
	
	
	//Employees Page....	
	@FindBy(id="ctl00_ServiceModule1_pnlEmployees")
	private WebElement Field360EmployeesPage;
	
	//Add Employee....
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement Field360EmployeesAddEmployeeButton;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_CompanyNameTextBox")
	private WebElement Field360EmployeesAddEmployeeCompanyNameTextBox;
		
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_txtContactName")
	private WebElement Field360EmployeesAddEmployeeContactNameTextBox;
		
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_txtFirstName")
	private WebElement Field360EmployeesAddEmployeeFirstNameTextBox;
		
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_txtLastName")
	private WebElement Field360EmployeesAddEmployeeLastNameTextBox;
		
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_PhoneTextBox")
	private WebElement Field360EmployeesAddEmployeePhoneTextBox;
		
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_ExtensionTextBox")
	private WebElement Field360EmployeesAddEmployeePhoneExtensionTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_CellPhoneTextBox")
	private WebElement Field360EmployeesAddEmployeeCellPhoneTextBox;
		
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_FaxTextBox")
	private WebElement Field360EmployeesAddEmployeeFaxTextBox;
		
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_EmailTextBox")
	private WebElement Field360EmployeesAddEmployeeEmailTextBox;
		
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_AddressTextBox")
	private WebElement Field360EmployeesAddEmployeeStreetTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_ddlCountries")
	private WebElement Field360EmployeesAddEmployeeCountryListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_ddlStates")
	private WebElement Field360EmployeesAddEmployeeStateListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_ddlCities")
	private WebElement Field360EmployeesAddEmployeeCityListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_ZipCodeTextBox")
	private WebElement Field360EmployeesAddEmployeeZipCodeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_txtLongitude")
	private WebElement Field360EmployeesAddEmployeeLongitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_txtLatitude")
	private WebElement Field360EmployeesAddEmployeeLatitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_InsertButton")
	private WebElement Field360EmployeesAddEmployeeSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_InsertCancelButton")
	private WebElement Field360EmployeesAddEmployeeCancelButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement Field360EmployeesAddEmployeeDoneButton;
	
	
	//Delete Customer.......................		
	@FindBy(id="ctl00_MainContent_btnDelete")
	private WebElement Field360EmployeesDeleteButton;
		
	@FindBy(id="ctl00_MainContent_btnMultipleRowDelete")
	private WebElement Field360EmployeesDeleteConfirmationButton;
		
	@FindBy(id="ctl00_MainContent_CancelButton")
	private WebElement Field360EmployeesDeleteCancelConfirmationButton;
		
	@FindBy(id="ctl00_MainContent_ddlPageSize")
	private WebElement Field360EmployeesPageShowRowsListBox;
	
	
	
	//Search Employee.......
	@FindBy(id="ctl00_MainContent_txtFilter")
	private WebElement Field360EmployeesSearchEmployeeTextBox;
		
	@FindBy(id="ctl00_MainContent_btnSearch")
	private WebElement Field360EmployeesSearchEmployeeButton;
	
/*
	//Update Employee......
	@FindBy(xpath="//td//div/a/span[text()='xyxyEmployee']")
	private WebElement selectExstngEmployee;
	
	
	//Update Employee Window.....
	@FindBy(xpath="//a[@id='__tab_ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit']")
	private WebElement updateEditLink;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_CompanyNameTextBox']")
	private WebElement updateCompanyNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtContactName']")
	private WebElement updateContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtFirstName']")
	private WebElement updateFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLastName']")
	private WebElement updateLastNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_PhoneTextBox']")
	private WebElement updatePhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ExtensionTextBox']")
	private WebElement updatePhoneExtTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_CellPhoneTextBox']")
	private WebElement updateCellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FaxTextBox']")
	private WebElement updateFaxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_EmailTextBox']")
	private WebElement updateEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_AddressTextBox']")
	private WebElement updateStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlCountries']")
	private WebElement updateCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlStates']")
	private WebElement updateStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlCities']")
	private WebElement updateCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ZipCodeTextBox']")
	private WebElement updateZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLongitude']")
	private WebElement updateLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLatitude']")
	private WebElement updateLatitudeTB;
	
	//Update - Add Contact button...
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_btnAddAdditionalContact']")
	private WebElement updateAddContactButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_NameTextBox']")
	private WebElement updateAddContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_PhoneTextBox']")
	private WebElement updateAddContactPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_EmailTextBox']")
	private WebElement updateAddContactEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_InsertButton']")
	private WebElement updateAddContactSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_InsertCancelButton']")
	private WebElement updateAddContactCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_LinkButton3']")
	private WebElement updateAddContactCloseIcon;
	
	
	//Update - Add Site button....
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_btnAddAddNewSite']")
	private WebElement updateAddSiteButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_NameTextBox']")
	private WebElement updateAddSiteLocationNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_Street1TextBox']")
	private WebElement updateAddSiteStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlCountries']")
	private WebElement updateAddSiteCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlStates']")
	private WebElement updateAddSiteStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlCities']")
	private WebElement updateAddSiteCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_ZipTextBox']")
	private WebElement updateAddSiteZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_txtLongitude']")
	private WebElement updateAddSiteLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_txtLatitude']")
	private WebElement updateAddSiteLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_InsertButton']")
	private WebElement updateAddSiteSaveButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton1']")
	private WebElement updateAddSiteCloseButton;
	
	
	
	
	//Update - Notes Link....
	
	@FindBy(xpath="//a[@id='__tab_ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit']")
	private WebElement updateExtEmpNotesLink;
	
	@FindBy(xpath="//textarea[@id='ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_txtNotes']")
	private WebElement updateNotesTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_UpdateButton']")
	private WebElement updateNotesSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_UpdateCancelButton']")
	private WebElement updateNotesCancelButton;
	
	
	
	//Update Existing Employee.....
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_UpdateButton']")
	private WebElement updateExtEmpSaveButton;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_UpdateCancelButton']")
	private WebElement updateExtEmpCancelButton;
	*/

		
	
	
	//Vendors Page....
	@FindBy(id="ctl00_ServiceModule1_pnlVendors")
	private WebElement Field360VendorsPage;
	
	//Add Vendor....
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement Field360VendorsAddVendorsButton;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_CompanyNameTextBox")
	private WebElement Field360VendorsAddVendorsCompanyNameTextBox;	
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_txtContactName")
	private WebElement Field360VendorsAddVendorsContactNameTextBox;	
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_txtFirstName")
	private WebElement Field360VendorsAddVendorsFirstNameTextBox;	
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_txtLastName")
	private WebElement Field360VendorsAddVendorsLastNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_PhoneTextBox")
	private WebElement Field360VendorsAddVendorsPhoneTextBox;	
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_ExtensionTextBox")
	private WebElement Field360VendorsAddVendorsPhoneExtensionTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_CellPhoneTextBox")
	private WebElement Field360VendorsAddVendorsCellPhoneTextBox;	
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_FaxTextBox")
	private WebElement Field360VendorsAddVendorsFaxTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_EmailTextBox")
	private WebElement Field360VendorsAddVendorsEmailTextBox;	
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_AddressTextBox")
	private WebElement Field360VendorsAddVendorsStreetTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_ddlCountries")
	private WebElement Field360VendorsAddVendorsCountryListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_ddlStates")
	private WebElement Field360VendorsAddVendorsStateListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_ddlCities")
	private WebElement Field360VendorsAddVendorsCityListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_ZipCodeTextBox")
	private WebElement Field360VendorsAddVendorsZipCodeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_txtLongitude")
	private WebElement Field360VendorsAddVendorsLongitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_txtLatitude")
	private WebElement Field360VendorsAddVendorsLatitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_InsertButton")
	private WebElement Field360VendorsAddVendorsSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewContactInsert_InsertCancelButton")
	private WebElement Field360VendorsAddVendorsCancelButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement Field360VendorsAddVendorsDoneButton;
	
	
	//Delete Vendor.......................
	@FindBy(id="ctl00_MainContent_btnDelete")
	private WebElement Field360VendorsDeleteButton;
	
	@FindBy(id="ctl00_MainContent_btnMultipleRowDelete")
	private WebElement Field360VendorsDeleteConfirmationButton;
	
	@FindBy(id="ctl00_MainContent_CancelButton")
	private WebElement Field360VendorsDeleteCancelConfirmationButton;
	
	@FindBy(id="ctl00_MainContent_ddlPageSize")
	private WebElement Field360VendorsPageShowRowsListBox;
	
	
	

	//Search Vendor.......
	@FindBy(id="ctl00_MainContent_txtFilter")
	private WebElement Field360VendorsSearchVendorTextBox;
		
	@FindBy(id="ctl00_MainContent_btnSearch")
	private WebElement Field360VendorsSearchVendorButton;
		
	
	
	

/*
	//Update Vendor......
	@FindBy(xpath="//td//div/a/span[text()='aaaVendor']")
	private WebElement selectExstngVendor;
	
	
	//Update Vendor Window.....
	@FindBy(xpath="//a[@id='__tab_ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit']")
	private WebElement updateEditLink;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_CompanyNameTextBox']")
	private WebElement updateCompanyNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtContactName']")
	private WebElement updateContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtFirstName']")
	private WebElement updateFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLastName']")
	private WebElement updateLastNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_PhoneTextBox']")
	private WebElement updatePhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ExtensionTextBox']")
	private WebElement updatePhoneExtTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_CellPhoneTextBox']")
	private WebElement updateCellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FaxTextBox']")
	private WebElement updateFaxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_EmailTextBox']")
	private WebElement updateEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_AddressTextBox']")
	private WebElement updateStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlCountries']")
	private WebElement updateCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlStates']")
	private WebElement updateStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ddlCities']")
	private WebElement updateCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_ZipCodeTextBox']")
	private WebElement updateZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLongitude']")
	private WebElement updateLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_txtLatitude']")
	private WebElement updateLatitudeTB;
	
	//Update - Add Contact button...
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_btnAddAdditionalContact']")
	private WebElement updateAddContactButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_NameTextBox']")
	private WebElement updateAddContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_PhoneTextBox']")
	private WebElement updateAddContactPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_EmailTextBox']")
	private WebElement updateAddContactEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_InsertButton']")
	private WebElement updateAddContactSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_FormView2_InsertCancelButton']")
	private WebElement updateAddContactCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_LinkButton3']")
	private WebElement updateAddContactCloseIcon;
	
	
	//Update - Add Site button....
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_btnAddAddNewSite']")
	private WebElement updateAddSiteButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_NameTextBox']")
	private WebElement updateAddSiteLocationNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_Street1TextBox']")
	private WebElement updateAddSiteStreetTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlCountries']")
	private WebElement updateAddSiteCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlStates']")
	private WebElement updateAddSiteStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewSites_ddlCities']")
	private WebElement updateAddSiteCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_ZipTextBox']")
	private WebElement updateAddSiteZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_txtLongitude']")
	private WebElement updateAddSiteLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_txtLatitude']")
	private WebElement updateAddSiteLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewSites_InsertButton']")
	private WebElement updateAddSiteSaveButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton1']")
	private WebElement updateAddSiteCloseButton;
	
	
	
	
	//Update - Notes Link....
	
	@FindBy(xpath="//a[@id='__tab_ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit']")
	private WebElement updateExtVendorNotesLink;
	
	@FindBy(xpath="//textarea[@id='ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_txtNotes']")
	private WebElement updateNotesTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_UpdateButton']")
	private WebElement updateNotesSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelNotesEdit_FormViewNotes_UpdateCancelButton']")
	private WebElement updateNotesCancelButton;
	
	
	
	//Update Existing Vendor.....
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_UpdateButton']")
	private WebElement updateExtVendorSaveButton;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_TabContainerEdit_TabPanelContactsEdit_FormViewContactsEdit_UpdateCancelButton']")
	private WebElement updateExtVendorCancelButton;
	
	*/
	
	
	
	//Quotes Page....
	@FindBy(id="ctl00_ServiceModule1_aQuotes")
	private WebElement Field360QuotesPage;
	
	//Add Quote....
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement Field360QuotesAddQuotesButton;

	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtService")
	private WebElement Field360QuotesAddQuotesJobNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_ddlQuoteStatus")
	private WebElement Field360QuotesAddQuotesJobStatusListBox;
	
	//client..
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_ddlClient")
	private WebElement Field360QuotesAddQuotesClientListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_btnFind")
	private WebElement Field360QuotesAddQuotesFindButton;	
	
	//find client window..........	
	@FindBy(id="ctl00_MainContent_btnSearchContact")
	private WebElement Field360QuotesAddQuotesFindSearchClientButton;
	
	@FindBy(id="ctl00_MainContent_GridViewFindCustomers_ctl02_btnSelectContact")
	private WebElement Field360QuotesAddQuotesFindSelectClientButton;
		
	@FindBy(id="ctl00_MainContent_LinkButton4")
	private WebElement Field360QuotesAddQuotesFindCloseButton;
	
	
	//Add Client window
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_btnAddContact")
	private WebElement Field360QuotesAddQuotesAddCustomerButton;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_CompanyNameTextBox")
	private WebElement Field360QuotesAddQuotesClientCompanyNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_txtContactName")
	private WebElement Field360QuotesAddQuotesClientContactNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_txtFirstName")
	private WebElement Field360QuotesAddQuotesClientFirstNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_txtLastName")
	private WebElement Field360QuotesAddQuotesClientLastNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_PhoneTextBox")
	private WebElement Field360QuotesAddQuotesClientPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_ExtensionTextBox")
	private WebElement Field360QuotesAddQuotesClientPhoneExtensionTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_CellPhoneTextBox")
	private WebElement Field360QuotesAddQuotesClientCellPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_FaxTextBox")
	private WebElement Field360QuotesAddQuotesClientFaxTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_EmailTextBox")
	private WebElement Field360QuotesAddQuotesClientEmailTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_AddressTextBox")
	private WebElement Field360QuotesAddQuotesClientStreetTextBox;
	
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_ddlCountries")
	private WebElement Field360QuotesAddQuotesClientCountryListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_ddlStates")
	private WebElement Field360QuotesAddQuotesClientStateListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_ddlCities")
	private WebElement Field360QuotesAddQuotesClientCityListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_ZipCodeTextBox")
	private WebElement Field360QuotesAddQuotesClientZipCodeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_txtLongitude")
	private WebElement Field360QuotesAddQuotesClientLongitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_txtLatitude")
	private WebElement Field360QuotesAddQuotesClientLatitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_InsertButton")
	private WebElement Field360QuotesAddQuotesClientSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_InsertCancelButton")
	private WebElement Field360QuotesAddQuotesClientCancelButton;
	
	@FindBy(id="ctl00_MainContent_LinkButton6")
	private WebElement Field360QuotesAddQuotesClientCloseButton;
	
	
	
	//View Client Button...................
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_btnView")
	private WebElement Field360QuotesAddQuotesViewCustButton;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_CompanyNameTextBox")
	private WebElement Field360QuotesAddQuotesViewCompNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_txtContactName")
	private WebElement Field360QuotesAddQuotesViewContactNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_txtFirstName")
	private WebElement Field360QuotesAddQuotesViewFirstNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_txtLastName")
	private WebElement Field360QuotesAddQuotesViewLastNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_PhoneTextBox")
	private WebElement Field360QuotesAddQuotesViewPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_ExtensionTextBox")
	private WebElement Field360QuotesAddQuotesViewPhoneExtensionTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_CellPhoneTextBox")
	private WebElement Field360QuotesAddQuotesViewCellPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_FaxTextBox")
	private WebElement Field360QuotesAddQuotesViewFaxTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_EmailTextBox")
	private WebElement Field360QuotesAddQuotesViewEmailTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_AddressTextBox")
	private WebElement Field360QuotesAddQuotesViewStreetTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_ddlCountries")
	private WebElement Field360QuotesAddQuotesViewCountryListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_ddlStates")
	private WebElement Field360QuotesAddQuotesViewStateListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_ddlCities")
	private WebElement Field360QuotesAddQuotesViewCityListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_ZipCodeTextBox")
	private WebElement Field360QuotesAddQuotesViewZipCodeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_txtLongitude")
	private WebElement Field360QuotesAddQuotesViewLongitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_txtLatitude")
	private WebElement Field360QuotesAddQuotesViewLatitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_UpdateButton")
	private WebElement Field360QuotesAddQuotesViewSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_UpdateCancelButton")
	private WebElement Field360QuotesAddQuotesViewCancelButton;
	
	@FindBy(id="ctl00_MainContent_LinkButton6")
	private WebElement Field360QuotesAddQuotesViewCloseButton;
	
	
	
	
	
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtCompanyName")
	private WebElement Field360QuotesAddQuotesCompanyNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtFirstName")
	private WebElement Field360QuotesAddQuotesFirstNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtLastName")
	private WebElement Field360QuotesAddQuotesLastNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtEmail")
	private WebElement Field360QuotesAddQuotesEmailTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_PhoneTextBox")
	private WebElement Field360QuotesAddQuotesPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_CellPhoneTextBox")
	private WebElement Field360QuotesAddQuotesCellPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_FaxTextBox")
	private WebElement Field360QuotesAddQuotesFaxTextBox;
	
	
	
	
	//Location...........
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_ddlSelectSite")
	private WebElement Field360QuotesAddQuotesSiteListBox;
	
	
	//Add Site Button
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_btnAddAddSite")
	private WebElement Field360QuotesAddQuotesAddSiteButton;
	
	//Additional Site Window.....
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_NameTextBox")
	private WebElement Field360QuotesAddQuotesAddSiteLocationNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_Street1TextBox")
	private WebElement Field360QuotesAddQuotesAddSiteStreetTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_ddlCountries")
	private WebElement Field360QuotesAddQuotesAddSiteCountryListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_ddlStates")
	private WebElement Field360QuotesAddQuotesAddSiteStateListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_ddlCities")
	private WebElement Field360QuotesAddQuotesAddSiteCityListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_ZipTextBox")
	private WebElement Field360QuotesAddQuotesAddSiteZipCodeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_txtLongitude")
	private WebElement Field360QuotesAddQuotesAddSiteLongitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_txtLatitude")
	private WebElement Field360QuotesAddQuotesAddSiteLatitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_InsertButton")
	private WebElement Field360QuotesAddQuotesAddSiteSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_InsertCancelButton")
	private WebElement Field360QuotesAddQuotesAddSiteCancelButton;
	
	@FindBy(id="ctl00_MainContent_LinkButton1")
	private WebElement Field360QuotesAddQuotesAddSiteCloseButton;
	
	
	
	//View Site Button........
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_btnViewSite")
	private WebElement Field360QuotesAddQuotesViewSiteButton;
	
	
	
	
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtSite")
	private WebElement Field360QuotesAddQuotesSiteNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtStreet")
	private WebElement Field360QuotesAddQuotesStreetTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtCity")
	private WebElement Field360QuotesAddQuotesCityTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtState")
	private WebElement Field360QuotesAddQuotesStateTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtZip")
	private WebElement Field360QuotesAddQuotesZipCodeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtCountry")
	private WebElement Field360QuotesAddQuotesCountryTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtLatitude")
	private WebElement Field360QuotesAddQuotesLatitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtLongitude")
	private WebElement Field360QuotesAddQuotesLongitudeTextBox;
	
	
	
	
	//Additional Contact Information..........
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_ddlAdditionalContacts")
	private WebElement Field360QuotesAddQuotesAdditionalContactInformationContactListBox;
	
	//ACI - Add Additional Contact Button......
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_btnAddAdditionalContact")
	private WebElement Field360QuotesAddQuotesAdditionalContactInformationAddContactButton;
	
	//ACI - Additional Contact Window......
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsInsert_NameTextBox")
	private WebElement Field360QuotesAddQuotesAdditionalContactInformationAddContactNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsInsert_PhoneTextBox")
	private WebElement Field360QuotesAddQuotesAdditionalContactInformationAddContactPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsInsert_EmailTextBox")
	private WebElement Field360QuotesAddQuotesAdditionalContactInformationAddContactEmailTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsInsert_InsertButton")
	private WebElement Field360QuotesAddQuotesAdditionalContactInformationAddContactSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsInsert_InsertCancelButton")
	private WebElement Field360QuotesAddQuotesAdditionalContactInformationAddContactCancelButton;
	
	@FindBy(id="ctl00_MainContent_LinkButton3")
	private WebElement Field360QuotesAddQuotesAdditionalContactInformationAddContactCloseTextBox;
	
	
	
	//ACI - View Button	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_btnViewAdditionalContact")
	private WebElement Field360QuotesAddQuotesAdditionalContactInformationViewButton;
		
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtContact")
	private WebElement Field360QuotesAddQuotesAdditionalContactInformationContactNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_AdditionalContactPhoneTextBox")
	private WebElement Field360QuotesAddQuotesAdditionalContactInformationPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_AdditionalContactEmailTextBox")
	private WebElement Field360QuotesAddQuotesAdditionalContactInformationEmailTextBox;
		
	//Appointment Info...	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_IsScheduled")
	private WebElement Field360QuotesAddQuotesAppointmentInformationCheckBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_dtpQuoteStartDate_dateInput")
	private WebElement Field360QuotesAddQuotesAppointmentInformationStartTimeTextBox;
		
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_dtpQuoteStartDate_popupButton")
	private WebElement Field360QuotesAddQuotesAppointmentInformationStartDateButton;
	
	//xpath to Select Start Date as 20 December 2016.....
	@FindBy(xpath="//table[@id='ctl00_MainContent_FormViewNewQuote_dtpQuoteStartDate_calendar_Top']//a[contains(text(),'20')]")
	private WebElement Field360QuotesAddQuotesAppointmentInformationStartDateSelectButton;
		
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_dtpQuoteStartDate_timePopupLink")
	private WebElement Field360QuotesAddQuotesAppointmentInformationStartTimeButton;
	
	//xpath to Select Start Time as 10:30am .....
	@FindBy(xpath="//table[contains(@id,'StartDate_timeView_tdl')]/tbody/tr/td/div[contains(text(),'10:00 AM')]")
	private WebElement Field360QuotesAddQuotesAppointmentInformationStartTimeSelectButton;
		
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_dtpQuoteFinishDate_dateInput")
	private WebElement Field360QuotesAddQuotesAppointmentInformationFinishTimeTextBox;
		
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_dtpQuoteFinishDate_popupButton")
	private WebElement Field360QuotesAddQuotesAppointmentInformationFinishDateButton;
	
	//xpath to Select Finish Date as 26 December 2016.....
	@FindBy(xpath="//table[@id='ctl00_MainContent_FormViewNewQuote_dtpQuoteFinishDate_calendar_Top']//a[contains(text(),'26')]")
	private WebElement Field360QuotesAddQuotesAppointmentInformationFinishDateSelectButton;	
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_dtpQuoteFinishDate_timePopupLink")
	private WebElement Field360QuotesAddQuotesAppointmentInformationFinishTimeButton;
	
	//xpath to Select Finish Time as 4:00pm .....
	@FindBy(xpath="//table[contains(@id,'FinishDate_timeView_tdl')]/tbody/tr/td/div[contains(text(),'4:00 PM')]")
	private WebElement Field360QuotesAddQuotesAppointmentInformationFinishTimeSelectButton;	
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_txtServiceDetails")
	private WebElement Field360QuotesAddQuotesAppointmentInformationJobDetailsTextBox;
	
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_InsertButton")
	private WebElement Field360QuotesAddQuotesSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_InsertCancelButton")
	private WebElement Field360QuotesAddQuotesCancelButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement Field360QuotesAddQuotesDoneButton;
	
	@FindBy(id="ctl00_MainContent_btnCreateJob")
	private WebElement Field360QuotesCreateJobButton;
	
	
	
	
	//Jobs Page....
	@FindBy(id="ctl00_ServiceModule1_aJobs")
	private WebElement Field360JobsPage;
	
	//Add Job....
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement Field360JobsAddJobButton;	
		
	//Customer....	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_ddlClient")
	private WebElement Field360JobsAddJobClientListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_btnFind")
	private WebElement Field360JobsAddJobFindCustomerButton;	
	
	//find client window..........	
	@FindBy(id="ctl00_MainContent_btnSearchContact")
	private WebElement Field360JobsAddJobFindCustomerSearchClientButton;
	
	@FindBy(id="ctl00_MainContent_GridViewFindCustomers_ctl02_btnSelectContact")
	private WebElement Field360JobsAddJobFindCustomerSelectClientButton;
	
	@FindBy(id="ctl00_MainContent_LinkButton4")
	private WebElement Field360JobsAddJobFindCustomerCloseButton;	
	
	//Add Client window
	@FindBy(id="ctl00_MainContent_FormViewNewJob_btnAddContact")
	private WebElement Field360JobsAddJobAddCustomerButton;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_CompanyNameTextBox")
	private WebElement Field360JobsAddJobAddCustomerClientCompanyNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_txtContactName")
	private WebElement Field360JobsAddJobAddCustomerClientContactNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_txtFirstName")
	private WebElement Field360JobsAddJobAddCustomerClientFirstNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_txtLastName")
	private WebElement Field360JobsAddJobAddCustomerClientLastNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_PhoneTextBox")
	private WebElement Field360JobsAddJobAddCustomerClientPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_ExtensionTextBox")
	private WebElement Field360JobsAddJobAddCustomerClientPhoneExtensionTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_CellPhoneTextBox")
	private WebElement Field360JobsAddJobAddCustomerClientCellPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_FaxTextBox")
	private WebElement Field360JobsAddJobAddCustomerClientFaxTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_EmailTextBox")
	private WebElement Field360JobsAddJobAddCustomerClientEmailTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_AddressTextBox")
	private WebElement Field360JobsAddJobAddCustomerClientStreetTextBox;
	
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_ddlCountries")
	private WebElement Field360JobsAddJobAddCustomerClientCountryListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_ddlStates")
	private WebElement Field360JobsAddJobAddCustomerClientStateListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_ddlCities")
	private WebElement Field360JobsAddJobAddCustomerClientCityListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_ZipCodeTextBox")
	private WebElement Field360JobsAddJobAddCustomerClientZipCodeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_txtLongitude")
	private WebElement Field360JobsAddJobAddCustomerClientLongitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_txtLatitude")
	private WebElement Field360JobsAddJobAddCustomerClientLatitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_InsertButton")
	private WebElement Field360JobsAddJobAddCustomerClientSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsInsert_InsertCancelButton")
	private WebElement Field360JobsAddJobAddCustomerClientCancelButton;
	
	@FindBy(id="ctl00_MainContent_LinkButton6")
	private WebElement Field360JobsAddJobAddCustomerClientCloseButton;
		
	//View Client Button...................	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_btnView")
	private WebElement Field360JobsAddJobCustomerViewCustomerButton;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_CompanyNameTextBox")
	private WebElement Field360JobsAddJobCustomerViewCompanyNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_txtContactName")
	private WebElement Field360JobsAddJobCustomerViewContactNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_txtFirstName")
	private WebElement Field360JobsAddJobCustomerViewFirstNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_txtLastName")
	private WebElement Field360JobsAddJobCustomerViewLastNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_PhoneTextBox")
	private WebElement Field360JobsAddJobCustomerViewPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_ExtensionTextBox")
	private WebElement Field360JobsAddJobCustomerViewPhoneExtensionTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_CellPhoneTextBox")
	private WebElement Field360JobsAddJobCustomerViewCellPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_FaxTextBox")
	private WebElement Field360JobsAddJobCustomerViewFaxTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_EmailTextBox")
	private WebElement Field360JobsAddJobCustomerViewEmailTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_AddressTextBox")
	private WebElement Field360JobsAddJobCustomerViewStreetTextBox;
	
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_ddlCountries")
	private WebElement Field360JobsAddJobCustomerViewCountryListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_ddlStates")
	private WebElement Field360JobsAddJobCustomerViewStateListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_ddlCities")
	private WebElement Field360JobsAddJobCustomerViewCityListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_ZipCodeTextBox")
	private WebElement Field360JobsAddJobCustomerViewZipCodeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_txtLongitude")
	private WebElement Field360JobsAddJobCustomerViewLongitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_txtLatitude")
	private WebElement Field360JobsAddJobCustomerViewLatitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_UpdateButton")
	private WebElement Field360JobsAddJobCustomerViewSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewContactsEdit_UpdateCancelButton")
	private WebElement Field360JobsAddJobCustomerViewCancelButton;
	
	@FindBy(id="ctl00_MainContent_LinkButton6")
	private WebElement Field360JobsAddJobCustomerViewCloseButton;
	
	//Contact.......	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_txtCompanyName")
	private WebElement Field360JobsAddJobContactCompanyNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_txtFirstName")
	private WebElement Field360JobsAddJobContactFirstNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_txtLastName")
	private WebElement Field360JobsAddJobContactLastNameTextBox;
	
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_EmailTextBox")
	private WebElement Field360JobsAddJobContactEmailTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_PhoneTextBox")
	private WebElement Field360JobsAddJobContactPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_ExtensionTextBox")
	private WebElement Field360JobsAddJobContactPhoneExtensionTextBox;
	
	//Job.........	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_txtService")
	private WebElement Field360JobsAddJobJobNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_ddlJobStatus")
	private WebElement Field360JobsAddJobJobStatusListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_cbNotifyCustomer")
	private WebElement Field360JobsAddJobJobNotifyCustomerCheckBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_ddlNotificationStatus")
	private WebElement Field360JobsAddJobJobNotificationListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_ddlPriority")
	private WebElement Field360JobsAddJobJobPriorityListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_ServiceDetailTextBox")
	private WebElement Field360JobsAddJobJobDescriptionTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_SpecialInstructionsTextBox")
	private WebElement Field360JobsAddJobJobServiceSpecialTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_CompletionNotesTextBox")
	private WebElement Field360JobsAddJobJobCompletionNotesTextBox;
	
	//Location...........	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_ddlSelectSite")
	private WebElement Field360JobsAddJobSiteListBox;
	
	//Add Site Button.........	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_btnAddAddSite")
	private WebElement Field360JobsAddJobAddSiteButton;
	
	//Additional Site Window.......
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_NameTextBox")
	private WebElement Field360JobsAddJobAddSiteLocationNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_Street1TextBox")
	private WebElement Field360JobsAddJobAddSiteStreetTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_ddlCountries")
	private WebElement Field360JobsAddJobAddSiteCountryListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_ddlStates")
	private WebElement Field360JobsAddJobAddSiteStateListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_ddlCities")
	private WebElement Field360JobsAddJobAddSiteCityListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_ZipTextBox")
	private WebElement Field360JobsAddJobAddSiteZipCodeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_txtLongitude")
	private WebElement Field360JobsAddJobAddSiteLongitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_txtLatitude")
	private WebElement addSiteLatitudeTB;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_InsertButton")
	private WebElement Field360JobsAddJobAddSiteSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalSitesInsert_InsertCancelButton")
	private WebElement Field360JobsAddJobAddSiteCancelButton;
	
	@FindBy(id="ctl00_MainContent_LinkButton1")
	private WebElement Field360JobsAddJobAddSiteCloseButton;
	
	//View Site Button........	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_btnViewSite")
	private WebElement Field360JobsAddJobViewSiteButton;
		
	@FindBy(id="ctl00_MainContent_FormViewNewJob_Street1TextBox")
	private WebElement Field360JobsAddJobStreetTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_CityTextBox")
	private WebElement Field360JobsAddJobCityTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_StateTextBox")
	private WebElement Field360JobsAddJobStateTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_ZipTextBox")
	private WebElement Field360JobsAddJobZipCodeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_CountryTextBox")
	private WebElement Field360JobsAddJobCountryTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_LatitudeTextBox")
	private WebElement Field360JobsAddJobLatitudeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_LongitudeTextBox")
	private WebElement Field360JobsAddJobLongitudeTextBox;
		
	//Additional Contact..........	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_ddlAdditionalContacts")
	private WebElement Field360JobsAddJobAdditionalContactInformationContactListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_txtAdditionalContact")
	private WebElement Field360JobsAddJobAdditionalContactInformationContactNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_AdditionalContactPhoneTextBox")
	private WebElement Field360JobsAddJobAdditionalContactInformationPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_AdditionalContactEmailTextBox")
	private WebElement Field360JobsAddJobAdditionalContactInformationEmailTextBox;
		
	//ACI - Add Additional Contact Button......	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_btnAddAdditionalContact")
	private WebElement Field360JobsAddJobAdditionalContactInformationAddContactButton;
	
	//ACI - Additional Contact Window......	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsInsert_NameTextBox")
	private WebElement Field360JobsAddJobAdditionalContactInformationAddContactNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsInsert_PhoneTextBox")
	private WebElement Field360JobsAddJobAdditionalContactInformationAddContactPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsInsert_EmailTextBox")
	private WebElement Field360JobsAddJobAdditionalContactInformationAddContactEmailTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsInsert_InsertButton")
	private WebElement Field360JobsAddJobAdditionalContactInformationAddContactSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsInsert_InsertCancelButton")
	private WebElement Field360JobsAddJobAdditionalContactInformationAddContactCancelButton;
	
	@FindBy(id="ctl00_MainContent_LinkButton3")
	private WebElement Field360JobsAddJobAdditionalContactInformationAddContactCloseTextBox;
		
	//ACI - View Button.....	
	@FindBy(id="ctl00_MainContent_FormViewNewQuote_btnViewAdditionalContact")
	private WebElement Field360JobsAddJobAdditionalContactInformationViewButton;
	
	//AC - View Additional Contact Window....	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsEdit_NameTextBox")
	private WebElement Field360JobsAddJobAdditionalContactInformationViewContactNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsEdit_PhoneTextBox")
	private WebElement Field360JobsAddJobAdditionalContactInformationViewPhoneTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsEdit_EmailTextBox")
	private WebElement Field360JobsAddJobAdditionalContactInformationViewEmailTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsEdit_UpdateButton")
	private WebElement Field360JobsAddJobAdditionalContactInformationViewSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewAdditionalContactsEdit_UpdateCancelButton")
	private WebElement Field360JobsAddJobAdditionalContactInformationViewCancelButton;
	
	@FindBy(id="ctl00_MainContent_LinkButton3")
	private WebElement Field360JobsAddJobAdditionalContactInformationViewCloseButton;
		
	//Appointment Info...	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_IsScheduled")
	private WebElement Field360JobsAddJobAppointmentInformationAddtoScheduleCheckBox;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_dtpStartDate_dateInput")
	private WebElement Field360JobsAddJobAppointmentInformationStartTimeTextBox;
		
	@FindBy(id="ctl00_MainContent_FormViewNewJob_dtpStartDate_popupButton")
	private WebElement Field360JobsAddJobAppointmentInformationStartDateButton;
	
	//xpath to Select Start Date as 20 December 2016.....
	@FindBy(xpath="//table[@id='ctl00_MainContent_FormViewNewJob_dtpStartDate_calendar_Top']//a[contains(text(),20)]")
	private WebElement Field360JobsAddJobAppointmentInformationStartDateSelectButton;
		
	@FindBy(id="ctl00_MainContent_FormViewNewJob_dtpStartDate_timePopupLink")
	private WebElement Field360JobsAddJobAppointmentInformationStartTimeButton;
	
	//xpath to Select Start Time as 10:30am .....
	@FindBy(xpath="//table[contains(@id,'StartDate_timeView_tdl')]/tbody/tr/td/div[contains(text(),'10:00 AM')]")
	private WebElement Field360JobsAddJobAppointmentInformationStartTimeSelectButton;
	
	//Finish Time ..
	@FindBy(id="ctl00_MainContent_FormViewNewJob_dtpFinishDate_dateInput")
	private WebElement Field360JobsAddJobAppointmentInformationFinishTimeTextBox;
		
	@FindBy(id="ctl00_MainContent_FormViewNewJob_dtpFinishDate_popupButton")
	private WebElement Field360JobsAddJobAppointmentInformationFinishDateButton;
	
	//xpath to Select Finish Date as 26 December 2016.....
	@FindBy(xpath="//table[@id='ctl00_MainContent_FormViewNewJob_dtpFinishDate_calendar_Top']//a[contains(text(),26)]")
	private WebElement Field360JobsAddJobAppointmentInformationFinishDateSelectButton;
			
	@FindBy(id="ctl00_MainContent_FormViewNewJob_dtpFinishDate_timePopupLink")
	private WebElement Field360JobsAddJobAppointmentInformationFinishTimeButton;
	
	//xpath to Select Finish Time as 4:00pm .....
	@FindBy(xpath="//table[contains(@id,'FinishDate_timeView_tdl')]/tbody/tr/td/div[contains(text(),'4:00 PM')]")
	private WebElement Field360JobsAddJobAppointmentInformationFinishTimeSelectButton;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_InsertButton")
	private WebElement Field360JobsAddJobSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewNewJob_InsertCancelButton")
	private WebElement Field360JobsAddJobCancelButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement Field360JobsAddJobDoneButton;
		
	//Delete job......	
	@FindBy(xpath="//span[contains(text(),'aaaaNewCustomer12')]/../../preceding-sibling::td[last()]/input")
	private WebElement Field360JobsExistingJobCheckBox;
	
	@FindBy(id="ctl00_MainContent_btnDelete")
	private WebElement Field360JobsDeleteButton;
	
	@FindBy(id="ctl00_MainContent_btnMultipleRowDelete")
	private WebElement Field360JobsDeleteConfirmationButton;
	
	@FindBy(id="ctl00_MainContent_CancelButton")
	private WebElement Field360JobsDeleteCancelConfirmationButton;
	
	@FindBy(id="ctl00_MainContent_ddlPageSize")
	private WebElement Field360JobsShowRowsListBox;
	
	//Search Employee.......
	@FindBy(id="ctl00_MainContent_txtFilter")
	private WebElement Field360JobsSearchJobTextBox;
		
	@FindBy(id="ctl00_MainContent_btnSearch")
	private WebElement Field360JobsSearchJobButton;
	
	/*
	//Update Job........
	@FindBy(xpath="//span[text()='aaaJob']")
	private WebElement selectExstngJob;
		
	//Jobs Page........
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnJobs']")
	private WebElement updateJobsPage;
		
	//client..
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewJob_ddlClient']")
	private WebElement updateJobClientLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_btnFind']")
	private WebElement updateJobFindButton;
	
	//find client window..........
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearchContact']")
	private WebElement updateJobFindSearchClientButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_GridViewFindCustomers_ctl02_btnSelectContact']")
	private WebElement updateJobFindSelectClientButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton4']")
	private WebElement updateJobFindCloseButton;
	
	//Add Client window...
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_btnAddContact']")
	private WebElement updateJobAddCustButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_CompanyNameTextBox']")
	private WebElement updateJobClientCompNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_txtContactName']")
	private WebElement updateJobClientContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_txtFirstName']")
	private WebElement updateJobClientFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_txtLastName']")
	private WebElement updateJobClientLastNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_PhoneTextBox']")
	private WebElement updateJobClientPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_ExtensionTextBox']")
	private WebElement updateJobClientPhoneExtnsnTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_CellPhoneTextBox']")
	private WebElement updateJobClientCellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_FaxTextBox']")
	private WebElement updateJobClientFaxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_EmailTextBox']")
	private WebElement updateJobClientEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_AddressTextBox']")
	private WebElement updateJobClientStreetTB;
	
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactsInsert_ddlCountries']")
	private WebElement updateJobClientCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactsInsert_ddlStates']")
	private WebElement updateJobClientStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactsInsert_ddlCities']")
	private WebElement updateJobClientCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_ZipCodeTextBox']")
	private WebElement updateJobClientZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_txtLongitude']")
	private WebElement updateJobClientLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_txtLatitude']")
	private WebElement updateJobClientLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_InsertButton']")
	private WebElement updateJobClientSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsInsert_InsertCancelButton']")
	private WebElement updateJobClientCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton6']")
	private WebElement updateJobClientCloseButton;
	
	//View Client Button...................	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_btnView']")
	private WebElement UpdateJobsViewCustButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_CompanyNameTextBox']")
	private WebElement UpdateJobsViewCompNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtContactName']")
	private WebElement UpdateJobsViewContactNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtFirstName']")
	private WebElement UpdateJobsViewFirstNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtLastName']")
	private WebElement UpdateJobsViewLastNameTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_PhoneTextBox']")
	private WebElement UpdateJobsViewPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_ExtensionTextBox']")
	private WebElement UpdateJobsViewPhoneExtnsnTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_CellPhoneTextBox']")
	private WebElement UpdateJobsViewCellPhoneTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_FaxTextBox']")
	private WebElement UpdateJobsViewFaxTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_EmailTextBox']")
	private WebElement UpdateJobsViewEmailTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_AddressTextBox']")
	private WebElement UpdateJobsViewStreetTB;
	
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactsEdit_ddlCountries']")
	private WebElement UpdateJobsViewCountryLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactsEdit_ddlStates']")
	private WebElement UpdateJobsViewStateLB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewContactsEdit_ddlCities']")
	private WebElement UpdateJobsViewCityLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_ZipCodeTextBox']")
	private WebElement UpdateJobsViewZipCodeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtLongitude']")
	private WebElement UpdateJobsViewLongitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_txtLatitude']")
	private WebElement UpdateJobsViewLatitudeTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_UpdateButton']")
	private WebElement UpdateJobsViewSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewContactsEdit_UpdateCancelButton']")
	private WebElement UpdateJobsViewCancelButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton6']")
	private WebElement UpdateJobsViewCloseButton;
	
	
	//Contact.......	
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_txtCompanyName']")
		private WebElement UpdateJobsCompanyNameTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_txtFirstName']")
		private WebElement UpdateJobsFirstNameTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_txtLastName']")
		private WebElement UpdateJobsLastNameTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_PhoneTextBox']")
		private WebElement UpdateJobsPhoneTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_ExtensionTextBox']")
		private WebElement UpdateJobsPhoneExtnsnTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_EmailTextBox']")
		private WebElement UpdateJobsEmailTB;
						
		//Job.....		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_txtService']")
		private WebElement updateJobNameTB;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewJob_ddlJobStatus']")
		private WebElement updateJobStatusLB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_cbNotifyCustomer']")
		private WebElement updateJobNotifyCustChkbox;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewJob_ddlNotificationStatus']")
		private WebElement updateJobNotificationLB;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewJob_ddlPriority']")
		private WebElement updateJobPriorityLB;
		
		@FindBy(xpath="//textarea[@id='ctl00_MainContent_FormViewJob_ServiceDetailTextBox']")
		private WebElement updateJobDescriptionTB;
		
		@FindBy(xpath="//textarea[@id='ctl00_MainContent_FormViewJob_SpecialInstructionsTextBox']")
		private WebElement updateJobServiceSpecialTB;
		
		@FindBy(xpath="//textarea[@id='ctl00_MainContent_FormViewJob_CompletionNotesTextBox']")
		private WebElement updateJobCompletionNotesTB;
		
		//Additional Contact..........		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewJob_ddlAdditionalContacts']")
		private WebElement updateJobAciContactLB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_txtAdditionalContact']")
		private WebElement updateJobAciContactNameTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_AdditionalContactPhoneTextBox']")
		private WebElement updateJobAciPhoneTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_AdditionalContactEmailTextBox']")
		private WebElement updateJobAciEmailTB;
		
		//ACI - Add Additional Contact Button......		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_btnAddAdditionalContact']")
		private WebElement updateJobAciAddContactButton;
		
		//ACI - Additional Contact Window......		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsInsert_NameTextBox']")
		private WebElement updateJobAciAddContactNameTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsInsert_PhoneTextBox']")
		private WebElement updateJobAciAddContactPhoneTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsInsert_EmailTextBox']")
		private WebElement updateJobAciAddContactEmailTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsInsert_InsertButton']")
		private WebElement updateJobAciAddContactSaveButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsInsert_InsertCancelButton']")
		private WebElement updateJobAciAddContactCancelButton;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton3']")
		private WebElement updateJobAciAddContactCloseTB;
				
		//ACI - View Button....		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_btnViewAdditionalContact']")
		private WebElement updateJobAciViewButton;
		
		//AC - View Additional Contact Window....		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsEdit_NameTextBox']")
		private WebElement updateJobAciViewContactNameTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsEdit_PhoneTextBox']")
		private WebElement updateJobAciViewPhoneTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalContactsEdit_EmailTextBox']")
		private WebElement updateJobAciViewEmailTB;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewAdditionalContactsEdit_UpdateButton']")
		private WebElement updateJobAciViewSaveButton;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewAdditionalContactsEdit_UpdateCancelButton']")
		private WebElement updateJobAciViewCancelButton;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton3']")
		private WebElement updateJobAciViewCloseButton;
		
		//Appointment Info......
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_IsScheduled']")
		private WebElement updateJobAppInfoAddtoScheduleCheckBox;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_dtpStartDate_dateInput']")
		private WebElement updateJobAppInfoStartTimeTB;
			
		@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewJob_dtpStartDate_popupButton']")
		private WebElement updateJobAppInfoStartDateButton;
		
		//xpath to Select Start Date as 22 December 2016.....
		@FindBy(xpath="//table[@id='ctl00_MainContent_FormViewJob_dtpStartDate_calendar_Top']//a[contains(text(),19)]")
		private WebElement updateJobAppInfoStartDateSelectButton;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewJob_dtpStartDate_timePopupLink']")
		private WebElement updateJobAppInfoStartTimeButton;
		
		//xpath to Select Start Time as 10:00am .....
		@FindBy(xpath="//table[contains(@id,'StartDate_timeView_tdl')]/tbody/tr/td/div[contains(text(),'10:00 AM')]")
		private WebElement updateJobAppInfoStartTimeSelectButton;
						
		//Finish Time ..
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_dtpFinishDate_dateInput']")
		private WebElement updateJobAppInfoFinishTimeTB;
			
		@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewJob_dtpFinishDate_popupButton']")
		private WebElement updateJobAppInfoFinishDateButton;
		
		//xpath to Select Finish Date as 28 December 2016.....
		@FindBy(xpath="//table[@id='ctl00_MainContent_FormViewJob_dtpFinishDate_calendar_Top']//td[@title='Wednesday, December 28, 2016']")
		private WebElement updateJobAppInfoFinishDateSelectButton;
						
		@FindBy(xpath="//a[@id='ctl00_MainContent_FormViewJob_dtpFinishDate_timePopupLink']")
		private WebElement updateJobAppInfoFinishTimeButton;
		
		//xpath to Select Finish Time as 4:00pm .....
		@FindBy(xpath="//table[contains(@id,'FinishDate_timeView_tdl')]/tbody/tr/td/div[contains(text(),'2:00 PM')]")
		private WebElement updateJobAppInfoFinishTimeSelectButton;
				
		//Location...........		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewJob_ddlSelectSite']")
		private WebElement updateJobSiteLB;
				
		//Add Site Button.....		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_btnAddAddSite']")
		private WebElement updateJobAddSiteButton;
		
		//Additional Site Window.....		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_NameTextBox']")
		private WebElement updateJobAddSiteLocationNameTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_Street1TextBox']")
		private WebElement updateJobAddSiteStreetTB;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_ddlCountries']")
		private WebElement updateJobAddSiteCountryLB;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_ddlStates']")
		private WebElement updateJobAddSiteStateLB;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_ddlCities']")
		private WebElement updateJobAddSiteCityLB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_ZipTextBox']")
		private WebElement updateJobAddSiteZipCodeTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_txtLongitude']")
		private WebElement updateJobAddSiteLongitudeTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_txtLatitude']")
		private WebElement updateJobAddSiteLatitudeTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_InsertButton']")
		private WebElement updateJobAddSiteSaveButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewAdditionalSitesInsert_InsertCancelButton']")
		private WebElement updateJobAddSiteCancelButton;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton1']")
		private WebElement updateJobAddSiteCloseButton;
						
		//View Site Button........		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_btnViewSite']")
		private WebElement updateJobViewSiteButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_Street1TextBox']")
		private WebElement updateJobstreetTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_CityTextBox']")
		private WebElement updateJobcityTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_StateTextBox']")
		private WebElement updateJobstateTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_ZipTextBox']")
		private WebElement updateJobzipCodeTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_CountryTextBox']")
		private WebElement updateJobcountryTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_LatitudeTextBox']")
		private WebElement updateJoblatitudeTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_LongitudeTextBox']")
		private WebElement updateJoblongitudeTB;

		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_InsertButton']")
		private WebElement updateJobViewSiteSaveButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_InsertCancelButton']")
		private WebElement updateJobViewSiteCancelButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
		private WebElement updateJobDoneButton;
		
		//Jobs Page - Save and Cancel Button...		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_UpdateButton']")
		private WebElement updateJobSaveButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewJob_UpdateCancelButton']")
		private WebElement updateJobCancelButton;

		//Update - Tasks Page....		
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnTasks']")
		private WebElement updateJobTasksPage;
		
		//Add Task Button....
		@FindBy(xpath="//input[@id='ctl00_MainContent_TasksControl1_btnAddNewTask']")
		private WebElement updateTasksAddTaskButton;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_ddlNotificationStatus']")
		private WebElement updateTasksNotificationLB;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_ddlPriority']")
		private WebElement updateTasksPriorityLB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_txtService']")
		private WebElement updateTasksTaskTB;
		
		@FindBy(xpath="//textarea[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_txtServiceDetails']")
		private WebElement updateTasksDescriptionTB;
		
		@FindBy(xpath="//textarea[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_txtSpecialInstructions']")
		private WebElement updateTasksServiceSpecialTB;
		
		@FindBy(xpath="//textarea[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_txtCompletionNotes']")
		private WebElement updateTasksCompletionNotesTB;
		
		
		//Update Tasks - Appointment Info......		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_IsScheduled']")
		private WebElement updateTasksAppInfoChkbox;
		
		@FindBy(xpath="//select[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_ddlAssignedTo']")
		private WebElement updateTasksAppInfoAssignedToLB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_dtpTaskStartDate_dateInput']")
		private WebElement updateTasksAppInfoStartTimeTB;
			
		@FindBy(xpath="//a[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_dtpTaskStartDate_popupButton']")
		private WebElement updateTasksAppInfoStartDateButton;
		
		//xpath to Select Start Date as 19 December 2016.....
		@FindBy(xpath="//table[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_dtpTaskStartDate_calendar_Top']//a[contains(text(),19)]")
		private WebElement updateTasksAppInfoStartDateSelectButton;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_dtpTaskStartDate_timePopupLink']")
		private WebElement updateTasksAppInfoStartTimeButton;
		
		//xpath to Select Start Time as 10:00am .....
		@FindBy(xpath="//table[contains(@id,'StartDate_timeView_tdl')]/tbody/tr/td/div[contains(text(),'10:00 AM')]")
		private WebElement updateTasksAppInfoStartTimeSelectButton;
				
		//Finish Time ..
		@FindBy(xpath="//input[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_dtpTaskFinishDate_dateInput']")
		private WebElement updateTasksAppInfoFinishTimeTB;
			
		@FindBy(xpath="//a[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_dtpTaskFinishDate_popupButton']")
		private WebElement updateTasksAppInfoFinishDateButton;
		
		//xpath to Select Finish Date as 28 December 2016.....
		@FindBy(xpath="//table[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_dtpTaskFinishDate_calendar_Top']//td[@title='Wednesday, December 28, 2016']")
		private WebElement updateTasksAppInfoFinishDateSelectButton;
				
		@FindBy(xpath="//a[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_dtpTaskFinishDate_timePopupLink']")
		private WebElement updateTasksAppInfoFinishTimeButton;
		
		//xpath to Select Finish Time as 2:00pm .....
		@FindBy(xpath="//table[contains(@id,'FinishDate_timeView_tdl')]/tbody/tr/td/div[contains(text(),'2:00 PM')]")
		private WebElement updateTasksAppInfoFinishTimeSelectButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_InsertButton']")
		private WebElement updateTasksSaveButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TasksControl1_FormViewAddTask_InsertCancelButton']")
		private WebElement updateTasksCancelButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TasksControl1_btnCancelNewTask']")
		private WebElement updateTasksDoneButton;
		
		//Update - Team Page....		
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnTeam']")
		private WebElement updateJobTeamPage;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_TeamControl1_FormViewResources_hylProjectProjects']")
		private WebElement updateTeamAddContactButton;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_TeamControl1_FormViewResources_GridViewUsers_ctl12_btnUserName']")
		private WebElement updateTeamSelectContact;
		
		@FindBy(xpath="//div[@class='floatRight']//a[contains(text(),'Remove from Project')]")
		private WebElement UpdateTeamRemoveContactLink;
			
		//Update - Email Page....		
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnEmail']")
		private WebElement updateJobEmailPage;
		
		//Email To.....
		@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_txtTo']")
		private WebElement updateEmailToTB;
		
		//To Address Add Icon...........
		@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_btnAddTo']")
		private WebElement updateEmailToAddIcon;

		//Add Icon Window for Email To, CC, BC.......
		@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_txtBoxSearchReminder']")
		private WebElement updateEmailToSearchTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_btnSearchPopulateEmails']")
		private WebElement updateEmailToSearchButton;
		
		//xpath to checkbox contact's first name:xycust..
		@FindBy(xpath="//label[contains(text(),'xycust')]/..//input")
		private WebElement updateEmailToExistingChkbox;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_EmailControl1_lbCancelPopulateEmail']")
		private WebElement updateEmailToWindowCloseIcon;
		
				
		//Email CC......
		@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_txtCC']")
		private WebElement updateEmailCcTB;
		
		//Email CC - add Icon.....
		@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_btnAddToCC']")
		private WebElement updateEmailCcAddIcon;
				
		
		//Email BC.......
		@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_txtBC']")
		private WebElement updateEmailBcTB;
		
		//Email BC - Add Icon.......
		@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_btnAddToBC']")
		private WebElement updateEmailBcAddIcon;
				
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_txtSubject']")
		private WebElement updateEmailSubjectTB;
		
		@FindBy(xpath="//textarea[@id='ctl00_MainContent_EmailControl1_txtBody']")
		private WebElement updateEmailBodyTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_btnCancelEmailExcel']")
		private WebElement updateEmailCancelButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_EmailControl1_Button6']")
		private WebElement updateEmailSendButton;
						
		//Update - Documents Page....				
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnDocuments']")
		private WebElement updateJobDocumentsPage;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_DocumentsControl1_Button2']")
		private WebElement updateDocumentsUploadDocButton;
		
		@FindBy(id="ctl00_MainContent_DocumentsControl1_RadAsyncUpload1ListContainer")
		private WebElement updateDocumentsUploadDocSelectButton;
		
		@FindBy(xpath="//span[text()='Remove']")
		private WebElement updateDocumentsUploadDocRemoveButton;  //It works only if any files are uploaded at present.....
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_DocumentsControl1_btnSaveDocs']")
		private WebElement updateDocumentsUploadDocSaveButton;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_DocumentsControl1_LinkButton8']")
		private WebElement updateDocumentsUploadDocCloseButton;
		
		@FindBy(xpath="//a[@id='ctl00_MainContent_DocumentsControl1_GridViewDocuments_ctl02_lnkDownload']")
		private WebElement updateDocumentsOpenExistingImage1;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_DocumentsControl1_GridViewDocuments_ctl02_lnkDelete']")
		private WebElement updateDocumentsDeleteExistingImage1;
					
		//Update - History Page....		
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnHistory']")
		private WebElement updateJobHistoryPage;
		
		//Update - Photos Page....		
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnPhotos']")
		private WebElement updateJobPhotosPage;
		
		//Add Photo Button....
		@FindBy(xpath="//input[@id='ctl00_MainContent_PhotosControl1_btnAddPhotos']")
		private WebElement updatePhotoAddPhotoButton;
		
		//Add Photo Page.....
		@FindBy(xpath="//input[@id='ctl00_MainContent_PhotosControl1_FormViewServicePhotosInsert_TitleTextBox']")
		private WebElement updatePhotoAddPhotoTitleTB;
		
		@FindBy(xpath="//input[@class='file-upload365-h35']")
		private WebElement updatePhotoAddPhotoBrowseButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_PhotosControl1_FormViewServicePhotosInsert_btnAddPicture']")
		private WebElement updatePhotosAddPhotoUploadButton;
		
		@FindBy(xpath="//textarea[@id='ctl00_MainContent_PhotosControl1_FormViewServicePhotosInsert_DescriptionTextBox']")
		private WebElement updatePhotosAddPhotoDescriptionTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_PhotosControl1_FormViewServicePhotosInsert_InsertButton']")
		private WebElement updatePhotosAddPhotoSaveButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_PhotosControl1_FormViewServicePhotosInsert_InsertCancelButton']")
		private WebElement updatePhotosAddPhotoCancelButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_PhotosControl1_btnBacktoPhotos']")
		private WebElement updatePhotosAddPhotoDoneButton;
				
		//Update - Photos Page....		
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnNotes']")
		private WebElement updateJobNotesPage;
				
		@FindBy(xpath="//textarea[@id='ctl00_MainContent_NotesControl1_FormViewNotes1_Editor']")
		private WebElement updateNotesDescriptionTB;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_NotesControl1_FormViewNotes1_UpdateButton']")
		private WebElement updateNotesSaveButton;
		
		@FindBy(xpath="//input[@id='ctl00_MainContent_NotesControl1_FormViewNotes1_UpdateCancelButton']")
		private WebElement updateNotesCancelButton;
		
		//Update - Purchase Orders Page....		
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnPurchaseOrders']")
		private WebElement updateJobPurchaseOrdersPage;
				
		//Update - Invoices Page....
		@FindBy(xpath="//input[@id='ctl00_MainContent_btnInvoices']")
		private WebElement updateJobInvoicesPage;
				
		@FindBy(xpath="//table[@id='ctl00_MainContent_InvoicesControl1_GridViewInvoices']//img")
		private WebElement updateJobInvoicesViewIcon1;
		*/
		
	
	
	//Schedule Page....
	@FindBy(id="ctl00_ServiceModule1_aResourceScheduler")
	private WebElement Field360SchedulePage;
	
	@FindBy(xpath="//div[@id='ctl00_MainContent_RadScheduler1']//table//td//table[@class='rsAllDayTable']//tr[1]//td[7]")
	private WebElement targetSchedule;
	
	@FindBy(xpath="//div[@class='row-hbc border-ccc']/span[@id='ctl00_MainContent_RadGrid1_ctl00_ctl08_Label1']")
	private WebElement sourceSchedule;
	
	@FindBy(xpath="//div[@id='ctl00_MainContent_RadScheduler1']//table//td//table[@class='rsAllDayTable']//tr[2]//td[10]")
	private WebElement targetSchedule1;
	
	@FindBy(xpath="//div[@class='row-hbc border-ccc']/span[text()='delete.............dfgdsgdg']")
	private WebElement sourceSchedule1;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_RadScheduler1_ctl55_UnscheduleAppointment']")
	private WebElement unSchedule;
	
	
	//Routing Page....
	@FindBy(id="ctl00_ServiceModule1_aMapRoutung")
	private WebElement Field360RoutingPage;
	
	
	
	
	
	
	
	//Purchase Orders Page....
	@FindBy(id="ctl00_ServiceModule1_pnlPOs")
	private WebElement Field360PurchaseOrdersPage;	
	
	//Create Purchase Order.....
	@FindBy(id="ctl00_MainContent_FormView1_ItemTextBox")
	private WebElement Field360PurchaseOrderCreatePurchaseOrderTextBox;
	
	@FindBy(id="ctl00_MainContent_FormView1_DateTextBox")
	private WebElement Field360PurchaseOrderCreatePurchaseOrderDateTextBox;
		
	@FindBy(id="ctl00_MainContent_FormView1_CalendarExtender_day_3_2")
	private WebElement Field360PurchaseOrderCreatePurchaseOrderDateSelect;
	
	@FindBy(id="ctl00_MainContent_FormView1_ddlVendor")
	private WebElement Field360PurchaseOrderCreatePurchaseOrderVendorListBox;
	
	@FindBy(id="ctl00_MainContent_FormView1_ddlProject")
	private WebElement Field360PurchaseOrderCreatePurchaseOrderJobListBox;
	
	@FindBy(id="ctl00_MainContent_FormView1_InsertButton")
	private WebElement Field360PurchaseOrderCreatePurchaseOrderAddButton;
	
	@FindBy(id="ctl00_MainContent_GridView1_ctl02_lblDescription")
	private WebElement Field360PurchaseOrderCreatePurchaseOrderSelectPurchaseOrderName;
	/*
	//Delete Purchase Orders...................	
	@FindBy(xpath="//span[text()='aaa1234']/../../..//input")
	private WebElement purchaseOrderChkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnMultipleRowDelete']")
	private WebElement deleteConfirmationButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_CancelButton']")
	private WebElement deleteCancelConfirmationButton;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_ddlPageSize']")
	private WebElement showRowsLB;
	
	
	
	
	//Search Purchase Order.......
	@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
	private WebElement searchPOTB;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
	private WebElement searchPOButton;
	
	
	//Update Purchase Order........
	
	@FindBy(xpath="//span[text()='aaaVendor']")
	private WebElement updatePOSelectExistingPO;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_DescriptionTextBox']")
	private WebElement updatePODescriptionTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_PurchaseOrderDateTextBox']")
	private WebElement updatePODate;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_SalesmanTextBox']")
	private WebElement updatePOSalesmanTB;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewEdit_ddlStatus']")
	private WebElement updatePOStatusLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_chkBoxShareWithCustomer']")
	private WebElement updatePOShareWithCustChkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewPurchaseOrderItemsInsert_DescriptionTextBox']")
	private WebElement updatePOAddItemDescriptionTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewPurchaseOrderItemsInsert_txtQTY']")
	private WebElement updatePOAddItemQuantityTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewPurchaseOrderItemsInsert_txtPrice']")
	private WebElement updatePOAddItemPriceTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewPurchaseOrderItemsInsert_InsertButton']")
	private WebElement updatePOAddItemAddIcon;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewPurchaseOrderItemsInsert_InsertCancelButton']")
	private WebElement updatePOAddItemCancelIcon;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_UpdateButton']")
	private WebElement updatePOSaveButton;	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_UpdateCancelButton']")
	private WebElement updatePOCancelButton;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
	private WebElement updatePODoneButton;
	
	*/
	
	//Invoices Page....
	@FindBy(id="ctl00_ServiceModule1_aInvoices")
	private WebElement Field360InvoicesPage;
	
	@FindBy(id="//input[@id='ctl00_MainContent_btnOpenInvoices']")
	private WebElement Field360InvoicesOpenInvoicePageButton;
	
	@FindBy(id="//input[@id='ctl00_MainContent_btnUninvoicedJobs']")
	private WebElement Field360InvoicesUnInvoicedJobsPageButton;
	
	@FindBy(id="//input[@id='ctl00_MainContent_btnUnpaidInvoices']")
	private WebElement Field360InvoicesUnpaidInvoicePageButton;
	
	@FindBy(id="//input[@id='ctl00_MainContent_btnPaidInvoices']")
	private WebElement Field360InvoicesPaidInvoicePageButton;
	
	//Add Invoice Button....
	@FindBy(id="//input[@id='ctl00_MainContent_btnAddInvoice']")
	private WebElement Field360InvoicesAddInvoiceButton;
	
	//Add Invoice Window.......
	@FindBy(id="ctl00_MainContent_FormView1_ItemTextBox")
	private WebElement Field360InvoicesAddInvoiceTitleTextBox;
	
	@FindBy(id="ctl00_MainContent_FormView1_DateTextBox")
	private WebElement Field360InvoicesAddInvoiceDateTextBox;
	
	@FindBy(id="ctl00_MainContent_FormView1_CalendarExtender_day_3_2")
	private WebElement Field360InvoicesAddInvoiceSelectDate;
	
	@FindBy(id="ctl00_MainContent_FormView1_ddlVendor")
	private WebElement Field360InvoicesAddInvoiceSelectCustomerListBox;
	
	@FindBy(id="ctl00_MainContent_FormView1_ddlProject")
	private WebElement Field360InvoicesAddInvoiceSelectProjectListBox;
	
	@FindBy(id="ctl00_MainContent_FormView1_InsertButton")
	private WebElement Field360InvoicesAddInvoiceSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormView1_InsertCancelButton")
	private WebElement Field360InvoicesAddInvoiceCancelButton;
	
	@FindBy(id="ctl00_MainContent_LinkButton1")
	private WebElement Field360InvoicesAddInvoiceCloseButton;
	

	
	/*
	//Delete Invoices...............

	@FindBy(xpath="//span[text()='aaaJob']/../../../td/input")
	private WebElement openInvoiceSelectChkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnDelete']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnMultipleRowDelete']")
	private WebElement deleteConfirmationButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_CancelButton']")
	private WebElement deleteCancelConfirmationButton;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_ddlPageSize']")
	private WebElement showRowsLB;
	
	
	
	//Search Invoices.......
	@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilter']")
	private WebElement searchInvoiceTB;
			
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearch']")
	private WebElement searchInvoiceButton;
			
		
	
	//Update Open Invoices.....
	@FindBy(xpath="//span[text()='aaaaNewCustomer12 aaa34']")
	private WebElement updateOpenInvoiceSelectExistingInvoice;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewEdit_ddlTerms']")
	private WebElement updateOpenInvoiceTermsLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_InvoiceDateTextBox']")
	private WebElement updateOpenInvoiceDateTB;
	
	@FindBy(xpath="//div[@id='ctl00_MainContent_FormViewEdit_CalendarExtender3_container']//div[text()='20']")
	private WebElement updateOpenInvoiceSelectDate;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_InvoiceDateDueTextBox']")
	private WebElement updateOpenInvoiceDueDateTB;
	
	@FindBy(xpath="//div[@id='ctl00_MainContent_FormViewEdit_CalendarExtender1_container']//div[text()='5']")
	private WebElement updateOpenInvoiceSelectDueDate;
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewEdit_ddlStatus']")
	private WebElement updateOpenInvoiceStatusLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewEdit_chkBoxShareWithCustomer']")
	private WebElement updateOpenInvoiceShareWithCustChkbox;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewInvoiceItemsInsert_DescriptionTextBox']")
	private WebElement updateInvoiceAddItemDescriptionTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewInvoiceItemsInsert_txtQTY']")
	private WebElement updateInvoiceAddItemQuantityTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewInvoiceItemsInsert_txtPrice']")
	private WebElement updateInvoiceAddItemPriceTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewInvoiceItemsInsert_InsertButton']")
	private WebElement updateInvoiceAddItemAddIcon;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewInvoiceItemsInsert_InsertCancelButton']")
	private WebElement updateInvoiceAddItemCancelIcon;
	
	//Add Items Button....
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewInvoiceItemsInsert_btnAddInventoryItems']")
	private WebElement updateInvoiceAddItemsButton;
	
	//Add Inventory Window....
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_ddlCategory']")
	private WebElement updateInvoiceInventoryCategoryLB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_txtFilterItems']")
	private WebElement updateInvoiceInventorySearchTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnSearchItems']")
	private WebElement updateInvoiceInventorySearchButton;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_GridViewInventoryItems_ctl02_cbRows']")
	private WebElement updateInvoiceInventorySelectItem1Chkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_GridViewInventoryItems_ctl02_txtQuantity']")
	private WebElement updateInvoiceInventorySelectItem1QuantityTB;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_ImageButton2']")
	private WebElement updateInvoiceInventoryAddItemsButton;
	
	@FindBy(xpath="//a[@id='ctl00_MainContent_LinkButton7']")
	private WebElement updateInvoiceInventoryCloseIcon;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_FormViewInvoiceItemsInsert_chkBoxisTaxable']")
	private WebElement updateInvoiceTaxableItemsChkbox;
	
	//When Items are added..
	@FindBy(xpath="//img[@id='ctl00_MainContent_GridViewInvoiceItems_ctl02_imgEdit']")
	private WebElement updateInvoiceItem1;
	
	@FindBy(xpath="//img[@id='ctl00_MainContent_GridViewInvoiceItems_ctl03_imgEdit']")
	private WebElement updateInvoiceItem2;
	
	@FindBy(xpath="//img[@id='ctl00_MainContent_GridViewInvoiceItems_ctl04_imgEdit']")
	private WebElement updateInvoiceItem3;
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_GridViewInvoiceItems_ctl02_LinkButton2']")
	private WebElement updateInvoiceDeleteItem1;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_GridViewInvoiceItems_ctl03_LinkButton2']")
	private WebElement updateInvoiceDeleteItem2;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_GridViewInvoiceItems_ctl04_LinkButton2']")
	private WebElement updateInvoiceDeleteItem3;
	
	
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_FormViewTotals_ddlTaxRate']")
	private WebElement updateInvoiceTaxRateLB;
	
	
	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_UpdateButton']")
	private WebElement updateInvoiceSaveButton;	
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_UpdateCancelButton']")
	private WebElement updateInvoiceCancelButton;
		
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnBack']")
	private WebElement updateInvoiceDoneButton;
	
	
	
	//Update Uninvoiced Jobs...
	
	@FindBy(xpath="//select[@id='ctl00_MainContent_JobsControl1_ddlPageSize']")
	private WebElement uninvoicedJobsShowRowsLB;
	
	@FindBy(xpath="//span[text()='aaaJob']/../..//input")
	private WebElement selectUninvoicedJobsChkbox;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_JobsControl1_btnConvertToInvoice']")
	private WebElement uninvoicedJobsConvertToInvoiceButton;
	
	*/
	
	
	//Reports Page....
	@FindBy(id="ctl00_ServiceModule1_pnlReports")
	private WebElement Field360ReportsPage;
	
	@FindBy(id="ctl00_MainContent_txtStart")
	private WebElement Field360ReportsStartDateTextBox;
	
	@FindBy(xpath="//table[@id='ctl00_MainContent_CalExtDate_daysTable']//div[@title='Friday, December 30, 2016']")
	private WebElement Field360ReportsSelectStartDate;
	
	@FindBy(id="ctl00_MainContent_txtEnd")
	private WebElement Field360ReportsEndDateTextBox;
	
	@FindBy(xpath="//table[@id='ctl00_MainContent_CalendarExtender1_daysTable']//div[@title='Sunday, January 01, 2017']")
	private WebElement Field360ReportsSelectEndDate;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnReports']")
	private WebElement Field360ReportsButton;
	
	
	//Customer Reports....
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnCustomerReports']")
	private WebElement reportsSelectCustomer;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnCustomerTotalProjects']")
	private WebElement reportsCustomerProjects;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnCustomerInvoices']")
	private WebElement reportsCustomerInvoices;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnCustomerPurchaseOrders']")
	private WebElement reportsCustomerPurchaseOrders;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnCustomerTotals']")
	private WebElement reportsCustomerTotals;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnCustomerExpenses']")
	private WebElement reportsCustomerExpenses;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnCustomerSummary']")
	private WebElement reportsCustomerSummary;
	
		
	//Job Reports....
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnJobReports']")
	private WebElement reportsSelectJob;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnProjectTotals']")
	private WebElement reportsJobsQuotes;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnProjectInvoices']")
	private WebElement reportsJobInvoices;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnProjectPurchaseOrders']")
	private WebElement reportsJobPurchaseOrders;
	
		
	//Employee Reports....
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnEmployeeReports']")
	private WebElement reportsSelectEmployee;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnEmployeeTotalProjects']")
	private WebElement reportsEmployeeTotalProjects;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnEmployeeHours']")
	private WebElement reportsEmployeeHours;
	
	
	//Vehicle Reports....
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnVehicleReports']")
	private WebElement reportsSelectVehicle;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnTotalMiles']")
	private WebElement reportsVehicleTotalMiles;
	
	@FindBy(xpath="//input[@id='ctl00_MainContent_btnToalFuel']")
	private WebElement reportsVehicleTotalFuel;
	
	
	
	
	
	
	public void clickField360Page()
	{
		Field360Page.click();
	}
	
	public void clickField360DashboardPage()
	{
		Field360DashboardPage.click();
	}
	
	//Customers Page..
	public void clickField360CustomersPage()
	{
		Field360CustomersPage.click();
	}
	
	//Add Customer..
	public void clickToAddCustomerAtField360()
	{
		Field360CustomerAddCustomerButton.click();
	}

	public void enterCompanyNameToAddField360Customer(String companyName)
	{
		Field360CustomerAddCustomerCompanyNameTextBox.sendKeys(companyName);
	}

	public void enterContactNameToAddField360Customer(String contactName)
	{
		Field360CustomerAddCustomerContactNameTextBox.sendKeys(contactName);
	}
	
	public void enterFirstNameToAddField360Customer(String firstName)
	{
		Field360CustomerAddCustomerFirstNameTextBox.sendKeys(firstName);
	}
	
	public void enterLastNameToAddField360Customer(String lastName)
	{
		Field360CustomerAddCustomerLastNameTextBox.sendKeys(lastName);
	}
	
	public void enterPhoneNoToAddField360Customer(String phoneNo)
	{
		Field360CustomerAddCustomerPhoneTextBox.sendKeys(phoneNo);
	}
	
	public void enterPhoneExtensionToAddField360Customer(String phoneExt)
	{
		Field360CustomerAddCustomerPhoneExtensionTextBox.sendKeys(phoneExt);
	}
	
	public void enterCellPhoneToAddField360Customer(String cellPhoneNo)
	{
		Field360CustomerAddCustomerCellPhoneTextBox.sendKeys(cellPhoneNo);
	}
	
	public void enterFaxToAddField360Customer(String fax)
	{
		Field360CustomerAddCustomerFaxTextBox.sendKeys(fax);
	}
	
	public void enterEmailToAddField360Customer(String email)
	{
		Field360CustomerAddCustomerEmailTextBox.sendKeys(email);
	}
	
	public void enterStreetNameToAddField360Customer(String streetName)
	{
		Field360CustomerAddCustomerStreetTextBox.sendKeys(streetName);
	}
	
	public void selectCountryNameToAddField360Customer(String countryName)
	{
		GenericUtils.selectbyVisibletext(Field360CustomerAddCustomerCountryListBox, countryName);
	}
	
	public void selectStateNameToAddField360Customer(String stateName)
	{
		GenericUtils.selectbyVisibletext(Field360CustomerAddCustomerStateListBox, stateName);
	}
	
	public void selectCityNameToAddField360Customer(String cityName)
	{
		GenericUtils.selectbyVisibletext(Field360CustomerAddCustomerCityListBox, cityName);
	}
	
	public void enterZipCodeToAddField360Customer(String zipCode)
	{
		Field360CustomerAddCustomerZipCodeTextBox.sendKeys(zipCode);
	}
	
	public void enterLongitudeToAddField360Customer(String longitude)
	{
		Field360CustomerAddCustomerLongitudeTextBox.sendKeys(longitude);
	}
	
	public void enterLatitudeToAddField360Customer(String latitude)
	{
		Field360CustomerAddCustomerLatitudeTextBox.sendKeys(latitude);
	}
	
	public void clickSaveToAddField360Customer()
	{
		Field360CustomerAddCustomerSaveButton.click();
	}
	
	public void clickDoneToAddField360Customer()
	{
		Field360CustomerAddCustomerDoneButton.click();
	}
	
	
	//Employees Page....
	public void clickField360EmployeesPage()
	{
		Field360EmployeesPage.click();
	}
	
	//Add Employee....
	public void clickOnAddEmployeeButton()
	{
		Field360EmployeesAddEmployeeButton.click();
	}
	
	public void enterCompanyNameToAddEmployee(String companyName)
	{
		Field360EmployeesAddEmployeeCompanyNameTextBox.sendKeys(companyName);
	}
	
	public void enterContactNameToAddEmployee(String contactName)
	{
		Field360EmployeesAddEmployeeContactNameTextBox.sendKeys(contactName);
	}
	
	public void enterFirstNameToAddEmployee(String firstName)
	{
		Field360EmployeesAddEmployeeFirstNameTextBox.sendKeys(firstName);
	}
	
	public void enterLastNameToAddEmployee(String lastName)
	{
		Field360EmployeesAddEmployeeLastNameTextBox.sendKeys(lastName);
	}
	
	public void enterphoneNoToAddEmployee(String phoneNo)
	{
		Field360EmployeesAddEmployeePhoneTextBox.sendKeys(phoneNo);
	}
	
	public void enterPhoneExtensionNoToAddEmployee(String phoneExt)
	{
		Field360EmployeesAddEmployeePhoneExtensionTextBox.sendKeys(phoneExt);
	}
	
	public void enterCellPhoneNoToAddEmployee(String cellPhoneNo)
	{
		Field360EmployeesAddEmployeeCellPhoneTextBox.sendKeys(cellPhoneNo);
	}
	
	public void enterFaxToAddEmployee(String fax)
	{
		Field360EmployeesAddEmployeeFaxTextBox.sendKeys(fax);
	}
	
	public void enterEmailToAddEmployee(String email)
	{
		Field360EmployeesAddEmployeeEmailTextBox.sendKeys(email);
	}
	
	public void enterStreetNameToAddEmployee(String streetName)
	{
		Field360EmployeesAddEmployeeStreetTextBox.sendKeys(streetName);
	}
	
	public void selectCountryNameToAddEmployee(String countryName)
	{
		GenericUtils.selectbyVisibletext(Field360EmployeesAddEmployeeCountryListBox, countryName);
	}
	
	public void selectStateNameToAddEmployee(String stateName)
	{
		GenericUtils.selectbyVisibletext(Field360EmployeesAddEmployeeStateListBox, stateName);
	}
	
	public void selectCityNameToAddEmployee(String cityName)
	{
		GenericUtils.selectbyVisibletext(Field360EmployeesAddEmployeeCityListBox, cityName);
	}
	
	public void enterZipCodeToAddEmployee(String zipCode)
	{
		Field360EmployeesAddEmployeeZipCodeTextBox.sendKeys(zipCode);
	}
	
	public void enterLongitudeToAddEmployee(String longitude)
	{
		Field360EmployeesAddEmployeeLongitudeTextBox.sendKeys(longitude);
	}
	
	public void enterLatitudeToAddEmployee(String latitude)
	{
		Field360EmployeesAddEmployeeLatitudeTextBox.sendKeys(latitude);
	}
	
	public void clickSaveToAddEmployee()
	{
		Field360EmployeesAddEmployeeSaveButton.click();
	}
	
	public void clickDoneToAddEmployee()
	{
		Field360EmployeesAddEmployeeDoneButton.click();
	}
	
		
	//Vendors Page....
	public void clickField360VendorsPage()
	{
		Field360VendorsPage.click();
	}
	
	//Add Vendors....
	public void clickOnAddVendorsButton()
	{
		Field360VendorsAddVendorsButton.click();
	}
	
	public void enterCompanyNameToAddVendor(String companyName)
	{
		Field360VendorsAddVendorsCompanyNameTextBox.sendKeys(companyName);
	}
	
	public void enterContactNameToAddVendor(String contactName)
	{
		Field360VendorsAddVendorsContactNameTextBox.sendKeys(contactName);
	}
	
	public void enterFirstNameToAddVendor(String firstName)
	{
		Field360VendorsAddVendorsFirstNameTextBox.sendKeys(firstName);
	}
	
	public void enterLastNameToAddVendor(String lastName)
	{
		Field360VendorsAddVendorsLastNameTextBox.sendKeys(lastName);
	}
	
	public void enterphoneNoToAddVendor(String phoneNo)
	{
		Field360VendorsAddVendorsPhoneTextBox.sendKeys(phoneNo);
	}
	
	public void enterPhoneExtensionNoToAddVendor(String phoneExt)
	{
		Field360VendorsAddVendorsPhoneExtensionTextBox.sendKeys(phoneExt);
	}
	
	public void enterCellPhoneNoToAddVendor(String cellPhoneNo)
	{
		Field360VendorsAddVendorsCellPhoneTextBox.sendKeys(cellPhoneNo);
	}
	
	public void enterFaxToAddVendor(String fax)
	{
		Field360VendorsAddVendorsFaxTextBox.sendKeys(fax);
	}
	
	public void enterEmailToAddVendor(String email)
	{
		Field360VendorsAddVendorsEmailTextBox.sendKeys(email);
	}
	
	public void enterStreetNameToAddVendor(String streetName)
	{
		Field360VendorsAddVendorsStreetTextBox.sendKeys(streetName);
	}
	
	public void selectCountryNameToAddVendor(String countryName)
	{
		GenericUtils.selectbyVisibletext(Field360VendorsAddVendorsCountryListBox, countryName);
	}
	
	public void selectStateNameToAddVendor(String stateName)
	{
		GenericUtils.selectbyVisibletext(Field360VendorsAddVendorsStateListBox, stateName);
	}
	
	public void selectCityNameToAddVendor(String cityName)
	{
		GenericUtils.selectbyVisibletext(Field360VendorsAddVendorsCityListBox, cityName);
	}
	
	public void enterZipCodeToAddVendor(String zipCode)
	{
		Field360VendorsAddVendorsZipCodeTextBox.sendKeys(zipCode);
	}
	
	public void enterLongitudeToAddVendor(String longitude)
	{
		Field360VendorsAddVendorsLongitudeTextBox.sendKeys(longitude);
	}
	
	public void enterLatitudeToAddVendor(String latitude)
	{
		Field360VendorsAddVendorsLatitudeTextBox.sendKeys(latitude);
	}
	
	public void clickSaveToAddVendor()
	{
		Field360VendorsAddVendorsSaveButton.click();
	}
	
	public void clickDoneToAddVendor()
	{
		Field360VendorsAddVendorsDoneButton.click();
	}
	
	
	//Quotes Page....
	public void clickField360QuotesPage()
	{
		Field360QuotesPage.click();
	}
		
	//Add Quote....
	public void clickOnAddQuoteButton()
	{
		Field360QuotesAddQuotesButton.click();
	}
	
	public void enterJobNameToAddQuote(String jobName)
	{
		Field360QuotesAddQuotesJobNameTextBox.sendKeys(jobName);
	}
	
	public void selectJobStatusToAddQuote(String jobStatus)
	{
		GenericUtils.selectbyVisibletext(Field360QuotesAddQuotesJobStatusListBox, jobStatus);
	}
	
	public void selectClientToAddQuote(String clientName)
	{
		GenericUtils.selectbyVisibletext(Field360QuotesAddQuotesClientListBox, clientName);
	}
	
	public void clickOnFindButtonToAddClientAtAddQuotePage()
	{
		Field360QuotesAddQuotesFindButton.click();
	}
	
	public void clickOnSearchButtonToAddClientAtAddQuotePage()
	{
		Field360QuotesAddQuotesFindSearchClientButton.click();
	}
	
	public void clickOnSelectButtonToAddClientAtAddQuotePage()
	{
		Field360QuotesAddQuotesFindSelectClientButton.click();
	}
	
	public void clickOnCloseButtonToAddClientAtAddQuotePage()
	{
		Field360QuotesAddQuotesFindCloseButton.click();
	}
	
	public void selectAdditionalContactToAddQuote(String additionalContact)
	{
		GenericUtils.selectbyVisibletext(Field360QuotesAddQuotesAdditionalContactInformationContactListBox, additionalContact);
	}
	
	public void clickOnAddToScheduleCheckBoxToAddQuote()
	{
		Field360QuotesAddQuotesAppointmentInformationCheckBox.click();
	}
	
	//use this format - 12/28/2016 12:00 AM
	public void enterStartDateAndTimeToAddQuote(String dateTime)
	{
		Field360QuotesAddQuotesAppointmentInformationStartTimeTextBox.sendKeys(dateTime); 
	}
	
	//use this format - 12/28/2016 12:00 AM
	public void enterFinishDateAndTimeToAddQuote(String dateTime)
	{
		Field360QuotesAddQuotesAppointmentInformationFinishTimeTextBox.sendKeys(dateTime); 
	}
	
	public void enterJobDetailsToAddQuote(String jobDetails)
	{
		Field360QuotesAddQuotesAppointmentInformationJobDetailsTextBox.sendKeys(jobDetails);
	}
	
	public void clickOnSaveButtonToAddQuote()
	{
		Field360QuotesAddQuotesSaveButton.click();
	}
	
	public void clickOnDoneButtonToAddQuote()
	{
		Field360QuotesAddQuotesDoneButton.click();
	}
	
	
	//Field360 Quotes - Create Job Button....
	public void clickOnCreateJobButtonToConvertQuoteToJob()
	{
		Field360QuotesCreateJobButton.click();
	}
	
		
	//Jobs Page....
	public void clickField360JobsPage()
	{
		Field360JobsPage.click();
	}
		
	//Add Job....
	public void clickOnAddJobButtonAtField360JobsPage()
	{
		Field360JobsAddJobButton.click();
	}
	
	public void clickOnFindCustomerButtonToAddJobAtField360JobsPage()
	{
		Field360JobsAddJobFindCustomerButton.click();
	}
	
	public void clickOnSearchCustomerButtonToAddJobAtField360JobsPage()
	{
		Field360JobsAddJobFindCustomerSearchClientButton.click();
	}
	
	public void clickOnSelectCustomerButtonToAddJobAtField360JobsPage()
	{
		Field360JobsAddJobFindCustomerSelectClientButton.click();
	}
	
	public void clickOnCloseCustomerButtonToAddJobAtField360JobsPage()
	{
		Field360JobsAddJobFindCustomerCloseButton.click();
	}
	
	public void enterJobNameToAddJobAtField360JobsPage(String jobName)
	{
		Field360JobsAddJobJobNameTextBox.sendKeys(jobName);
	}
	
	public void selectJobStatusToAddJobAtField360JobsPage(String jobStatus)
	{
		GenericUtils.selectbyVisibletext(Field360JobsAddJobJobStatusListBox, jobStatus);
	}
	
	public void clickOnNotifyCustomerCheckBoxToAddJobAtField360JobsPage()
	{
		Field360JobsAddJobJobNotifyCustomerCheckBox.click();
	}
	
	public void selectJobNotificationToAddJobAtField360JobsPage(String jobNotification)
	{
		GenericUtils.selectbyVisibletext(Field360JobsAddJobJobNotificationListBox, jobNotification);
	}
	
	public void selectJobPriorityToAddJobAtField360JobsPage(String jobPriority)
	{
		GenericUtils.selectbyVisibletext(Field360JobsAddJobJobPriorityListBox, jobPriority);
	}
	
	public void enterJobDescriptionToAddJobAtField360JobsPage(String jobDescription)
	{
		Field360JobsAddJobJobDescriptionTextBox.sendKeys(jobDescription);
	}
	
	public void enterJobServiceSpecialToAddJobAtField360JobsPage(String jobServiceSpecial)
	{
		Field360JobsAddJobJobServiceSpecialTextBox.sendKeys(jobServiceSpecial);
	}
	
	public void enterJobCompletionNotesToAddJobAtField360JobsPage(String jobCompletionNotes)
	{
		Field360JobsAddJobJobCompletionNotesTextBox.sendKeys(jobCompletionNotes);
	}
	
	public void selectadditionalContactNameToAddJobAtField360JobsPage(String additionalContactName)
	{
		GenericUtils.selectbyVisibletext(Field360JobsAddJobAdditionalContactInformationContactListBox, additionalContactName);
	}
	
	
	public void clickOnAddtoScheduleCheckBoxToAddJobAtField360JobsPage()
	{
		Field360JobsAddJobAppointmentInformationAddtoScheduleCheckBox.click();
	}
	
	//Enter Date and Time in this format - 12/29/2016 12:00 AM......
	public void enterStartTimeToAddJobAtField360JobsPage(String startTime)
	{
		Field360JobsAddJobAppointmentInformationStartTimeTextBox.sendKeys(startTime);
	}
	
	//Enter Date and Time in this format - 12/29/2016 12:00 AM......
	public void enterFinishTimeToAddJobAtField360JobsPage(String finishTime)
	{
		Field360JobsAddJobAppointmentInformationFinishTimeTextBox.sendKeys(finishTime);
	}
	
	public void clickOnSaveButtonToAddJobAtField360JobsPage()
	{
		Field360JobsAddJobSaveButton.click();
	}
	
	public void clickOnDoneButtonToAddJobAtField360JobsPage()
	{
		Field360JobsAddJobDoneButton.click();
	}
		
	//Schedule Page....
	public void clickField360SchedulePage()
	{
		Field360SchedulePage.click();
	}
		
	//Add Schedule....
	public void dragAndDropJobToScheduleJobToEmployee(WebElement source,WebElement destination)
	{
		GenericUtils.dragAndDrop(driver, source, destination);
	}
	
	//Routing Page....
	public void clickField360RoutingPage()
	{
		Field360RoutingPage.click();
	}
			
	
	//Purchase Orders Page....
	public void clickField360PurchaseOrdersPage()
	{
		Field360PurchaseOrdersPage.click();
	}
			
	//Add Purchase Order....
	public void enterPurchaseOrderDescriptionToAddPurchaseOrderAtField360PurchaseOrder(String purchaseOrderDescription)
	{
		Field360PurchaseOrderCreatePurchaseOrderTextBox.sendKeys(purchaseOrderDescription);
	}
	
	public void enterDateToCreatePurchaseOrderAtField360PurchaseOrder(String date)
	{
		Field360PurchaseOrderCreatePurchaseOrderDateTextBox.sendKeys(date);
	}
	
	public void selectVendorNameToCreatePurchaseOrderAtField360PurchaseOrder(String vendorName)
	{
		GenericUtils.selectbyVisibletext(Field360PurchaseOrderCreatePurchaseOrderVendorListBox, vendorName);
	}
	
	public void selectJobNameToCreatePurchaseOrderAtField360PurchaseOrder(String jobName)
	{
		GenericUtils.selectbyVisibletext(Field360PurchaseOrderCreatePurchaseOrderJobListBox	, jobName);
	}
	
	public void clickOnAddButtonToCreatePurchaseOrderAtField360PurchaseOrder()
	{
		Field360PurchaseOrderCreatePurchaseOrderAddButton.click();
	}
	
	
	
	//Invoices Page....
	public void clickField360InvoicesPage()
	{
		Field360InvoicesPage.click();
	}
	
	public void clickUnInvoicedJobsAtField360InvoicesPage()
	{
		Field360InvoicesUnInvoicedJobsPageButton.click();
	}
	
	public void clickOpenInvoicedJobsAtField360InvoicesPage()
	{
		Field360InvoicesOpenInvoicePageButton.click();
	}
	
	public void clickUnpaidInvoicedJobsAtField360InvoicesPage()
	{
		Field360InvoicesUnpaidInvoicePageButton.click();
	}
	
	public void clickPaidJobsAtField360InvoicesPage()
	{
		Field360InvoicesPaidInvoicePageButton.click();
	}
	
	//Add Invoices....
	public void clickOnAddInvoiceButtonAtField360InvoicesPage()
	{
		Field360InvoicesAddInvoiceButton.click();
	}
	
	public void enterInvoiceTitleToAddInvoiceAtField360InvoicesPage(String invoiceTitle)
	{
		Field360InvoicesAddInvoiceTitleTextBox.sendKeys(invoiceTitle);
	}
	
	public void enterInvoiceDateToAddInvoiceAtField360InvoicesPage(String invoiceDate)
	{
		Field360InvoicesAddInvoiceDateTextBox.sendKeys(invoiceDate);
	}
		
	public void selectCustomerToAddInvoiceAtField360InvoicesPage(String customerName)
	{
		GenericUtils.selectbyVisibletext(Field360InvoicesAddInvoiceSelectCustomerListBox, customerName);
	}

	public void selectProjectNameToAddInvoiceAtField360InvoicesPage(String projectName)
	{
		GenericUtils.selectbyVisibletext(Field360InvoicesAddInvoiceSelectProjectListBox, projectName);
	}
	
	public void clickOnSaveButtonAtField360InvoicesPage()
	{
		Field360InvoicesAddInvoiceSaveButton.click();
	}
	
	public void clickOnCloseButtonAtField360InvoicesPage()
	{
		Field360InvoicesAddInvoiceCloseButton.click();
	}
	
	//Reports Page....
	public void clickField360ReportsPage()
	{
		Field360ReportsPage.click();
	}
	
	public void enterStartDateToViewReportAtField360ReportsPage(String startDate)
	{
		Field360ReportsStartDateTextBox.sendKeys(startDate);
	}
	
	public void enterEndDateToViewReportAtField360ReportsPage(String endDate)
	{
		Field360ReportsEndDateTextBox.sendKeys(endDate);
	}
	
	public void clickOnReportsButtonAtField360ReportsPage()
	{
		GenericUtils.mouseOver(driver, Field360ReportsButton);
	}
	//Customer Report....
	public void clickOnCustomerReportAtField360ReportsPage()
	{
		reportsSelectCustomer.click();
	}
	
	public void clickOnCustomerProjectsReportAtField360ReportsPage()
	{
		reportsCustomerProjects.click();
	}
	
	public void clickOnCustomerInvoicesReportAtField360ReportsPage()
	{
		reportsCustomerInvoices.click();
	}
	
	public void clickOnCustomerPurchaseOrdersReportAtField360ReportsPage()
	{
		reportsCustomerPurchaseOrders.click();
	}
	
	public void clickOnCustomerTotalsReportAtField360ReportsPage()
	{
		reportsCustomerTotals.click();
	}
	
	public void clickOnCustomerExpensesReportAtField360ReportsPage()
	{
		reportsCustomerExpenses.click();
	}
	
	public void clickOnCustomerSummaryReportAtField360ReportsPage()
	{
		reportsCustomerSummary.click();
	}
	
	//Job Report....	
	public void clickOnJobReportAtField360ReportsPage()
	{
		reportsSelectJob.click();
	}
	
	public void clickOnJobQuotesReportAtField360ReportsPage()
	{
		reportsJobsQuotes.click();
	}
	
	public void clickOnJobInvoicesReportAtField360ReportsPage()
	{
		reportsJobInvoices.click();
	}
	
	public void clickOnJobPurchaseOrdersReportAtField360ReportsPage()
	{
		reportsJobPurchaseOrders.click();
	}
	
	//Employee Report....	
	public void clickOnEmployeeReportAtField360ReportsPage()
	{
		reportsSelectEmployee.click();
	}
		
	public void clickOnEmployeeTotalProjectsReportAtField360ReportsPage()
	{
		reportsEmployeeTotalProjects.click();
	}
	
	public void clickOnEmployeeHoursReportAtField360ReportsPage()
	{
		reportsEmployeeHours.click();
	}
		
	//Vehicle Report....	
	public void clickOnVehicleReportAtField360ReportsPage()
	{
		reportsSelectVehicle.click();
	}
			
	public void clickOnVehicleTotalMilesReportAtField360ReportsPage()
	{
		reportsVehicleTotalMiles.click();
	}
		
	public void clickOnVehicleTotalFuelReportAtField360ReportsPage()
	{
		reportsVehicleTotalFuel.click();
	}
	
}
