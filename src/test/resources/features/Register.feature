Feature: Register Client

  @RegisterTest

  Scenario Outline: Testing the Registration
    Given As a user i launch the sauce demo webpage
    And I click open account
    And  User enters"<FirstName>"
    And   User type"<Surname>"
    And   The user enters the "<Email>"
    And   The user types "<MobileNumber>"
    And   The user enters "<Username>"
    And   User  types "<Password>"
    And   User enters his"<SouthAfricanID>"
    And   User click the product desired
    And   User click the Captcha checkbox






    Examples:
      | FirstName | Surname | Email             | MobileNumber | Username | Password       | SouthAfricanID |
      | Respect   | Themba  | benzx21@gmail.com | 0815817671   | benzx21  | Tendamidzimu@1 | 8110295988901  |