Feature: Password recovery

  Background:
    Given I am on the Password recovery page

  @pwd_recovery_exist_user
  Scenario: Password recovery with existing user
    When I input email
    And I click on Send button
    Then I see success message

    """
  Password recovery instructions have been sent to
    """

  @pwd_recovery_non_exist_user
  Scenario: Password recovery with nonexisting user
    When I introduce email
    And I click on Send button
    Then I see error message

      """
      Error! This user doesn't exist in our DB
      """


