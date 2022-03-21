Feature: Login

@Verify

  Scenario Outline: Testing the logon
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

    Examples:
      | FirstName | Surname | Email           | MobileNumber | Username | Password    | SouthAfricanID |  |
      | Henry     | Lunga   | henry@gmail.com | 08157817671  | henry123 | Marondera@1 | 08110295       |  |