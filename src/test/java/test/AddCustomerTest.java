package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;

	@Test
	public void validateUserShouldBeAbleToAddCustomer() {
			
			
		 driver = BrowserFactory.init();
		 
		 LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		 loginPage.insertUserName("demo@techfios.com");
		 loginPage.insertPassword("abc123");
		 loginPage.clickSignInButton();
		 
		 DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		 dashboardPage.validateDashboardPage();
		 dashboardPage.clickCustomerButton();
		 dashboardPage.clickAddCustomerButton();
		 
		 AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		 addCustomerPage.insertFullName("Selenium");
		 addCustomerPage.chooseCompanyOption("Techfios");
		 addCustomerPage.insertEmailString("demo@techfios.com");
		 addCustomerPage.insertPhoneNumber("989889797");
		 addCustomerPage.chooseCountryOption("Bhutan");
	}

}
