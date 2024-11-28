package com.crm.objectrepository;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class organaizationPage {
		@FindBy(xpath = "//img[@title='Create Organization...']")
		private WebElement getCreateicon;
		
		public organaizationPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getGetCreateicon() {
			return getCreateicon;
		}

		

	}



