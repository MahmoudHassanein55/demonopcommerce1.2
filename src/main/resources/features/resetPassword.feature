@smoke
  Feature: User could reset his/her password successfully
    Scenario: User reset his password successfully
      Given user go to login page
      And user enter valid email and password
      When user click on login button
      Then user click on my account
      When user go to change password page
      And user enter oldPassword and newPassword
      And click on change button