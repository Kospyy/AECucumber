Feature: This feature will complete an automation form.
Background:
  Given I open a browser
  When I navigate to "https://automationexercise.com/"
  Then Click consent

  Scenario: Signup and Login
    Then Verify that title is 'Automation Exercise'
    And Click ' Signup / Login' link
    And Verify that title is 'Automation Exercise - Signup / Login'
    And Enter name and random email address:
      |Dave Jones|
    And Click 'Signup' button
    And Verify that title is 'Automation Exercise - Signup'
    And Enter details
      |Mr|
      |Password|
      |06/09/2006|
    And Select checkbox 'Sign up for our newsletter!'
    And Select checkbox 'Receive special offers from our partners!'
    And Fill address information:
      |Dave|
      |Jones|
      |DaveCo|
      |123 Dave Lane|
      |Daveville|
      |Canada|
      |Dave|
      |Daveville|
      |DV3 V1L|
      |+12505269134|
    And Click 'Create Account' button
    And Verify that title is 'ACCOUNT CREATED!'
    And Click 'Continue' link
    And Verify that title is 'Automation Exercise'
    And Click ' Logout' link

  Scenario: Login and Order
    Then Click ' Signup / Login' link
    And Enter random email address and password:
      |Password|
    And Click 'Login' button
    And Verify that I am logged in as:
      |Dave Jones|
    And I select the following product:
      |2|
    And Select quantity and Add to cart
      |3|
    And Click 'Continue Shopping' button
    And Click ' Products' link
    And Sleep
    And I select the following product:
      |4|
    And Select quantity and Add to cart
      |3|
    And Go to cart
    And Click 'Proceed To Checkout' link
    And Click 'Place Order' link
    And Fill payment information:
      |Dave Jones|
      |1234 1234 1234 1234|
      |123|
      |12|
      |1234|
    And Click 'Pay and Confirm Order' button
    And Verify that title is 'Order Placed!'
    And Click 'Continue' link
    And Click ' Logout' link
    And Click ' Home' link