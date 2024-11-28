package com.crm.organization;

import org.testng.annotations.Test;

import com.crm.genericutility.BaseClass;
import com.crm.objectrepository.ContactPage;
import com.crm.objectrepository.CreateContactPage;
import com.crm.objectrepository.HomePage;

public class TC_VT_003_Test extends BaseClass{
	@Test
	public void createContactwithOrganizaton() {
		hp=new HomePage(driver);
		hp.getContactstextfield().click();
		
		ContactPage cp=new ContactPage(driver);
		cp.getCreateContacticon().click();
		
		CreateContactPage createcontactpage=new CreateContactPage(driver);
		createcontactpage.getLastnametestfield().sendKeys("john");
		
		createcontactpage.getSelecticon().click();
		
	}

}
