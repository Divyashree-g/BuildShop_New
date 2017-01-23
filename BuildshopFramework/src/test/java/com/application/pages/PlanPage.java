package com.application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.application.libraries.GenericUtils;

public class PlanPage {
	

	WebDriver driver;
	public PlanPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//-------------Start of sub-Modules of FinancialPage-----------------
	
	/** The Dashboard tab. */
	@FindBy (id="ctl00_FinancialModule1_hylFinancialDashboard" )
	private WebElement DashboardTab;
	
	public void ClickDashboard()
	{
		DashboardTab.click();
	}
		
	/** The Drawings tab. */
	@FindBy (id="ctl00_PlanModule1_aDrawings" )
	private WebElement DrawingsTab;
	
	public void ClickDrawings()
	{
		DrawingsTab.click();
	}
	
	/** The Scope tab. */
	@FindBy (id="ctl00_PlanModule1_aScopeofwork" )
	private WebElement ScopeTab;
	
	public void ClickScope()
	{
		ScopeTab.click();
	}
		
	/** The Estimate tab. */
	@FindBy (id="ctl00_PlanModule1_hylSumEstimate" )
	private WebElement EstimateTab;
	
	public void ClickEstimate()
	{
		EstimateTab.click();
	}
	
	/** The Schedule tab. */
	@FindBy (id="ctl00_PlanModule1_aSchListView")
	private WebElement ScheduleTab;
	
	public void ClickSchedule()
	{
		ScheduleTab.click();
	}
	
	/** The Selections tab. */	
	@FindBy (id="ctl00_PlanModule1_aSelections" )
	private WebElement SelectionsTab;
	
	public void ClickSelections()
	{
		SelectionsTab.click();
	}
		
	/** The PaymentSchedule tab. */	
	@FindBy (id="ctl00_PlanModule1_aPaymentSchedule" )
	private WebElement Payment_ScheduleTab;
	
	public void ClickPaymentScheduleTab()
	{
		Payment_ScheduleTab.click();
	}
	
	/** The Risk Manager tab. */	
	@FindBy (id="ctl00_PlanModule1_aRiskManager")
	private WebElement Risk_ManagerTab;
	
	public void ClickRisk_Manager()
	{
		Risk_ManagerTab.click();
	}
	
	/** Elements in Drawings Tab   */
	@FindBy (id="ctl00_MainContent_GridViewDocuments_ctl02_lnkDownload")
	private WebElement DrawingsTab_Pdf_download;
	
	public void Pdf_download()
	{
		DrawingsTab_Pdf_download.click();
	
	}
	
	@FindBy (id="ctl00_MainContent_GridViewDocuments_ctl02_lnkDelete")
	private WebElement DrawingsTab_Pdf_delete;
	
	public void Pdf_delete()
	{
		DrawingsTab_Pdf_delete.click();
	}
	
	@FindBy (id="ctl00_MainContent_btnLearnMore")
	private WebElement DrawingsTab_LearnMore_Button;
	
	public void DrawingspageLearnMore()
	{
		DrawingsTab_LearnMore_Button.click();
	}
	
	@FindBy (id="ctl00_MainContent_btnUpload")
	private WebElement DrawingsTab_UploadDocuments_Button;
	
	public void DrawingspageUploadDocuments()
	{
		DrawingsTab_UploadDocuments_Button.click();
	
	}
		
	@FindBy (id="ctl00_MainContent_AjaxFileUpload1_Html5DropZone")
	private WebElement DrawingsTab_UploadDocuments_Button_DropFiles;
	
	@FindBy (id="ctl00_MainContent_AjaxFileUpload1_Html5InputFile")
	private WebElement DrawingsTab_UploadDocuments_Button_Select_File;
	
	public void DrawingspageUploadDocumentsSelectFile()
	{
		DrawingsTab_UploadDocuments_Button_Select_File.click();
	
	}
	
	@FindBy (id="ctl00_MainContent_AjaxFileUpload1_FileItemDeleteButton_2488514C-B05B-3F09-14C1-6BE8C8CBFB75")
	private WebElement DrawingsTab_UploadDocuments_Button_Remove;
	
	public void DrawingspageUploadDocumentsSelectFileRemove()
	{
		DrawingsTab_UploadDocuments_Button_Remove.click();
	
	}
	
	@FindBy (id="ctl00_MainContent_AjaxFileUpload1_UploadOrCancelButton")
	private WebElement DrawingsTab_UploadDocuments_Button_Upload;
	
	public void DrawingspageUploadDocumentsSelectFileUpload()
	{
		DrawingsTab_UploadDocuments_Button_Upload.click();
	
	}
	
	@FindBy (id="ctl00_MainContent_Button1")
	private WebElement DrawingsTab_UploadDocuments_Button_Done;
	
	public void DrawingspageUploadDocumentsDone()
	{
		DrawingsTab_UploadDocuments_Button_Done.click();
	
	}
	
	/** Elements in Scope Tab   */
	@FindBy( id="ctl00_MainContent_txtFilter")
	private WebElement ScopeTabSearchTextField;
	
	public void EnterScopeInSearchTextField(String searchtext)
	{
		ScopeTabSearchTextField.sendKeys(searchtext);
	}
	
	@FindBy (id="ctl00_MainContent_btnSearch")
	private WebElement ScopeTabSearchIcon;
	
	public void ScopeSearchIcon()
	{
		ScopeTabSearchIcon.click();
	}
			
	@FindBy (id= "ctl00_MainContent_btnNew")
	private WebElement ScopeTabAddScopeButton;
	
	public void ScopePageAddScope()
	{
		ScopeTabAddScopeButton.click();
	}

