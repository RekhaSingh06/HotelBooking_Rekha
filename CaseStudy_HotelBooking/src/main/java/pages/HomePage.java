package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class HomePage extends TestBase {
	
	//home page web elements
	
	@FindBy(id = "txtFirstName")
	WebElement firstName;
	
	@FindBy(id = "txtLastName")
	WebElement lastName;
	
	@FindBy(name = "Email")
	WebElement email;
	
	@FindBy(name = "Phone")
	WebElement phone;
	
	@FindBy(xpath="//td[contains(text(),'Address')]/following-sibling::td/textarea")
	WebElement address;
	
	@FindBy(name = "city")
	WebElement city;
	
	@FindBy(name = "state")
	WebElement state;
	
	@FindBy(id = "txtCardholderName")
	WebElement cardHolderName;
	
	@FindBy(id = "txtDebit")
	WebElement debitCardNumber;
	
	@FindBy(id = "txtCvv")
	WebElement cvv;
	
	@FindBy(id = "txtMonth")
	WebElement expiryMonth;
	
	@FindBy(id = "txtYear")
	WebElement expiryYear;
	
	@FindBy(xpath="//input[@value='Confirm Booking']")
	WebElement cnfrmBokingBtn;
	
	@FindBy(xpath="//h1[text()='Booking Completed!']")
	WebElement successMessage;
	
	//initialize webelements
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public String validateFirstNameField()
	{
		cnfrmBokingBtn.click();
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for first name is:"+msg);
		alert.accept();
		return msg;
		
	}
	public String validateLastNameField(String fName)
	{
		firstName.clear();
		firstName.sendKeys(fName);
		cnfrmBokingBtn.click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for last name is:"+msg);
		alert.accept();
		return msg;
		
	}
	
	public String validateEmailField(String lName)
	{
		lastName.clear();
		lastName.sendKeys(lName);
		cnfrmBokingBtn.click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for email is:"+msg);
		alert.accept();
		return msg;
		
	}
	
	public String validateEmailFormate(String emailId)
	{
		email.clear();
		email.sendKeys(emailId);
		cnfrmBokingBtn.click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for email is:"+msg);
		alert.accept();
		return msg;
		
	}
	public String validateMobileNoField(String emailId)
	{
		email.clear();
		email.sendKeys(emailId);
		cnfrmBokingBtn.click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for mobile number is:"+msg);
		alert.accept();
		return msg;
		
	}
	
	public void enterAddress(String adr) throws InterruptedException
	{
		address.sendKeys(adr);
		Thread.sleep(2000);
		
	}
	
	public String validateValidMobileNo(String mobileNo)
	{
		phone.clear();
		phone.sendKeys(mobileNo);
		cnfrmBokingBtn.click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for mobile number is:"+msg);
		alert.accept();
		return msg;
		
	}
	
	public String validateCityField(String mobileNo)
	{
		phone.clear();
		phone.sendKeys(mobileNo);
		cnfrmBokingBtn.click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for city field is:"+msg);
		alert.accept();
		return msg;
		
	}
	
	public String validateStateField(String UCity)
	{
		
		Select sel = new Select(city);
		sel.selectByVisibleText(UCity);
		
		cnfrmBokingBtn.click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for state field is:"+msg);
		alert.accept();
		return msg;
		
	}
	
	public String validateCardHolderField(String UState)
	{
		
		Select sel = new Select(state);
		sel.selectByVisibleText(UState);
		
		cnfrmBokingBtn.click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for card holder name field is:"+msg);
		alert.accept();
		return msg;
		
	}
	
	public String validateCardNoField(String cardHldrName)
	{
		
		
		cardHolderName.sendKeys(cardHldrName);
		cnfrmBokingBtn.click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for card number name field is:"+msg);
		alert.accept();
		return msg;
		
	}
	
	public String validateCvvField(String cardNo)
	{
		
		
		debitCardNumber.sendKeys(cardNo);
		cnfrmBokingBtn.click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for cvv name field is:"+msg);
		alert.accept();
		return msg;
		
	}
	
	public String validateExpiryMonthField(String UserCvv)
	{
		
		
		cvv.sendKeys(UserCvv);
		cnfrmBokingBtn.click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for expiry month field is:"+msg);
		alert.accept();
		return msg;
		
	}
	
	public String validateExpiryYearField(String expiryMnth , String expiryYr)
	{
		
		
		expiryMonth.sendKeys(expiryMnth);
		cnfrmBokingBtn.click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("alert message for expiry year field is:"+msg);
		alert.accept();
		expiryYear.sendKeys(expiryYr);
		return msg;
		
	}
	
	public void clickConfirmBooking()
	{
		cnfrmBokingBtn.click();
	}
	
	public boolean validateSuccessMsg()
	{
		boolean flag = successMessage.isDisplayed();
		return flag;
	}
	
	
	
	

}
