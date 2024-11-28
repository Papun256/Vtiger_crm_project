package com.crm.objectrepository;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPage {
		@FindBy(name = "user_name")
		private WebElement usernametextfield;
		
		@FindBy(name = "user_password")
		private WebElement userpasswordtextfield;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement userloginbuttontextfield;
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getUsernametextfield() {
			return usernametextfield;
		}

		public WebElement getUserpasswordtextfield() {
			return userpasswordtextfield;
		}

		public WebElement getUserloginbuttontextfield() {
			return userloginbuttontextfield;
		}

		
		

	}



