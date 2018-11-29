/**
 * 
 */
package com.papajohns.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import com.framework.methods.CommonMethod;
import com.framework.methods.TestBase;

/**
 * @author K000172  KRISHNA
 *
 */
public class LoginPage extends TestBase {
	
	//web elements
	public By login_link =By.xpath("//a[@href='http://projectdemo.aptaracorp.com/login']");
	public By username =By.id("username");
	public By password =By.id("password");
	public By login=By.id("loginbtn");	
	public By Testcourse = By.xpath("//a[@title='Test Course']");
	public By  sco_m00b_en = By.xpath("//li[@id='section-1']//span[@class='instancename']");
	public By enter = By.xpath("//input[@type='submit']");
	
	
	
	//actions
	
	public void clickOnLoginLink() throws IOException{
		
		CommonMethod.click(driver, login_link, "Clicking on login link");
		
	}
	
	public void fillupLoginDetails() throws IOException{
		
		String username_data = data.getCellData("Login", "username", 2);
		String password_data = data.getCellData("Login", "password", 2);
		
		CommonMethod.clear(driver, username, "clearing username field");
		CommonMethod.sendKeys(driver, username, username_data, "passing data to the username field");
		CommonMethod.clear(driver, password, "clearing password field");
		CommonMethod.sendKeys(driver, password, password_data, "passing data to the password field");
	
	}
	
	public void clickOnLoginButton() throws IOException{
		
		CommonMethod.click(driver, login, "Clicking on login button");
	}
	
	
	
	public void clickOnTestCourse() throws IOException
	{
		CommonMethod.click(driver, Testcourse, "clicking on Testcourse");
	}
	
	
	public void ClickOnCourse() throws IOException
	{
		CommonMethod.click(driver,  sco_m00b_en, "clickOnCourse");
	}
	
	
	public void clickonEnterButton() throws IOException, InterruptedException{
		
		CommonMethod.click(driver, enter, "click on enter");		
		/*Set<String> wnds=driver.getWindowHandles();
		Iterator<String> s=wnds.iterator();
		driver.switchTo().window(s.next());
		Thread.sleep(2000);
		driver.switchTo().window(s.next());
		Thread.sleep(4000);*/
		CommonMethod.handleNewTab(driver);
		driver.switchTo().frame("scorm_object");
	     driver.manage().window().maximize();
	     
	     
		
		}
	
	
	
	
	
	
}
