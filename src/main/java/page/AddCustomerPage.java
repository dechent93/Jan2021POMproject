package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage{
	
	WebDriver driver;
	//Element Library
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id=\"account\"]") 
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"cid\"]") 
	WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"email\"]") 
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"phone\"]") 
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"address\"]")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how=How.XPATH,using="//*[@id=\"country\"]") 
	WebElement COUNTRY_FIELD_LOCATOR;


	//Interactive Methods
	
	public void insertFullName(String fullName) {	//since its test date we can't hard code hence we need to parameterize it
		
		int generateNumber = randomGenerator(999);
		USERNAME_FIELD_LOCATOR.sendKeys(fullName + generateNumber);

		
	}

	public void chooseCompanyOption(String company) {
		
		selectDropDown(COMPANY_FIELD_LOCATOR, company);
		
		
	}
	public void insertEmailString(String email) {
		int generatedNumber = randomGenerator(999);
		EMAIL_FIELD_LOCATOR.sendKeys(generatedNumber + email);

	}
	public void insertPhoneNumber(String phone) {
		int generatedNumber = randomGenerator(999);
		EMAIL_FIELD_LOCATOR.sendKeys(generatedNumber + phone);
		
	}
	public void chooseCountryOption(String country) {
		selectDropDown(COUNTRY_FIELD_LOCATOR, country);
	}
}