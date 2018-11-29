package com.framework.methods;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BrowserType extends TestBase {
	
	

	 public static void browserName(String browserName ,String RunMode){
			
	   log.info("Choosing BrowserType");
	  
	   try{
		   
		   if(RunMode.equalsIgnoreCase("local")) 
		   {
			   
		   if(browserName.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/DriverFiles/geckodriver.exe");

				driver = new FirefoxDriver();
				
			}
			else if(browserName.equalsIgnoreCase("chrome")){
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/DriverFiles/chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			else if(browserName.equalsIgnoreCase("ie")){
			
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/DriverFiles/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
		   log.info("Choosing BrowserType successfully as........"+browserName);
			  driver.manage().window().maximize();
	   }
		   else if(RunMode.equalsIgnoreCase("Grid")) {
			   if(browserName.equalsIgnoreCase("Firefox")){
					
				    DesiredCapabilities cap = DesiredCapabilities.firefox();
				 	cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
					driver = new RemoteWebDriver(new URL("http://192.168.0.101:4444/wd/hub"),cap);
				}
				else if(browserName.equalsIgnoreCase("chrome")){
					
					DesiredCapabilities cap = DesiredCapabilities.chrome();
				 	cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
					driver = new RemoteWebDriver(new URL("http://192.168.0.101:4444/wd/hub"),cap);					
				}
				else if(browserName.equalsIgnoreCase("ie")){
				
					DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
					driver = new RemoteWebDriver(new URL("http://192.168.0.101:4444/wd/hub"),cap);
				}
				
			   log.info("Choosing BrowserType successfully as........"+browserName);
				  driver.manage().window().maximize();
		   }
		   

	   }  
		 catch(Throwable t) 
		    {	
				  log.info(t.getLocalizedMessage());
			      Error e1 = new Error(t.getMessage()); 
			      log.error("Choosing BrowserType type failed.....     " +t.getLocalizedMessage());
			      log.error(t.getMessage());
			      e1.setStackTrace(t.getStackTrace()); 
			      throw e1;
		   }	
		
		}
	
	
	
	
	

	}
