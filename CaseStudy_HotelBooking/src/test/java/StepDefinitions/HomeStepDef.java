package StepDefinitions;

import org.testng.Assert;

import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;

public class HomeStepDef extends TestBase{
	
	HomePage homePage;
	 boolean flag = false;
	
	@Given("^user is already on home page$")
	public void user_is_already_on_home_page() throws Throwable {
	   
		System.out.println("user is already on home page");
	    
	}

	@Then("^validate Home Page title$")
	public void validate_Home_Page_title() throws Throwable {
		homePage = new HomePage();
		String homePageTitle = homePage.validateHomePageTitle();
		System.out.println("Title of page is:"+homePageTitle);
		Assert.assertEquals("Hotel Booking",homePageTitle);
	    
	    
	}

	@Then("^validate first name field popUp$")
	public void validate_first_name_field() throws Throwable {

    String fNameMsg = homePage.validateFirstNameField();
    if(fNameMsg.equals("Please fill the First Name"))
    {
    	flag=true;
    	System.out.println("alert is displayed when first name field is left blank");
    }
    Assert.assertTrue(flag);
	    
	}

	@Then("^enter first name and validate last name field popUp$")
	public void validate_last_name_field() throws Throwable {
	   
		String lNameMsg = homePage.validateLastNameField(prop.getProperty("fName"));
	    if(lNameMsg.equals("Please fill the Last Name"))
	    {
	    	flag=true;
	    	System.out.println("alert is displayed when Last name field is left blank");
	    }
	    Assert.assertTrue(flag);
	    
	}

	@Then("^enter last name and Validate Email field popUp$")
	public void validate_Email_field() throws Throwable {
	   
		String emailMsg = homePage.validateEmailField(prop.getProperty("lName"));
		if(emailMsg.equals("Please fill the Email"))
		{
			flag=true;
			System.out.println("Alert is displayed when email field is left blank");
		}
		 Assert.assertTrue(flag);

		 String validEmailMsg = homePage.validateEmailFormate("rekhasingh@abcd");
		 if(validEmailMsg.equals("Please enter valid Email Id."))
			{
				flag=true;
				System.out.println("Alert is displayed when email formate is not correct");
			}
			 Assert.assertTrue(flag);
		
	   }

	@Then("^enter email and validate mobile no. field popUp$")
	public void validate_mobile_no_field() throws Throwable {

		String MobileNoMsg = homePage.validateMobileNoField(prop.getProperty("email"));
		if(MobileNoMsg.equals("Please fill the Mobile No."))
		{
			flag=true;
			System.out.println("Alert is displayed when mobile no field is left blank");
		}
		 Assert.assertTrue(flag);
		 
		 String invalidMobileNoMsg = homePage.validateValidMobileNo("325698");
		 if(invalidMobileNoMsg.equals("Please enter valid Contact no."))
		 {
			 flag = true;
			 System.out.println("Alert is displayed when mobile no is not valid");
		 }
		 Assert.assertTrue(flag);
		
	    
	}

	
	
	
	
	@Then("^enter mobile no and validate city field popUp$")
	public void validate_user_enters_city_field() throws Throwable {
	  
		String cityMsg = homePage.validateCityField(prop.getProperty("mobileNo"));
		if(cityMsg.equals("Please select city"))
		{
			flag=true;
			System.out.println("Alert is displayed when city field is left blank");
		}
		 Assert.assertTrue(flag);
		   
	}
	
	

	@Then("^enter city and validate state field popUp$")
	public void validate_user_enters_state_field() throws Throwable {
	    
		String stateMsg = homePage.validateStateField(prop.getProperty("city"));
		if(stateMsg.equals("Please select state"))
		{
			flag=true;
			System.out.println("Alert is displayed when State field is left blank");
		}
		 Assert.assertTrue(flag);
	    
	}

	@Then("^enter state and validate card holder name field popUp$")
	public void validate_user_enters_card_holder_name_field() throws Throwable {
		String cardHolderFieldMsg = homePage.validateCardHolderField(prop.getProperty("state"));
		if(cardHolderFieldMsg.equals("Please fill the Card holder name"))
		{
			flag=true;
			System.out.println("Alert is displayed when card holder name field is left blank");
		}
		 Assert.assertTrue(flag);
	    
	    
	}

	@Then("^enter card holder and validate debit card number field popUp$")
	public void validate_user_enters_debit_card_number_field() throws Throwable {
		String cardNumMsg = homePage.validateCardNoField(prop.getProperty("cardHolderName"));
		if(cardNumMsg.equals("Please fill the Debit card Number"))
		{
			flag=true;
			System.out.println("Alert is displayed when card number field is left blank");
		}
		 Assert.assertTrue(flag);
	    
	    
	}
	@Then("^enter card number and validate cvv field popUp$")
	public void validate_cvv_field_pop_up_msg() throws Throwable {
		String cvvMsg = homePage.validateCvvField(prop.getProperty("cardNumber"));
		if(cvvMsg.equals("Please fill the CVV"))
		{
			flag=true;
			System.out.println("Alert is displayed when cvv field is left blank");
		}
		 Assert.assertTrue(flag);
	    
	    
	}


	@Then("^enter cvv and validate card expiration month field popUp$")
	public void validate_user_enters_card_expiration_month_field() throws Throwable {
		String expiryMnthMsg = homePage.validateExpiryMonthField(prop.getProperty("cvv"));
		if(expiryMnthMsg.equals("Please fill expiration month"))
		{
			flag=true;
			System.out.println("Alert is displayed when expiry month field is left blank");
		}
		 Assert.assertTrue(flag);
	    
	    
	}

	@Then("^enter expiration mnth and validate card expiration year field popUp$")
	public void validate_user_enters_card_expiration_year_field() throws Throwable {
		String expiryYrMsg = homePage.validateExpiryYearField(prop.getProperty("expiryMonth"),prop.getProperty("expiryYear"));
		if(expiryYrMsg.equals("Please fill the expiration year"))
		{
			flag=true;
			System.out.println("Alert is displayed when expiry year field is left blank");
		}
		 Assert.assertTrue(flag);
	    
	    
	}
	
	@Then("^enter address details and validate$")
	public void enter_address_detail_and_validate() throws Throwable {
		
	   homePage.enterAddress(prop.getProperty("address"));
		
	}
	

	@Then("^user click on confirm booking$")
	public void validate_user_confirm_the_booking() throws Throwable {

     homePage.clickConfirmBooking();
	   
	}
	
	@Then("^validate confirm booking page is displayed$")
	public void validate_confirm_booking_page_is_displayed() throws Throwable {

    boolean flag = homePage.validateSuccessMsg();
    System.out.println("success message displayed or not ?:"+flag);
    Assert.assertTrue(flag);
	   
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {

    driver.close();
	   
	}


}
