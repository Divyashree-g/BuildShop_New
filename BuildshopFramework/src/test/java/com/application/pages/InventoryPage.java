package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.libraries.GenericUtils;

public class InventoryPage {
	WebDriver driver;
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ctl00_pnlInventory")
	private WebElement inventoryInHomePage;
	
	@FindBy(id="ctl00_InventoryModule1_aInventory")
	private WebElement inventoryInventoryTab;
	
	@FindBy(id="ctl00_MainContent_GridViewInventoryCategories_ctl02_btnAccountType")
	private WebElement inventoryCategoryLink;
	
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement inventoryAddItemButton;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_ItemNameTextBox")
	private WebElement inventoryAddItemItemInformationItemNameTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_AccountCodeTextBox")
	private WebElement inventoryAddItemItemInformationAccountCodeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_AssetCodeTextBox")
	private WebElement inventoryAddItemItemInformationAssetCodeTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_PartNumberTextBox")
	private WebElement inventoryAddItemItemInformationPartNumberTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_ItemDescriptionTextBox")
	private WebElement inventoryAddItemItemInformationItemDescriptionTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_SupplierCostExTaxTextBox")
	private WebElement inventoryAddItemPriceInformationSupplierCostNoTaxTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_MarkUpPercentageTextBox")
	private WebElement inventoryAddItemPriceInformationMarkUpPercentageTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_PriceEachExTaxTextBox")
	private WebElement inventoryAddItemPriceInformationPriceEachNoTaxTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_cbApplyTaxRate")
	private WebElement inventoryAddItemPriceInformationApplyTaxRateCheckBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_ddlTaxRate")
	private WebElement inventoryAddItemPriceInformationTaxRateDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_PriceWithTaxTextBox")
	private WebElement inventoryAddItemPriceInformationPriceWithTaxTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_IsInventoryCheckBox")
	private WebElement inventoryAddItemInventoryInformationInventoryCheckBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_IsDiscountedCheckBox")
	private WebElement inventoryAddItemInventoryInformationDiscountedCheckBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_IsActiveCheckBox")
	private WebElement inventoryAddItemInventoryInformationActiveCheckBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_QuantityTextBox")
	private WebElement inventoryAddItemAdditionalInformationQuantityTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_ddlUnit")
	private WebElement inventoryAddItemAdditionalInformationUnitDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryInsert_InsertButton")
	private WebElement inventoryAddItemSaveButton;
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement inventoryAddItemDoneButton;
	
	@FindBy(id="ctl00_InventoryModule1_aInventoryCategories")
	private WebElement inventoryCategoriesTab;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryCategories_TitleTextBox")
	private WebElement inventoryCategoriesAddaCategoryTextBox;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryCategories_ddlType")
	private WebElement inventoryCategoriesCategoryTypeDropDown;
	
	@FindBy(id="ctl00_MainContent_FormViewInventoryCategories_InsertButton")
	private WebElement inventoryCategoriesInsertButton;
	
