Feature: Verify User controller

  Scenario: Verify create list of users with all params in list
    Given I want to create a list of users
    When I enter details of new users:
      |username                     | firstname  | lastname    | email               | password  | phone | status |
      | albert.camus                | Albert     | Camus       | albert.ca@mail.com  | 123456    | 12345 | 1      |
      | william.shakespeare         | William    | Shakespeare | william.sh@mail.com | 123456    | 12345 | 1      |
    And I attempt to create a list of new users
    Then the response status code should be 200

  Scenario: Verify create list of users with all params in list
    Given I want to create a list of users
    When I enter details of new users:
      |username                     | firstname  | lastname    | email               | password  | phone | status |
    And I attempt to create a list of new users
    Then the response status code should be 400