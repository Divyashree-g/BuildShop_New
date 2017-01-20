package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.libraries.GenericUtils;

public class VehicleLogsPage 
{
	WebDriver driver;
	
	public VehicleLogsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Vehicle Logs']")
	private WebElement VehicleLogsPage;
	
	@FindBy(xpath="//a[text()='Dashboard']")
	private WebElement VehicleLogsDashboardPage;
	
	@FindBy(id="ctl00_MainContent_ddlVehicle")
	private WebElement VehicleLogsDashboardPageFilterByVehicleListBox;
	
	@FindBy(id="ctl00_MainContent_txtDateFrom")
	private WebElement VehicleLogsDashboardPageDateRangeFromTextBox;
	
	@FindBy(id="ctl00_MainContent_txtDateTo")
	private WebElement VehicleLogsDashboardPageDateRangeToTextBox;
	
	@FindBy(id="ctl00_MainContent_btnFilter")
	private WebElement VehicleLogsDashboardPageGoButton;
	
	
	//Vehicle Log Page..
	@FindBy(id="ctl00_VehicleModule1_aVehicleLog")
	private WebElement VehicleLogsVehicleLogPage;
	
	@FindBy(id="ctl00_MainContent_txtFilter")
	private WebElement VehicleLogsPageSearchTextBox;
	
	@FindBy(id="ctl00_MainContent_btnSearch")
	private WebElement VehicleLogsPageSearchButton;
	
	//Add Vehicle Button..
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement VehicleLogsPageAddVehicleButton;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtVehicleName")
	private WebElement VehicleLogsPageAddVehicleVehicleIdTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtMake")
	private WebElement VehicleLogsPageAddVehicleVehicleMakeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtModel")
	private WebElement VehicleLogsPageAddVehicleVehicleModelTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtYear")
	private WebElement VehicleLogsPageAddVehicleVehicleManufacturedYearTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtColor")
	private WebElement VehicleLogsPageAddVehicleVehicleColourTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtMPGCity")
	private WebElement VehicleLogsPageAddVehicleVehicleMPGCityTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtMPGHighway")
	private WebElement VehicleLogsPageAddVehicleVehicleMPGHighwayTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtMileage")
	private WebElement VehicleLogsPageAddVehicleVehicleMileageTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_imgButtonInsert")
	private WebElement VehicleLogsPageAddVehicleVehiclePhotoInsertIcon;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_Button3")
	private WebElement VehicleLogsPageAddVehicleSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_Button4")
	private WebElement VehicleLogsPageAddVehicleCancelButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement VehicleLogsPageAddVehicleDoneButton;
	
	
	//Fuel Log Page....
	@FindBy(id="ctl00_VehicleModule1_aFuelLog")
	private WebElement VehicleLogsFuelLogPage;
	
	@FindBy(id="ctl00_MainContent_txtFilter")
	private WebElement VehicleLogsFuelLogSearchTextBox;
	
	@FindBy(id="ctl00_MainContent_btnSearch")
	private WebElement VehicleLogsFuelLogSearchButton;
	
	@FindBy(id="ctl00_MainContent_btnDelete")
	private WebElement VehicleLogsFuelLogDeleteFuelLogButton;
	
	
	//Add Fuel Button....
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement VehicleLogsFuelLogAddFuelButton;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_ddlVehicle")
	private WebElement FuelLogAddFuelVehicleNameListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtDatePurchasedInsert")
	private WebElement FuelLogAddFuelDatePurchasedTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtTimePurchasedInsert")
	private WebElement FuelLogAddFuelTimePurchasedTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_OdometerReadingTextBox")
	private WebElement FuelLogAddFuelOdometerReadingTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtTotalGallons")
	private WebElement FuelLogAddFuelTotalGallonsTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtTotalCost")
	private WebElement FuelLogAddFuelTotalCostTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_InsertButton")
	private WebElement FuelLogAddFuelSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_InsertCancelButton")
	private WebElement FuelLogAddFuelCancelButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement FuelLogAddFuelDoneButton;
	
	
	//Mileage Log Page....
	@FindBy(id="ctl00_VehicleModule1_aMileageLog")
	private WebElement VehicleLogsMileageLogPage;
	
	@FindBy(id="ctl00_MainContent_txtFilter")
	private WebElement VehicleLogsMileageLogSearchTextBox;
	
	@FindBy(id="ctl00_MainContent_btnSearch")
	private WebElement VehicleLogsMileageLogSearchButton;
	
