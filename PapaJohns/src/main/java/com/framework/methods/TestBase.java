package com.framework.methods;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.framework.utilities.XlsReader;


public class TestBase extends ReportLogs {
	
	public static WebDriver driver;
	public static XlsReader data; 
	
	@BeforeClass
	@Parameters({"browserName","environment","RunMode"})
	public void initialization(String browserName,String environment,String RunMode) throws IOException{
		
		//Browser Initialization
		BrowserType.browserName(browserName,RunMode);
	    extent.addSystemInfo("BrowserName", browserName);
	    
	    //EnvironMent initialization
	    EnvironmentType.environmentMode(environment);
	    extent.addSystemInfo("Environment", environment);
	
		//TestData Configuration  
	    data = new XlsReader(System.getProperty("user.dir")+"/src/main/resources/TestData.xlsx");

	}
	
	@AfterMethod
    protected void afterEachTest(ITestResult result) {
        extent.endTest(test);        
        extent.flush();
    }

	@AfterClass
	public void tearDown(){
		driver.quit();
		log.info("Browser closed successfully");
	}

}
