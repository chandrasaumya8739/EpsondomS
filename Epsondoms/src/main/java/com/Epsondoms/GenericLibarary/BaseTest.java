package com.Epsondoms.GenericLibarary;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.Epsondoms.WebDriverLibarary.WebDriverUtility;


public class BaseTest {
	

	
	@Parameters("")
   @BeforeClass
public void browserSetup(String browser) {
		
		
		//Step1: Launch the Browser-----> Chrome,Edge,Safari
		WebDriverUtility.launchBrowser(browser);
		Reporter.log("browaser launched successfully",true);
		
		//maximize browser
		WebDriverUtility.maximizeTheBrowser();
		
		Reporter.log("Maximize browser successfully",true);
		
		//Step 2: Navigating to the Application via URL
		WebDriverUtility.NavigateToApplication(
		"file:///C:/Users/91969/Desktop/Selenium_class/selenium/Epsondoms/src/main/resources/Softwares/webpage.html");
		
		Reporter.log("application launched success",true);

		
		
		
		//Step 3: Verify the welcome page using Title
		String exptitle="Learning Selenium";
		String acttitle=WebDriverUtility.driver.getTitle();
		
		
		if(exptitle.equals(acttitle))
		{
			Reporter.log("----Title Verified:"+acttitle,true);
		}else
			Reporter.log("Title not verified",true);
	
		//Execute the postcondition-->Terminate browser
		
		//Execution Log or Status 
		Reporter.log("Execution completed successsfully",true);
	}
	
	
	@AfterClass
	public static void terminateBrowser() {
		// TODO Auto-generated method stub
		//Step10: Close the Browser
		
		WebDriverUtility.driver.quit();
	}
		
		
	}

