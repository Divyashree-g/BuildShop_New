package com.application.tests;

import org.testng.annotations.Test;
import com.application.pages.EmployeeCreationPage;
import com.application.pages.LoginPage;

public class EmployeeCreationTest extends BaseClass
{

    @Test(description="Employee creations")
    public void testEmployeeCreation()
    {
    	LoginPage login=new LoginPage(driver);
	    login.loginToApplication();
	    EmployeeCreationPage emp=new EmployeeCreationPage(driver);
    	emp.createUser();		
    }
    

}
