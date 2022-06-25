@features
Feature: Register / Login / New Customer

  @register_new_account
  Scenario: Create new account
    # Given Open Login Page
    When Click on Here button
    # Open Register Page
    Then Close the Ads
    Then Enter to Email textbox
    Then Click on Submit
    #And Successful page is displayed
    Then Get UserID info
    Then Get Password info
    Then Open Login Page again

 @login_new_account
  Scenario: Login by new account
    # Given Open Login Page
    Then Enter to Username textbox
    Then Enter to Password textbox
    Then Click on Login button
    And Successful page is displayed
    
   @create_new_customer
  Scenario: Create New Customer
    # Given Open HomePage
    When Click on New Customer on sub menu
    Then Verify all fields are enable
    Then Input to Customer Name textbox
    Then Click on Gender radio button
    Then Input to Date of Birth textbox
    Then Input to Address textbox
    Then Input to City textbox
    Then Input to State textbox
    Then Input to PIN textbox
    Then Input to Mobile Number textbox
    Then Input to Email textbox
    Then Input to Password textbox
    Then Click on Submit button
    And Successful message is displayed
    And Verify all output data display same as input data

    

