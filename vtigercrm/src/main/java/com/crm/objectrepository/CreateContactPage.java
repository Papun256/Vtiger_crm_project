package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	@FindBy(name = "lastname")
	private WebElement lastnametestfield;
	
	@FindBy(xpath = "//img[@alt='Select']")
	private WebElement selecticon;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(id = "mouseArea_Organization Name")
	private WebElement organizationNamefield;
	
	
	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getLastnametestfield() {
		return lastnametestfield;
	}


	public WebElement getSelecticon() {
		return selecticon;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}


	public WebElement getOrganizationNamefield() {
		return organizationNamefield;
	}
}
