package com.Epsondoms.PageRepositoryLibarary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import com.Epsondoms.GenericLibarary.BaseTest;

public class WelcomePage  {
	// initialization
		public WelcomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
			
		// declarization
		@FindBy(id="name")
		private WebElement name;
		
		@FindBy(id="email")
		private WebElement email;
		
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="mobile")
		private WebElement mobile;
		
		@FindBy(id="male")
		private WebElement male;
		
		@FindBy(partialLinkText="Contact Us")
		private WebElement contact;
		
		@FindBy(id="goa")
		private WebElement places;
		
		
	

		public WebElement getPlaces() {
			return places;
		}
		//utilization
		public WebElement getNameTextField() {
			return name;
		}
		public WebElement getEmailTextField() {
			return email;
		}
		
		public WebElement getPasswordTextField1() {
			return password;
		}
		
		
		public WebElement getMobileTextField() {
			return mobile;
		}
		
		public WebElement getMaleTextField() {
			return male;
		}
		public WebElement getContact() {
			return contact;
		}
}