	@FindBy (id="ctl00_MainContent_FormViewInsert_IsSharewithSubs")
	private WebElement ScopeTabAddScopeButton_ShareWithSubs;
	
	public void ScopeTabAddScopeButton_ShareWithSubsMethod()
	{
		ScopeTabAddScopeButton_ShareWithSubs.click();
	}
	
	@FindBy (id="ctl00_MainContent_FormViewInsert_IsEstimate")
	private WebElement ScopeTabAddScopeButton_AddToEstimate;
	
	public void ScopeTabAddScopeButton_AddToEstimateMethod()
	{
		ScopeTabAddScopeButton_AddToEstimate.click();
	}
	
	@FindBy (id="ctl00_MainContent_FormViewInsert_IsSchedule")
	private WebElement ScopeTabAddScopeButton_AddToSchedule;
	
	public void ScopeTabAddScopeButton_AddToScheduleMethod()
	{
		ScopeTabAddScopeButton_AddToSchedule.click();
	}
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtDescription")
	private WebElement ScopeTabAddScopeButton_Description_TextField;
	
	public void ScopeTabAddScopeButton_Description_TextFieldMethod(String Entertext)
	{
		ScopeTabAddScopeButton_Description_TextField.sendKeys(Entertext);;
	}
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtScopeofWork")
	private WebElement ScopeTabAddScopeButton_Scope_TextField;
	
	public void ScopeTabAddScopeButton_Scope_TextFieldMethod(String Entertext)
	{
		ScopeTabAddScopeButton_Scope_TextField.sendKeys(Entertext);;
	}
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_txtExclusions")
	private WebElement ScopeTabAddScopeButton_Exclusions_TextField;
	
	public void ScopeTabAddScopeButton_Exclusions_TextFieldMethod(String Entertext)
	{
		ScopeTabAddScopeButton_Exclusions_TextField.sendKeys(Entertext);;
	}
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_InsertButton")
	private WebElement ScopeTabAddScopeButton_SaveButton;
	
	public void ScopeTabAddScopeButton_SaveButtonMethod()
	{
		ScopeTabAddScopeButton_SaveButton.click();
	}
	
	@FindBy(id="ctl00_MainContent_FormViewInsert_InsertCancelButton")
	private WebElement ScopeTabAddScopeButton_CancelButton;
	
	public void ScopeTabAddScopeButton_CancelButtonMethod()
	{
		ScopeTabAddScopeButton_CancelButton.click();
	}

	@FindBy(id="ctl00_MainContent_btnDelete")
	private WebElement ScopeTab_DeleteIcon;
	
	public void ScopePageDeleteIcon()
	{
		ScopeTab_DeleteIcon.click();
	}
	
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement ScopeTabAddScopeButton_DoneButton;
	
	public void ScopeTabAddScopeButton_DoneButtonMethod()
	{
		ScopeTabAddScopeButton_DoneButton.click();
	}
	
	@FindBy(id="ctl00_MainContent_btnLearnMore")
	private WebElement ScopeTab_LearnMoreButton;
	
