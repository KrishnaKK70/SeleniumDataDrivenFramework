/**
 * 
 */
package com.papajohns.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.framework.methods.CommonMethod;
import com.framework.methods.TestBase;

/**
 * @author K000172
 *
 */
public class LaunchPageNew  extends TestBase {
	
		//p[@class='6ruction introInsTxt']
	
			//web elements
	
	public By launch = By.xpath("//*[@id='initLaunchBtn']");
	public By Review_mode = By.id("scormmode");
	public By launch_header = By.xpath("");
	public By launch_img = By.xpath("//img[@src='assets/image/common/papaJohns_launch.png']");
	public By unfamiliar_text = By.xpath("//div[@class='intronavTourTxt IntroInstruction navLauchTxt']");
				
				    
			//actions;
	
	
	public void ClickOnLaunch() throws IOException, InterruptedException
	{
		
		CommonMethod.click(driver, launch, "click on launch button");
		
	}
	
	public void UIVerificationOfLaunchPage() throws IOException {
		
		CommonMethod.comparedWithExpectedElement(driver, launch);
		CommonMethod.comparedWithExpectedElement(driver, unfamiliar_text);
		CommonMethod.comparedWithExpectedElement(driver, launch_img);
		//CommonMethod.comparedWithExpectedElement(driver, Review_mode);
		//CommonMethod.comparedWithExpectedElement(driver, launch_header);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
				
			}



	
	
	
	
	
	


