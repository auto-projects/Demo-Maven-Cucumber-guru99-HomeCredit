Feature: Register then Login

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


