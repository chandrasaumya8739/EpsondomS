package com.Epsondoms.WebDriverLibarary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {

public static WebDriver driver;
public static Select selectobj;
public static Actions actionsobj;
public static Robot robotobj;


public static void launchBrowser(String browser)
{
	//Launch the  browser->chrome, fixfox
	switch(browser) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;
	
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
	
	default:
		System.out.println("You have Entered incorrect browser name");
		break;
	}
	}

public static void NavigateToApplication(String url) {
	driver.get(url);
}

public static void maximizeTheBrowser()
{
	driver.manage().window().maximize();
	}

public static void closeTheBrowser()
{
	driver.close();
	}

public static void closeAllBrowser()
{
	driver.quit();
	}

public static void waitImplicitly(long duration) {
	driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
}

public static void waitEplicitly(long duration,WebElement element) {
	WebDriverWait wait =new WebDriverWait (driver,duration);
	wait.until(ExpectedConditions.visibilityOf(element));
}

public void selectOptionInDropdown(WebElement element,int index) {
	selectobj.selectByIndex(index);
}

public void selectOptionInDropdown(WebElement element,String visibletext) {
	selectobj.selectByVisibleText(visibletext);

}

public void selectOptionInDropdown(String value,WebElement element) {
	selectobj.selectByValue(value);
}

public void mouseHovering(WebElement element) {
	actionsobj.moveToElement(element).perform();
}


public void pressTheKey_pageDown()
{
	robotobj.keyPress(KeyEvent.VK_PAGE_DOWN);
	}

public void ReleaseTheKey_pageDown() 
{
	robotobj.keyRelease(KeyEvent.VK_PAGE_DOWN);
}

public void alertPopupAccept() 
{
driver.switchTo().alert().accept();	
}


public void alertPopupDismiss() 
{
driver.switchTo().alert().dismiss();	
}

public void switchContrlToframe(int index) {
	driver.switchTo().frame(index);
}
public void switchBackControlToMain()
{
	driver.switchTo().defaultContent();

}
public void switchContrlToWindow(String windowaddress) {
	
	driver.switchTo().window(windowaddress);
}




}