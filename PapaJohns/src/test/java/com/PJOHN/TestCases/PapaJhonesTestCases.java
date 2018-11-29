package com.PJOHN.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.framework.methods.CommonMethod;
import com.framework.methods.TestBase;
import com.papajohns.pages.ConclusionPage;
import com.papajohns.pages.FranchiseStores;
import com.papajohns.pages.GrowingwithPapajohns;
import com.papajohns.pages.LaunchPageNew;
import com.papajohns.pages.LoginPage;
import com.papajohns.pages.MessageFromJohn;
import com.papajohns.pages.SchannaterMessage;
import com.papajohns.pages.WelcomePage;

public class PapaJhonesTestCases extends TestBase {
	
	LoginPage loginpage = new LoginPage();
	WelcomePage welcome = new WelcomePage();
 	LaunchPageNew launch = new LaunchPageNew();
    MessageFromJohn message = new MessageFromJohn(); 
    GrowingwithPapajohns growing = new GrowingwithPapajohns();
    FranchiseStores franchise = new FranchiseStores();
    SchannaterMessage john = new SchannaterMessage();
    ConclusionPage close = new ConclusionPage();
	
	@Test(priority=1)
	public void PJLogin() throws IOException{

		   test = extent.startTest("PJ001 valid login Functionality");
	
		 	try{
				loginpage.clickOnLoginLink();
				loginpage.fillupLoginDetails();
				loginpage.clickOnLoginButton();				
				
				
				//int len = driver.findElements(By.className("iconlarge activityicon")).size();
				//System.out.println(len);
				//for(int i=1;i<=len;i++){			
		 	}	
		 
			 catch(Throwable t) 
			   {	
				 CommonMethod.takeScreenShotonFailure(driver,"PJLoginFailed");
				 log.info(t.getLocalizedMessage());
		         Error e1 = new Error(t.getMessage()); 
		         log.error("TestCase failed" +t.getLocalizedMessage());
		         log.error(t.getMessage());
		         e1.setStackTrace(t.getStackTrace()); 
		         throw e1;
			  }	
		 	
	}	
			@Test(priority=2)
			public void PJLaunch() throws IOException{

				   test = extent.startTest("PJ002 valid launch Functionality");
			
				 	try{
				 		  loginpage.clickOnTestCourse();
				 		  loginpage.ClickOnCourse();
				 		  loginpage.clickonEnterButton();
				 		  launch.UIVerificationOfLaunchPage();
					      launch.ClickOnLaunch();
				 	}	
				 
					 catch(Throwable t) 
					   {
						 CommonMethod.takeScreenShotonFailure(driver, "PJLaunch");
						 log.info(t.getLocalizedMessage());
				         Error e1 = new Error(t.getMessage()); 
				         log.error("TestCase failed" +t.getLocalizedMessage());
				         log.error(t.getMessage());
				         e1.setStackTrace(t.getStackTrace()); 
				         throw e1;
					  }	
	
		 }
		
			
			@Test(priority=3, dependsOnMethods="PJLaunch")
			public void PJwelcome() throws Exception{

				   test = extent.startTest("PJ003 valid welcome Functionality");
			
				 	try{
						
					     welcome.clickOnBookmarking();					      
					      welcome.isWelcomeHeaderTextPresent();
					      welcome.verifyPageNo("01/06");				      
					      welcome.openmenu();					      
					      welcome.menubtn();
					      welcome.glossarybtn();					      
					      welcome.glossaryopn();
					      welcome.helpbtn();
					      welcome.shell_transcript();
					      welcome.Transcript_Close();
					      welcome.funFactBtn();
					      welcome.FFBackBtn();
					      welcome.shell_exit();
					      welcome.shell_no_btn();
					      welcome.Logo();
					      
					      
				 	}	
				 
					 catch(Throwable t) 
					   {
						
						 CommonMethod.takeScreenShotonFailure(driver, "PJwelcome");
						 log.info(t.getLocalizedMessage());
				         Error e1 = new Error(t.getMessage()); 
				         log.error("TestCase failed" +t.getLocalizedMessage());
				         log.error(t.getMessage());
				         e1.setStackTrace(t.getStackTrace()); 
				         throw e1;
					  }	
				 	finally {
				 		
					      welcome.Link();
					      Thread.sleep(1500);
				 	}
			
				  
	
}
			@Test(priority=4)
			public void PJMessage() throws Exception{

				   test = extent.startTest("PJ004 valid MessageFromJohn Functionality");
			
				 	try{
						
					      					      
					      message.isWelcomeHeaderTextPresent();
					      message.verifyPageNo("02/06");					     
					      message.openmenu();					      
					      message.menubtn();
					      message.glossarybtn();					      
					      message.glossaryopn();
					      message.helpbtn();
					      message.shell_transcript();
					      message.Transcript_Close();
					      message.funFactBtn();
					      message.FFBackBtn();
					      message.shell_exit();
					      message.shell_no_btn();
					      message.Logo();
					      
					      
				 	}	
				 
					 catch(Throwable t) 
					   {
						 CommonMethod.takeScreenShotonFailure(driver, "PJMessage");
						 log.info(t.getLocalizedMessage());
				         Error e1 = new Error(t.getMessage()); 
				         log.error("TestCase failed" +t.getLocalizedMessage());
				         log.error(t.getMessage());
				         e1.setStackTrace(t.getStackTrace()); 
				         throw e1;
					  }	
				 	finally {
				 		
					      welcome.Link();
					      Thread.sleep(1500);
				 	}
						
			}
			
			
			@Test(priority=5)
			public void PJGrowing() throws Exception{

				   test = extent.startTest("PJ005 valid GrowingwithJohn Functionality");
			
				 	try{
						
					      					      
					      growing.isWelcomeHeaderTextPresent();
					      growing.verifyPageNo("03/06");				      
					      growing.openmenu();					      
					      growing.menubtn();
					      growing.glossarybtn();					      
					      growing.glossaryopn();
					      growing.helpbtn();
					      growing.shell_transcript();
					      growing.Transcript_Close();
					      growing.funFactBtn();
					      growing.FFBackBtn();
					      growing.shell_exit();
					      growing.shell_no_btn();
					      growing.Logo();
					      
					      
				 	}	
				 
					 catch(Throwable t) 
					   {
						 CommonMethod.takeScreenShotonFailure(driver, "PJGrowing");
						 log.info(t.getLocalizedMessage());
				         Error e1 = new Error(t.getMessage()); 
				         log.error("TestCase failed" +t.getLocalizedMessage());
				         log.error(t.getMessage());
				         e1.setStackTrace(t.getStackTrace()); 
				         throw e1;
					  }	
				 	finally {
				 		
					      welcome.Link();
					      Thread.sleep(1500);
				 	}
						
			}
			
