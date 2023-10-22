Feature: Login page automation of saucedemo App
  Scenario:  Check login is successful with valid creds
    Given User is on Login Page
    When User enters valid username and password
    And Clicks on Login Button
    Then User is navigated to Home Page
    And Close the Browser
