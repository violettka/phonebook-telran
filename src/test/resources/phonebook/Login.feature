Feature: Login Tests

  Background:
    Given I am on the Login page

  @exist_user
  Scenario Outline: Login with an existing user
    When I input <email> email
    And I input <password> password
    And I click on Login button
    Then I see <button> button

    Examples:
      | email          | password       | button |
      | test@gmail.com | test@gmail.com | Выйти  |


  @incorrect_email
  Scenario Outline: Input incorrect email
    When I input <email> email
    Then I see email error message

      """
      Email must be a valid email address.
      """

    Examples:
      | email          |
      | a2amail.ru     |
      | a2a@mailru     |
      | a2a&*(@mail.ru |
      | 123oooonnnn.ru |
      | qwerty.com     |
      | @@@@17900.com  |


  @small_password
  Scenario Outline:Input password less than 8 characters
    When I input <password> password
    Then I see short password error

    """
   Password must be at least 8 characters.
    """

    Examples:
      | password |
      | 123pass  |
      | pass00   |
      | 123pa    |
      | 12       |
      | 1        |


  @long_password
  Scenario Outline: Input password more than 8 characters
    When I input <password> password
    Then I see long password error

    """
    Password must be no longer than 20 characters.
    """

    Examples:
      | password                 |
      | password1234567890127    |
      | passwordpasswordpassword |












