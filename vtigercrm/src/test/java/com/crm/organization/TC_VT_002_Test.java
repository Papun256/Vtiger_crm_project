package com.crm.organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.objectrepository.CreateOrganizationPage;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.organaizationPage;

public class TC_VT_002_Test extends BaseClass {
	@Test
	public void createOraganization() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getOrganizationstextfield().click();
		
		organaizationPage orgPage=new organaizationPage(driver);
		orgPage.getGetCreateicon().click();
		
		CreateOrganizationPage createorgPage=new CreateOrganizationPage(driver);
		Assert.assertTrue(createorgPage.getOrganizationtextfield().isDisplayed(), "create organization page is not displayed");
		test.log(Status.PASS, "create organization page is displayed");
		
		String organizationName = eUtil.getStringDataFromExcel("Organization", 1, 0)+jUtil.getRandomNumber();
		createorgPage.getOrganizationtextfield().sendKeys(organizationName);
		createorgPage.getSaveButton().click();
		
		String headerText = createorgPage.getOrganizationtextfield().getText();
		System.out.println(headerText);
		Assert.assertTrue(headerText.contains(organizationName),"organization is not created");
		test.log(Status.PASS, "organization page is created");
	}
	
	

}
