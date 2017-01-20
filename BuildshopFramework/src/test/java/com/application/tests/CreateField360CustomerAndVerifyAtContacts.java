package com.application.tests;

import org.testng.annotations.Test;

import com.application.libraries.ExcelLibrary;
import com.application.pages.Field360Page;
import com.application.pages.LoginPage;

public class CreateField360CustomerAndVerifyAtContacts extends BaseClass
{
  @Test
  public void Field360Customer() 
  {
	  LoginPage lp=new LoginPage(driver);
	  lp.loginToApplication();
	  
	  Field360Page fp=new Field360Page(driver);
	  fp.clickField360Page();
	  fp.clickField360CustomersPage();
	  fp.clickToAddCustomerAtField360();
	  //String compName = ExcelLibrary.getExcelData("datafile.xls","Field360CustomerDataFile",1,0);
	 // Field360CustomerAddCustomerCompanyNameTextBox.sendKeys(compName);
	 // fp.enterCompanyNameToAddField360Customer(companyName);
	  
	  
  }
}