	@FindBy(id="ctl00_MainContent_btnDelete")
	private WebElement VehicleLogsMileageLogDeleteMileageLogButton;
	
	
	//Add Mileage Log Button....
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement VehicleLogsMileageLogAddMileageButton;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_ddlVehicle")
	private WebElement MileageLogAddMileageVehicleNameListBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtDescription")
	private WebElement MileageLogAddMileageTaskTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_DateTextBox")
	private WebElement MileageLogAddMileageDateTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_OdometerBeginInsertTextBox")
	private WebElement MileageLogAddMileageOdometerBeginTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_OdometerEndInsertTextBox")
	private WebElement MileageLogAddMileageOdometerEndTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_MilesTraveledInsertTextBox")
	private WebElement MileageLogAddMileageMilesTravelledTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_NotesTextBox")
	private WebElement MileageLogAddMileageNotesTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_InsertButton")
	private WebElement MileageLogAddMileageSaveButton;
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_InsertCancelButton")
	private WebElement MileageLogAddMileageCancelButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement MileageLogAddMileageDoneButton;
	
	
	
	
	
	
	
	public void selectVehicleLogsPage()
	{
		VehicleLogsPage.click();
	}
	
	//Dashboard Page....
	public void selectVehicleLogsDashboardPage()
	{
		VehicleLogsDashboardPage.click();
	}
	
	public void filterByVehicleFromVehicleLogsDashboardPage(String vehicleName)
	{
		GenericUtils.selectbyVisibletext(VehicleLogsDashboardPageFilterByVehicleListBox, vehicleName);
	}
	
	public void enterDateRangeFromTextBox(String date)
	{
		VehicleLogsDashboardPageDateRangeFromTextBox.sendKeys(date);
	}
	
	public void enterDateRangeToTextBox(String date)
	{
		VehicleLogsDashboardPageDateRangeToTextBox.sendKeys(date);
	}
	
	public void clickGoButtonAtDashboardPage()
	{
		VehicleLogsDashboardPageGoButton.click();
	}
	
	
	//Vehicle Log Page..
	public void clickVehicleLogPage()
	{
		VehicleLogsVehicleLogPage.click();
	}
	
	public void enterVehicleNameToSearchAtVehicleLogPage(String vehicle)
	{
		VehicleLogsPageSearchTextBox.sendKeys(vehicle);
	}
	
	public void clickToSearchVehicleAtVehicleLogPage()
	{
		VehicleLogsPageSearchButton.click();
	}
	
	public void clickToAddVehicleAtVehicleLogPage()
	{
		VehicleLogsPageAddVehicleButton.click();
	}
	
	public void enterVehicleIdAtAddNewVehiclePage(String id)
	{
		VehicleLogsPageAddVehicleVehicleIdTextBox.sendKeys(id);
	}
	
	public void enterVehicleMakeAtAddNewVehiclePage(String vehicleMake)
	{
		VehicleLogsPageAddVehicleVehicleMakeTextBox.sendKeys(vehicleMake);
	}
	
	public void enterVehicleModelAtAddNewVehiclePage(String vehicleModel)
	{
		VehicleLogsPageAddVehicleVehicleModelTextBox.sendKeys(vehicleModel);
	}
	
	public void enterVehicleManufacturedYearAtAddNewVehiclePage(String year)
	{
		VehicleLogsPageAddVehicleVehicleManufacturedYearTextBox.sendKeys(year);
	}
	
	public void enterVehicleColourAtAddNewVehiclePage(String vehicleColour)
	{
		VehicleLogsPageAddVehicleVehicleColourTextBox.sendKeys(vehicleColour);
	}
	
	public void enterVehicleMPGCitytAddNewVehiclePage(String MPGCity)
	{
		VehicleLogsPageAddVehicleVehicleMPGCityTextBox.sendKeys(MPGCity);
	}
	
	public void enterVehicleMPGHighwayAtAddNewVehiclePage(String MPGHighway)
	{
		VehicleLogsPageAddVehicleVehicleMPGHighwayTextBox.sendKeys(MPGHighway);
	}
	
	public void enterVehicleMileageAtAddNewVehiclePage(String mileage)
	{
		VehicleLogsPageAddVehicleVehicleMileageTextBox.sendKeys(mileage);
	}
	
	public void clickToAddVehiclePhotodAtAddNewVehiclePage()
	{
		VehicleLogsPageAddVehicleVehiclePhotoInsertIcon.click();
	}
	
