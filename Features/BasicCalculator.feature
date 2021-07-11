Feature: Calculator Module

Background: 
Given Application url for testing


  @Addition
  Scenario: Test Scenario to verify Addition functionality using given calculator application page
    When User should enter two enter and perform Addition operation
    Then Result should get display and verify output value for Addition.

  @Subtraction
  Scenario: Test Scenario to verify Subtraction functionality using given calculator application page
    When User should enter two enter and perform Subtraction operation
    Then Result should get display and verify output value for Subtraction.

  @Multiplication
  Scenario: Test Scenario to verify Multiplication functionality using given calculator application page
    When User should enter two enter and perform Multiplication operation
    Then Result should get display and verify output value for Multiplication.

  @Division
  Scenario: Test Scenario to verify Division functionality using given calculator application page
    When User should enter two enter and perform Division operation
    Then Result should get display and verify output value for Division.
