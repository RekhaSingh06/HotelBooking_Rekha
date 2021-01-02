Feature: Hotel Booking application test for home page

Scenario: validate Home page test

Given user is already on home page
Then validate Home Page title
Then validate first name field popUp
Then enter first name and validate last name field popUp

Then enter last name and Validate Email field popUp
Then enter email and validate mobile no. field popUp
Then enter mobile no and validate city field popUp


Then enter city and validate state field popUp
Then enter state and validate card holder name field popUp
Then enter card holder and validate debit card number field popUp
Then enter card number and validate cvv field popUp

Then enter cvv and validate card expiration month field popUp
Then enter expiration mnth and validate card expiration year field popUp
Then enter address details and validate
Then user click on confirm booking
Then validate confirm booking page is displayed 

Then close the browser

