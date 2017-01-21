package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.libraries.GenericUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class FinancialPage.
 */
public class FinancialPage extends SuperPage{
	
	/** The driver. */
	WebDriver driver;
	
	/**
	 * Instantiates a new financial page.
	 *
	 * @param driver the driver
	 */
	public FinancialPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		;
	}
	
	/** The financial link. */
	@FindBy(id="ctl00_pnlFinancial")
	private WebElement financialLink;
	
	/** The budget expence tab. */
	//-------------Start of sub-Modules of FinancialPage------------------------
	@FindBy(id="ctl00_FinancialModule1_aBudgetExpenseLog")
	private WebElement budgetExpenceTab;
	
	/** The invoice tab. */
	@FindBy(id="ctl00_FinancialModule1_aInvoices")
	private WebElement invoiceTab;
	
	/** The purchase order tab. */
	@FindBy(id="ctl00_FinancialModule1_aPurchaseOrders")
	private WebElement purchaseOrderTab;
	
	/** The over view tab. */
	@FindBy(id="ctl00_FinancialModule1_aOverView")
	private WebElement overViewTab;
	
	/** The add business category tab. */
	@FindBy(id="ctl00_MainContent_AccordionPane1_header")
	private WebElement addBusinessCategoryTab;
	
	/** The business categories tab. */
	@FindBy(id="ctl00_MainContent_AccordionPane2_header")
	private WebElement businessCategoriesTab;
	
	/** The add business category text box. */
	@FindBy(id="ctl00_MainContent_AccordionPane1_content_AccountIDTextBox")
	private WebElement addBusinessCategoryTextBox;
	
	/** The business category save button. */
	@FindBy(id="ctl00_MainContent_AccordionPane1_content_InsertButton")
	private WebElement businessCategorySaveButton;
	
	/** The close business category message. */
	@FindBy(id="ctl00_MainContent_AccordionPane1_content_InsertCancelButton")
	private WebElement closeBusinessCategoryMessage;
	
	/** The select A business category tab. */
	@FindBy(id="ctl00_MainContent_AccordionPane2_content_GridViewBusinessAccountType_ctl02_btnAccountName")
	private WebElement selectABusinessCategoryTab;
	
	/** The delete A business category tab. */
	@FindBy(id="ctl00_MainContent_AccordionPane2_content_GridViewBusinessAccountType_ctl02_ibDelete")
	private WebElement deleteABusinessCategoryTab;
	
	/** The add item in business category text box. */
	@FindBy(id="ctl00_MainContent_FormViewEstIns_DateTextBox")
	private WebElement addItemInBusinessCategoryTextBox;
	
	/** The add description in business category text box. */
	@FindBy(id="ctl00_MainContent_FormViewEstIns_ItemTextBox")
	private WebElement addDescriptionInBusinessCategoryTextBox;
	
	/** The total business category text box. */
	@FindBy(id="ctl00_MainContent_FormViewEstIns_TotalTextBox")
	private WebElement totalBusinessCategoryTextBox;
	
	/** The add budget in business category button. */
	@FindBy(id="ctl00_MainContent_FormViewEstIns_InsertButton")
	private WebElement addBudgetInBusinessCategoryButton;
	
	/** The add expence items for A business cartegory link. */
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_lbAddExpense")
	private WebElement addExpenceItemsForABusinessCartegoryLink;
	
	/** The view expence items for A business cartegory icon. */
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_imgBtnShow")
	private WebElement viewExpenceItemsForABusinessCartegoryIcon;
				
	/** The check trans number in expence text field. */
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_CheckTransNumberLabel")
	private WebElement checkTransNumberInExpenceTextField;
	
	/** The enter check trans number in expence text field. */
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_CheckTransNumber")
	private WebElement enterCheckTransNumberInExpenceTextField;
	
	/** The description in expence text field. */
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_DescriptionLabel")
	private WebElement descriptionInExpenceTextField;

	/** The enter description in expence text field. */
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_Description")
	private WebElement enterDescriptionInExpenceTextField;
	
	/** The amount in expence text field. */
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_AmountLabel")
	private WebElement amountInExpenceTextField;

	/** The enter amount in expence text field. */
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_Amount")
	private WebElement enterAmountInExpenceTextField;

	/** The variance in expence. */
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_lblVariance")
	private WebElement varianceInExpence;
	
	/** The delete added expence item icon. */
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_imgEdit")
	private WebElement deleteAddedExpenceItemIcon;
	
	/** The delete added expence item button. */
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_LinkButton2")
	private WebElement deleteAddedExpenceItemButton;
	
	/** The delete expence button. */
	@FindBy(id="ctl00_MainContent_DataPagerGridView1_ctl02_ibDelete")
	private WebElement deleteExpenceButton;
	
	/** The add invoices button. */
	@FindBy(id="ctl00_MainContent_btnAddInvoice")
	private WebElement addInvoicesButton;
	
	/** The invoice title text field. */
	@FindBy(id="ctl00_MainContent_FormView1_ItemTextBox")
	private WebElement invoiceTitleTextField;
	
	/** The invoice date text field. */
	@FindBy(id="ctl00_MainContent_FormView1_DateTextBox")
	private WebElement invoiceDateTextField;
	
	/** The select A customer drop down. */
	@FindBy(id="ctl00_MainContent_FormView1_ddlVendor")
	private WebElement selectACustomerDropDown;
	
	/** The select A project. */
	@FindBy(id="ctl00_MainContent_FormView1_ddlProject")
	private WebElement selectAProject;
	
	/** The invoices save button. */
	@FindBy(id="ctl00_MainContent_FormView1_InsertButton")
	private WebElement invoicesSaveButton;
	
	/** The invoices cancel button. */
	@FindBy(id="ctl00_MainContent_FormView1_InsertCancelButton")
	private WebElement invoicesCancelButton;
	
	/** The close add invoice pop up. */
	@FindBy(id="ctl00_MainContent_LinkButton1")
	private WebElement closeAddInvoicePopUp;
	

	/** The purchase order name text field. */
	@FindBy(id="ctl00_MainContent_FormView1_ItemTextBox")
	private WebElement purchaseOrderNameTextField;
    
    /** The purchase order date text field. */
    @FindBy(id="ctl00_MainContent_FormView1_DateTextBox")
    public WebElement purchaseOrderDateTextField; 
    
    /** The purchase order vendor drop down. */
    @FindBy(id="ctl00_MainContent_FormView1_ddlVendor")
    public WebElement purchaseOrderVendorDropDown; 
    
    /** The purchase order project drop down. */
    @FindBy(id="ctl00_MainContent_FormView1_ddlProject")
    public WebElement purchaseOrderProjectDropDown;     
     
    /** The add purchase order button. */
    @FindBy(id="ctl00_MainContent_FormView1_InsertButton")
    public WebElement addPurchaseOrderButton; 
    
	/**
	 * Click on finance module in home page.
	 */
	public void clickOnFinanceModuleInHomePage()
	{
		financialLink.click();
	}

	/**
	 * Click on budget expence tab.
	 */
	public void clickOnBudgetExpenceTab()
	{
		budgetExpenceTab.click();
	}
	
	/**
	 * Click on invoice expence tab.
	 */
	public void clickOnInvoiceExpenceTab()
	{
		invoiceTab.click();
	}
	
	/**
	 * Click on purchase order expence tab.
	 */
	public void clickOnPurchaseOrderExpenceTab()
	{
		purchaseOrderTab.click();
	}
	
	/**
	 * Click on add business category.
	 */
	public void clickOnAddBusinessCategory()
	{
		addBusinessCategoryTab.click();
	}
	
	/**
	 * Enterbusiness category.
	 *
	 * @param businessCategory the business category
	 */
	public void enterbusinessCategory(String businessCategory)
	{
		addBusinessCategoryTextBox.sendKeys(businessCategory);
	}
	
	/**
	 * Click on business category save button.
	 */
	public void clickOnBusinessCategorySaveButton()
	{
		businessCategorySaveButton.click();
		closeBusinessCategoryMessage.click();
	}
	
	/**
	 * Click business categories tab.
	 */
	public void clickBusinessCategoriesTab()
	{
		businessCategoriesTab.click();
	}
	
	/**
	 * Click on select business category tab.
	 */
	public void clickOnSelectBusinessCategoryTab()
	{
		selectABusinessCategoryTab.click();
	}
	
	/**
	 * Click on delete business category tab.
	 */
	public void clickOnDeleteBusinessCategoryTab()
	{
		deleteABusinessCategoryTab.click();
	}
	
	/**
	 * Enter in add item in business category text box.
	 *
	 * @param addItemNumber the add item number
	 */
	public void enterInAddItemInBusinessCategoryTextBox(String addItemNumber)
	{
		addItemInBusinessCategoryTextBox.sendKeys(addItemNumber);
	}
	
	/**
	 * Enter in add description in business category text box.
	 *
	 * @param addDescription the add description
	 */
	public void enterInAddDescriptionInBusinessCategoryTextBox(String addDescription)
	{
		addDescriptionInBusinessCategoryTextBox.sendKeys(addDescription);
	}
	
	/**
	 * Enter total business category text box.
	 *
	 * @param itemTotal the item total
	 */
	public void enterTotalBusinessCategoryTextBox(String itemTotal)
	{
		totalBusinessCategoryTextBox.sendKeys(itemTotal);
	}
	
	/**
	 * Click on add budget in business category button.
	 */
	public void clickOnAddBudgetInBusinessCategoryButton()
	{
		addBudgetInBusinessCategoryButton.click();
	}
	
	/**
	 * Click on add expence items for A business cartegory link.
	 */
	public void clickOnAddExpenceItemsForABusinessCartegoryLink()
	{
		addExpenceItemsForABusinessCartegoryLink.click();
	}
	
	/**
	 * Click on view expence items for A business cartegory icon.
	 */
	public void clickOnViewExpenceItemsForABusinessCartegoryIcon()
	{
		viewExpenceItemsForABusinessCartegoryIcon.click();	
	}
	
	/**
	 * Enter check trans number in expence text field.
	 *
	 * @param checkTransNumber the check trans number
	 */
	public void enterCheckTransNumberInExpenceTextField(String checkTransNumber)
	{
		checkTransNumberInExpenceTextField.click();
		enterCheckTransNumberInExpenceTextField.sendKeys(checkTransNumber);
	}
	
	/**
	 * Enter description in expence text field.
	 *
	 * @param budgetDescription the budget description
	 */
	public void enterDescriptionInExpenceTextField(String budgetDescription)
	{
		descriptionInExpenceTextField.click();
		enterDescriptionInExpenceTextField.sendKeys(budgetDescription);
	}
	
	/**
	 * Enter amount in expence text field.
	 *
	 * @param budgetAmount the budget amount
	 */
	public void enterAmountInExpenceTextField(String budgetAmount)
	{
		amountInExpenceTextField.click();
		enterAmountInExpenceTextField.sendKeys(budgetAmount);
	}

	/**
	 * Click on invoices tab.
	 */
	public void clickOnInvoicesTab()
	{
		invoiceTab.click();
	}
	
	/**
	 * Click on add invoices button.
	 */
	public void clickOnAddInvoicesButton()
	{
		addInvoicesButton.click();
	}
	
	/**
	 * Enter invoice title text field.
	 *
	 * @param invoiceTitle the invoice title
	 */
	public void enterInvoiceTitleTextField(String invoiceTitle)
	{
		invoiceTitleTextField.sendKeys(invoiceTitle);
	}
	
	/**
	 * Enter invoice date text field.
	 *
	 * @param invoiceDate the invoice date
	 */
	public void enterInvoiceDateTextField(String invoiceDate)
	{
		invoiceDateTextField.clear();
		invoiceDateTextField.sendKeys(invoiceDate);
	}
	
	/**
	 * Click on customer from drop down.
	 *
	 * @param customer the customer
	 */
	public void clickOnCustomerFromDropDown(String customer)
	{
		GenericUtils.selectbyVisibletext(selectACustomerDropDown, customer);
	}
	
	/**
	 * Click on project from drop down.
	 *
	 * @param project the project
	 */
	public void clickOnProjectFromDropDown(String project)
	{
		GenericUtils.selectbyVisibletext(selectAProject, project);
	}
	 
	/**
	 * Click on invoice save button.
	 */
	public void clickOnInvoiceSaveButton()
	{
		invoicesSaveButton.click();
	}
	
	/**
	 * Click on invoice cancel button.
	 */
	public void clickOnInvoiceCancelButton()
	{
		invoicesCancelButton.click();
	}
	
	/**
	 * Click to close invoice pop up.
	 */
	public void clickToCloseInvoicePopUp()
	{
		closeAddInvoicePopUp.click();
	}	 
	
    /**
     * Enter purchase order name.
     *
     * @param purchaseOrder the purchase order
     */
    public void enterPurchaseOrderName(String purchaseOrder)
    {
    	purchaseOrderNameTextField.sendKeys(purchaseOrder);
    }
	
    /**
     * Enter purchase order date.
     *
     * @param purchaseOrderDate the purchase order date
     */
    public void enterPurchaseOrderDate(String purchaseOrderDate)
    {
    	purchaseOrderDateTextField.clear();
    	purchaseOrderDateTextField.sendKeys(purchaseOrderDate);
    }
	
	/**
	 * Select A vendor from drop down.
	 *
	 * @param vendor the vendor
	 */
	public void selectAVendorFromDropDown(String vendor)
	{
		GenericUtils.selectbyVisibletext(purchaseOrderVendorDropDown, vendor);
	}
	
	/**
	 * Select A project from drop down.
	 *
	 * @param project the project
	 */
	public void selectAProjectFromDropDown(String project)
	{
		GenericUtils.selectbyVisibletext(purchaseOrderProjectDropDown, project);
	}
	
	/**
	 * Click on add purchase order button.
	 */
	public void clickOnAddPurchaseOrderButton()
	{
		addPurchaseOrderButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}