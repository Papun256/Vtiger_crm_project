package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	@FindBy(name = "accountname")
	private WebElement organizationtextfield;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement headerText;
	
	@FindBy(name = "industry")
	private WebElement industrydropdown;
	
	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganizationtextfield() {
		return organizationtextfield;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getHeaderText() {
		return headerText;
	}

	public WebElement getIndustrydropdown() {
		return industrydropdown;
	}
	
	

}
