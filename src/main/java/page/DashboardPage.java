package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

	WebDriver driver;
	//Element Library
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="//h2[contains(text(),'Dashboard')]") WebElement DASHBOARD_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMER_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_BUTTON_ELEMENT;

	//Interactive Methods
	
	public void validateDashboardPage() {
		
		Assert.assertEquals(DASHBOARD_ELEMENT.getText(), "Dashboard", "Dashboard page not found");
	}	
	public void clickCustomerButton() {
		CUSTOMER_ELEMENT.click();
		
	}
	public void clickAddCustomerButton() {
		ADD_CUSTOMER_BUTTON_ELEMENT.click();
	}
	}
