package com.application.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.application.libraries.ExcelLibrary;
import com.application.libraries.ExtentManager;
import com.application.libraries.ExtentTestManager;
import com.application.libraries.GenericUtils;
import com.application.libraries.MyEventListener;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//Comment
public class BaseClass {
	//New Comment Updated
	String extentReportFile;
	ExtentReports extent;
	WebDriver wdriver;
	ExtentTest extentTest;
	EventFiringWebDriver driver;
	MyEventListener myListner;
	DesiredCapabilities cap;
	String configFilePath = "config/config.xlsx";
	String dataFilePath = "data/data.xlsx";
	
	@Parameters({"Machine"})
	@BeforeSuite
	public void suitePreCondition(@Optional("localhost") String machine){
		ExtentManager.generateFilePath();
		int port = 5555;
		System.out.println("--------------Testing port " + port);
	    Socket s = null;
	    try {
	        s = new Socket(machine, port);
	        // If the code makes it this far without an exception it means
	        // something is using the port and has responded.
	        System.out.println("--------------Port " + port + " is not available");
	    } catch (IOException e) {
	        System.out.println("--------------Port " + port + " is available");
	    } finally {
	        if( s != null){
	            try {
	                s.close();
	            } catch (IOException e) {
	                throw new RuntimeException("You should handle this error." , e);
	            }
	        }
	    }
	}
	
	
	@Parameters({"Category","Machine","Browser"})
	@BeforeClass
	public void classPreconditions(@Optional() String category, @Optional("localhost") String machine, @Optional("Chrome") String browser){
		String testDescription = this.getClass().getDeclaredMethods()[0].getAnnotation(Test.class).description();
		ExtentTestManager.startTest(this.getClass().getSimpleName()+" ["+testDescription+"]");
		if(category != null){
			ExtentTestManager.getTest().assignCategory(category);
		}		
		
		ExtentManager.getReporter().addSystemInfo("Selenium Version", "3.0.1");
		ExtentManager.getReporter().addSystemInfo("Execution Machine", machine);
		ExtentManager.getReporter().addSystemInfo("Browser", browser);
		
		
		if(browser.equals("Firefox")){
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
		}
		else if(browser.equals("Chrome")){			
			cap = DesiredCapabilities.chrome();
			System.setProperty("webdriver.chrome.driver","browserdrivers/chromedriver.exe");
			cap.setBrowserName("chrome");						
		}
		
		try {
			wdriver = new RemoteWebDriver(new URL("http://"+machine+":5555/wd/hub"),cap);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		setMousePosition();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Browser Launched");
		driver = new EventFiringWebDriver(wdriver);
        myListner = new MyEventListener();
        driver.register(myListner);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Long.parseLong(GenericUtils.getConfigProperties("config/config.properties", "IMPLICIT_WAIT")),TimeUnit.SECONDS);		
		driver.get(ExcelLibrary.getExcelData(configFilePath, "Init", 1, 0));		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Navigating to"+ ExcelLibrary.getExcelData(configFilePath, "Init", 1, 0));			
		ExtentTestManager.getTest().log(LogStatus.PASS, "Application opened successfully");	
	}
	
	@AfterMethod
	public void methodPostCondition(ITestResult iRes){
		if(iRes.getStatus()==2){			
			String screenshotFile = ExtentManager.screenshotFolderName+"/"+iRes.getTestClass().getRealClass().getSimpleName()+".jpg";
			System.out.println(screenshotFile);
			TakesScreenshot te = (TakesScreenshot)driver;			
			try {
				FileUtils.copyFile(te.getScreenshotAs(OutputType.FILE), new File(screenshotFile));
			} catch (WebDriverException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
			ExtentTestManager.getTest().log(LogStatus.FAIL,"HTML", "There is an error: <br/><br/> "+iRes.getThrowable().getMessage()+" <br/><br/> Error Snapshot : "+ ExtentTestManager.getTest().addScreenCapture(screenshotFile.replace(ExtentManager.reportsFolderName+"/","")));
		}		
	}
	
	@AfterClass
	public void classPostconditions(){
		//driver.quit();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Browser closed");
		ExtentManager.getReporter().endTest(ExtentTestManager.getTest());		
		ExtentManager.getReporter().flush();
	}
	
	public void setMousePosition(){
		try {
			Robot r = new Robot();
			r.mouseMove(0,0);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