	public void clickToSaveVehicleInformationAtAddNewVehiclePage()
	{
		VehicleLogsPageAddVehicleSaveButton.click();
	}
	
	public void clickDoneAtAddNewVehiclePage()
	{
		VehicleLogsPageAddVehicleDoneButton.click();
	}
	
	//Fuel Log Page..
	public void clickFuelLogPage()
	{
		VehicleLogsFuelLogPage.click();
	}
	
	//Search Fuel Log..
	public void enterFuelLogToSearch(String fuelLog)
	{
		VehicleLogsFuelLogSearchTextBox.sendKeys(fuelLog);
	}
	
	public void enterFuelLogToSearch()
	{
		VehicleLogsFuelLogSearchButton.click();
	}
	
	//Add Fuel Log....
	public void clickToAddFuelLog()
	{
		VehicleLogsFuelLogAddFuelButton.click();
	}
	
	public void selectVehicleNameToAddFuelLog(String vehicleName)
	{
		GenericUtils.selectbyVisibletext(VehicleLogsFuelLogAddFuelButton, vehicleName);
	}
	
	public void enterVehiclePurchasedDateToAddFuelLog(String datePurchased)
	{
		FuelLogAddFuelDatePurchasedTextBox.sendKeys(datePurchased);
	}
	
	public void enterVehiclePurchasedTimeToAddFuelLog(String timePurchased)
	{
		FuelLogAddFuelTimePurchasedTextBox.sendKeys(timePurchased);
	}
	
	public void enterOdometerReadingToAddFuelLog(String odometerReading)
	{
		FuelLogAddFuelOdometerReadingTextBox.sendKeys(odometerReading);
	}
	
	public void enterTotalGallosToAddFuelLog(String totalGallons)
	{
		FuelLogAddFuelTotalGallonsTextBox.sendKeys(totalGallons);
	}
	
	public void enterTotalCostToAddFuelLog(String totalCost)
	{
		FuelLogAddFuelTotalCostTextBox.sendKeys(totalCost);
	}
	
	public void clickSaveToAddNewFuelLog()
	{
		FuelLogAddFuelSaveButton.click();
	}
	
	public void clickDoneToAddNewFuelLog()
	{
		FuelLogAddFuelDoneButton.click();
	}
	
	//Mileage Log Page..
	public void clickMileageLogPage()
	{
		VehicleLogsMileageLogPage.click();
	}
		
	//Search Mileage Log..
	public void enterMileageLogToSearch(String fuelLog)
	{
		VehicleLogsMileageLogSearchTextBox.sendKeys(fuelLog);
	}
		
	public void enterMileageLogToSearch()
	{
		VehicleLogsMileageLogSearchButton.click();
	}
	
	//Add Mileage Log..
	public void clickToAddMileageLog()
	{
		VehicleLogsMileageLogAddMileageButton.click();
	}
	
	public void selectVehicleNameToAddMileageLog(String vehicleName)
	{
		GenericUtils.selectbyVisibletext(MileageLogAddMileageVehicleNameListBox, vehicleName);
	}
	
	public void enterTaskToAddMileageLog(String task)
	{
		MileageLogAddMileageTaskTextBox.sendKeys(task);
	}
	
	public void enterDateToAddMileageLog(String datePurchased)
	{
		MileageLogAddMileageDateTextBox.sendKeys(datePurchased);
	}
	
	public void enterOdometerBeginningReadingToAddMileageLog(String odometerBegin)
	{
		MileageLogAddMileageOdometerBeginTextBox.sendKeys(odometerBegin);
	}
	
	public void enterOdometerEndingReadingToAddMileageLog(String odometerEnd)
	{
		MileageLogAddMileageOdometerEndTextBox.sendKeys(odometerEnd);
	}
	
	public void enterMilesTravelledToAddMileageLog(String milesTravelled)
	{
		MileageLogAddMileageMilesTravelledTextBox.sendKeys(milesTravelled);
	}
	
	public void enterNotesToAddMileageLog(String notes)
	{
		MileageLogAddMileageNotesTextBox.sendKeys(notes);
	}
	
	public void clickSaveToAddNewMileageLog()
	{
		MileageLogAddMileageSaveButton.click();
	}
	
	public void clickDoneToAddNewMileageLog()
	{
		MileageLogAddMileageDoneButton.click();
	}
	
		
}
