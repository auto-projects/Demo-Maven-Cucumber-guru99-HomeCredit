Feature: Create new customer

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



