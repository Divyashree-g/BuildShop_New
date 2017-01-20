package com.application.tests;

import org.testng.annotations.Test;

import com.application.libraries.ExcelLibrary;
import com.application.pages.EmployeeCreationPage;
import com.application.pages.LoginPage;

public class EmployeeCreationTest extends BaseClass
{

    @Test(description="Employee creations")
    public void testEmployeeCreation()
    {
    	LoginPage loginPage=new LoginPage(driver);	  
    	loginPage.clickWelcomePageSignInLink();
  	    String username = ExcelLibrary.getExcelData("./data/data.xlsx", "Sheet1", 1, 1);
  	    loginPage.enterUsernameTextField(username);
  	    String password = ExcelLibrary.getExcelData("./data/data.xlsx", "Sheet1", 1, 2);
  	    loginPage.enterPasswordTextField(password);
  	    loginPage.clickLoginPageSignInButton();
	    
	    
	    EmployeeCreationPage emp=new EmployeeCreationPage(driver);
	    String empusername= ExcelLibrary.getExcelData("./data/data.xlsx", "Emp-Creation", 1, 0);
	    String empemail= ExcelLibrary.getExcelData("./data/data.xlsx", "Emp-Creation", 1, 1);
	    String emppassword= ExcelLibrary.getExcelData("./data/data.xlsx", "Emp-Creation", 1, 2);
	    emp.createUser(empusername, empemail, emppassword);
    }
    

}
