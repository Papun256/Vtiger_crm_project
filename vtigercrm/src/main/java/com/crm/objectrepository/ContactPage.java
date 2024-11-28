package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createContacticon;
	
	public ContactPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	}

	public WebElement getCreateContacticon() {
		return createContacticon;
	}
	
	

}
