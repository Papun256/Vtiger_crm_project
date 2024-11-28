package com.crm.objectrepository;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePage {
		@FindBy(linkText = "Calendar")
		private WebElement calendertextfield;
		
		@FindBy(linkText = "Leads")
		private WebElement leadstextfield;
		
		@FindBy(linkText = "Organizations")
		private WebElement Organizationstextfield;
		
		@FindBy(linkText = "Contacts")
		private WebElement Contactstextfield;
		
		@FindBy(linkText =  "Opportunities")
		private WebElement Opportunitiestextfield;
		
		@FindBy(linkText = "Products")
		private WebElement Productstextfield;
		
		@FindBy(linkText = "Documents")
		private WebElement Documentstextfield;
		
		@FindBy(linkText = "Email")
		private WebElement Emailtextfield;
		
		@FindBy(linkText = "Trouble Tickets")
		private WebElement TroubleTicketstextfield;
		
		@FindBy(linkText = "Dashboard")
		private WebElement Dashboardtextfield;
		
		@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
		private WebElement getprofileicon;
		
		@FindBy(linkText =  "Sign Out")
		private WebElement signouttextfield;
		
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}

		public WebElement getCalendertextfield() {
			return calendertextfield;
		}

		public WebElement getLeadstextfield() {
			return leadstextfield;
		}

		public WebElement getOrganizationstextfield() {
			return Organizationstextfield;
		}

		public WebElement getContactstextfield() {
			return Contactstextfield;
		}

		public WebElement getOpportunitiestextfield() {
			return Opportunitiestextfield;
		}

		public WebElement getProductstextfield() {
			return Productstextfield;
		}

		public WebElement getDocumentstextfield() {
			return Documentstextfield;
		}

		public WebElement getEmailtextfield() {
			return Emailtextfield;
		}

		public WebElement getTroubleTicketstextfield() {
			return TroubleTicketstextfield;
		}

		public WebElement getDashboardtextfield() {
			return Dashboardtextfield;
		}

		public WebElement getSignouttextfield() {
			return signouttextfield;
		}

		public WebElement getGetprofileicon() {
			return getprofileicon;
		}

		public void setGetprofileicon(WebElement getprofileicon) {
			this.getprofileicon = getprofileicon;
		}		
		
		

	}



