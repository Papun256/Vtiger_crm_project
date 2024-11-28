package com.crm.organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectrepository.ContactPage;
import com.crm.objectrepository.CreateOrganizationPage;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.organaizationPage;

@Listeners(ListenerUtility.class)
public class TC_VT_004_Test extends BaseClass{
	@Test
	public void OrganizationDropdown() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getOrganizationstextfield().click();
		
		organaizationPage orgPage=new organaizationPage(driver);
		orgPage.getGetCreateicon().click();
		
		CreateOrganizationPage CreateorgPage=new CreateOrganizationPage(driver);
		String orgName = eUtil.getStringDataFromExcel("Organization", 1, 0)+jUtil.getRandomNumber();
		CreateorgPage.getOrganizationtextfield().sendKeys(orgName);
		
		wUtil.selectDropDownByVisibleText(CreateorgPage.getIndustrydropdown(), eUtil.getStringDataFromExcel("Organization", 2, 1));
		CreateorgPage.getSaveButton().click();
		
		Assert.assertEquals(CreateorgPage.getIndustrydropdown().getText(), eUtil.getStringDataFromExcel("Organization", 2, 1));
		test.log(Status.PASS, "Organization is created with industry name ====>"+CreateorgPage.getIndustrydropdown().getText());
		
		
		
	}

}
