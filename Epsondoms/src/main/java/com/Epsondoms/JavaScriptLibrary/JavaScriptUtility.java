package com.Epsondoms.JavaScriptLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Epsondoms.WebDriverLibarary.WebDriverUtility;

public class JavaScriptUtility {
	public static JavascriptExecutor javascriptobj;

	public static void enterData_DisabledElement(WebElement element, String data)
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
		javascriptobj.executeScript("arguments[0].value='"+data+"'",element);
	}
	public static void click_DisabledElement(WebElement element)
	{
		
	}
	
	
	public static void defaultVerticalscrollBy()
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
		javascriptobj.executeScript("window.scrollBy(1000,1000)");
	}
	public static void defaultscrollTo()
	{

		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
		javascriptobj.executeScript("window.scrollTo(1000,1000)");
	}
	
	
	public static void scrollUsingView(WebElement element, boolean value)
	{
		javascriptobj=(JavascriptExecutor)WebDriverUtility.driver;
		javascriptobj.executeScript("arguments[0].scrollIntoView("+value+");",element);
	}
	
}
