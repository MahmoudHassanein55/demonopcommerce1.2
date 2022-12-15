@smoke
Feature: User could log in with valid email and password
  Scenario: user login with valid email and password
    Given user go to login page
    When user enter valid email and password
    And user click on login button