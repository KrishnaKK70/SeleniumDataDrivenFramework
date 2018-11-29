package com.framework.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ReportLogs {
	

	public static Logger log = Logger.getLogger("Logs");
	public ExtentReports extent;
	public static ExtentTest test;

	@BeforeSuite
	public void GeneratingReportLogs() throws IOException{
		
	    
		try{
			log.info("Configuration of reporting logs ..........");

			//Configuring properties of Extent reports
			extent = new ExtentReports(System.getProperty("user.dir")+"/CustomReports/Report.html");
			extent.loadConfig(new File(System.getProperty("user.dir")+"/src/main/resources/extent-config.xml"));
			
			//Configuring properties of Log4j
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/Log4j.properties");
			prop.load(file);
			PropertyConfigurator.configure(prop);
			log.info("Configuration of reporting logs successfully..........");
	
		}
		catch(Throwable t) 
	    {	
			  log.info(t.getLocalizedMessage());
		      Error e1 = new Error(t.getMessage()); 
		      log.error("Configuration of reporting logs failed........" +t.getLocalizedMessage());
		      log.error(t.getMessage());
		      e1.setStackTrace(t.getStackTrace()); 
		      throw e1;
	   }	
	
	}
		
	}
	
	
	


