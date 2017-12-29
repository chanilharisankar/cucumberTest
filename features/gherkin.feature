Feature: App login feature without param
  Scenario: successfully login to application with valid credentials
    Given application is open
    When user loges in with username and password
    Then application loges in
    And user closes the broswer

Feature: App login feature with param
  Scenario: successfully login to application with valid credentials
    Given application is open with user "test1" and password "password"
    When user loges in with username and password
    Then application loges in
    And user closes the broswer