package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class SuperPage.
 */
public class SuperPage {
	
	/** The driver. */
	WebDriver driver;
	
	/**
	 * Instantiates a new super page.
	 *
	 * @param driver the driver
	 */
	public SuperPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/** The Home page messages link. */
	@FindBy(id="ctl00_pnlCommunication")
	private WebElement HomePageMessagesLink;
	
	/** The Home page project set up link. */
	@FindBy(id="ctl00_pnlSetUp")
	private WebElement HomePageProjectSetUpLink;
	
	/** The Home page plan link. */
	@FindBy(id="ctl00_pnlPlan")
	private WebElement HomePagePlanLink;
	
	/** The Home page procure link. */
	@FindBy(id="ctl00_pnlProcurement")
	private WebElement HomePageProcureLink;
	
	/** The Home page manage link. */
	@FindBy(id="ctl00_pnlManage")
	private WebElement HomePageManageLink;
	
	/** The Home page financial link. */
	@FindBy(id="ctl00_pnlFinancial")
	private WebElement HomePageFinancialLink;
	
	/** The Home page field 360 link. */
	@FindBy(id="ctl00_pnlService")
	private WebElement HomePageField360Link;
	
	/** The Home page inventory link. */
	@FindBy(id="ctl00_pnlInventory")
	private WebElement HomePageInventoryLink;
	
	/** The Home page logs link. */
	@FindBy(id="ctl00_pnlLogs")
	private WebElement HomePageLogsLink;
	
	/** The Home page vehical logs link. */
	@FindBy(id="ctl00_pnlVehicles")
	private WebElement HomePageVehicalLogsLink;
	
	/** The Home page time sheet link. */
	@FindBy(id="ctl00_pnlTimesheet")
	private WebElement HomePageTimeSheetLink;
	
	/** The Home page documents link. */
	@FindBy(id="ctl00_pnlDocuments")
	private WebElement HomePageDocumentsLink;
	
	/** The Home page design link. */
	@FindBy(id="ctl00_pnlDesign")
	private WebElement HomePageDesignLink;
	
	/** The Home page contacts link. */
	@FindBy(id="ctl00_pnlContacts")
	private WebElement HomePageContactsLink;
	
	/** The Home page reports link. */
	@FindBy(id="ctl00_pnlReports")
	private WebElement HomePageReportsLink;
	
	/** The Home page templates link. */
	@FindBy(id="ctl00_pnlTemplates")
	private WebElement HomePageTemplatesLink;
	
	/** The Home page warranty link. */
	@FindBy(id="ctl00_pnlWarranty")
	private WebElement HomePageWarrantyLink;
	
	/** The Home page bid center link. */
	@FindBy(id="ctl00_pnlBids")
	private WebElement HomePageBidCenterLink;	

	/**
	 * Click on messages link.
	 */
	public void clickOnMessagesLink()
	{
		HomePageMessagesLink.click();
	}
	
	/**
	 * Click on project set up link.
	 */
	public void clickOnProjectSetUpLink()
	{
		HomePageProjectSetUpLink.click();
	}
	
	/**
	 * Click on plan link.
	 */
	public void clickOnPlanLink()
	{
		HomePagePlanLink.click();
	}
	
	/**
	 * Click on procure link.
	 */
	public void clickOnProcureLink()
	{
		HomePageProcureLink.click();
	}
	
	/**
	 * Click on manage link.
	 */
	public void clickOnManageLink()
	{
		HomePageManageLink.click();
	}
	
	/**
	 * Click on financial link.
	 */
	public void clickOnFinancialLink()
	{
		HomePageFinancialLink.click();
	}
	
	/**
	 * Click on field 360 link.
	 */
	public void clickOnField360Link()
	{
		HomePageField360Link.click();
	}
	
	/**
	 * Click on inventory link.
	 */
	public void clickOnInventoryLink()
	{
		HomePageInventoryLink.click();
	}
	
	/**
	 * Click on logs link.
	 */
	public void clickOnLogsLink()
	{
		HomePageLogsLink.click();
	}
	
	/**
	 * Click on vehical logs link.
	 */
	public void clickOnVehicalLogsLink()
	{
		HomePageVehicalLogsLink.click();
	}
	
	/**
	 * Click on time sheet link.
	 */
	public void clickOnTimeSheetLink()
	{
		HomePageTimeSheetLink.click();
	}
	
	/**
	 * Click on documents link.
	 */
	public void clickOnDocumentsLink()
	{
		HomePageDocumentsLink.click();
	}
	
	/**
	 * Click on design link.
	 */
	public void clickOnDesignLink()
	{
		HomePageDesignLink.click();
	}
	
	/**
	 * Click on contacts link.
	 */
	public void clickOnContactsLink()
	{
		HomePageContactsLink.click();
	}
	
	/**
	 * Click on reports link.
	 */
	public void clickOnReportsLink()
	{
		HomePageReportsLink.click();
	}
	
	/**
	 * Click on templates link.
	 */
	public void clickOnTemplatesLink()
	{
		HomePageTemplatesLink.click();
	}
	
	/**
	 * Click on warranty link.
	 */
	public void clickOnWarrantyLink()
	{
		HomePageWarrantyLink.click();
	}
	
	/**
	 * Click on bid center link.
	 */
	public void clickOnBidCenterLink()
	{
		HomePageBidCenterLink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
