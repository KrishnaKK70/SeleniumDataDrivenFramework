/**
 * 
 */
package com.papajohns.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.framework.methods.CommonMethod;
import com.framework.methods.TestBase;

/**
 * @author K000172 KRISHNA
 *
 */
public class MessageFromJohn  extends TestBase{
	

		// web elements
		
		public By  openmenu = By.xpath("//*[@id='gadgetsButn']/span");	
		public By  menubtn = By.xpath("//*[@id='menubtn']/span");
		public By  shell_transcript = By.id("shell_transcript");
		public By glossarybtn = By.id("glossarybtn");
		public By  glossaryopn = By.xpath("//*[@id='glossaryDrp']");
		public By  helpbtn = By.id("helpbtn");
		public By  Link = By.xpath("//*[@id='shell_next']");
		public By  Transcript_Close = By.xpath("//*[@id='shell_t_close']");
		public By  funFactBtn = By.id("funFactBtn");
		public By FFBackBtn = By.id("FFBackBtn");
		public By shell_exit = By.id("shell_exit");
		public By shell_no_btn =By.id("shell_no_btn");
		public By  shell_yes_btn =By.id("shell_yes_btn");
		public By  Logo = By.xpath("//img[@class='lang-cn lang-es lang-ru lang-ko']");
		public By  Replay = By.xpath("//div[@class='playButton play icon-play replay']");
		public By  audio_Icon = By.id("audio_Icon");
		public By  audio_IconOff = By.id("audio_Icon");
		public By   welcome = By.xpath("//h2[@class='courseTitle course_title']");
		public By  PageNo = By.xpath("//span[@class='page-no']");
		public By  yes = By.xpath("//li[@class='yes_btn']");
		
	
		public void MessageJohn()throws Exception
		{
			
			
		}
		
		public void isWelcomeHeaderTextPresent() throws IOException{
			
			if(CommonMethod.isElementPresent(driver, welcome)){
				
			}
			else{
				throw new RuntimeException("Welcome Header Text not Present");
			}
		}		
	
		
		public void verifyPageNo(String pagenumber) throws Exception  {
			
			CommonMethod.containsWithExpectedText(driver, PageNo, pagenumber);
			  
		}	
		public void openmenu () throws IOException, Exception
		{
			Thread.sleep(3000);
			CommonMethod.click(driver, openmenu, "Menu is opened");
			  
		}	
		
		public void menubtn() throws IOException, Exception
		{
			Thread.sleep(3000);
			CommonMethod.click(driver, menubtn, "course is Enabled");
			  
		}	
		public void glossarybtn() throws IOException, Exception
		{
			Thread.sleep(3000);
			CommonMethod.click(driver, glossarybtn, "Glossary is Enabled");
			  
		}	
		public void  glossaryopn() throws IOException, Exception
		{
			Thread.sleep(3000);
			CommonMethod.click(driver,  glossaryopn, "Glossary is displayed");
			  
		}	
		public void helpbtn() throws IOException, Exception
		{
			Thread.sleep(3000);
			CommonMethod.click(driver, helpbtn, "Help is Enabled");
			  
		}	
		public void shell_transcript() throws IOException, Exception
		{
			Thread.sleep(3000);
			CommonMethod.click(driver,shell_transcript, "shell is Enabled");
		}
			  
		public void  Link() throws IOException, Exception
		{
			
			CommonMethod.click(driver,  Link, "Link is Enabled");
			  
		}	
		public void  Transcript_Close () throws IOException, Exception
		{
			Thread.sleep(3000);
			CommonMethod.click(driver, Transcript_Close, "Transcript is closed");
			  
		}	
		public void funFactBtn() throws IOException, Exception
		{
			Thread.sleep(3000);
			CommonMethod.click(driver, funFactBtn, "Funfact is opened");
			  
		}	
		public void FFBackBtn() throws IOException, Exception
		{
			Thread.sleep(3000);
			CommonMethod.click(driver,FFBackBtn, "Funfact is closed");
			  
		}	
		public void shell_exit() throws IOException, Exception
		{
			Thread.sleep(3000);
			CommonMethod.click(driver, shell_exit, "shell is Enabled");
			  
		}	
		public void shell_no_btn() throws IOException, Exception
		{
			Thread.sleep(3000);
			CommonMethod.click(driver,shell_no_btn, "shell is closed");
			  
		}	
		public void Logo() throws IOException
		{
			
			CommonMethod.isElementPresent(driver,Logo);
			  
		}	

		
		
		
	}
	


