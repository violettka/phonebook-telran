Feature: Add contact

  Background:
    Given I am logged in

  @add_contact_window
  Scenario: Clicking on the Add new contact button really opens the window for adding a contact
    When I click on Add new contact button
    Then I see window with an inscription

      """
      Добавить контакт
      """

  @add_new_contact
  Scenario:Add new contact
    When I click on Add new contact button
    And I add a new contact
    Then I see first and last name of contact