	public void clickOnInventoryInHomePage()
	{
		inventoryInHomePage.click();
	}
	public void clickOnInventoryTab()
	{
		inventoryInventoryTab.click();
	}
	public void clickOnCategoryLink()
	{
		inventoryCategoryLink.click();
	}
	public void clickOnInventoryAddItemButton()
	{
		inventoryAddItemButton.click();
	}
	public void enterInventoryAddItemItemInformationItemNameTextBox(String itemname)
	{
		inventoryAddItemItemInformationItemNameTextBox.sendKeys(itemname);
	}
	public void enterInventoryAddItemItemInformationAccountCodeTextBox(String accountcode)
	{
		inventoryAddItemItemInformationAccountCodeTextBox.sendKeys(accountcode);
	}
	public void enterInventoryAddItemItemInformationAssetCodeTextBox(String assetcode)
	{
		inventoryAddItemItemInformationAssetCodeTextBox.sendKeys(assetcode);
	}
	public void enterInventoryAddItemItemInformationPartNumberTextBox(String partnumber)
	{
		inventoryAddItemItemInformationPartNumberTextBox.sendKeys(partnumber);
	}
	public void enterInventoryAddItemItemInformationItemDescriptionTextBox(String itemdescription)
	{
		inventoryAddItemItemInformationItemDescriptionTextBox.sendKeys(itemdescription);
	}
	public void enterInventoryAddItemPriceInformationSupplierCostNoTaxTextBox(String suppliercostnotax)
	{
		inventoryAddItemPriceInformationSupplierCostNoTaxTextBox.clear();
		inventoryAddItemPriceInformationSupplierCostNoTaxTextBox.sendKeys(suppliercostnotax);
	}
	public void enterInventoryAddItemPriceInformationMarkUpPercentageTextBox(String markuppercentage)
	{
		inventoryAddItemPriceInformationMarkUpPercentageTextBox.clear();
		inventoryAddItemPriceInformationMarkUpPercentageTextBox.sendKeys(markuppercentage);
	}
	public void enterInventoryAddItemPriceInformationPriceEachNoTaxTextBox(String priceeachnotax)
	{
		inventoryAddItemPriceInformationPriceEachNoTaxTextBox.clear();
		inventoryAddItemPriceInformationPriceEachNoTaxTextBox.sendKeys(priceeachnotax);
	}
	public void clickOnInventoryAddItemPriceInformationApplyTaxRateCheckBox()
	{
		inventoryAddItemPriceInformationApplyTaxRateCheckBox.click();
	}
	public void selectInventoryAddItemPriceInformationTaxRateDropDown(String taxrate)
	{
		GenericUtils.selectbyVisibletext(inventoryAddItemPriceInformationTaxRateDropDown, taxrate);
	}
	public void enterInventoryAddItemPriceInformationPriceWithTaxTextBox(String pricewithtax)
	{
		inventoryAddItemPriceInformationPriceWithTaxTextBox.clear();
		inventoryAddItemPriceInformationPriceWithTaxTextBox.sendKeys(pricewithtax);
	}
	public void clickOnInventoryAddItemInventoryInformationInventoryCheckBox()
	{
		inventoryAddItemInventoryInformationInventoryCheckBox.click();
	}
	public void clickOnInventoryAddItemInventoryInformationDiscountedCheckBox()
	{
		inventoryAddItemInventoryInformationDiscountedCheckBox.click();
	}
	public void clickOnInventoryAddItemInventoryInformationActiveCheckBox()
	{
		inventoryAddItemInventoryInformationActiveCheckBox.click();
	}
	public void enterInventoryAddItemAdditionalInformationQuantityTextBox(String quantity)
	{
		inventoryAddItemAdditionalInformationQuantityTextBox.sendKeys(quantity);
	}
	public void selectInventoryAddItemAdditionalInformationUnitDropDown(String unit)
	{
		GenericUtils.selectbyVisibletext(inventoryAddItemAdditionalInformationUnitDropDown, unit);
	}
	public void clickOnInventoryAddItemSaveButton()
	{
		inventoryAddItemSaveButton.click();
	}
	public void clickOnInventoryAddItemDoneButton()
	{
		inventoryAddItemDoneButton.click();
	}
	public void clickOnInventoryCategoriesTab()
	{
		inventoryCategoriesTab.click();
	}
	public void enterInventoryAddaCategoryTextBox(String addacategory)
	{
		inventoryCategoriesAddaCategoryTextBox.sendKeys(addacategory);
	}
	public void selectInventoryCategoriesCategoryTypeDropDown(String categorytype)
	{
		GenericUtils.selectbyVisibletext(inventoryCategoriesCategoryTypeDropDown, categorytype);
	}
	public void clickOnInventoryCategoriesInsertButton()
	{
		inventoryCategoriesInsertButton.click();
	}
}
