package com.Epsondoms.WelcomeTest;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;

import com.Epsondoms.GenericLibarary.BaseTest;
import com.Epsondoms.JavaLibarary.JavaUtility;
import com.Epsondoms.PageRepositoryLibarary.WelcomePage;
import com.Epsondoms.WebDriverLibarary.WebDriverUtility;

public class VerifyWelcomePageTest extends BaseTest {
	
	public void verifyWelcompageWithValidInput(){
	
		
		Reporter.log("<----ExecutionStart---->",true);
	
		//Execute the precondition---->1.Launch browser 2. Navigate to Url
		
		//BaseTest.browserSetup("chrome");
		
		//implicit Wait
		
		WebDriverUtility.waitImplicitly(20);
		
		//Step 3: Verify the welcome page using Title
		String exptitle="Learning Selenium";
		String acttitle=WebDriverUtility.driver.getTitle();
		
		
		if(exptitle.equals(acttitle))
		{
			Reporter.log("Title Verified-Pass"+ acttitle,true);
		}
		else
			Reporter.log("Title Verified-Fail",true);
		
		
		//Create object of welcome page

		WelcomePage welcompageobj=new WelcomePage(WebDriverUtility.driver);
		
		//Verify name textfield
		boolean result= welcompageobj.getNameTextField().isDisplayed();
		
		if(result)
			Reporter.log("ElementVerified: Name text field is displayed");
		else
			Reporter.log("Name text field is not displayed");
			
		//step3: perform Action----clear
		welcompageobj.getNameTextField().clear();
		Reporter.log("Step3- clear action Done successfully-NameTextField",true);
		//Step4 perform actions----sendkeys
		welcompageobj.getNameTextField().sendKeys("Harry");
		Reporter.log("Step4- Sendkeys action Done successfully-NameTextField",true);
		
		//see the execution
		JavaUtility.pause(3000);
		
		
		
		
		//Execute the postcondition-->Terminate browser
		
		
		//Execution Log or Status 
		Reporter.log("Execution completed successsfully",true);
		
		
	}
}