			@Test(priority=6)
			public void PJFranchise() throws Exception{

				   test = extent.startTest("PJ006 valid FranchiseStores Functionality");
			
				 	try{
						
					      					      
					      franchise.isWelcomeHeaderTextPresent();
					      franchise.verifyPageNo("04/06");					      
					      franchise.openmenu();					      
					      franchise.menubtn();
					      franchise.glossarybtn();					      
					      franchise.glossaryopn();
					      franchise.helpbtn();
					      franchise.shell_transcript();
					      franchise.Transcript_Close();
					      franchise.funFactBtn();
					      franchise.FFBackBtn();
					      franchise.shell_exit();
					      franchise.shell_no_btn();
					      franchise.Logo();
					      
					      
				 	}	
				 
					 catch(Throwable t) 
					   {
						 CommonMethod.takeScreenShotonFailure(driver, "PJFranchise");
						 log.info(t.getLocalizedMessage());
				         Error e1 = new Error(t.getMessage()); 
				         log.error("TestCase failed" +t.getLocalizedMessage());
				         log.error(t.getMessage());
				         e1.setStackTrace(t.getStackTrace()); 
				         throw e1;
					  }	
				 	finally {
				 		
					      welcome.Link();
					      Thread.sleep(1500);
				 	}
						
			}	
			
			
			
			@Test(priority=7)
			public void PJSchannaterMessage() throws Exception{

				   test = extent.startTest("PJ007 valid SchannaterMessage Functionality");
			
				 	try{
						
					      					      
					      john.isWelcomeHeaderTextPresent();
					      john.verifyPageNo("05/06");					      
					      john.openmenu();					      
					      john.menubtn();
					      john.glossarybtn();					      
					      john.glossaryopn();
					      john.helpbtn();
					      john.shell_transcript();
					      john.Transcript_Close();
					      john.funFactBtn();
					      john.FFBackBtn();
					      john.shell_exit();
					      john.shell_no_btn();
					      john.Logo();
					      
					      
				 	}	
				 
					 catch(Throwable t) 
					   {
						 CommonMethod.takeScreenShotonFailure(driver, "PJSchannaterMessage");
						 log.info(t.getLocalizedMessage());
				         Error e1 = new Error(t.getMessage()); 
				         log.error("TestCase failed" +t.getLocalizedMessage());
				         log.error(t.getMessage());
				         e1.setStackTrace(t.getStackTrace()); 
				         throw e1;
					  }	
				 	finally {
				 		
					      welcome.Link();
					      Thread.sleep(1500);
				 	}
						
			}	
			
			@Test(priority=8)
			public void PJConclusionPage() throws IOException{

				   test = extent.startTest("PJ008 valid ConclusionPage Functionality");
			
				 	try{
						   					      
					      close.isWelcomeHeaderTextPresent();
					      close.verifyPageNo("06/06");					      
					      close.openmenu();					      
					      close.menubtn();
					      close.glossarybtn();					      
					      close.glossaryopn();
					      close.helpbtn();
					      close.shell_transcript();
					      close.Transcript_Close();
					      close.funFactBtn();
					      close.FFBackBtn();
					      close.shell_exit();
					      close.shell_no_btn();
					      close.Logo();
					      close.course_exit();
					      
					      
				 	}	
				 
					 catch(Throwable t) 
					   {
						 CommonMethod.takeScreenShotonFailure(driver, "PJConclusionPage");
						 log.info(t.getLocalizedMessage());
				         Error e1 = new Error(t.getMessage()); 
				         log.error("TestCase failed" +t.getLocalizedMessage());
				         log.error(t.getMessage());
				         e1.setStackTrace(t.getStackTrace()); 
				         throw e1;
					  }	
				 	
						
			}	
			
}

		 	 
		 	 
	 
	  


	    	
	    	
	    
		  

	
	

