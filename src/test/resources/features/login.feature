Feature: User Login functionality

  Scenario: Verify user can login
    Given user opens the website
    Then verify user is on login page
    When user enters username "username" and password "password"
    Then verify user is on home page
