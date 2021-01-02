package StepDefinitions;

import org.testng.Assert;

import base.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDef extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^user launch the application browser$")
	public void user_launch_the_application_browser() throws Throwable {
	    
		TestBase.initialization();
		
	    
	}

	
	
	@Then("^user verify heading of Login Page$")
	public void user_verify_heading_of_Login_Page() throws Throwable {
	   
	loginPage = new LoginPage();
	String ExpectedHeading = loginPage.validateLoginPageHeading();
	System.out.println("expected heading is :"+ExpectedHeading);
	Assert.assertEquals("Hotel Booking Application",ExpectedHeading);

	    
	}

	
	@Then("^validate username field for err mesg$")
	public void validate_username_field() throws Throwable {
		
	   boolean flag = loginPage.validateUserNameFieldErrMsg();
	   System.out.println("userName err message displayed ? :"+flag);
	   Assert.assertTrue(flag);
		
	  
	}

	
	@Then("^validate Password field for err msg$")
	public void validate_Password_field() throws Throwable {
		
		loginPage.enterUserName(prop.getProperty("username"));
		boolean flag = loginPage.validatePwdFieldErrMsg();
		System.out.println("pwd err message displayed ? :"+flag);
		   Assert.assertTrue(flag);
	   
	}

	@Then("^enter valid username and password$")
	public void enter_valid_username_and_password() throws Throwable {
	  homePage = loginPage.enterPwd(prop.getProperty("password"));
	    
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		
		
	    
	}



}
