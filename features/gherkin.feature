Feature: App login feature without param

  Scenario: successfully login to application with valid credentials
    Given application is open
    When user loges in with Username and Password
      | Username | Password   |
      | Hari     | myPassword |
    Then application loges in
    And user closes the broswer

