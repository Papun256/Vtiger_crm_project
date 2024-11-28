package com.crm.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.crm.objectrepository.ContactPage;
import com.crm.objectrepository.CreateContactPage;
import com.crm.objectrepository.CreateOrganizationPage;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.LoginPage;
import com.crm.objectrepository.organaizationPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;
	public static ExtentReports extReport;
	public ExtentTest test;

	public JavaUtility jUtil = new JavaUtility();
	public WebDriverUtility wUtil = new WebDriverUtility();
	public FileUtility fUtil = new FileUtility();
	public ExcelUtility eUtil = new ExcelUtility();

	public ContactPage cp;
	public LoginPage lp;
	public HomePage hp;
	public CreateContactPage ccp;
	public CreateOrganizationPage cop;
	public organaizationPage op;
	

	@BeforeSuite
	public void reportConfig() {
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"./HTML_Report/ExtentReport_" + jUtil.getSystemTime() + ".html");
		extReport = new ExtentReports();
		extReport.attachReporter(spark);
	}

    @Parameters("Browsrer")
	@BeforeClass
	public void launchBrowser(@Optional("chrome") String browserName) throws IOException {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}

		sdriver = driver;
		wUtil.maximizeWindow(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(fUtil.getDataFromProperty("url"));
	}

	@BeforeMethod
	public void login() throws InterruptedException, IOException {
		lp = new LoginPage(driver);
		lp.getUsernametextfield().sendKeys(fUtil.getDataFromProperty("UserName"));
		lp.getUserpasswordtextfield().sendKeys(fUtil.getDataFromProperty("Password"));
		lp.getUserloginbuttontextfield().click();

		Thread.sleep(5000);

	}

	@AfterMethod
	public void logout() {
		hp = new HomePage(driver);
		wUtil.mouseHover(driver, hp.getGetprofileicon());
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@AfterSuite
	public void reportBackup() {
		extReport.flush();

	}
}