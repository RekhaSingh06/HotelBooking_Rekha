package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	//WebElements
	@FindBy(xpath="//h1[contains(text(),'Hotel Booking Application')]")
	WebElement loginHeading;
	
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="userPwd")
	WebElement userPwd;
	
	@FindBy(xpath="//input[@type='button']")
	WebElement login_btn;
	
	@FindBy(id="userErrMsg")
	WebElement userErrorMsg;
	
	@FindBy(id="pwdErrMsg")
	WebElement pwdErrorMsg;

	
	//initializing web element
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public String validateLoginPageHeading()
	{
		String heading = loginHeading.getText().toString();
		return heading;
	}
	
	public boolean validateUserNameFieldErrMsg()
		{
		 login_btn.click();
		 boolean userErrFlag = userErrorMsg.isDisplayed();
		 return userErrFlag;
		
	}
	
	public void enterUserName(String uName)
	{
		userName.sendKeys(uName);
	}
	
	public boolean validatePwdFieldErrMsg()
	{
	 login_btn.click();
	 boolean pwdErrFlag = pwdErrorMsg.isDisplayed();
	 return pwdErrFlag;
	
    }
	
	public HomePage enterPwd(String pwd)
	{
		userPwd.sendKeys(pwd);
		login_btn.click();
		return new HomePage();
	}
	
	

}