	public void ScopePageLearnMore()
	{
		ScopeTab_LearnMoreButton.click();
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl01_checkAll")
	private WebElement ScopeTab_CheckAll;
	
	public void ScopePageCheckAll()
	{
		ScopeTab_CheckAll.click();
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_cbRows")
	private WebElement ScopeTab_CheckBox_SecondRow;
	
	public void ScopeTab_CheckBox_SecondRowMethod()
	{
		ScopeTab_CheckBox_SecondRow.click();
	}
	
	@FindBy (id="ctl00_MainContent_dlPager_ctl00_lnkPageNo")
	private WebElement ScopeTab_PageNo1;
	
	public void ScopeTab_PageNo1Method()
	{
		ScopeTab_PageNo1.click();
	}
	
	@FindBy (id="ctl00_MainContent_ddlPageSize")
	private WebElement ScopeTab_PageSizeSelection;
	
	public void ScopeTab_PageSizeSelectionMethod ()
	{
	   GenericUtils.selectbyValue(ScopeTab_PageSizeSelection, "NumberofScopes");
		
	}
	
	@FindBy (id="ctl00_MainContent_txtPageNum")
	private WebElement ScopeTab_PageNo_TextField;
	
	public void ScopeTab_PageNo_TextFieldMethod(CharSequence Number)
	{
		
		ScopeTab_PageNo_TextField.sendKeys(Number);
	}
	
	
	@FindBy (id="ctl00_MainContent_btnShare")
	private WebElement ScopeTab_PageNo_ShareButton;
	
	public void ScopeTab_PageNo_ShareButtonMethod()
	{
		ScopeTab_PageNo_ShareButton.click();
	}
	
	@FindBy (id="ctl00_MainContent_btnEmailExcel2")
	private WebElement ScopeTab_PageNo_ShareButton_EmailPDF;		
	
	public void ScopeTab_PageNo_ShareButton_EmailPDFMethod()
	{
		ScopeTab_PageNo_ShareButton_EmailPDF.click();
	}
	
	@FindBy (id="ctl00_MainContent_btnExportGridExcel")
	private WebElement ScopeTab_PageNo_ShareButton_ExportExcel;
	
	public void ScopeTab_PageNo_ShareButton_ExportExcelMethod()
	{
		ScopeTab_PageNo_ShareButton_ExportExcel.click();
	}
	
	@FindBy (id="ctl00_MainContent_btnExportGridPDF")
	private WebElement ScopeTab_PageNo_ShareButton_ExportPDF;
	
	public void ScopeTab_PageNo_ShareButton_ExportPDFMethod()
	{
		ScopeTab_PageNo_ShareButton_ExportPDF.click();
	}
	
	/** Elements in Estimate Tab   */
	@FindBy (id="ctl00_MainContent_txtFilter")
	private WebElement EstimateTabSearchTextField;
			
	public void EstimateTabSearchTextFieldMethod(String searchtext)
	{
		EstimateTabSearchTextField.sendKeys(searchtext);;
	}
	
	@FindBy (id="ctl00_MainContent_btnSearch")
	private WebElement EstimateTabSearchicon;
	
	public void EstimateTabSearchiconMethod()
	{
		EstimateTabSearchicon.click();
	}
	
	@FindBy (id="ctl00_MainContent_pnlEstimateBuiler")
	private WebElement EstimateTab_EstimateBuilder_Button;
	
	public void EstimateTab_EstimateBuilder_ButtonMethod()
	{
		EstimateTab_EstimateBuilder_Button.click();
	}
	
	@FindBy (id="ctl00_MainContent_btnFree")
	private WebElement EstimateTab_EstimateBuilder_Free;
	
	public void EstimateTab_EstimateBuilder_FreeMethod()
	{
		EstimateTab_EstimateBuilder_Free.click();
	}
	
	@FindBy (id="ctl00_MainContent_lbtnBuyCraftsmanData")
    private WebElement EstimateTab_EstimateBuilder_CraftsmanData;
	
	public void EstimateTab_EstimateBuilder_CraftsmanDataMethod()
	{
		EstimateTab_EstimateBuilder_CraftsmanData.click();
	}
	
	@FindBy(id="ctl00_MainContent_pnlEstimateBuiler")
	private WebElement EstimateTab_EstimateBuilder_BackToEstimate;
	
	public void EstimateTab_EstimateBuilder_BackToEstimateMethod()
	{
		EstimateTab_EstimateBuilder_BackToEstimate.click();
	}
	
	@FindBy (id="ctl00_MainContent_btnAddFreetoEstimate")
	private WebElement EstimateTab_EstimateBuilder_AddToEstimate;
	
	public void EstimateTab_EstimateBuilder_AddToEstimateMethod()
	{
		EstimateTab_EstimateBuilder_AddToEstimate.click();
	}
	
	@FindBy (id="ctl00_MainContent_btnQuote")
	private WebElement EstimateTab_QuoteButton;
	
	public void EstimateTab_QuoteButtonMethod()
	{
		EstimateTab_QuoteButton.click();
	}
	
	@FindBy (id="ctl00_MainContent_HyperLink1")
	private WebElement EstimateTab_QuoteButton_Cover_Sheet;
	
	public void EstimateTab_QuoteButton_Cover_SheetMethod()
	{
		EstimateTab_QuoteButton_Cover_Sheet.click();
	}
	
	@FindBy (id="ctl00_MainContent_btnLineQuote")
	private WebElement EstimateTab_QuoteButton_Proposal;
	
	public void EstimateTab_QuoteButton_ProposalMethod()
	{
		EstimateTab_QuoteButton_Proposal.click();
	}
	
	@FindBy (id="ctl00_MainContent_btnProvisions")
	private WebElement EstimateTab_QuoteButton_Provisions;
	
	public void EstimateTab_QuoteButton_ProvisionsMethod()
	{
		EstimateTab_QuoteButton_Provisions.click();
	}
	
	@FindBy(id="ctl00_MainContent_btnLearnMore")
	private WebElement EstimateTab_LearnMoreButton;
			
	public void EstimateTab_LearnMoreButtonMethod()
	{
		EstimateTab_LearnMoreButton.click();
	}
	
	@FindBy (id="ctl00_MainContent_EstInsertOrderNumberTextBox")
	private WebElement EstimateTab_OrderNumberTextField;
	
	public void EstimateTab_OrderNumberTextFieldMethod(String OrderNumber)
	{
		EstimateTab_OrderNumberTextField.sendKeys(OrderNumber);;
	}
	
	@FindBy (id="ctl00_MainContent_ItemTextBox")
	private WebElement EstimateTab_AddDescriptionTextField;
	
	public void EstimateTab_AddDescriptionTextFieldMethod(String AddDescription)
	{
		EstimateTab_AddDescriptionTextField.sendKeys(AddDescription);;
	}
	
	@FindBy (id="ctl00$MainContent$InsertButton")
	private WebElement EstimateTab_plusIcon;
	
	public void EstimateTab_plusIconMethod()
	{
		EstimateTab_plusIcon.click();
	}
	
	@FindBy (id="ctl00$MainContent$InsertCancelButton")
	private WebElement EstimateTab_minusIcon;
	
	public void EstimateTab_minusIconMethod()
	{
		EstimateTab_minusIcon.click();
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_imgBtnShow")
	private WebElement EstimateTab_FirstEstimate;
	
	public void EstimateTab_FirstEstimateMethod()
	{
		EstimateTab_FirstEstimate.click();
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_lbAddNewItem")
	private WebElement EstimateTab_FirstEstimate_AddNewItem;
	
	public void EstimateTab_FirstEstimate_AddNewItemMethod()
	{
		EstimateTab_FirstEstimate_AddNewItem.click();
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_imgEdit")
	private WebElement EstimateTab_FirstEstimate_AddedItemEditIcon;
	
	public void EstimateTab_FirstEstimate_AddedItemEditIconMethod()
	{
		EstimateTab_FirstEstimate_AddedItemEditIcon.click();
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_LinkButton2")
	private WebElement EstimateTab_FirstEstimate_AddedItemDelete;
	
	public void EstimateTab_FirstEstimate_AddedItemDeleteMethod()
	{
		EstimateTab_FirstEstimate_AddedItemDelete.click();
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_Description")
	private WebElement EstimateTab_FirstEstimate_AddedItemDescription;
	
	public void EstimateTab_FirstEstimate_AddedItemDescriptionMethod(String AddDescription)
	{
		EstimateTab_FirstEstimate_AddedItemDescription.sendKeys(AddDescription);;
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_Quantity")
	private WebElement EstimateTab_FirstEstimate_AddedItemQuantity;
	
	public void EstimateTab_FirstEstimate_AddedItemQuantityMethod(String Quantity)
	{
		EstimateTab_FirstEstimate_AddedItemQuantity.sendKeys(Quantity);;
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_Material")
	private WebElement EstimateTab_FirstEstimate_AddedItemMaterial;
	
	public void EstimateTab_FirstEstimate_AddedItemMaterialMethod(String Material)
	{
		EstimateTab_FirstEstimate_AddedItemMaterial.sendKeys(Material);;
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_Labor")
	private WebElement EstimateTab_FirstEstimate_AddedItemLabor;
	
	public void EstimateTab_FirstEstimate_AddedItemLaborMethod(String Labor)
	{
		EstimateTab_FirstEstimate_AddedItemLabor.sendKeys(Labor);;
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_Equipment")
	private WebElement EstimateTab_FirstEstimate_AddedItemEquipment;
	
	public void EstimateTab_FirstEstimate_AddedItemEquipmentMethod(String Equipment)
	{
		EstimateTab_FirstEstimate_AddedItemEquipment.sendKeys(Equipment);;
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_OP")
	private WebElement EstimateTab_FirstEstimate_AddedItemOP;
	
	public void EstimateTab_FirstEstimate_AddedItemOPMethod(String OP)
	{
		EstimateTab_FirstEstimate_AddedItemOP.sendKeys(OP);;
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_GridView1_ctl02_TotalOP")
	private WebElement EstimateTab_FirstEstimate_AddedItemTotalOP;
	
	public void EstimateTab_FirstEstimate_AddedItemTotalOPMethod(String TotalOP)
	{
		EstimateTab_FirstEstimate_AddedItemTotalOP.sendKeys(TotalOP);
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_imgEditSum")
	private WebElement EstimateTab_FirstEstimate_EditIcon;
	
	public void EstimateTab_FirstEstimate_EditIconMethod()
	{
		EstimateTab_FirstEstimate_EditIcon.click();
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_btnViewDescription")
	private WebElement EstimateTab_FirstEstimate_EditIcon_Edit;
	
	public void EstimateTab_FirstEstimate_EditIcon_EditMethod()
	{
		EstimateTab_FirstEstimate_EditIcon_Edit.click();
	}
					
	@FindBy ( id="ctl00_MainContent_DataPagerGridView1_ctl02_btnDelete")
	private WebElement EstimateTab_FirstEstimate_EditIcon_Delete;
	
	public void EstimateTab_FirstEstimate_EditIcon_DeleteMethod()
	{
		EstimateTab_FirstEstimate_EditIcon_Delete.click();
	}
							
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_lbAddtoSchedule")
    private WebElement EstimateTab_FirstEstimate_EditIcon_AddtoSchedule;
	
	public void EstimateTab_FirstEstimate_EditIcon_AddtoScheduleMethod()
	{
		EstimateTab_FirstEstimate_EditIcon_AddtoSchedule.click();
	}
									
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_lbAddAllToSchedule")
    private WebElement EstimateTab_FirstEstimate_EditIcon_AddAllToSchedule;
	
	public void EstimateTab_FirstEstimate_EditIcon_AddAllToScheduleMethod()
	{
		EstimateTab_FirstEstimate_EditIcon_AddAllToSchedule.click();
	}
	
	@FindBy (id="ctl00_MainContent_DataPagerGridView1_ctl02_btnCreatePurchaseOrder")
    private WebElement EstimateTab_FirstEstimate_EditIcon_CreatePurchaseOrder;
	
	public void EstimateTab_FirstEstimate_EditIcon_CreatePurchaseOrderMethod()
	{
		EstimateTab_FirstEstimate_EditIcon_CreatePurchaseOrder.click();
	}
	
	@FindBy (id="ctl00_MainContent_ddlPageSize")
	private WebElement EstimateTab_NumberofEstimateSelect;
	
	public void EstimateSelectionNumber ()
	{
	   GenericUtils.selectbyValue(EstimateTab_NumberofEstimateSelect, "NumberofEstimates");
		
	}
	
	@FindBy (id="ctl00_MainContent_txtPageNum")
	private WebElement EstimateTab_PageNum_TextField;
	
	public void EstimateTab_PageNum_TextFieldMethod (String Number)
	{
		EstimateTab_PageNum_TextField.sendKeys(Number);
		
	}
	
	@FindBy (id="ctl00_MainContent_dlPager_ctl10_lnkPageNo")
	private WebElement EstimateTab_PageNum_LastLink;
	
	public void EstimateTab_PageNum_LastLinkMethod ()
	{
		EstimateTab_PageNum_LastLink.click();
		
	}
	
	/** Elements in Selections Tab   */
	@FindBy (id="ctl00_MainContent_btnSelectionTools")
	private WebElement SelectionsTab_TemplatesDropDown;
	
	public void SelectionsTab_TemplatesDropDownMethod ()
	{
		SelectionsTab_TemplatesDropDown.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_hlSaveProjectasTemplate")
	private WebElement SelectionsTab_TemplatesDropDown_SaveAsTemplate;
		
	public void SelectionsTab_TemplatesDropDown_SaveAsTemplateMethod ()
	{
		SelectionsTab_TemplatesDropDown_SaveAsTemplate.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_HyperLink7")
	private WebElement SelectionsTab_TemplatesDropDown_SavedTemplate;
	
	public void SelectionsTab_TemplatesDropDown_SavedTemplateMethod ()
	{
		SelectionsTab_TemplatesDropDown_SavedTemplate.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_btnLearnMore")
	private WebElement SelectionsTab_LearnMoreButton;
	
	public void SelectionsTab_LearnMoreButtonMethod ()
	{
		SelectionsTab_LearnMoreButton.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_btnAddtoEstimate")
	private WebElement SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate;
	
	public void SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplateMethod ()
	{
		SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_txtTemplateName")
	private WebElement SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate_Name;		
	
	public void SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate_NameMethod(String Name)
	{
		SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate_Name.sendKeys(Name);
		
	}
	
	@FindBy (id="ctl00_MainContent_txtTemplateType")
	private WebElement SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate_TemplateType;	
	
	public void SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate_TemplateTypeMethod(String Name)
	{
		SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate_TemplateType.sendKeys(Name);
		
	}
	
	@FindBy (id="ctl00_MainContent_btnMultipleRowDelete")
	private WebElement SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate_SaveButton;			
	
	public void SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate_SaveButtonMethod ()
	{
		SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate_SaveButton.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_CancelButton")
	private WebElement SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate_CancelButton;
	
	public void SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate_CancelButtonMethod ()
	{
		SelectionsTab_TemplatesDropDown_SaveAsTemplate_SaveTemplate_CancelButton.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_AccordionPane1_header")
	private WebElement SelectionsTab_AddACategory;
	
	public void SelectionsTab_AddACategoryMethod ()
	{
		SelectionsTab_AddACategory.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_AccordionPane1_content_AccountTypeTextBox")
	private WebElement SelectionsTab_AddACategory_SelectionTypeTextField;
	
	public void SelectionsTab_AddACategory_SelectionTypeTextFieldMethod (String SelectionType)
	{
		SelectionsTab_AddACategory_SelectionTypeTextField.sendKeys(SelectionType);
		
	}
	
	@FindBy (id="ctl00_MainContent_AccordionPane1_content_InsertButtoneft")
	private WebElement SelectionsTab_AddACategory_SaveButton;
	
	public void SelectionsTab_AddACategory_SaveButtonMethod ()
	{
		SelectionsTab_AddACategory_SaveButton.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_AccordionPane2_header")
	private WebElement SelectionsTab_Categories;
	
	public void SelectionsTab_CategoriesMethod ()
	{
		SelectionsTab_Categories.click();
		
	}
	
	
	@FindBy (id="ctl00_MainContent_AccordionPane2_content_GridViewSelectionType_ctl02_ibDelete")
	private WebElement SelectionsTab_AddedSelectionDelete;
	
	public void SelectionsTab_AddedSelectionDeleteMethod ()
	{
		SelectionsTab_AddedSelectionDelete.click();
		
	}
	
	/** Elements in Payment Schedule Tab   */
	@FindBy (id="ctl00_MainContent_txtFilter")
	private WebElement PaymentScheduleTab_SearchTextField;
	
	public void PaymentScheduleTab_SearchTextFieldMethod(String searchtext)
	{
		PaymentScheduleTab_SearchTextField.sendKeys(searchtext);;
	}
	
	@FindBy(id="ctl00_MainContent_btnSearch")
	private WebElement PaymentScheduleTab_SearchIcon;
	
	public void PaymentScheduleTab_SearchIconMethod ()
	{
		PaymentScheduleTab_SearchIcon.click();
		
	}
			
	@FindBy(id="ctl00_MainContent_btnNew")
	private WebElement PaymentScheduleTab_AddItem;
	
	public void PaymentScheduleTab_AddItemMethod ()
	{
		PaymentScheduleTab_AddItem.click();
		
	}
	
	@FindBy(id="ctl00_MainContent_FormViewDrawsandPaymentsInsert_DescriptionTextBox")
	private WebElement PaymentScheduleTab_AddItem_DescriptionTextField;
	
	public void PaymentScheduleTab_AddItem_DescriptionTextFieldMethod (String AddDescription)
	{
		PaymentScheduleTab_AddItem_DescriptionTextField.sendKeys(AddDescription);
		
	}
	
	@FindBy(id="ctl00_MainContent_FormViewDrawsandPaymentsInsert_AmountDueTextBox")
	private WebElement PaymentScheduleTab_AddItem_AmountDueTextField;		
	
	public void PaymentScheduleTab_AddItem_AmountDueTextFieldMethod (String AmountDue)
	{
		PaymentScheduleTab_AddItem_AmountDueTextField.sendKeys(AmountDue);
		
	}
	
	@FindBy(id="ctl00_MainContent_FormViewDrawsandPaymentsInsert_AmountPaidTextBox")
	private WebElement PaymentScheduleTab_AddItem_AmountPaidTextField;
	
	public void PaymentScheduleTab_AddItem_AmountPaidTextFieldMethod (String Amountpaid)
	{
		PaymentScheduleTab_AddItem_AmountPaidTextField.sendKeys(Amountpaid);
		
	}
		
	@FindBy(id="ctl00_MainContent_FormViewDrawsandPaymentsInsert_DueDateTextBox")
	private WebElement PaymentScheduleTab_AddItem_PaymentDueDateField;
	
	public void PaymentScheduleTab_AddItem_PaymentDueDateFieldMethod (String PaymentDueDate)
	{
		PaymentScheduleTab_AddItem_PaymentDueDateField.sendKeys(PaymentDueDate);
		
	}
	
	@FindBy(id="ctl00_MainContent_FormViewDrawsandPaymentsInsert_DatePaidTextBox")
	private WebElement PaymentScheduleTab_AddItem_DatePaidField;
	
	public void PaymentScheduleTab_AddItem_DatePaidFieldMethod (String DatePaid)
	{
		PaymentScheduleTab_AddItem_DatePaidField.sendKeys(DatePaid);
		
	}
	
	@FindBy(id="ctl00_MainContent_FormViewDrawsandPaymentsInsert_DropDownList1")
	private WebElement PaymentScheduleTab_AddItem_SelectPayPal;
	
	public void PaymentScheduleTab_AddItem_SelectPayPalMethod (String Value)
	{
		GenericUtils.selectbyVisibletext(PaymentScheduleTab_AddItem_SelectPayPal, Value);
		
	}
	
	
	
	@FindBy(id="ctl00_MainContent_FormViewDrawsandPaymentsInsert_InsertButton")
	private WebElement PaymentScheduleTab_AddItem_SaveButtton;
	
	public void PaymentScheduleTab_AddItem_SaveButttonMethod ()
	{
		PaymentScheduleTab_AddItem_SaveButtton.click();
		
	}
	
	@FindBy(id="ctl00_MainContent_FormViewDrawsandPaymentsInsert_InsertCancelButton")
	private WebElement PaymentScheduleTab_AddItem_CancelButton;
	
	public void PaymentScheduleTab_AddItem_CancelButtonMethod ()
	{
		PaymentScheduleTab_AddItem_CancelButton.click();
		
	}
	
	@FindBy(id="ctl00_MainContent_btnBack")
	private WebElement PaymentScheduleTab_AddItem_DoneButton;
	
	public void PaymentScheduleTab_AddItem_DoneButtonMethod ()
	{
		PaymentScheduleTab_AddItem_DoneButton.click();
		
	}
	
	@FindBy(id="ctl00_MainContent_btnLearnMore")
	private WebElement PaymentScheduleTab_LearnMoreButton;
	
	public void PaymentScheduleTab_LearnMoreButtonMethod ()
	{
		PaymentScheduleTab_LearnMoreButton.click();
		
	}
	
	@FindBy(id="ctl00_MainContent_btnDelete")
	private WebElement PaymentScheduleTab_DeleteIcon;
	
	public void PaymentScheduleTab_DeleteIconMethod ()
	{
		PaymentScheduleTab_DeleteIcon.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_btnShare")
	private WebElement PaymentScheduleTab_PageNo_ShareButton;
	
	public void PaymentScheduleTab_PageNo_ShareButtonMethod ()
	{
		PaymentScheduleTab_PageNo_ShareButton.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_btnEmailExcel2")
	private WebElement PaymentScheduleTab_PageNo_ShareButton_EmailPDF;		
	
	public void PaymentScheduleTab_PageNo_ShareButton_EmailPDFMethod ()
	{
		PaymentScheduleTab_PageNo_ShareButton_EmailPDF.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_btnExportGridExcel")
	private WebElement PaymentScheduleTab_PageNo_ShareButton_ExportExcel;
	
	public void PaymentScheduleTab_PageNo_ShareButton_ExportExcelMethod ()
	{
		PaymentScheduleTab_PageNo_ShareButton_ExportExcel.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_btnExportGridPDF")
	private WebElement PaymentScheduleTab_PageNo_ShareButton_ExportPDF;
	
	public void PaymentScheduleTab_PageNo_ShareButton_ExportPDFMethod ()
	{
		PaymentScheduleTab_PageNo_ShareButton_ExportPDF.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl01_checkAll")
	private WebElement PaymentScheduleTab_CheckAll;
	
	public void PaymentScheduleTab_CheckAllMethod ()
	{
		PaymentScheduleTab_CheckAll.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_cbRows")
	private WebElement PaymentScheduleTab_FirstPaymentSchedule;
	
	public void PaymentScheduleTab_FirstPaymentScheduleMethod ()
	{
		PaymentScheduleTab_FirstPaymentSchedule.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_lblDescription")
	private WebElement PaymentScheduleTab_FirstPaymentSchedule_Description;		
	
	public void PaymentScheduleTab_FirstPaymentSchedule_DescriptionMethod ()
	{
		PaymentScheduleTab_FirstPaymentSchedule_Description.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_lblDueDate")
	private WebElement PaymentScheduleTab_FirstPaymentSchedule_DueDate;		
	
	public void PaymentScheduleTab_FirstPaymentSchedule_DueDateMethod ()
	{
		PaymentScheduleTab_FirstPaymentSchedule_DueDate.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_lblAmountDue")
	private WebElement PaymentScheduleTab_FirstPaymentSchedule_AmountDue;				
	
	public void PaymentScheduleTab_FirstPaymentSchedule_AmountDueMethod ()
	{
		PaymentScheduleTab_FirstPaymentSchedule_AmountDue.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_lblDatePaid")
	private WebElement PaymentScheduleTab_FirstPaymentSchedule_DatePaid;						
	
	public void PaymentScheduleTab_FirstPaymentSchedule_DatePaidMethod ()
	{
		PaymentScheduleTab_FirstPaymentSchedule_DatePaid.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_lblAmountPaid")
	private WebElement PaymentScheduleTab_FirstPaymentSchedule_AmountPaid;								
	
	public void PaymentScheduleTab_FirstPaymentSchedule_AmountPaidMethod ()
	{
		PaymentScheduleTab_FirstPaymentSchedule_AmountPaid.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_btnPayWithPayPalNow")
	private WebElement PaymentScheduleTab_FirstPaymentSchedule_PayPalNow;
	
	public void PaymentScheduleTab_FirstPaymentSchedule_PayPalNowMethod ()
	{
		PaymentScheduleTab_FirstPaymentSchedule_PayPalNow.click();
		
	}
	
	/** Elements in Risk Manager Tab   */
	@FindBy (id="ctl00_MainContent_txtFilter")
	private WebElement RiskManagerTab_SearchTextField;
	
	public void RiskManagerTab_SearchTextFieldMethod (String searchText)
	{
		RiskManagerTab_SearchTextField.sendKeys(searchText);
		
	}
	
	@FindBy (id="ctl00_MainContent_btnSearch")
	private WebElement RiskManagerTab_SearchIcon;
	
	public void RiskManagerTab_SearchIconMethod ()
	{
		RiskManagerTab_SearchIcon.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_btnNew")
	private WebElement RiskManagerTab_AddRisk;
	
	public void RiskManagerTab_AddRiskMethod ()
	{
		RiskManagerTab_AddRisk.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewIssueIns_ItemTextBox")
	private WebElement RiskManagerTab_AddRisk_AddAnItem_TextField;
	
	public void RiskManagerTab_AddRisk_AddAnItem_TextFieldMethod (String AddText)
	{
		RiskManagerTab_AddRisk_AddAnItem_TextField.sendKeys(AddText);
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewIssueIns_DateTextBox")
	private WebElement RiskManagerTab_AddRisk_AddAnItem_DateField;
	
	public void RiskManagerTab_AddRisk_AddAnItem_DateFieldMethod (String AddText)
	{
		RiskManagerTab_AddRisk_AddAnItem_DateField.sendKeys(AddText);
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_DateOpenedTextBox")
	private WebElement RiskManagerTab_AddRisk_AddAnItem_DateOpenedField;
	
	public void RiskManagerTab_AddRisk_AddAnItem_DateOpenedFieldMethod (String AddText)
	{
		RiskManagerTab_AddRisk_AddAnItem_DateOpenedField.sendKeys(AddText);
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_DateClosedTextBox")
	private WebElement RiskManagerTab_AddRisk_AddAnItem_DateClosedField;
	
	public void RiskManagerTab_AddRisk_AddAnItem_DateClosedFieldMethod (String AddText)
	{
		RiskManagerTab_AddRisk_AddAnItem_DateClosedField.sendKeys(AddText);
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_ddlOwner")
	private WebElement RiskManagerTab_AddRisk_AddAnItem_OwnerOftheRisk;
	
	public void RiskManagerTab_AddRisk_AddAnItem_OwnerOftheRiskMethod (String Name)
	{
		GenericUtils.selectbyValue(RiskManagerTab_AddRisk_AddAnItem_OwnerOftheRisk, Name);
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_ddlAssignedTo")
	private WebElement RiskManagerTab_AddRisk_AddAnItem_RiskAssignedTo;
	
	public void RiskManagerTab_AddRisk_AddAnItem_RiskAssignedToMethod (String Value)
	{
		GenericUtils.selectbyValue(RiskManagerTab_AddRisk_AddAnItem_RiskAssignedTo , Value);
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_DropDownList2")
	private WebElement RiskManagerTab_AddRisk_AddAnItem_StatusoftheRisk;
	
	public void RiskManagerTab_AddRisk_AddAnItem_StatusoftheRiskMethod (String Value)
	{
		GenericUtils.selectbyValue(RiskManagerTab_AddRisk_AddAnItem_StatusoftheRisk , Value);
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_DropDownList1")
	private WebElement RiskManagerTab_AddRisk_AddAnItem_Priority;
	
	public void RiskManagerTab_AddRisk_AddAnItem_PriorityMethod (String Value)
	{
		GenericUtils.selectbyValue(RiskManagerTab_AddRisk_AddAnItem_Priority , Value);
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_DropDownList3")
	private WebElement RiskManagerTab_AddRisk_AddAnItem_Probability;
	
	public void RiskManagerTab_AddRisk_AddAnItem_ProbabilityMethod (String Value)
	{
		GenericUtils.selectbyValue(RiskManagerTab_AddRisk_AddAnItem_Probability , Value);
		
	}	
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_DropDownList5")
	private WebElement RiskManagerTab_AddRisk_AddAnItem_Impact;
	
	public void RiskManagerTab_AddRisk_AddAnItem_ImpactMethod (String Value)
	{
		GenericUtils.selectbyValue(RiskManagerTab_AddRisk_AddAnItem_Impact , Value);
		
	}		
	
	@FindBy ( id="ctl00_MainContent_FormViewRiskManagementInsert_DropDownList4")
	private WebElement RiskManagerTab_AddRisk_AddAnItem_Severity;
	
	public void RiskManagerTab_AddRisk_AddAnItem_SeverityMethod (String Value)
	{
		GenericUtils.selectbyValue(RiskManagerTab_AddRisk_AddAnItem_Severity , Value);
		
	}		
	
	@FindBy ( id="ctl00_MainContent_FormViewRiskManagementInsert_DropDownList7")
	private WebElement RiskManagerTab_AddRisk_AddAnItem_ShareWithCustomer;
	
	public void RiskManagerTab_AddRisk_AddAnItem_ShareWithCustomerMethod (String Value)
	{
		GenericUtils.selectbyValue(RiskManagerTab_AddRisk_AddAnItem_ShareWithCustomer , Value);
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewIssueIns_InsertButton")
	private WebElement RiskManagerTab_AddRisk_PlusIcon;
	
	public void RiskManagerTab_AddRisk_PlusIconMethod ()
	{
		RiskManagerTab_AddRisk_PlusIcon.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewIssueIns_InsertCancelButton")
	private WebElement RiskManagerTab_AddRisk_MinusIcon;	
	
	public void RiskManagerTab_AddRisk_MinusIconMethod ()
	{
		RiskManagerTab_AddRisk_MinusIcon.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_NameTextBox")
	private WebElement RiskManagerTab_AddRisk_RiskName;
	
	public void RiskManagerTab_AddRisk_RiskNameMethod (String AddText)
	{
		RiskManagerTab_AddRisk_RiskName.sendKeys(AddText);
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_DetailsTextBox")
	private WebElement RiskManagerTab_AddRisk_DetailsTextField;		
	
	public void RiskManagerTab_AddRisk_DetailsTextFieldMethod (String Details)
	{
		RiskManagerTab_AddRisk_DetailsTextField.sendKeys(Details);
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_TextBox1")
	private WebElement RiskManagerTab_AddRisk_MitigationTextField;
	
	public void RiskManagerTab_AddRisk_MitigationTextFieldMethod (String Mitigation)
	{
		RiskManagerTab_AddRisk_MitigationTextField.sendKeys(Mitigation);
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_InsertButton")
	private WebElement RiskManagerTab_AddRisk_SaveButton;
	
	public void RiskManagerTab_AddRisk_SaveButtonMethod ()
	{
		RiskManagerTab_AddRisk_SaveButton.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_FormViewRiskManagementInsert_InsertCancelButton")
	private WebElement RiskManagerTab_AddRisk_CancelButton;
	
	public void RiskManagerTab_AddRisk_CancelButtonMethod ()
	{
		RiskManagerTab_AddRisk_CancelButton.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_btnBack")
	private WebElement RiskManagerTab_AddRisk_DoneButton;
	
	public void RiskManagerTab_AddRisk_DoneButtonMethod ()
	{
		RiskManagerTab_AddRisk_DoneButton.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_btnLearnMore")
	private WebElement RiskManagerTab_LearnMoreButton;
	
	public void RiskManagerTab_LearnMoreButtonMethod ()
	{
		RiskManagerTab_LearnMoreButton.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_imgEdit")
	private WebElement RiskManagerTab_RiskEditIcon;
	
	public void RiskManagerTab_RiskEditIconMethod ()
	{
		RiskManagerTab_RiskEditIcon.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_btnViewDetailsProjectPlanStep")
	private WebElement RiskManagerTab_RiskEdit;
	
	public void RiskManagerTab_RiskEditMethod ()
	{
		RiskManagerTab_RiskEdit.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_LinkButton2")
	private WebElement RiskManagerTab_RiskDelete;
	
	public void RiskManagerTab_RiskDeleteMethod ()
	{
		RiskManagerTab_RiskDelete.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_DescriptionLabel")
	private WebElement RiskManagerTab_DescriptionLabel;
	
	public void RiskManagerTab_DescriptionLabelMethod ()
	{
		RiskManagerTab_DescriptionLabel.click();
		
	}	
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_StartLabel")
	private WebElement RiskManagerTab_DateOpenedLabel;
	
	public void RiskManagerTab_DateOpenedLabelMethod ()
	{
		RiskManagerTab_DateOpenedLabel.click();
		
	}		
	
	@FindBy (id="ctl00_MainContent_GridView1_ctl02_ImageStart")
	private WebElement RiskManagerTab_DateOpenedLabel_Image;
	
	public void RiskManagerTab_DateOpenedLabel_ImageMethod ()
	{
		RiskManagerTab_DateOpenedLabel_Image.click();
		
	}		
	
	@FindBy ( id="ctl00_MainContent_GridView1_ctl02_FinishLabel")
	private WebElement RiskManagerTab_DateClosedLabel;
	
	public void RiskManagerTab_DateClosedLabelMethod ()
	{
		RiskManagerTab_DateClosedLabel.click();
		
	}	
	
	@FindBy ( id="ctl00_MainContent_GridView1_ctl02_ImageFinish")
	private WebElement RiskManagerTab_DateClosedLabel_Image;
	
	public void RiskManagerTab_DateClosedLabel_ImageMethod ()
	{
		RiskManagerTab_DateClosedLabel_Image.click();
		
	}	
	
	@FindBy ( id="ctl00_MainContent_GridView1_ctl02_ProjectStatusLabel")
	private WebElement RiskManagerTab_StatusLabel;
	
	public void RiskManagerTab_StatusLabelMethod ()
	{
		RiskManagerTab_StatusLabel.click();
		
	}	
	
	@FindBy ( id="ctl00_MainContent_GridView1_ctl02_PriorityLabel")
	private WebElement RiskManagerTab_PriorityLabel;
	
	public void RiskManagerTab_PriorityLabelMethod ()
	{
		RiskManagerTab_PriorityLabel.click();
		
	}
	
	@FindBy (id="ctl00_MainContent_dlPager_ctl00_lnkPageNo")
	private WebElement RiskManagerTab_FirstPageNo;
	
	public void RiskManagerTab_FirstPageNoMethod ()
	{
		RiskManagerTab_FirstPageNo.click();
		
	}
	
	@FindBy ( id="ctl00_MainContent_ddlPageSize")
	private WebElement RiskManagerTab_PageSize;
	
	public void RiskManagerTab_PageSizeMethod (String Value)
	{
		GenericUtils.selectbyValue(RiskManagerTab_PageSize, Value);
		
	}
	
	@FindBy (id="ctl00_MainContent_txtPageNum")
	private WebElement RiskManagerTab_PageNumField;
			
	public void RiskManagerTab_PageNumFieldMethod (String Number)
	{
		RiskManagerTab_PageNumField.sendKeys(Number);
		
	}
	
}


