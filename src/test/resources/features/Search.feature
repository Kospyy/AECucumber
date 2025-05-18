Feature: This feature will complete an automation form.

  Scenario: Complete automation form
    Given I open a browser
    When I navigate to "https://automationexercise.com/"
    Then Verify that title is 'Automation Exercise'
    And Click ' Signup / Login' link
    And Verify that title is 'Automation Exercise - Signup / Login'
    And Enter name and email address
      |Dave Jones|
      |Daveiscool123@gmail.com|
    And Click 'Signup' button
    And Verify that title is 'Automation Exercise - Signup'
    And Enter details
      |Mr|
      |Password!1|
      |06/09/2006|
    And Select checkbox 'Sign up for our newsletter!'
    And Select checkbox 'Receive special offers from our partners!'
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click 'Create Account' button
    And Verify that title is 'ACCOUNT CREATED!'
    And Click 'Continue' button
    And Verify that title is 'Logged in as username'
    And Click 'Delete Account' button
    And Verify that title is 'ACCOUNT DELETED!'
    And Click 'Continue' button