Feature: Login

  @login_new_account
  Scenario: Login by new account
    # Given Open Login Page
    Then Enter to Username textbox
    Then Enter to Password textbox
    Then Click on Login button
    And Successful page is displayed


